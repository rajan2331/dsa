package tree;

import java.util.ArrayList;

public class LeftViewree {

	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 LeftViewree tree_level = new LeftViewree();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(1);
	        tree_level.root.left = new Node(2);
	        tree_level.root.right = new Node(3);
	        tree_level.root.left.left = new Node(4);
	        tree_level.root.left.right = new Node(5);
	        tree_level.root.right.right = new Node(8);
	        tree_level.root.right.right.right = new Node(9);
	        tree_level.root.left.left.left = new Node(10);
	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	    //    postorder(root);
	    	System.out.println();
	    	
	    	System.out.println(leftVieww(root));
	//   	System.out.println(mirror(root));
	 }
	 
	 
	
	private static ArrayList<Integer> leftVieww(Node root2) {
		
		
		ArrayList<Integer> leftV= new ArrayList<Integer>();
		
		leftViewee(root,0,leftV);
		return leftV;
	}



	private static void leftViewee(Node root2, int level, ArrayList<Integer> leftV) {
		
		if(root2==null)
			return;
		
		if(level==leftV.size())
			leftV.add(root2.data);
		leftViewee(root2.left,level+1,leftV);
		leftViewee(root2.right,level+1,leftV);
		
	}



	static  ArrayList<Integer> leftView(Node root)
	{
	
		ArrayList<Integer> leftV= new ArrayList<Integer>();
		
		leftView(root,0,leftV);
		return leftV;
		
	}


	private static void leftView(Node root2, int level,ArrayList<Integer> leftV) {
		
		if(root2==null)
			return ;
		
		if(level==leftV.size())
		{
			leftV.add(root2.data);
		
			
		}
		leftView(root2.left,level+1,leftV);
		
		leftView(root2.right, level+1,leftV);
	
	}	
		
}
