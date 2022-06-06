package linkedList;

import linkedList.AddToLisnkLIst.Node;

public class AddwoNumber {

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
	//	second.next=new Node(1);
	//	second.next.next=new Node(1);

		printList(second);
		System.out.println();
		printList(add2Num(first,second));
	
	}

private static Node add2Num(Node first,Node second) {

	int carry=0;
	
	Node temp=null;

		first =reverse(first);
		second=reverse(second);
		Node res=first; 
		Node res2=second;
	while(res!=null && res2!=null) {
		
		
		int num =res.data+res2.data+carry;
		carry=num/10;
		int n=num%10;
		res.data=n;
		
			
		temp=res;
		res=res.next;
		res2=res2.next;
		
	}
	
	if(res!=null || res2!=null) {
		if(res2!=null)temp.next=res2;
		res=temp.next;
		while(res!=null) {
			int sum= carry+res.data;
			res.data=sum%10;
			carry=sum/10;
			temp=res;
			res=res.next;
		}
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
