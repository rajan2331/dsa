package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

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
        
       
          
        System.out.println(bfsOfGraph(v,adj));
        printGraph(adj);
	}

	private static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		
		
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		
		adj.get(u).add(v);
		adj.get(v).add(u);
		
	}
	
	  public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
	      
		  ArrayList<Integer> result= new ArrayList<Integer>();
		  int[] visited = new int[V];
		  
		  Arrays.fill(visited, 0);
		  
		  
			  if(visited[0]!=1) {
				  
				  Queue<Integer> queue= new LinkedList<Integer>();
				  queue.add(0);
				  visited[0]=1;
				  while(!queue.isEmpty()) {
					 int node= queue.poll();
					 result.add(node);
					 ArrayList<Integer> ele =adj.get(node);
					 
					 for(int j=0;j<ele.size();j++) {
						 
						 if(visited[ele.get(j)]!=1) {
							 queue.add(ele.get(j));
							 visited[ele.get(j)]=1;
						 }
					 }
						 
					  
				  }
			  
			  
		  }
		  
		  return result;
		  // Code here
	    }
}
