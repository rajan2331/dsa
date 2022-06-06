package graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class DirectedCycleDFS {
public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>>  adj = new ArrayList<ArrayList<Integer>>();
		int v=4;
		for (int i = 0; i < v; i++)
	        adj.add(new ArrayList<Integer>());


		 addEdge(adj,0, 1);
	     addEdge(adj,0, 2);
	     addEdge(adj,1, 2);
	     addEdge(adj,2, 0);
	     addEdge(adj,2, 3);
	     addEdge(adj,3, 3);
	     
	     System.out.println(directedcycleDFS(adj,v));
	}

private static boolean directedcycleDFS(ArrayList<ArrayList<Integer>> adj, int v) {
	
	
	boolean[] visited = new boolean[v];
	boolean[] dfsVisited= new boolean[v];
	Arrays.fill(visited, false);
	Arrays.fill(dfsVisited, false);
	for(int i=0;i<v;i++) {
		
		if(!visited[i]) {
			
			if(dfsDirected(i,adj,visited,dfsVisited))
				return true;
			
			
		}
	}
	
	
	return false;
}

private static boolean dfsDirected(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] dfsVisited) {
	
	visited[node]=true;
	dfsVisited[node]=true;
	for(int ele:adj.get(node)) {
		if(!visited[ele]) {
			if(dfsDirected(ele,adj,visited,dfsVisited))
				return true;
		}else  if(dfsVisited[ele]){
			return true;
			
		}
		
	}
	dfsVisited[node]=false;
	return false;
}

private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
	adj.get(i).add(j);
	adj.get(j).add(i);
	
}
}
