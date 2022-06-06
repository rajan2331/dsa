package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KSum {



	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 KSum tree_level = new KSum();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
		 Node root = new Node(1);
	        root.left = new Node(3);
	        root.left.left = new Node(2);
	        root.left.right = new Node(1);
	        root.left.right.left = new Node(1);
	        root.right = new Node(-1);
	        root.right.left = new Node(4);
	        root.right.left.left = new Node(1);
	        root.right.left.right = new Node(2);
	        root.right.right = new Node(5);
	        root.right.right.right = new Node(2);
	 

	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	        getKsum(root,5);
	        
	        
	        for(List<Integer> li : result)
	    	System.out.println(li);
	    	
	 }
	 static List< List<Integer>> result = new ArrayList<List<Integer>>();
	 static List<Integer> list = new ArrayList<Integer>();

static void getKsum(Node root,int k) {
	
	if(root==null) 
		return;
		int sum=0;
		list.add(root.data);
		getKsum(root.left,k);
		getKsum(root.right, k);
		
		for(int i=list.size()-1;i>=0;i--) {
			sum=sum+list.get(i);
			if(sum==k) {
				List<Integer> listy = new ArrayList<Integer>();
				for(int p=i;p<list.size();p++) {
					
					listy.add(list.get(p));
				}
				result.add(listy);
			}
							
			
		}
		
		list.remove(list.size()-1);

		
	
}
}
