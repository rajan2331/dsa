package com.springboot.chatapp.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node{
	int first;
	int second;
	public Node(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	
}
public class Graph {

	public static void main(String[] args) {
	/*	ArrayList<ArrayList<Integer>>  adj = new ArrayList<ArrayList<Integer>>();
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
      */
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        int v =4;
        System.out.println(checkCycle(adj,v));
        System.out.println(checkCycleDFS(adj,v));
	}
	
	private static boolean checkCycleDFS(ArrayList<ArrayList<Integer>> adj, int v) {
		
		boolean[] visited= new boolean[v];
		
		Arrays.fill(visited, false);

		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			{
			return 	dfsCycle(adj,visited,i,-1,v);
			}
		}
		return false;
	}

	private static boolean dfsCycle(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int i, int par, int v) {
		
		visited[i] = true;
		for(int ele: adj.get(i))
		{
			if(!visited[ele])
			return	dfsCycle(adj, visited, ele, i, v);
			else if(ele==par)
				return true;
		}
		return false;
	}

	private static boolean checkCycle(ArrayList<ArrayList<Integer>> adj,int v) {
		boolean visited[] = new boolean[v];
		Arrays.fill(visited, false);
		
		for(int i=0;i<v;i++)
		{
			if(visited[i]==false)
			{
				if(isCycle(adj,i,v,visited))
					return true;
			}
		}
		return false;
	}

	private static boolean isCycle(ArrayList<ArrayList<Integer>> adj, int i, int v, boolean[] visited) {
		Queue<Node> queue = new LinkedList();
		
		queue.add(new Node(i,-1));
		while(!queue.isEmpty())
		{
			int ele = queue.peek().first;
			int par = queue.peek().second;
			
			for(int it : adj.get(ele))
			{
				if(visited[it]==false)
				{
					visited[it]=true;
					queue.add(new Node(it,ele));
				}else if(it!=par)
					return true;
			}
			queue.remove();
		}
		return false;
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		
		adj.get(u).add(v);
		adj.get(v).add(u);
		
	}
	
	
}
