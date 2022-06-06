package bst;

import java.util.ArrayList;
import java.util.List;

public class InOrderSuccessor {
	 static Node root;
	 
	 
		static class Node
		 {
		     int key;
		     Node left, right,next;

		     public Node(int item)
		     {
		         key = item;
		         left = right = null;
		     }

		     static Node pre ,suc ;
	public static void main(String[] args)
	{
	     
	 
	    /*
	     * 
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
		 
	    inorder(root);
	}
	private static void inorder(Node root) {
		
		if(root==null)
			return;

		inorder(root.left);
		list.add(root);
		inorder(root.right);
	}

	static List<Node> list = new ArrayList<Node>();
	
	 public void populateNext(Node root){
	       
		 	for(int i=0;i<list.size();i++) {
		 		
		 		if(i!=list.size()-1) {
		 			list.get(i).next=list.get(i+1);
		 			
		 		}else
		 			list.get(i).next=null;
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
