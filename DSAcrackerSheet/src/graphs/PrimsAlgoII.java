package graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

import graphs.PrimsAlgo.Node;

public class PrimsAlgoII {
	static class Node implements Comparable<Node>
	{
	    private int v;
	    private int weight;
	    
	    Node(int v, int w) { 
	    	
	    	this.v = v; this.weight = w; 
	    	}
	    
	    Node() {}
	    
	    int getV() 
	    { 
	    	return v; }
	    int getWeight() 
	    { 
	    	return weight; 
	    
	    }

		@Override
		public int compareTo(Node o) {
			return this.weight-o.weight;
		}
	}
public static void main(String[] args) {
	

    int n = 5;
    ArrayList<ArrayList<Node> > adj = new ArrayList<ArrayList<Node> >();
	
	for (int i = 0; i < n; i++) 
		adj.add(new ArrayList<Node>());
		
	adj.get(0).add(new Node(1, 4));
	adj.get(1).add(new Node(0, 4));
	
	adj.get(1).add(new Node(2, 2));
	adj.get(2).add(new Node(1, 2));
	
	adj.get(0).add(new Node(2, 8));
	adj.get(2).add(new Node(0, 8));
	
	adj.get(1).add(new Node(3, 6));
	adj.get(3).add(new Node(1, 6));
	
	adj.get(2).add(new Node(3, 3));
	adj.get(3).add(new Node(2, 3));
	
	adj.get(3).add(new Node(4, 5));
	adj.get(4).add(new Node(3, 5));
	
	adj.get(2).add(new Node(4, 9));
	adj.get(4).add(new Node(2, 9));
	
	PrimsAlgoII obj = new PrimsAlgoII(); 
	obj.primsAlgoPQ(adj, n); 
}
private void primsAlgo(ArrayList<ArrayList<Node>> adj, int n) {
	
	int weight[]= new int[n];
	int[] parent= new int[n];
	boolean[] visited= new boolean[n];
	
	
	for(int i=0;i<n;i++) {
		weight[i]=100000;
		parent[i]=-1;
		visited[i]=false;
	}
	parent[0]=0;
	weight[0]=0;
	for(int i=0;i<n-1;i++) {
		int min=Integer.MAX_VALUE;
		int vMin=0;
		for(int j=0;j<n;j++) {
			if(visited[j]==false && weight[j]<min) {
				min=weight[j];
			vMin=j;
			}
		}
		
		visited[vMin]=true;
		for(Node node : adj.get(vMin)) {
			if(visited[node.v]==false && node.weight<weight[node.v]) {
				parent[node.v]=vMin;
				weight[node.v]=node.weight;
				
			}
			
		}
		
	}
	for(int i = 1;i<n;i++) {
    	System.out.println(parent[i] + " - " + i); 
    }
 
}
private void primsAlgoPQ(ArrayList<ArrayList<Node>> adj, int n) {
	int weight[]= new int[n];
	int[] parent= new int[n];
	boolean[] visited= new boolean[n];
	
	PriorityQueue<Node> queue = new PriorityQueue<Node>();
	for(int i=0;i<n;i++) {
		weight[i]=100000;
		parent[i]=-1;
		visited[i]=false;
		
	}
	parent[0]=0;
	weight[0]=0;
	queue.offer(new Node(parent[0],0));
	
	while(!queue.isEmpty()) {
		Node temp = queue.poll();
		visited[temp.v]=true;
		int vertex=temp.v;
	//	int w=temp.weight;
		
		for(Node node : adj.get(vertex)) {
			if(visited[node.v]==false && node.weight<weight[node.v]) {
				parent[node.v]=vertex;
				weight[node.v]=node.weight;
				queue.add(node);
			}
		}
		
		
	}
	
	for(int i = 1;i<n;i++) {
    	System.out.println(parent[i] + " - " + i); 
    }
	
	
	
	
	
}
}
