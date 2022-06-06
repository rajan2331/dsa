package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class PostOrderTraversal {

	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 PostOrderTraversal tree_level = new PostOrderTraversal();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(3);
	        tree_level.root.left = new Node(1);
	        tree_level.root.right = new Node(4);
	        tree_level.root.left.left = new Node(2);
	   //     tree_level.root.left.right = new Node(5);
	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	        postorder(root);
	    	System.out.println();
	    	postOrderIt(root);
	//   	System.out.println(mirror(root));
	 }


	private static void postOrderIt(Node root2) {
			List<Integer> list = new ArrayList<Integer>();
			if(root2==null)
				return   ;
			Queue<Node> que= new LinkedList<Node>();
			
			Stack<Node> stack = new Stack<Node>();
		//	stack.push(root2);
			que.add(root2);	
			while(!que.isEmpty()) {
				
				Node temp=que.poll();
				
				if(temp.left!=null)
				que.add(temp.left);
				if(temp.right!=null)
					que.add(temp.right);
				stack.push(temp);
			}
			
			while(!stack.isEmpty())
				list.add(stack.pop().data);
			System.out.println(list);
		
	}


	private static void postorder(Node root2) {
		if(root2.left!=null)
			postorder(root2.left);
		if(root2.right!=null)
			postorder(root2.right);
		
		System.out.print(root2.data+" ");
		
	}

}
