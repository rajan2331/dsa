package linkedList;

import linkedList.MergeSOrt.Node;

public class MergeKList {


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
		Node second=new Node(5);
		second.next=new Node(6);
		second.next.next= new Node(7);
		second.next.next.next=new Node(8);
		Node third=new Node(7);
		third.next=new Node(9);
		third.next.next= new Node(10);
		third.next.next.next=new Node(11);
		printList(first);
		System.out.println();
		printList(second);
		System.out.println();
		printList(third);
		System.out.println();
		Node[] arr = new Node[3];
		arr[0]= first;
		arr[1]=second;
		arr[2]=third;
		System.out.println();
		printList(merge(arr,3));
	
	}

	

	private static Node merge(Node[] arr, int k) {
		
		if(arr.length>1) {
		Node merge=merged(arr[0],arr[1]);
		for(int i=2;i<k;i++) {
			merge=merged(merge,arr[i]);
			
		}
		return merge;
		}else
			return arr[0];
			
	}


private static Node merged(Node head, Node slow) {
	
	Node n1=head;
	Node n2=slow;
	Node merged=new Node(-1);
	Node temp=merged;
	while(n1!=null && n2!=null) {
		if(n1.data<n2.data) {
			temp.next=n1;
			n1=n1.next;
		}else {
			temp.next=n2;
			n2=n2.next;
		}
		temp=temp.next;
	}
	while(n1!=null) {
		temp.next=n1;
		n1=n1.next;
		temp=temp.next;
	}
	while(n2!=null) {
		temp.next=n2;
		n2=n2.next;
		temp=temp.next;
	}
	return merged.next;
}

	private static  void  printList(Node first) {
		
		while(first!=null) {
			
			System.out.print(first.data+"->");
			first=first.next;
		}
		
	}
// 	1->2>3>4
	
	

}
