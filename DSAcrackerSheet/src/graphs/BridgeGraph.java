package graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class BridgeGraph {
	public static void main(String args[])
    {
        int n = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
		
		for (int i = 0; i < n; i++) 
			adj.add(new ArrayList<Integer>());
			
		adj.get(0).add(1);
		adj.get(1).add(0);

		adj.get(0).add(2);
		adj.get(2).add(0);

		adj.get(1).add(2);
		adj.get(2).add(1);

		adj.get(1).add(3);
		adj.get(3).add(1);

		adj.get(3).add(4);
		adj.get(4).add(3);
			
		BridgeGraph obj = new BridgeGraph(); 
		obj.printBridges(adj, n); 
		
    }

	private void printBridges(ArrayList<ArrayList<Integer>> adj, int n) {
		
		int[] visited= new int[n];
		int low[]= new int[n];
		int in[]= new int[n];
		int timer=0;
		
		Arrays.fill(visited, 0);
		for(int i=0;i<n;i++) {
			if(visited[i]==0) {
				dfs(i,-1,low,in,visited,adj,timer);
			}
			
			
		}
		
	}

	private void dfs(int i,int parent, int[] low, int[] in, int[] visited,ArrayList<ArrayList<Integer> > adj, int timer) {
	
		visited[i]=1;
		low[i]=timer++;
		in[i]=timer++;
		
		for(int it : adj.get(i)) {
			if(it==parent)
				continue;
			if(visited[it]==0) {
				dfs(it,i,low,in,visited,adj,timer);
				low[i] = Math.min(low[i], low[it]); 
				if(low[it] > in[i]) {
					System.out.println(it + " " +i); 
				}
				
			}else {
				low[i] = Math.min(low[i], in[it]); 
			}
			
			
		}
		
	}
}
