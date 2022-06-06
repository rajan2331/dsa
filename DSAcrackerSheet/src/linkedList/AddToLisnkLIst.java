package linkedList;

import linkedList.LLMoveToLast.Node;

public class AddToLisnkLIst {
static class Node{
		
		private int data;
		private Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	
	public static void main(String[] args) {
		Node  first=new Node(9);
		first.next=new Node(9);
		first.next.next=new Node(9);
		first.next.next.next= new Node(9);
		first.next.next.next.next=new Node(9);
		printList(first);
		System.out.println();
		printList(addNum(first));
	
	}

private static Node addNum(Node first) {

	int carry=1;
	
	Node temp=null;
		first =reverse(first);
		Node res=first; 
	while(res!=null) {
		if(carry>0) {
		int num =res.data+1;
		carry=num/10;
		int n=num%10;
		res.data=n;
		}
		temp=res;
		res=res.next;
		
		
		
	}
	
	if(carry>0) {
		Node newNode=new Node(1);
		temp.next=newNode;
	}
	return reverse(first);
		
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
