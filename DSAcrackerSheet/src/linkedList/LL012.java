package linkedList;

import linkedList.LLMoveToLast.Node;

public class LL012 {
static class Node{
		
		private int data;
		private Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	
	public static void main(String[] args) {
		Node first=new Node(1);
		first.next=new Node(0);
		first.next.next=new Node(1);
		first.next.next.next= new Node(2);
		first.next.next.next.next=new Node(1);
		printList(first);
		System.out.println();
		printList(sort(first));
	
	}
private static Node sort(Node first) {
	
	int zero=0;
	int one=0;
	int two=0;
	
	Node temp=first;
	while(temp!=null) {
		
		if(temp.data==0)
			zero++;
		
		if(temp.data==1)
			one++;
		
		if(temp.data==2)
			two++;
		
		temp=temp.next;
		
	}
	Node curr=first;
	
	while(curr!=null) {
		
		if(zero>0) {
			curr.data=0;
		zero--;
		}
		else if(one  >0) {
			curr.data=1;
			one--;
			
		}else {
			
			curr.data=2;
			two--;
		}
	//	curr=first;
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
