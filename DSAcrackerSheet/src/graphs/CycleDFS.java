package graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class CycleDFS {

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
	     
	     System.out.println(cycleDFS(adj,v));
	}

private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
	adj.get(i).add(j);
	adj.get(j).add(i);
	
}

private static boolean cycleDFS(ArrayList<ArrayList<Integer>> adj, int v) {
	
	boolean visited[]= new boolean[v];
	Arrays.fill(visited, false);
	
	for(int i=0;i<v;i++) {
		if(!visited[i]) {
			
			if(dfsCycle(i,-1,adj,visited))
					return true;
		}
	}
	return false;
}

private static boolean dfsCycle(int node, int prev,ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
	visited[node]=true;
	for(int ele:adj.get(node)) {
		
		if(!visited[ele]) {
			
			if(dfsCycle(ele,node,adj,visited))
			return true;
			
		}else {
			if(prev!=ele) {
				return true;
			}
		}
	}
	return false;
}


	
}
