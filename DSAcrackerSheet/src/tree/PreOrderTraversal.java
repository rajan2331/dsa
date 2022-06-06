package tree;

import java.util.Stack;

public class PreOrderTraversal {
	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 PreOrderTraversal tree_level = new PreOrderTraversal();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(1);
	        tree_level.root.left = new Node(2);
	        tree_level.root.right = new Node(3);
	        tree_level.root.left.left = new Node(4);
	  //      tree_level.root.left.right = new Node(5);
	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	        preorder(root);
	    	System.out.println();
	    	preOrderIt(root);
	//   	System.out.println(mirror(root));
	 }


	private static void preOrderIt(Node root2) {
		
		Stack<Node> stack = new Stack<Node>();
		
		//Node temp = root2;
		stack.push(root2);
		while(!stack.isEmpty()  ) {
			
			Node te=stack.pop();
			System.out.print(te.data+" ");
			
			if(te.right!=null) {
				stack.push(te.right);
			//stack.po
			}	
			if(te.left!=null)
				stack.push(te.left);
			
			
		}
		
		
	}


	private static void preorder(Node root2) {
		
		System.out.print(root2.data+" ");
		
		if(root2.left!=null)
			preorder(root2.left);
		if(root2.right!=null)
			preorder(root2.right);
			
		
	} 
	 
}
