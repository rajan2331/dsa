package graphs;

import java.util.ArrayList;



public class PrimsAlgo {
	static class Node 
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
	}
public static void main(String[] args) {
	

    int n = 5;
    ArrayList<ArrayList<Node> > adj = new ArrayList<ArrayList<Node> >();
	
	for (int i = 0; i < n; i++) 
		adj.add(new ArrayList<Node>());
		
	adj.get(0).add(new Node(1, 2));
	adj.get(1).add(new Node(0, 2));
	
	adj.get(1).add(new Node(2, 3));
	adj.get(2).add(new Node(1, 3));
	
	adj.get(0).add(new Node(3, 6));
	adj.get(3).add(new Node(0, 6));
	
	adj.get(1).add(new Node(3, 8));
	adj.get(3).add(new Node(1, 8));
	
	adj.get(1).add(new Node(4, 5));
	adj.get(4).add(new Node(1, 5));
	
	adj.get(2).add(new Node(4, 7));
	adj.get(4).add(new Node(2, 7));
	
	PrimsAlgo obj = new PrimsAlgo(); 
	obj.primsAlgo(adj, n); 
}
private void primsAlgo(ArrayList<ArrayList<Node>> adj, int n) {
	
	int[] key=  new int[n];
	boolean[] mst= new boolean[n];
	int[] parent= new int[n];
	
	
	for(int i=0;i<n;i++) {
		key[i]=1000000;
		mst[i]=false;
		
	}
	
	key[0]=0;
	parent[0]=-1;
	
    for(int i = 0;i<n-1;i++) {
    	int mini = 100000000, u = 0; 
    	for(int v = 0;v<n;v++) {
    		if(mst[v] == false && key[v] < mini) {
    			mini = key[v]; 
    			u = v; 
    		}
    	}

    	mst[u] = true;
    	for(Node it: adj.get(u)) {
    		if(mst[it.getV()] == false && it.getWeight() < key[it.getV()]) {
    			parent[it.getV()] = u; 
    			key[it.getV()] = it.getWeight(); 
    		}
    	}
    }

    for(int i = 1;i<n;i++) {
    	System.out.println(parent[i] + " - " + i); 
    }
 
	
}
}
