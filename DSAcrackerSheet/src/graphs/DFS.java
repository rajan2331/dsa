package graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class DFS {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>>  adj = new ArrayList<ArrayList<Integer>>();
		int v=10;
		for (int i = 0; i < v; i++)
            adj.add(new ArrayList<Integer>());
  
	
        addEdge(adj, 9 ,9);
        addEdge(adj, 0 ,2);
        addEdge(adj, 0 ,5);
        addEdge(adj, 1 ,5);
        addEdge(adj, 1 ,6);
        addEdge(adj, 1 ,8);
        addEdge(adj, 3 ,4);
        addEdge(adj, 3 ,5);
        addEdge(adj, 4 ,7);
        addEdge(adj, 5 ,7);
        
       
          
        System.out.println(dfsOfGraph(v,adj));
      //  printGraph(adj);
	}

	private static ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {

		ArrayList<Integer> res= new ArrayList<Integer>();
		boolean visited[]= new boolean[v];
		Arrays.fill(visited, false);
		for(int i=0;i<v;i++) {
			if(!visited[i])
			{
				visited[i]=true;
				res.add(i);
				dfs(adj,i,visited,res);
			}
		}
		
		return res;
	}

	private static void dfs(ArrayList<ArrayList<Integer>> adj,int node, boolean[] visited, ArrayList<Integer> res) {
		
		if(!visited[node]) {
			res.add(node);
			visited[node]=true;
			for(int ele: adj.get(node)) {
				dfs(adj,ele,visited,res);
			}
		}
		
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
		adj.get(i).add(j);
		adj.get(j).add(i);
		
	}
}
