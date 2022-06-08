package ae.dubaipolice.soap;

public class Test2 {


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
		first.next.next.next=new Node(6);
		first.next.next.next.next=new Node(7);
		first.next.next.next.next.next=new Node(8);
		first.next.next.next.next.next.next=new Node(9);
		printList(first);
		System.out.println();
		
		printList(getNthFromLast(first,8));
	
	}
	static  Node getNthFromLast(Node head,int n)
     {
		
		Node first = head;
		Node temp = head;
		int i=0;
		while(temp!=null) {
			if(i>n+1) {
				first = first.next;
			}	
			i++;
			
			
			temp=temp.next;
			
		}
		if(n<i+1)
		first.next=first.next.next;
		while(first!=null)
			first= first.next;
		
		return head;
		
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