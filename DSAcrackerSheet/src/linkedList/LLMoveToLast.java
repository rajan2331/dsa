package linkedList;

import linkedList.LinkListRemoveUnSortedList.Node;

public class LLMoveToLast {
static class Node{
		
		private int data;
		private Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	
	public static void main(String[] args) {
		Node first=new Node(3);
		first.next=new Node(2);
		first.next.next=new Node(1);
		first.next.next.next= new Node(4);
		first.next.next.next.next=new Node(5);
		printList(first);
		System.out.println();
		printList(movetoLast(first));
	
	}
private static Node movetoLast(Node first) {
		// TODO Auto-generated method stub
	Node curr=first;

	Node b=null;
	while(curr.next!=null) {

		
		b=curr;
		curr=curr.next;
		
		
	}
	b.next=null;
	curr.next=first;
	first=curr;
	
	return first;
	}
private static  void  printList(Node first) {
		
		while(first!=null) {
			
			System.out.print(first.data+"->");
			first=first.next;
		}
		
	}
}
