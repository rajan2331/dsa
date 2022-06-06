package tree;

import java.util.Stack;

public class InOrderTraversal {
	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 InOrderTraversal tree_level = new InOrderTraversal();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(1);
	        tree_level.root.left = new Node(2);
	        tree_level.root.right = new Node(3);
	        tree_level.root.left.left = new Node(4);
	        tree_level.root.left.right = new Node(5);
	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	        inorder(root);
	    	System.out.println();
	    	inOrderIt(root);
	//   	System.out.println(mirror(root));
	 } 
	 
	 static void inorder(Node node) {

			if(node.left!=null) {
				inorder( node.left);
				
			}
			System.out.print(node.data+" ");
			if(node.right!=null)
				inorder(node.right);
		
	 }
	 static void inOrderIt(Node node) {
		 
		 Stack<Node> stack = new Stack<Node>();
		 Node temp=node;
		// stack.add(node);
		 while(!stack.isEmpty() || temp !=null) {
			 
			 if(temp!=null) {
			 stack.push(temp);
			 temp=temp.left;
			 }else {
				 temp=stack.pop();
				 System.out.print(temp.data+" ");
			//	 if(temp.right!=null) {
					 temp=temp.right;
				 
			 }
			 
			 
		 }
		 
	 }
}
