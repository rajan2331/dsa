package bst;




public class LCABst {
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
    // Root of BST
   static Node root;
 
 
	
	
   public static void main(String[] args) {
       
		 
		 insert(new Node(2));
		 insert(new Node(5));
		 insert(new Node(6));
		 insert(new Node(10));
		 insert(new Node(15));
		
		 
		System.out.println(lca(root,5,10).key);
	     
	 }
		

	 
   private static Node lca(Node root2, int i, int j) {
	
	   if(root2==null)
		   return null;
	   
	   if(i<root2.key && j<root2.key)
		   lca(root2.left,i,j);
	    if(i>root2.key && j>root2.key)
		   lca(root2.left,i,j);
	   
		   return root2;
	   
	   
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