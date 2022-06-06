package tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {

	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 TopView tree_level = new TopView();
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
	    	
	    	System.out.println(topView(root));
	//   	System.out.println(mirror(root));
	 }
	 

	static  ArrayList<Integer> topView(Node root)
	{
		
		class Pair{
			 
			 Node node;
			 int len;
			 
			 public Pair(Node node,int len) {
				// TODO Auto-generated constructor stub
				 this.len=len;
				 this.node=node;
			}
		}

		
		if(root==null)
			return null;
		
		 ArrayList<Integer> res= new ArrayList<Integer>();
		Queue<Pair> queue= new LinkedList<Pair>();
		
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		
		queue.add(new Pair(root,0));
		while(!queue.isEmpty()) {
			
			Pair p = queue.remove();
			int len= p.len;
			Node temp = p.node;
			if(map.get(len)==null)
			map.put(len, temp.data);
			if(temp.left!=null) {
				queue.add(new Pair(temp.left,len-1));
			}
			if(temp.right!=null) {
				queue.add(new Pair(temp.right,len+1));
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			res.add(entry.getValue());
			
		}
		return res;
	}	
	
	
	
		
}
