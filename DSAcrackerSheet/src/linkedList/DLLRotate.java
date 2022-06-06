package linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import linkedList.DLLPairSum.Node;

public class DLLRotate {


	
	static Node head;
	
	static class Node{
		Node next;
		Node prev;
		int data;
		public Node(int data) {
			this.data=data;
		}
		
	}
	
	public static void main(String[] args) {
	
		push(13);
		push(12);
		push(9);
		push(8);
		push(6);
		push(5);
		push(4);
		push(2);
		push(1);
		printList(head);
		rotateDll(2);
		printList(head);
		
	
	}

	private static void rotateDll(int n) {
		
		Node first= head;
		int c=0;
		
		while(c<n&& first!=null) {
			first=first.next;
			c++;
		}
		
		System.out.println(first.data);
		Node temp=first;
		while(first.next!=null)
		{
			first=first.next;
		}
		
		first.next=head;
		head.prev=first;
		
		head=temp.next;
		head.prev=null;
		temp.next=null;
		
	}

	private static void push(int data) {
	
		Node newNode= new Node(data);
		newNode.next=head;
		newNode.prev=null;
		if(head!=null)	
		head.prev=newNode;
		
		head=newNode;
		
	}

	
	
	private static void printList(Node node) {
		Node back=null;
	
		
	while(node!=null) {
		System.out.print(node.data +"-> ");
		
		node=node.next;
	}
	
	System.out.println();
	/*while(back!=null) {
		System.out.print(back.data +"-> ");
		back=back.prev;
	}*/
	}

}
