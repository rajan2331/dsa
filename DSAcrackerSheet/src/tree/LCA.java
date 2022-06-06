package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LCA {


	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 LCA tree_level = new LCA();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(1);
	        tree_level.root.left = new Node(2);
	        tree_level.root.right = new Node(3);
	        tree_level.root.left.left = new Node(4);
	        tree_level.root.left.right = new Node(5);
	        tree_level.root.right.left = new Node(6);
	        tree_level.root.right.right = new Node(7);

	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	    	
	    	System.out.println(lca(root,6,7));
	 }
	static HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();

	static Node lca(Node root, int n1,int n2)
		{
			
		if(root==null)
			return new Node(-1);
		
		System.out.println(map);
		preorder(root,map,new ArrayList<Integer>());	
		return null;

	
		}
private static void preorder(Node root2,HashMap<Integer, ArrayList<Integer>> map,ArrayList<Integer> list) {
		
		
		if(root2==null) {
			
			
			return;
		}
		list.add(root2.data);
		
		if(!map.containsKey(root2.data))
		{	map.put(root2.data, list);
		list.remove(list.size()-1);
		}
			preorder(root2.left,map,list);
			preorder(root2.right,map,list);
		
			
	} 
	

}
