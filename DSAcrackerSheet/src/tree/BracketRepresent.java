package tree;

import java.util.ArrayList;

public class BracketRepresent {


	static Node root;
	
	
	 public static void main(String[] args) {
	        
		
	    	System.out.println();
	    	
	    	preorder(bracketRepresent("1(2)(3)"));
	
	 }
	 
	 
	
	static  Node bracketRepresent(String st)
	{
	
	//	ArrayList<Integer> represent= new ArrayList<Integer>();
	
		
		for(char c:st.toCharArray()) {
			
			if(c!='(' && c!=')')
				root=new Node(c);
			if(c=='(')
				root.left=root;
			if(c==')')
				root=root.right;
			
			
		}
		
		return root;
		
	}


private static void preorder(Node root2) {
		
		System.out.print(root2.data+" ");
		
		if(root2.left!=null)
			preorder(root2.left);
		if(root2.right!=null)
			preorder(root2.right);
			
		
	} 

}
