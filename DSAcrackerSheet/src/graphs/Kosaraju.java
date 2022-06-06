package graphs;

import java.util.ArrayList;
import java.util.Stack;

public class Kosaraju {
	public static void main(String args[])
    {
        int n = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
		
		for (int i = 0; i < n; i++) 
			adj.add(new ArrayList<Integer>());
			
		adj.get(0).add(1);
		adj.get(1).add(2);
		adj.get(2).add(0);
		adj.get(1).add(3);
		adj.get(3).add(4);

			
		Kosaraju obj = new Kosaraju(); 
		obj.kosaRaju(adj, n); 
		
    }

	private void kosaRaju(ArrayList<ArrayList<Integer>> adj, int n) {
		
		int[] visited=new int[n];
		Stack<Integer> st= new Stack<Integer>();
		
		for(int i=0;i<n;i++) {
			
			if(visited[i]==0) {
				dfs(st,adj,i,visited);
			}
		}
		
		ArrayList<ArrayList<Integer> > transpose = new ArrayList<ArrayList<Integer> >();
		for (int i = 0; i < n; i++) 
			transpose.add(new ArrayList<Integer>());

		for(int i = 0;i<n;i++) {
			visited[i] = 0; 
			for(Integer it: adj.get(i)) {
				transpose.get(it).add(i); 
			}
		}
		while(st.size() > 0) {
			int node = st.peek(); 
			st.pop(); 
			if(visited[node] == 0) {
				System.out.print("SCC: "); 
				revDfs(node, transpose, visited);
				System.out.println(); 
			}
		}
	}

	private void revDfs(int node, ArrayList<ArrayList<Integer>> transpose, int[] visited) {
		visited[node] = 1;
		System.out.print(node + " "); 
		for(Integer it : transpose.get(node)) {
			if(visited[it] == 0) {
				revDfs(it, transpose, visited); 
			}
		}
	}

	private void dfs(Stack<Integer> st, ArrayList<ArrayList<Integer>> adj, int node,int[] visited) {
	
		visited[node]=1;
		for(int it:adj.get(node)) {
			if(visited[it] == 0) {
			dfs(st,adj,it,visited);
			}
		}
		st.push(node);
		
	}
}
