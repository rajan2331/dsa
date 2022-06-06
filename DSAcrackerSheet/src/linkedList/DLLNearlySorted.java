package linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

import linkedList.DLLPairSum.Node;

public class DLLNearlySorted {

	
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
	
		push(8);
		push(56);
		push(12);
		push(2);
		push(6);
		push(3);
	//	push(4);
	//	push(2);
//		push(1);
		printList(head);
		
		nearlySorted(3);
		
		printList(head);
	
	}

	private static void nearlySorted( int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		Node fin= head;
		Node first = head;
		Node last= head;
		int len=1;
		while(last.next!=null) {
			len++;
			last=last.next;
		}
		int p=k;
		while(p+1!=0) {
			queue.add(first.data);
			p--;
			first= first.next;
		}
		System.out.println(queue);
//		System.out.println(len);
		
		while(first!=null) {
			
			fin.data=queue.peek();
			fin=fin.next;
			queue.poll();
			queue.add(first.data);
			first=first.next;
		}
		 Iterator<Integer> itr = queue.iterator();
        while (itr.hasNext()) {
            fin.data = queue.peek();
            fin=fin.next;
            queue.poll();
        }
        printList(fin);
		
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
		back=node;
		node=node.next;
	}
	
	System.out.println();
	/*while(back!=null) {
		System.out.print(back.data +"-> ");
		back=back.prev;
	}*/
	}
}
