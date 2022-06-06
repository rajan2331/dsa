package bst;


public class SearchInBST {
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
	        
		 
		 insert(new Node(5));
		 insert(new Node(3));
		 insert(new Node(6));
		 insert(new Node(2));
		 insert(new Node(4));
		System.out.println(findEle(root,9));
	     
	 }
		private static Node findEle(Node root, int i) {
		
			if(root!=null) {
				
				if(root.key==i)
					return root;
				else if(root.key>i)
				return	findEle(root.left,i);
					else
					return	findEle(root.right,i);
			}
			
		return null;
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
