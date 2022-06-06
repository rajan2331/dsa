package tree;

import java.util.HashMap;
import java.util.Map;

public class SumToLeaf {

	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 SumToLeaf tree_level = new SumToLeaf();
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
	    	
	    	System.out.println(sumOfLongRootToLeafPath(root));
	 }

	static Map<Integer,Integer> mp= new HashMap<>();
	   public  static int sumOfLongRootToLeafPath(Node root)
	   {   int sum=0,l=Integer.MIN_VALUE;
	       //code here
	       find(root,0,0);
	       System.out.println(mp);
	       for(Map.Entry i : mp.entrySet()){
	           if((int)i.getKey()>l)
	           sum=(int) i.getValue();
	           l=(int)i.getKey();
	       }
	       return sum;
	   }
	  static  void find(Node root,int level,int x){
	       if(root==null)  return;
	       x=x+root.data;
	       mp.put(level,x);
	       find(root.left,level+1,x);
	       find(root.right,level+1,x);
	       
	   }
}
