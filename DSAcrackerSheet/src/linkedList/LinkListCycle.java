package linkedList;

import linkedList.LinkList.Node;

public class LinkListCycle {
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
	//	first.next.next.next=first;
//		printList(first);
		System.out.println(cycle(first));
//		printList(first);
	
	}

	private static boolean cycle(Node first) {
		Node slow=first;
		Node fast=first;
		boolean flag=false;
		while(slow!=null && fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{	flag=true;
				break;
			}
		}
		return flag;
	}

	private static  void  printList(Node first) {
		
		while(first!=null) {
			
			System.out.print(first.data+"->");
			first=first.next;
		}
		
	}

}
