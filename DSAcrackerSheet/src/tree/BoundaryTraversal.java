package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BoundaryTraversal {
	


	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 BoundaryTraversal tree_level = new BoundaryTraversal();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(1);
	        tree_level.root.left = new Node(2);
	        tree_level.root.right = new Node(3);
	        tree_level.root.right.left = new Node(12);
	        tree_level.root.left.left = new Node(4);
	        tree_level.root.left.right = new Node(5);
	        tree_level.root.right.right = new Node(8);
	        tree_level.root.right.right.right = new Node(9);
	        tree_level.root.left.left.left = new Node(10);
	        
	        
/*	            1
	           
	         2      3
	         
	      4   5         8
	   10   				9*/
	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	    //    postorder(root);
	    	System.out.println();
	    	
	    	System.out.println(boundary(root));
	//   	System.out.println(mirror(root));
	 }
	 

	static  ArrayList<Integer> boundary(Node root)
	{
			ArrayList<Integer> res=new ArrayList<Integer>();
			
			ArrayList<Integer> leafLeft=new ArrayList<Integer>();
			ArrayList<Integer> leafRight=new ArrayList<Integer>();
			if(root==null)
				return null;
			res.add(root.data);
			 ArrayList<Integer> leftView = leftView(root.left);
			
	//		 if(leftView.size()>0)
	//		 leftView.remove(leftView.size()-1);
			 ArrayList<Integer>  rightView = rightView(root.right);
			 
	//		 if(rightView.size()>0) {
	//			 rightView.remove(0); 
	//		 rightView.remove(rightView.size()-1);
	//		 }
	//		 Collections.reverse(rightView);
			 leafLeft=leafView(root.left);
			 leafRight=leafView(root.right);
		//	 System.out.println(leftView);
		//	 System.out.println(leafLeft);
		//	 System.out.println(leafRight);
		//	 System.out.println(rightView);
			 for(int a:leftView)
				 res.add(a);
			 for(int b:leafLeft)
				 res.add(b);
			 for(int b:leafRight)
				 res.add(b);
			 for(int c:rightView)
				 res.add(c);
			 
			 return res;
			 
		}	
		static ArrayList<Integer> leafView(Node root){
			
			ArrayList<Integer> leafView= new ArrayList<Integer>();
			leafView(root,leafView);
			return leafView;
		}
		
		private static void leafView(Node root2,  ArrayList<Integer> leafView) {
			
			if(root2==null)
				return;
			
			if(root2.left==null && root2.right==null)
				leafView.add(root2.data);
			leafView(root2.left,leafView);
		
			leafView(root2.right,leafView);
		}
	
	
		static  ArrayList<Integer> leftView(Node root)
		{
		
			ArrayList<Integer> leftV= new ArrayList<Integer>();
			
			leftView(root,leftV);
			return leftV;
			
		}
	
	
		private static void leftView(Node root2,ArrayList<Integer> leftV) {
			
			if(root2==null)
				return ;
					
			if(root2.left!=null) {	
				leftV.add(root2.data);
			leftView(root2.left,leftV);
			}else if(root2.right!=null) {
				leftV.add(root2.data);
				leftView(root2.right, leftV);
			}
			
		
		}	
			
		static  ArrayList<Integer> rightView(Node root)
		{
		
			ArrayList<Integer> rightV= new ArrayList<Integer>();
			
			rightView(root,rightV);
			return rightV;
			
		}
	
	
		private static void rightView(Node root2, ArrayList<Integer> rightV) {
			
			if(root2==null)
				return ;
			
			if(root2.right!=null) {
			rightView(root2.right,rightV);
			rightV.add(root2.data);
			
			}else if(root2.left!=null) {
			rightView(root2.left,rightV);
			rightV.add(root2.data);
		
			}
		}	
	

}
