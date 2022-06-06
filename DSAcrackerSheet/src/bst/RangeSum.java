package bst;

import bst.DeleteNode.Node;

public class RangeSum {
	 static Node root;
	 
	 
		static class Node
		 {
		     int key;
		     Node left, right;

		     public Node(int item)
		     {
		         key = item;
		         left = right = null;
		     }

			
		 public static void main(String[] args) {
		        
			 
			 insert(new Node(5));
			 insert(new Node(3));
			 insert(new Node(6));
			 insert(new Node(2));
			 insert(new Node(4));
			System.out.println(rangeSumBST(root,4,6));
		     
		 }
		 private static void  insert(Node node) {
			 
			 if(root==null) {
				 root= node;
			return;	 
			 }
			 Node temp=root;
			 Node prev=null;
			 while(temp!=null) {
				 
				 if(node.key<temp.key) {
					 
					 prev=temp;
					 temp=temp.left;
			
					 
				 } else if(node.key>temp.key) {
					
					 prev=temp;
					 temp=temp.right;
					 
				 } 
				 
				
			 }
			 if(prev.key>node.key)
		            prev.left=node;
		        else prev.right=node;
			 
			 
		 }
		 }
		static int sum =0;

	 public static  int rangeSumBST(Node root, int low, int high) {
		
		 if(root==null)
			 return 0;
		
		 if(low>root.key)
		 rangeSumBST(root.right,low,high);
		 else if(high<root.key)
			 rangeSumBST(root.left,low,high);
		 else {
			
			rangeSumBST(root.left,low,high);
			rangeSumBST(root.right,low,high);
			sum=sum+root.key;
			
		 }	
		return sum;
	        
	    }
	
}
