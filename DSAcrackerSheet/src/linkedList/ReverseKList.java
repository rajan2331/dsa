package linkedList;


public class ReverseKList {
	static class Node{
		public int data;
		public Node next;
		
		public Node(int data ) {
			
			this.data=data;
			this.next = null;
		}
		
	}
	
	public static void main(String[] args) {
		Node first=new Node(2);
		first.next=new Node(3);
		first.next.next= new Node(4);
		first.next.next.next=new Node(5);
		printList(first);
		System.out.println();
		printList(reverse(first,2));
	
	}

	private static Node reverse(Node first, int k) {
		if(first==null)
			return first;
		Node next=null;
		Node prev=null;
		Node curr=first;
		int count=0;
		
		while(count<k && curr!=null) {
			
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
			
		}
		if(next!=null) {
			first.next= reverse(next,k);
		}
		
		
		return prev;
	}

	private static  void  printList(Node first) {
		
		while(first!=null) {
			
			System.out.print(first.data+"->");
			first=first.next;
		}
		
	}
}
