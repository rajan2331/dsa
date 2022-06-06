package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MinTimeJobsDAG {
	static int []indegree = new int[100000];
	static int []job = new int[100000];
public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>>  adj = new ArrayList<ArrayList<Integer>>();
		int v=10;
		for (int i = 1; i <= v; i++)
	        adj.add(new ArrayList<Integer>());


		 	addEdge(adj,1, 3);
		    addEdge(adj,1, 4);
		    addEdge(adj,1, 5);
		    addEdge(adj,2, 3);
		    addEdge(adj,2, 8);
		    addEdge(adj,2, 9);
		    addEdge(adj,3, 6);
		    addEdge(adj,4, 6);
		    addEdge(adj,4, 8);
		    addEdge(adj,5, 8);
		    addEdge(adj,6, 7);
		    addEdge(adj,7, 8);
		    addEdge(adj,8, 10);
	    findOrder(adj,v);
	}
private static void findOrder(ArrayList<ArrayList<Integer>> adj, int v) {
	Queue<Integer> q = new LinkedList<>();
    
    for(int i = 1; i <= v; i++)
    {
        if (indegree[i] == 0)
        {
            q.add(i);
            job[i] = 1;
        }
    }
 
    while (!q.isEmpty())
    {
        int cur = q.peek();
        q.remove();
        for(int a : adj.get(cur))
        {
             
            indegree[a]--;
 
            if (indegree[a] == 0){
                job[a] = 1 + job[cur];
                q.add(a);
            }
        }
    }
 
    for(int i = 1; i <= v; i++)
        System.out.print(job[i] + " ");
    System.out.println();

	
	
}
private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
	adj.get(i).add(j);
	indegree[j]++;
//	adj.get(j).add(i);
	
}

}
