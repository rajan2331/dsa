package tree;

public class MirrorTree {

	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 MirrorTree tree_level = new MirrorTree();
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
	    	printTree(root);
	    	System.out.println();
	    	mirror(root);
	    	printTree(root);
	//   	System.out.println(mirror(root));
	 } 	
	private static Node mirror(Node root2) {
		
		if(root2==null)
			return null;
		
		Node left = mirror(root2.left);
	//	Node temp=left;
				
		Node right= mirror(root2.right);
	
		root2.left=right;
		root2.right=left;
		return root2;
		
	}
	static void  printTree(Node node) {
		if(node.left!=null) {
			printTree( node.left);
			
		}
		System.out.print(node.data+" ");
		if(node.right!=null)
			printTree(node.right);
	}
}
