package tree;

import java.util.LinkedList;
import java.util.Queue;

public class DiameterTree {
	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 DiameterTree tree_level = new DiameterTree();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(1);
	        tree_level.root.left = new Node(2);
	        tree_level.root.right = new Node(3);
	        tree_level.root.left.left = new Node(4);
	        tree_level.root.left.right = new Node(5);
	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	    	
	    	System.out.println(diameter(root));
	 }


	static  int diameter(Node node) {
		int[] max= new int[1];
		diameter(node,max);
		return max[0];
	}


	private static int diameter(Node node, int[] max) {
		
		if(node==null)
			return 0;
		
		int lh= diameter(node.left, max);
		int rh= diameter(node.right,max);
		max[0]=Math.max(max[0],lh+ rh);
		return 1+Math.max(lh,rh);
	} 	
}
