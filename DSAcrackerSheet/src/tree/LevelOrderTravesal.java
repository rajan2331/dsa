package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class LevelOrderTravesal {
	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 LevelOrderTravesal tree_level = new LevelOrderTravesal();
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
	    	
	    	System.out.println(reverseLevelOrder(root));
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
	 
	 
	 public static ArrayList<Integer> reverseLevelOrder(Node node) 
	    {
		 ArrayList<Integer> li = new ArrayList<Integer>();
			Queue<Node> queue= new LinkedList<Node>();
			Stack<Node> stack = new Stack<Node>();
			queue.add(node);
			while(!queue.isEmpty()) {
				Node temp = queue.poll();
				stack.add(temp);
				
				if(temp.right!=null)
					queue.add(temp.right);
				
				if(temp.left!=null)
					queue.add(temp.left);
				
				
			}
			
			while(!stack.isEmpty())
				li.add(stack.pop().data);
			
			return li;
	    }
	 
	 private Node insert(Node current,int value){
	    	if (current == null) {
	        return new Node(value);
	    }

	    if (value < current.data) {
	        current.left = insert(current.left, value);
	    } else if (value > current.data) {
	        current.right = insert(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }

	    return current;
	    }
	    public void add(int value){
	    	root=insert(root,value);
	    }
	
}
