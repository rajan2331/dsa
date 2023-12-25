package com.springboot.chatapp.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class BipatriteGrph {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>>  adj = new ArrayList<ArrayList<Integer>>();
		int v=10;
		for (int i = 0; i < v; i++)
            adj.add(new ArrayList<Integer>());
  
	
       
  //      int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        int[][] graph= {{1,3},{0,2},{1,3},{0,2}};
        v=graph.length;
        for(int i=0;i<graph.length;i++)
        {
        	for(int j=0;j<graph[i].length;j++)
        	{
        		 if(i != j) {
        			 adj.get(i).add(j); 
        			 adj.get(j).add(i); 
                 }
        	}
        }
        System.out.println(isBipartite(graph));
    
	}
	   public static boolean isBipartite(int[][] graph) {
	        ArrayList<ArrayList<Integer>>  adj = new ArrayList<ArrayList<Integer>>();
	    	 int v=graph.length;
	         for (int i = 0; i < v; i++)
	            adj.add(new ArrayList<Integer>());
	        
	         for(int i=0;i<graph.length;i++)
	         {
	         	for(int j=0;j<graph[i].length;j++)
	         	{
	         		 
	         		 adj.get(i).add(graph[i][j]);
	                     
	         	}
	         }
	         
	        int[] visited= new int[v];
	        Arrays.fill(visited, -1);
	        
	        for(int i=0;i<v;i++)
	        {
	        	if(visited[i]==-1)
	        	{
	        	if(	dfs(adj,visited,i,0) ==false)return false;
	        	}
	        }
	        return true;
	    }
		private static boolean dfs(ArrayList<ArrayList<Integer>> adj, int[] visited, int node, int color) {
			visited[node]=color;
			for(int ele :adj.get(node))
			{
				if(visited[ele]==-1)
				{	
					if(dfs(adj,visited,ele,1-color)==false) return false ;
				}else if(visited[node]==visited[ele])
					return false;
			}
		return true;
			
		}
		
	
	
}
