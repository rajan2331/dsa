package ae.gov.dubaipolice.sas.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

 class Solutionn {

	public static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj) {
		int vis[] = new int[v];
		Arrays.fill(vis, 0);
		Stack<Integer> st = new Stack();
		for(int i=0;i<v;i++)
		{
			if(vis[i]==0)
				dfs(i,vis,st,adj,v);
		}
		

        int ans[] = new int[v];
        int i = 0;
        while (!st.isEmpty()) {
            ans[i++] = st.peek();
            st.pop();
        }
        return ans;
		
	}

	private static void dfs(int node, int[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj, int v) {

		vis[node] = 1;
		for(int it : adj.get(node))
		{
			if(vis[it]==0)
				dfs(it,vis,st,adj,v);
		}
		st.push(node);
	}

	
}

public class TopoSort {
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);

        int[] ans = Solutionn.topoSort(V, adj);
        for (int node : ans) {
            System.out.print(node + " ");
        }
        System.out.println("");
    }
} 