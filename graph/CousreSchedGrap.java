package ae.gov.dubaipolice.sas.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution1 {
	public static void main(String[] args) {
		
		int[][] preq = {{1,0}};
		System.out.println(canFinish(2,preq));
	}
	public static boolean canFinish(int numCourses, int[][] prerequisites) {
		
		 public boolean canFinish(int numCourses, int[][] prerequisites) {
			   	
			 ArrayList<Edge> graph []=new ArrayList[numCourses];
	        for(int i=0;i<numCourses;i++){
	            graph[i]=new ArrayList<Edge>();
	        }
	        for(int i=0;i<prerequisites.length;i++){
	            graph[prerequisites[i][1]].add(new Edge(prerequisites[i][1],prerequisites[i][0]));
	        }
	        boolean vis[]=new boolean [numCourses];
	        boolean path[]=new boolean [numCourses];
	        for(int i=0;i<numCourses;i++){
	            if(!vis[i]){
	                if(dfs(graph,i,vis,path))return false;
	            }
	        }
	        return true;
	    }
	    public boolean dfs(ArrayList<Edge> graph [],int curr,boolean vis[],boolean path[]){
	        // if already in path i.e cycle detected
	        if(path[curr])return true;
	        //if visited but not in path
	        // not a cycle
	        if(vis[curr])return false;

	        vis[curr] = true;
	        path[curr] = true;
	        
	        for(int i=0;i<graph[curr].size();i++){
	            Edge e=graph[curr].get(i);
	            if(dfs(graph,e.dst, vis, path))return true;
	        }

	        //not included in path now 
	        path[curr] = false;
	        return false;
	    }
	   
	    class Edge{
	        int src;
	        int dst;
	        Edge(int src,int dst){
	            this.src=src;
	            this.dst=dst;
	        }
	    }
}

