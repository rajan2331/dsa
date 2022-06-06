package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BinaryTreeToDLL {

	static Node root;
	
	static Node head;
	static Node tail ;
	 public static void main(String[] args) {
	        
		 BinaryTreeToDLL tree_level = new BinaryTreeToDLL();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(10);
	        tree_level.root.left = new Node(12);
	        tree_level.root.right = new Node(15);
	        tree_level.root.left.left = new Node(25);
	        tree_level.root.left.right = new Node(30);
	        tree_level.root.right.left = new Node(36);
	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	    	
	        inorder(bToDLL(root));
	 //   	inOrderIt(root);
	//   	System.out.println(mirror(root));
	 } 
	 
	/* static  Node bToDLL(Node root)
	{
		Node head = null;
		List<Integer> list = new ArrayList<Integer>();
        inorder(root,list);
        Collections.reverse(list);
        for(int data : list ) {

        	
    		Node newNode= new Node(data);
    		newNode.right=head;
    		newNode.left=null;
    		if(head!=null)	
    		head.left=newNode;
    		
    		head=newNode;
    		
    	
        }
		return head;
		
	   }  */
	
	
  
	 static Node bToDLL(Node node) {

		 if(node==null)
			 return null;
		 
			if(node.left!=null) 
				bToDLL( node.left);
			
			  if(head == null) {    
		            head = tail = node;    
		        }    
		        else {    
		            tail.right = node;    
		            node.left = tail;    
		            tail = node;    
		        }    
			if(node.right!=null)
				bToDLL(node.right);
			
			return head;
		
	 }
	 
	 

	 static void inorder(Node node) {

			if(node.left!=null) {
				inorder( node.left);
				
			}
			System.out.print(node.data+" ");
			if(node.right!=null)
				inorder(node.right);
		
	 }
}
