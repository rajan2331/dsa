package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeafNodeSameLevel {
	
	
	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 LeafNodeSameLevel tree_level = new LeafNodeSameLevel();
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
	    	
	    	System.out.println(check(root));
	 } 	
	static  boolean check(Node root)
	  {
	ArrayList<Integer> leftV= new ArrayList<Integer>();
		int[] leaflevel= new int[1];
		      
		return leftView(root,0,leftV,leaflevel);
		
	}


	private static boolean leftView(Node root2, int level,ArrayList<Integer> leftV,int[] leafLevel) {
		
		if(root2==null)
			return false;
		boolean lef=false;
		boolean right=false;
		
		if(root2.left==null && root2.right==null && leafLevel[0]==0)
			leafLevel[0]=level;
		
		
		if(root2.left==null && root2.right==null )
		{
			if(level==leafLevel[0])
			return true;
			else
				return false;
		}
		
		lef=leftView(root2.left,level+1,leftV,leafLevel);
		
		right=leftView(root2.right, level+1,leftV,leafLevel);
		
		return lef&&right;
	
	}	
}
