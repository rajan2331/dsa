package linkedList;

import linkedList.LinkList.Node;

public class NthNode {


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
		System.out.println(getNthFromLast(first,2));
	
	}
	static  int getNthFromLast(Node head,int n)
     {
		
		int k=0;
		Node first=head;
		
		while(first.next!=null)
		{
			k++;
			first=first.next;
		}
		System.out.println(k);
		first.next=head;
		first=first.next;
		int c=k-n+1;
		if(c<0)
			return -1;
		while(c!=0&& first!=null) {
			c--;
			first=first.next;
			
		}
		return first.data;
     	// Your code here	
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
