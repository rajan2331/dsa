package graphs;

public class DisjointSet {
	int[] parent;
	int[] rank;
	int n;
	public DisjointSet(int n)
    {
        rank = new int[n];
        parent = new int[n];
        this.n = n;
        makeSet();
    }
  
    void makeSet()
    {
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
	public static void main(String[] args)
    {
        int n = 5;
        DisjointSet dus = 
                new DisjointSet(n);
        dus.union(0, 2);
        dus.union(4, 2);
        dus.union(3, 1);
        if (dus.find(4) == dus.find(0))
            System.out.println("Yes");
        else
            System.out.println("No");
  
        if (dus.find(1) == dus.find(0))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

	private void union(int i, int j) {
		
		i=find(i);
		j=find(j);
		
		if(rank[i]<rank[j])
			parent[i]=j;
		else if(rank[j]<rank[i])
			parent[j]=i;
		else {
			parent[j]=i;
			rank[j]++;
		}
		
			
		
	}

	private Integer find(int node) {
		if(node==parent[node])
			return node;
	
		return parent[node]=find(parent[node]);
	}
}
