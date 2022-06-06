package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class DuplicateSubTree {


	
	
	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 DuplicateSubTree tree_level = new DuplicateSubTree();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(1);
	        tree_level.root.left = new Node(2);
	        tree_level.root.right = new Node(3);
	        tree_level.root.left.left = new Node(4);
	        tree_level.root.left.right = new Node(5);
	        tree_level.root.right.right = new Node(2);
	        tree_level.root.right.right.left = new Node(4);
	        tree_level.root.right.right.right = new Node(5);
	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	    	
	    	System.out.println(dupSub(root));
	 } 	
	
		static char MARKER = '$'; 

	    public static String dupSubUtil(Node root, HashSet<String> subtrees) 
	    { 
	        String s = ""; 
	    
	        if (root == null) 
	            return s + MARKER; 
	    
	        String lStr = dupSubUtil(root.left,subtrees); 
	        if (lStr.equals(s)) 
	            return s; 
	    
	        String rStr = dupSubUtil(root.right,subtrees); 
	        if (rStr.equals(s)) 
	            return s; 
	    
	        s = s + root.data + lStr + rStr; 
	    
	        if (s.length() > 3 && subtrees.contains(s)) 
	            return ""; 
	    
	        subtrees.add(s); 
	        System.out.println(s);
	        return s; 
	    } 

	    public static Integer dupSub(Node root) 
	    { 
	        HashSet<String> subtrees=new HashSet<>(); 
	    //    System.out.println(subtrees);
	        return dupSubUtil(root,subtrees).isEmpty()?1:0; 
	    } 

}
