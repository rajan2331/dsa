package linkedList;

import linkedList.FirstNodeLinked.Node;

public class RemoveDuplicate {
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
		first.next.next=new Node(3);
		first.next.next.next= new Node(4);
		first.next.next.next.next=new Node(5);
		first.next.next.next.next.next=new Node(5);
		printList(first);
		System.out.println();
		printList(removeDuplicate(first));
		
	
	}
	private static  void  printList(Node first) {
		
		while(first!=null) {
			
			System.out.print(first.data+"->");
			first=first.next;
		}
		
	}
	private static Node removeDuplicate(Node first) {
		Node curr=first;
		while(curr!=null&& curr.next!=null) {
			if(curr.next.data==curr.data)
			{	
				
				curr.next=curr.next.next;
				
			}else
			curr=curr.next;
		}
		
		return first;
	}
}
