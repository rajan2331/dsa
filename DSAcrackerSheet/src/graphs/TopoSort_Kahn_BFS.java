package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TopoSort_Kahn_BFS {

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
	     
	     System.out.println(Arrays.toString(topsort(adj,v)));
	}
private static int[] topsort(ArrayList<ArrayList<Integer>> adj, int v) {
	
	Queue<Integer> queue= new LinkedList<Integer>();
	int indegree[]=new int[v];
	Arrays.fill(indegree, 0);
	for(int i=0;i<v;i++) {
		for(int el:adj.get(i)) {
			indegree[el]++;
		}
	}
	for(int i=0;i<v;i++) {
		if(indegree[i]==0)
			queue.add(i);
	}
	int topo[] = new int[v];
	int j=0;
	while(!queue.isEmpty()) {
		int node = queue.poll();
		topo[j++]=node;
		
		for(int ele: adj.get(node)) {
			indegree[ele]--;
			if(indegree[ele]==0)
				queue.add(ele);
		}
			
	}
	return topo;
}
private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
	adj.get(i).add(j);
//	adj.get(j).add(i);
	
}
}
