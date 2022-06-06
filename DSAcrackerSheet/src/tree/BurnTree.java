package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BurnTree {

	
	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 BurnTree tree_level = new BurnTree();
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
	    	
	    	System.out.println(burnTree(root));
	 }


	private static Integer burnTree(Node root2) {
	
		Map<Node,Node> parentMap = markParents(root);
		System.out.println(parentMap.size());
		return null;
	}


	private static Map<Node, Node>  markParents(Node root2) {
		
		Map<Node, Node> res = new HashMap<Node,Node>();
		
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root2);
		
		while(!queue.isEmpty()) {
			
			Node temp = queue.poll();
			if(temp.left!=null) {
				res.put(temp.left, temp);
				queue.add(temp.left);
			}
			
			if(temp.right!=null) {
				
				res.put(temp.right, temp);
				queue.add(temp.right);
			}
		}
		
		return res;
		
		
	} 	
	 
}
