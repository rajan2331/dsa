package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Nodee
{
    int data;
    Nodee left, right;
    int hd;

    Nodee(int item)
    {
        data = item;
        hd=Integer.MAX_VALUE;
        left = right = null;
    }
}


public class BottomViewTree {

	
	static Nodee root;
	
	
	 public static void main(String[] args) {
	        
		 BottomViewTree tree_level = new BottomViewTree();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Nodee(1);
	        tree_level.root.left = new Nodee(2);
	        tree_level.root.right = new Nodee(3);
	        tree_level.root.left.left = new Nodee(4);
	        tree_level.root.left.right = new Nodee(5);
	        tree_level.root.right.right = new Nodee(8);
	        tree_level.root.right.right.right = new Nodee(9);
	        tree_level.root.left.left.left = new Nodee(10);
	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	    //    postorder(root);
	    	System.out.println();
	    	
	    	System.out.println(bottomView(root));
	//   	System.out.println(mirror(root));
	 }
	 

	static  ArrayList<Integer> bottomView(Nodee root)
	{
		
		
		
		if(root==null)
			return null;
		
		 ArrayList<Integer> res= new ArrayList<Integer>();
		Queue<Nodee> queue= new LinkedList<Nodee>();
		
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		
		queue.add(root);
		root.hd=0;
		while(!queue.isEmpty()) {
			
			Nodee temp = queue.remove();
			int len= temp.hd;
			
		//	if(map.get(len)==null)
			map.put(len, temp.data);
			if(temp.left!=null) {
				temp.left.hd=len-1;
				queue.add(temp.left);
			}
			if(temp.right!=null) {
				temp.right.hd=len+1;
				queue.add(temp.right);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			res.add(entry.getValue());
			
		}
		return res;
	}	
	
	
	
		

}
