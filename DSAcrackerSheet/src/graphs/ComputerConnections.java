package graphs;

import java.util.ArrayList;
import java.util.List;

public class ComputerConnections {
public static void main(String[] args) {
	int n = 5;
	int[][] connections = {{0,1},{0,2},{3,4},{2,3}};
	System.out.println(makeConnected(n,connections));
}
public static  int makeConnected(int n, int[][] connections) {
	
	
	if(n!=connections.length+1)
		return -1;
	
	ArrayList<ArrayList<Integer>>  adj = new ArrayList<ArrayList<Integer>>();
	
	for (int i = 0; i < n; i++)
        adj.add(new ArrayList<Integer>());

	for(int[] arr: connections) {
		
		 addEdge(adj, arr[0],arr[1]);
	}
    
	
	boolean[] visited= new boolean[n];
	
	
	int count=0;
	for(int i=0;i<n;i++) {
		
		if(!visited[i])
		{	checkCount(i,adj,n,visited);
			count++;
			
		}
	}
	return count-1;
    
}
private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
	adj.get(i).add(j);
	adj.get(j).add(i);
	
}
private static void checkCount(int source,ArrayList<ArrayList<Integer>> connections, int n, boolean[] visited) {


	
	if(!visited[source]) {
		visited[source]=true;
		for(int nod : connections.get(source)) {
		if(!visited[nod]) {
			
		checkCount(nod, connections, n, visited);
	
		}
		}
	}
	
}
}
