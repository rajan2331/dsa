package graphs;

import java.util.ArrayList;
import java.util.List;


public class JobFinish {
	static class Pair{
        int first, second;
         
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
	public static void main(String args[])
    {
        int numTasks = 4;
     
        List<Pair> prerequisites = new ArrayList<Pair>();;
     
        // for prerequisites: [[1, 0], [2, 1], [3, 2]]
     
        prerequisites.add(new Pair(1, 0));
        prerequisites.add(new Pair(2, 1));
        prerequisites.add(new Pair(3, 2));
         
        if (canFinish(numTasks, prerequisites)) {
            System.out.println("Possible to finish all tasks");
        }
        else {
            System.out.println("Impossible to finish all tasks");
        }
    }
	private static boolean canFinish(int numTasks, List<Pair> prerequisites) {
		ArrayList<ArrayList<Integer>>  adj = new ArrayList<ArrayList<Integer>>();
		createGraph(adj,prerequisites);
		
			boolean onpath[] = new boolean[numTasks];
	        boolean visited[] = new boolean[numTasks];
	 
	        for (int i = 0; i < numTasks; i++)
	            if (!visited[i] && dfs_cycle(adj, i, onpath, visited))
	                return false;
	 
	        return true;
	}
	private static boolean dfs_cycle(ArrayList<ArrayList<Integer>> adj, int node, boolean[] onpath, boolean[] visited) {
		
		  if (visited[node])
	            return false;
	        onpath[node] = visited[node] = true;
	 
	        for (int neigh : adj.get(node))
	            if (onpath[neigh] || dfs_cycle(adj, neigh, onpath, visited))
	                return true;
	 
	        return onpath[node] = false;
	}
	private static void createGraph(ArrayList<ArrayList<Integer>> adj, List<Pair> prerequisites) {
		 
        for(int i=0; i<4; i++){
        	adj.add(new ArrayList<Integer>());
        }
 
        for (Pair pre : prerequisites)
            adj.get(pre.second).add(pre.first);
 
      
		
	}
}
