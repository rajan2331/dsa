package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {

public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>>  adj = new ArrayList<ArrayList<Integer>>();
		int v=6;
		for (int i = 0; i < v; i++)
	        adj.add(new ArrayList<Integer>());


		addEdge(adj,5, 2);
	    addEdge(adj,5, 0);
	    addEdge(adj,4, 0);
	    addEdge(adj,4, 1);
	    addEdge(adj,2, 3);
	    addEdge(adj,3, 1);
	     
	     System.out.println(topsort(adj,v));
	}
private static List<Integer> topsort(ArrayList<ArrayList<Integer>> adj, int v) {
	Stack<Integer> st= new Stack<Integer>();
	List<Integer> res= new ArrayList<Integer>();
	boolean visited[]=new boolean[v];
	Arrays.fill(visited, false);
	for(int i=0;i<v;i++) {
		
		if(!visited[i])
		{
			findTopo(st,adj,i,visited);
		}
	}
	
	while(!st.empty() ){
		res.add(st.pop());
	}
	return res;
}
private static void findTopo(Stack<Integer> st, ArrayList<ArrayList<Integer>> adj, int node, boolean[] visited) {
	
	visited[node]=true;
	for(int ele:adj.get(node)) {
		if(!visited[ele])
		findTopo(st,adj,ele,visited);
		
	}
	st.push(node);
	
}
private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
	adj.get(i).add(j);
//	adj.get(j).add(i);
	
}
}
