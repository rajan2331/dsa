package tree;

public class IsoMorphicTress {

	static Node root;
	static Node root2;
	
	
	 public static void main(String[] args) {
	        
		 IsoMorphicTress tree_level = new IsoMorphicTress();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(1);
	        tree_level.root.left = new Node(2);
	        tree_level.root.right = new Node(3);
	        tree_level.root.left.left = new Node(4);
	    //    tree_level.root.left. = new Node(8);
	        tree_level.root.left.right = new Node(5);
	        tree_level.root.right.left = new Node(6);
	        tree_level.root.right.right = new Node(7);
	        
	        tree_level.root2 = new Node(1);
	        tree_level.root2.left = new Node(2);
	        tree_level.root2.right = new Node(3);
	        tree_level.root2.left.left = new Node(10);
	    //    tree_level.ro2ot.left. = new Node(8);
	        tree_level.root2.left.right = new Node(5);
	        tree_level.root2.right.left = new Node(7);
	        tree_level.root2.right.right = new Node(9);

	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	    	
	    	System.out.println(isoMorphic(root,root2));
	 }


	private static boolean isoMorphic(Node node1,Node node2) {
		if(node1==null && node2 == null)
			return  true;
		
		if(node1!=null && node2==null)
			return false;
		if(node2!=null && node1== null)
			return false;
		if(node1.data!=node2.data)
			return false;
		
		return	(isoMorphic(node1.left,node2.left) &&isoMorphic(node1.right,node2.right) ) ||( isoMorphic(node1.left,node2.right )||isoMorphic(node1.right,node2.left));
			 
		
	
	}
	


}
