package bst;


class Node
{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

public class InsertAndFindNode {
	
    // Root of BST
   static Node root;
 
 
	
	
	 public static void main(String[] args) {
	        
		 InsertAndFindNode tree_level = new InsertAndFindNode();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
		 insert(new Node(8));
		 insert(new Node(6));
		 insert(new Node(14));
		 insert(new Node(12));
		 insert(new Node(3));
		 insert(new Node(4));
		System.out.println(isBST(root));
	     
	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	    	
	   // 	System.out.println(find(root,12));
	    	
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
	 
	 private static boolean isBST(Node  node) {
	
		 if (node == null)
		        return true;
		     
		    if (node.left != null && node.left.key > node.key)
		        return false;
		     
		    if (node.right != null && node.right.key < node.key)
		        return false;
		     
		    if (!isBST(node.left) || !isBST(node.right))
		        return false;
		     
		    return true;
	 }


	private static int find(Node root2, int key) {
		if(root2==null)
			return 0;
		if(root2!=null&& root2.key==key )
			return root2.key;
		
		if(root2.key>key)
			return  find(root2.left,key);
		
		return find(root2.right,key);
		
	} 	
	static int minBst(Node root) {
		
		Node temp=root;
		if(root==null)
			return 0;
		Node prev=null;
		while(temp!=null) {
	
			prev=temp;
			if(temp.left!=null) {
			temp=temp.left;
			
			}else
				temp=temp.right;
		}
		
		return prev.key;
	}
}
