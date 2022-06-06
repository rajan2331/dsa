package linkedList;


public class LLPalindrome {


	static class Node{
		public int data;
		public Node next;
		
		public Node(int data ) {
			
			this.data=data;
			this.next = null;
		}
		
	}
	
	public static void main(String[] args) {
		Node first=new Node(5);
		first.next=new Node(1);
		first.next.next= new Node(5);
	//	first.next.next.next=new Node(5);
	//	first.next.next.next.next=new Node(5);
		printList(first);
		System.out.println();
		System.out.println(isPalindrome(first));
	
	}

	private static boolean isPalindrome(Node head) {
		Node slow=head;
		Node fast=head;
		Node prev=head;

		while(fast!=null && fast.next!=null) {
	
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		
		Node second=null;
		if(fast!=null) {
			second=slow.next;
				
		}else
		{	second=slow;
			//slow.next=null;
		}
		prev.next=null;
			
		Node curr=reverse(head);
		while(curr!=null && second!=null) {
			if(curr.data!=second.data)
				return false;
			
			curr=curr.next;
			second=second.next;
		}
		
		
		return true;
	}

	private static  void  printList(Node first) {
		
		while(first!=null) {
			
			System.out.print(first.data+"->");
			first=first.next;
		}
		
	}
// 	1->2>3>4
	private static Node reverse(Node first) {
		
		Node curr=first;
		Node prev=null;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
		}
		first=prev;
		return first;
		
	}
	

}
