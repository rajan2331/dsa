package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CycleBFS {
	
	
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
	     
	     System.out.println(cycleBfs(adj,v));
	}

	private static boolean cycleBfs(ArrayList<ArrayList<Integer>> adj,int v) {
		class Pair{
			
			int node;
			int prev;
			public Pair(int node,int prev) {

			this.node=node;
			this.prev=prev;
			}
		}
		boolean visited[]=new boolean[v];
		Arrays.fill(visited, false);
		for(int i=0;i<v;i++) {
		
			if(!visited[i]) {
				
				 Queue<Pair> queue= new LinkedList<Pair>();
				 
				  queue.add(new Pair(i,-1));
				  visited[0]=true;
				
				  while(!queue.isEmpty()) {
					  
					  Pair pair = queue.poll();
					  int node=pair.node;
					  int prev=pair.prev;
					  for(int ele: adj.get(node)) {
						  if(!visited[ele]) {
						  visited[ele]=true;
						  queue.add(new Pair(ele,node));
						  }else if(ele!=prev)
							  return true;
						  
				  }
				
			}
		}
	}
		return false;
	}	

	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
		
		adj.get(i).add(j);
		adj.get(j).add(i);
		
	}
	
	

	
		
		
	
    
   
}
