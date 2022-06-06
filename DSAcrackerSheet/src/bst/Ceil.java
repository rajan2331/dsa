package bst;

import bst.SearchInBST.Node;

public class Ceil {
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

	 }	
	 public static void main(String[] args) {
	        
		 
		 insert(new Node(2));
		 insert(new Node(3));
		 insert(new Node(4));
		 insert(new Node(5));
		 insert(new Node(6));
		 insert(new Node(9));
		 insert(new Node(10));
		 insert(new Node(11));
		 insert(new Node(13));
		 insert(new Node(14));
		 ceil(root,8);
		System.out.println(ceil);
	     
	 }
		

	 static int ceil ;
		private static void ceil(Node root2, int k) {
			
			if(root2!=null)
			{
				if(root2.key==k)
				{		ceil=k;
					return;
				
				}
				else if(root2.key<k) {
					
					ceil(root2.right,k);
					
				}	
				else {
					ceil(root2.left,k);
					if(root2.key>ceil)
					ceil=root2.key;
				}
					
						
				
			}else
				return;
			
			
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
