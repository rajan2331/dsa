package tree;

import java.util.LinkedList;
import java.util.Queue;


public class HeightTree {
	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 HeightTree tree_level = new HeightTree();
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
	    	
	    	System.out.println(height(root));
	 } 	
	 
	 
	 static int height(Node node) 
	    {
		 
		 int count=0;
		 Queue<Node> queue= new LinkedList<Node>();
		 queue.add(node);
		 boolean check=true;
		while(!queue.isEmpty()) {
			
			
			int level = queue.size();
			
			for(int i=0;i<level;i++) {
			Node temp =queue.peek();	
			
			if(temp.left!=null)
				queue.add(temp.left);
			if(temp.right!=null)
				queue.add(temp.right);
			
			queue.poll();
			}
			
			count++;
		}
		
		return count;
	        // code here 
	    }	 
}


