package ae.gov.dubaipolice.sas.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

 class Sol {

	public static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj) {

		int[] indegree = new int[v];
		
		for(int i =0 ;i<v;i++)
		{
			for(int it :adj.get(i))
			{
				indegree[it]++;
			}
		}
		
		Queue<Integer> queue = new LinkedList();
		for(int i=0 ; i<v;i++)
		{
			if(indegree[i]==0)
				queue.add(i);
		}
		int[] ans = new int[v];
		int i=0;
	//	System.out.println(Arrays.toString(indegree));
		while(!queue.isEmpty())
		{
			int node = queue.poll();
			ans[i++] =node;
			
			for(int it : adj.get(node))
			{
				indegree[it]--;
				if(indegree[it]==0 )
					queue.add(it);
			}
			
		}

		
		return ans;
	}

	
}

 public class KahnTopoSort
{
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

      int[] ans = Sol.topoSort(V, adj);
      for (int node : ans) {
          System.out.print(node + " ");
      }
      System.out.println("");
	} 
}