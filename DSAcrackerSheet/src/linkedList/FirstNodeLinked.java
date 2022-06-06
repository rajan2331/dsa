package linkedList;

import linkedList.LinkList.Node;

public class FirstNodeLinked {
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
		first.next.next.next.next=first.next;
	//	printList(first);
		System.out.println(detectFirstNode(first).data);
		
	
	}

	private static Node detectFirstNode(Node head) {
		
		if(head==null || head.next==null) {
			return null;
		}
		Node slow=head,fast=head;
		slow=slow.next;
		fast=fast.next.next;
		
		while(fast!=null && fast.next!=null) {
			if(slow==fast)
				break;
			slow=slow.next;
			fast=fast.next.next;
			
		}
		if(slow!=fast)
			return null;
		
		slow=head;
		while(slow!=fast) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}

	private static  void  printList(Node first) {
		
		while(first!=null) {
			
			System.out.print(first.data+"->");
			first=first.next;
		}
		
	}

}
