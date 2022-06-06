package tree;

public class MinimumDist {
	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 MinimumDist tree_level = new MinimumDist();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(1);
	        tree_level.root.left = new Node(2);
	        tree_level.root.right = new Node(3);
	        tree_level.root.left.left = new Node(4);
	    //    tree_level.root.left. = new Node(8);
	        tree_level.root.left.right = new Node(5);
	        tree_level.root.right.left = new Node(6);
	        tree_level.root.right.right = new Node(7);

	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	    	
	    	System.out.println(findDist(root,5,7));
	 }
	static int findDist(Node root, int a, int b) {
	       Node lca=findLCA( root,a, b);
	       
	       int c1=find(lca, a,0);
	       int c2=find(lca, b,0);	   
	      
	       return c1+c2;
	    }
	 
	static  int  find(Node node,int a,int count) {
		 
		if(node==null)
			return 0;
		 
		 if(node.data==a)
			 return count;
		 int c1=find(node.left,a,count+1);
		 int c2=find(node.right,a,count+1);
	
		 return Math.max(c1, c2);
		 
	 }
	
 
   
   static  Node findLCA(Node node, int n1, int n2)
    {
        if (node == null)
            return null;
 
       
        if (node.data == n1 || node.data == n2)
            return node;
 
        Node left_lca = findLCA(node.left, n1, n2);
        Node right_lca = findLCA(node.right, n1, n2);
 
        if (left_lca!=null && right_lca!=null)
            return node;
 
        return (left_lca != null) ? left_lca : right_lca;
    }
}
