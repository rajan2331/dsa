package tree;

import java.util.HashMap;
import java.util.Map;

public class SumSubTree {

	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 SumSubTree tree_level = new SumSubTree();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(1);
	        tree_level.root.left = new Node(-2);
	        tree_level.root.right = new Node(3);
	        tree_level.root.left.left = new Node(4);
	        tree_level.root.left.right = new Node(5);
	        tree_level.root.right.left = new Node(-6);
	        tree_level.root.right.right = new Node(2);

	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	    	
	    	System.out.println(subsubTree(root));
	 }


	private static int subsubTree(Node root2) {
		
		int[] max= new int[1];
		sum(root,0,max);
		return max[0];
	}


	private static int sum(Node root2, int sum,int[] max) {
		
		
		if(root2==null)
			return 0;
		
		 sum =root2.data; 
		 
		 int left= sum(root2.left,sum,max);
		 int right=sum(root2.right,sum,max);
		 sum=sum+left+right;
		
		max[0]= Math.max(max[0], sum);
		return  sum;
		
		
	}

	
}
