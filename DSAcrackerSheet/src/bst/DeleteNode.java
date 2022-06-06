package bst;




public class DeleteNode {
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
		System.out.println(delete(root,3));
	     
	 }
	 
private static Node delete(Node root, int key) {
	
		if(root==null)
			return null;
		
		if(root.key==key) {
			return helper(root);
		}
		Node temp =root;
		
		while(root!=null) {
			
			if(root.key>key)
			{
				if(root.left!=null && root.left.key==key) {
					root.left=helper(root.left);
				}else
					root=root.left;
			}else if(root.key<key) {
				if(root.right!=null && root.right.key==key) {
					root.right=helper(root.right);
					
				}else
					root=root.right;
			}
		}
		
		return temp;
	}

private static Node helper(Node left2) {
	
	
	if(left2.right==null)
		return left2.right;
	if(left2.left==null)
		return left2.left;
	
	Node rightChild=left2.right;
	Node last= findLastRight(left2.left);
	last.right=rightChild;
	
	
	return left2;
}


private static Node findLastRight(Node left2) {
	if(left2==null)
		return null;
	
	
	return findLastRight(left2.right);
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
	        else 
	        	prev.right=node;
		 
		 
	 }
	 }
}
