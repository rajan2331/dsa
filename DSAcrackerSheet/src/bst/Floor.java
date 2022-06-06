package bst;

import bst.Ceil.Node;

public class Floor {
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
		 insert(new Node(5));
		 insert(new Node(6));
		 insert(new Node(10));
		 insert(new Node(15));
		
		 floor(root,7);
		System.out.println(floor);
	     
	 }
		

	 static int floor ;
		private static void floor(Node root2, int k) {
			
			if(root2!=null)
			{
				if(root2.key==k)
				{		floor=k;
					return;
				
				}
				else if(root2.key<k) {
					
					floor(root2.right,k);
					if(root2.key>floor)
						floor=root2.key;
				}	
				else {
					floor(root2.left,k);
				
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
