package linkedList;

import linkedList.AddwoNumber.Node;

public class IntersectionPoint {


static class Node{
		
		private int data;
		private Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	
	public static void main(String[] args) {
		Node  first=new Node(3);
		first.next=new Node(4);
		first.next.next=new Node(5);
		first.next.next.next= new Node(5);
		first.next.next.next.next=new Node(9);
		printList(first);
		System.out.println();
		Node  second=new Node(1);
		second.next=new Node(1);
		second.next.next=new Node(1);

		printList(second);
		System.out.println();
		System.out.println(intersec(first,second));
	
	}

private static Integer intersec(Node first,Node second) {
	
	Node node1=null;
	int length=getLength(first);
	Node node2=null;
	int length1=getLength(second);
	int diff=0;
	if(length>=length1) {
		diff=length-length1;
		node1=first;
		node2=second;
	}else {
		diff=length1-length;
		node1=second;
		node2=first;
	}
	
	while(diff>0) {
		node1=node1.next;
		diff--;
	}
	
	while(node1!=null && node2!=null) {
		if(node1==node2)
			return node1.data;
		else {
			node1=node1.next;
			node2=node2.next;
		
	}
	}
	return -1;
}
private static int getLength(Node first) {
	int len=0;
	while(first!=null) {
		len++;
		first=first.next;
	}
	return len;
}

private static Node reverse(Node head) {
	Node curr=head;
	Node next=null;
	Node prev=null;
	while(curr!=null) {
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
	}
	head=prev;
	return head;
}
private static  void  printList(Node first) {
		
		while(first!=null) {
			
			System.out.print(first.data+"->");
			first=first.next;
		}
		
	}




}
