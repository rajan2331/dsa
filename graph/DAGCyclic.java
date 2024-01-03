package com.springboot.chatapp.domain;

import java.util.ArrayList;

public class DAGCyclic {
	public static void main(String[] args) {

		int V = 11;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}
		adj.get(1).add(2);
		adj.get(2).add(3);
		adj.get(3).add(4);
		adj.get(3).add(7);
		adj.get(4).add(5);
		adj.get(5).add(6);
		adj.get(7).add(5);
		adj.get(8).add(9);
		adj.get(9).add(10);
		adj.get(10).add(8);

		DAGCyclic obj = new DAGCyclic();
		boolean ans = obj.isCyclic(V, adj);
		if (ans)
			System.out.println("True");
		else
			System.out.println("False");

	}

	private boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
		int[] visited = new int[v];
		int[] pathVisited = new int[v];
		
		for(int i=1;i<=v;i++)
		{
			if(visited[i]==0)
			{
				if(isCyclicDFS(v,adj,visited,pathVisited,i))
					return true;
			}
		}
		return false;
	}

	private boolean isCyclicDFS(int v, ArrayList<ArrayList<Integer>> adj, int[] visited, int[] pathVisited ,int node) {
		visited[node]=1;
		
		for(int ele : adj.get(node))
		{
			// when node is not visted
			if(visited[ele]==0)
			{	if(isCyclicDFS(v, adj, visited, pathVisited,ele)==true)
					return true;
			}else if(pathVisited[ele]==1) // if path visited is visited it means node is visited again following the same path
				return true;
		}
		pathVisited[node]=0;
		return false;
	}

}
