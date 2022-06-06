package linkedList;

import linkedList.LinkList.Node;

public class LLCircularDel {


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
		first.next.next.next.next=first;
		printList(first);
		System.out.println();
		printList(deleteNode(first,5));
	
	}

	private static Node deleteNode(Node first, int i) {
		
	
		Node prev=first;
		Node curr= first;
		while(curr.data!=i) {
			if(curr.next==first) {
				return first;
			}
			prev=curr;
			curr=curr.next;
		}
	
		 if (curr == first && curr.next == first) {
	            first = null;
	            return first;
	       }
		if(curr==first) {
			prev=first;
			while(prev!=first) {
				prev=prev.next;
			first=curr.next;
			prev.next=first;
			}
		}
		else if(curr.next==first) {
			prev.next=first;
		}
		else {
			
			prev.next=curr.next;
			
		}
		return first;
		
	}

	private static  void  printList(Node first) {
		System.out.print(first.data+"->");
		Node curr=first.next;
		while(curr!=null && curr!=first) {
			
			System.out.print(curr.data+"->");
			curr=curr.next;
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
