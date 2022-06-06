package bst;

import bst.DeleteNode.Node;

public class PreSuccessorBST {
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

		     static Node pre ,suc ;
	public static void main(String[] args)
	{
	     
	    // Key to be searched in BST
	    int key = 65;
	 
	    /*
	     * Let us create following BST
	     *          50
	     *         /  \
	     *        30   70
	     *       /  \ /  \
	     *      20 40 60  80
	     */
	 
	    
	    insert(new Node(50));
		 insert(new Node(30));
		 insert(new Node(60));
		 insert(new Node(20));
		 insert(new Node(40));
		 insert(new Node(70));
	    findPreSuc(root, key);
	    if (pre != null)
	        System.out.println("Predecessor is " + pre.key);
	    else
	        System.out.println("No Predecessor");
	 
	    if (suc != null)
	        System.out.println("Successor is " + suc.key);
	    else
	        System.out.println("No Successor");
	}
	
	private static void findPreSuc(Node root, int key2) {
		
		if(root==null)
			return ;
		
		
		if(root.key==key2) {
			
			if(root.left!=null) {
				Node tmp = root.left;
	            while (tmp.right != null)
	                tmp = tmp.right;
	                 
	            pre = tmp;
			}
			if(root.right!=null) {
				Node tmp = root.right;
	            while (tmp.left != null)
	                tmp = tmp.left;
	                 
	            suc = tmp;
			}
			return;
		}
		
		if(root.key>key2) {
			suc=root;
			findPreSuc(root.left,key2);
			
		}else if(root.key<key2) {
			pre=root;
			findPreSuc(root.right,key2);
		}
		
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
}
