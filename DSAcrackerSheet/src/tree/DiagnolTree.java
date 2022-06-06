package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class DiagnolTree {

	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 DiagnolTree tree_level = new DiagnolTree();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
		 tree_level.root = new Node(8);
		 tree_level.root.left = new Node(3);
		 tree_level.root.right = new Node(10);
		 tree_level.root.left.left = new Node(1);
		 tree_level.root.left.right = new Node(6);
		 tree_level.root.right.right = new Node(14);
		 tree_level.root.right.right.left = new Node(13);
		 tree_level.root.left.right.left = new Node(4);
		 tree_level.root.left.right.right = new Node(7);
	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	    	
	    	System.out.println(diagnol(root));
	    	
	 } 	
	 static List<Integer> diagnol(Node root) {
		 
		 class Pair{
			 
			 Node node;
			 int len;
			 
			 public Pair(Node node,int len) {
				// TODO Auto-generated constructor stub
				 this.len=len;
				 this.node=node;
			}
		}

		 List<Integer> list = new ArrayList<Integer>();
		 Map<Integer,List<Integer>> map= new HashMap<Integer,List<Integer>>();
		 map.computeIfAbsent(0, k -> new ArrayList<>()).add(root.data);
	//	 k -> new ArrayList<>()).add(item);
	/*	 Node left=root.left;
		 int i=1;
	 while(left!=null) {
			List<Integer> li =  map.get(i);
			if(li==null)
				li = new ArrayList<Integer>();
				
			
			li.add(left.data);
			map.put(i, li);
			 left=left.left;
			 i++;
		 }
		 Node right=root.right;
		 while(right!=null)
		 {
			 List<Integer> li =  map.get(0);
				if(li==null)
					li = new ArrayList<Integer>();
				li.add(right.data);
				map.put(0, li);
			 right=right.right;
			
		 }
		 */
		 Queue<Pair> queue= new LinkedList<Pair>();
		 queue.add(new Pair(root,0));
		 
		 while(!queue.isEmpty()) {
			Pair p = queue.poll();
			Node temp = p.node;
			int len = p.len;
			
			if(temp.left!=null)
			{
				int le=len+1;
				queue.add(new Pair(temp.left,le));
				 List<Integer> li =  map.get(le);
					if(li==null)
						li = new ArrayList<Integer>();
					li.add(temp.left.data);
					map.put(le, li);
			}
			if(temp.right!=null)
			{
				
				queue.add(new Pair(temp.right,len));
				 List<Integer> li =  map.get(len);
					if(li==null)
						li = new ArrayList<Integer>();
					li.add(temp.right.data);
					map.put(len, li);
			}
			
			
		 }
		 
		 System.out.println(map);
		 
		 for(Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
			 
			List<Integer> ll =  e.getValue();
			System.out.println(ll);
			 
		 }
		 return list;
		 
	 }
	 
	


}
