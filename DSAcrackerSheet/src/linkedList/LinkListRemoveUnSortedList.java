package linkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkListRemoveUnSortedList {

	
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
		first.next.next=new Node(2);
		first.next.next.next= new Node(4);
		first.next.next.next.next=new Node(5);
		printList(first);
		System.out.println();
		printList(removeDuplicateUnsorted(first));
	
	}

	private static Node removeDuplicateUnsorted(Node first) {
		Node curr= first;
		Node prev=null;
		
		Set<Integer> hash= new HashSet<Integer>();
		
		while(curr!=null) {
			
			int val= curr.data;
			
			if(hash.contains(val)) {
				prev.next=curr.next;
			}else {
				hash.add(val);
				prev=curr;
			}
			curr=curr.next;
		}
		
		return first;
	}

	private static  void  printList(Node first) {
		
		while(first!=null) {
			
			System.out.print(first.data+"->");
			first=first.next;
		}
		
	}
}
