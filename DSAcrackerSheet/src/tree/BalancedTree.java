package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BalancedTree {
	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 BalancedTree tree_level = new BalancedTree();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(1);
	        tree_level.root.left = new Node(2);
	       tree_level.root.right = new Node(3);
	        tree_level.root.left.left = new Node(4);
	       tree_level.root.left.left.left = new Node(4);
	       tree_level.root.left.left.left.left = new Node(4);
	       tree_level.root.left.left.left.left.left = new Node(4);
	       tree_level.root.left.left.left.left.left.right = new Node(4);
	        tree_level.root.left.right = new Node(5);
	        tree_level.root.right.right = new Node(8);
	       tree_level.root.right.right.right = new Node(8);
	       tree_level.root.right.right.right.right = new Node(8);
	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	    	
	    	System.out.println(height(root));
	    	
	 } 	
	 static boolean balance(Node root) {
		 
		 if(root==null)
			 return true;
		 
		 int lh= height(root.left);
		 int rh= height(root.right);
		 
		  if(Math.abs(lh-rh)<=1 && balance(root.left) && balance(root.right))
			  return true;
			 
		 return false;
	 }
	 static int  height(Node root) {
		 
		 if(root==null)
			 return 0;
		 
		 int lh=height(root.left);
		 int rh = height(root.right);
		 return 1+Math.max(lh,rh);
	 }
	
}
