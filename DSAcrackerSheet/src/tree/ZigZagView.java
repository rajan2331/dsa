package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.apache.commons.lang.SystemUtils;

public class ZigZagView {
	

	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 ZigZagView tree_level = new ZigZagView();
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
	    	
	    	System.out.println(zigZagTraversall(root));
	 } 	
	 
	 
	 static ArrayList <Integer> zigZagTraversal(Node node) 
	    {
		 ArrayList<Integer> li = new ArrayList<Integer>();
		 Deque<Node> deque = new LinkedList<Node>();
	//	Stack<Node> stack2= new Stack<Node>();
		deque.add(node);
		
	//	boolean check=false;
		li.add(deque.peek().data);
		int level=1;
		while(!deque.isEmpty()) {
			
			Node temp=null;
			for(int i =0 ;i<deque.size();i++) {
			
			if(level%2==0) 
				 temp=deque.pollLast();
				 else
					 temp=deque.pollFirst();
			
			if(level%2!=0) {
				if(temp.right!=null) {
					deque.add(temp.right);
					li.add(temp.right.data);
					//check=true;
				}
				if(temp.left!=null) {
					deque.add(temp.left);
					li.add(temp.left.data);
				//	check=true;
				}
			}else {
				
				
				
				if(temp.left!=null) {
					deque.offerFirst(temp.left);
					li.add(temp.left.data);
				//	check=false;
				}
				if(temp.right!=null) {
					deque.offerFirst(temp.right);
					li.add(temp.right.data);
				//	check=false;
				}
				
				
			}
			}
			level++;
			
			
			
		}
			return li;
	   	 
	    }
	 
		 static ArrayList <Integer> zigZagTraversall(Node node) {
			 
			 Queue<Node> queue= new LinkedList<Node>();
			 queue.add(node);
			 List<List<Integer>> list = new ArrayList<List<Integer>>();
			 ArrayList <Integer> result = new ArrayList<Integer>();
			 result.add(node.data);
			while(!queue.isEmpty()) {
				
				
				int level = queue.size();
				List<Integer> listy = new ArrayList<Integer>();
				for(int i=0;i<level;i++) {
					
				Node temp =queue.peek();	
				if(temp.left!=null) {
					queue.add(temp.left);
					listy.add(temp.left.data);
				}	if(temp.right!=null) {
					queue.add(temp.right);
					listy.add(temp.right.data);
				}
				queue.poll();
				}
				
				list.add(listy);
				
			}
			boolean check=false;
			for(List<Integer> l : list) {
				
				if(!check) {
					Collections.reverse(l);
					check=true;
				}else {
					check=false;
				}
				
				for(int a : l) {
					result.add(a);
				}
				
			}
			
			return result;
		    
		 }

}
