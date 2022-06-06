package tree;

public class IsSumTree {

	static Node root;
	
	
	 public static void main(String[] args) {
	        
		 IsSumTree tree_level = new IsSumTree();
	   // 	tree.add(4);
	//	   BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(10);
	        tree_level.root.left = new Node(12);
	        tree_level.root.right = new Node(15);
	        tree_level.root.left.left = new Node(25);
	        tree_level.root.left.right = new Node(30);
	        tree_level.root.right.left = new Node(36);
	 //   	tree.add(6);
	  //  	tree.add(7);
	   // 	tree.add(8);
	        System.out.println(toSumTree(root));
	        inorder(root);
	 //   	inOrderIt(root);
	//   	System.out.println(mirror(root));
	 } 
	 
	 public static boolean toSumTree(Node root){
        

			return  sumUtil(root);
	    }
	  
		 private static boolean sumUtil(Node root2) {
			 
			 if(root2==null)
				 return true;
			 int left =sum(root2.left);
			 int right=sum(root2.right);
			 
			
			if(left+right!=root2.data&& sumUtil(root2.left)!=false && sumUtil(root2.right)!=false )
				return false;
			return  true;
			 
			
		}

		private static int sum(Node node) {
			if(node==null)
			return 0;
			return sum(node.left)+node.data+sum(node.right);
		}
	static void inorder(Node node) {

			if(node.left!=null) {
				inorder( node.left);
				
			}
			System.out.print(node.data+" ");
			if(node.right!=null)
				inorder(node.right);
		
	 }
}
