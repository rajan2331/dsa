package tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Serialize {
	static Node root;
	
	static class Student{
		
		int name ;
		int age;
		public Student(int name , int age) {
			this.age=age;
			this.name=name;
		}
	
		
	}
	 public static void main(String[] args) {
	        
		 Serialize tree_level = new Serialize();
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
	    	Student s1= new Student(1,1);
	    	Student s2= new Student(1,1);
	    	Set<Student> s= new HashSet<>();
	    	
	    	s.add(s1);
	    	s.add(s2);
	    	
	    	System.out.println(s);
	    	System.out.println(serialize(root));
	  //  	System.out.println(desrialize(serialize(root)));
	    	
	    	
	    	
	 } 	
	 
	 
	 private static String desrialize(Node serialize) {
		
		 
		return null;
	}


	private static String serialize(Node root2) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		Queue<Node> queue= new LinkedList<Node>();
		 StringBuilder sb= new StringBuilder();
		
		queue.add(root2);
		while(!queue.isEmpty()) {
			
			Node temp=queue.poll();
			sb.append(temp.data+",");
			if(temp!=null) {
			li.add(temp.data);
			if(temp.left!=null) {
				queue.add(temp.left);
			}else
				sb.append('#'+",");
			if(temp.right!=null) {
				queue.add(temp.right);
				
			}else
				sb.append('#'+",");
		}
		}	
		return sb.toString();
	}


	static ArrayList <Integer> levelOrder(Node node) 
	    {
		 ArrayList<Integer> li = new ArrayList<Integer>();
		Queue<Node> queue= new LinkedList<Node>();
		 
		queue.add(node);
		while(!queue.isEmpty()) {
			
			Node temp=queue.poll();
			if(temp!=null) {
			li.add(temp.data);
			if(temp.left!=null)
				queue.add(temp.left);
			if(temp.right!=null)
				queue.add(temp.right);
			}	
		}
			return li;
	   	 
	    }
	 
}
