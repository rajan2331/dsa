package tree;

import java.util.HashMap;
import java.util.Map;

public class ContructTreeInoRderPreOrder {


	static Node root;
	
	static Node head;
	static Node tail ;
	 public static void main(String[] args) {
	        
		 ContructTreeInoRderPreOrder tree_level = new ContructTreeInoRderPreOrder();
	     int inorder[] = {3 ,1, 4, 0, 5, 2};
	     int preorder[] = {0 ,1 ,3 ,4 ,2 ,5};
	     buildTree(inorder,preorder,inorder.length);
	        postorder(root);
	 } 
	 
	 public static Node buildTree(int inorder[], int preorder[], int n)
     {
		 
		 
		 Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		 
		 for(int i=0;i<n;i++) {
			 map.put(inorder[i], i);
		 }
		 
		  root= solve(preorder,0,n-1,inorder,0,n-1,map);
		  return root;
		 
     }
	 
	 private static Node solve(int[] preorder, int preS, int preE, int[] inorder, int inS, int inE, Map<Integer, Integer> map) {
		
		 if(preS>preE || inS>inE)
			 return null;
		 Node root= new Node(preorder[preS]);
		 int inRoot= map.get(preorder[preS]);
		 int numsLeft=inRoot-preS;
		 root.left=solve(preorder,preS,preS+numsLeft,inorder,inS,inRoot-1,map);
		 
		 root.right=solve(preorder,preS+numsLeft,preE,inorder,inRoot+1,inE,map);
		 
		return root;
	}

	

	 private static void postorder(Node root2) {
			if(root2.left!=null)
				postorder(root2.left);
			if(root2.right!=null)
				postorder(root2.right);
			
			System.out.print(root2.data+" ");
			
		}

}
