package tree;

public class SumTree {

	static Node root;
	
	static Node head;
	static Node tail ;
	 public static void main(String[] args) {
	        
		 SumTree tree_level = new SumTree();
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
	        toSumTree(root);
	        inorder(root);
	 //   	inOrderIt(root);
	//   	System.out.println(mirror(root));
	 } 
	 
	 public static void toSumTree(Node root){
        
		 sumUtil(root);
    }
  
	 private static int sumUtil(Node root2) {
		 
		 if(root2==null)
			 return 0;
		 
		 
		 int temp=root2.data;
		 
		 int l=sumUtil(root2.left);
		 int r=sumUtil(root2.right);
		 root2.data=l+r;
		 int sum=l+r+temp;
		return sum;
		 
		// TODO Auto-generated method stub
		
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
