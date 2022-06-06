package linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DLLPairSum {

	
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
		
		List<Integer[]> res= getPair(9);
		for(Integer[] a:res)
			System.out.println(Arrays.toString(a));
		
	
	}

	private static List<Integer[]> getPair( int k) {
		
		Node first =head;
		Node last =head;
		List<Integer[]> result= new ArrayList<Integer[]>();
		while(head.next!=null) {
			last=head.next;
			head=head.next;
			
		}
		
		while(first.data<last.data) {
			
			if(k-first.data==last.data) {
				Integer[] a = new Integer[2];
				a[0]=first.data;
				a[1]=last.data;
				result.add(a);
				first=first.next;
				last=last.prev;
			}else if(k-first.data>last.data)
				first=first.next;
			else
				last=last.prev;
		}
		// TODO Auto-generated method stub
		return result;
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
