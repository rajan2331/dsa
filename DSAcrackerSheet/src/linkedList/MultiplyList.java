package linkedList;

import linkedList.LinkList.Node;

public class MultiplyList {


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
	//	first.next.next= new Node(4);
	//	first.next.next.next=new Node(5);
		printList(first);
		System.out.println();
		Node second=new Node(3);
		second.next=new Node(1);
	//	second.next.next= new Node(4);
	//	second.next.next.next=new Node(5);
		printList(first);
		System.out.println();
		System.out.println(multpily(first,second));
	
	}

	private static Long multpily(Node first, Node second) {
		long n1=0,n2=0;
		long num=1000000007;
		while(first!=null || second!=null) {
			
			if(first!=null) {
				n1=(n1*10)%num+first.data;
				first=first.next;
			}
			if(second!=null) {
				n2=(n2*10)%num+second.data;
				second=second.next;
			}
		}
		return ((n1%num)*(n2%num))%num;
	}

	private static  void  printList(Node first) {
		
		while(first!=null) {
			
			System.out.print(first.data+"->");
			first=first.next;
		}
		
	}
// 	1->2>3>4
	
	

}
