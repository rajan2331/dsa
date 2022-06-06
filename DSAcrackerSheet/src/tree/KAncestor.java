package tree;

import java.util.ArrayList;

public class KAncestor {
	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 KAncestor tree_level = new KAncestor();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(1);
	        tree_level.root.left = new Node(2);
	        tree_level.root.right = new Node(3);
	        tree_level.root.left.left = new Node(4);
	       tree_level.root.left.left.right = new Node(8);
	        tree_level.root.left.right = new Node(5);
	        tree_level.root.right.left = new Node(6);
	        tree_level.root.right.right = new Node(7);

	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	    	
	    	System.out.println(getKAncestor(root,8,3));
	 }
	 
	 
	 
	 static int getKAncestor(Node root,Integer node , int k) {
		 ArrayList<Integer> arr= new ArrayList<Integer>();
		 
		 arr=printPath(root,node);
		 int res=-1;
		 for(int i=arr.size()-1;i>=0;i--) {
			 
			 
			 if(k==0)
				res= arr.get(i);
			 k--;
		 }
		 System.out.println(arr);
		 return res;
		 
	 }
	static  ArrayList<Integer> printPath(Node root,int b) {
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		 if(root==null)
			 return arr;
		 getPath(root, arr, b);
		 return arr;
		 
	 }
	 
	 private static boolean getPath(Node root,ArrayList<Integer> arr,int x) {
		 if(root==null)
			 return false;
		 
		 arr.add(root.data);
		 if(root.data==x) {
			 return true;
		 }
			if(getPath(root.left, arr, x) || getPath(root.right, arr, x))
				return true;
			
			arr.remove(arr.size()-1);
			return false;
		 
	 }
}
