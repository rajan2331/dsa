package linkedList;


public class MergeSOrt {


static class Node{
		
		private int data;
		private Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	
	public static void main(String[] args) {
		Node  first=new Node(4);
		first.next=new Node(2);
		first.next.next=new Node(1);
		first.next.next.next= new Node(6);
		first.next.next.next.next=new Node(7);
		printList(first);
		System.out.println();
	//	Node  second=new Node(1);
	//	second.next=new Node(1);
	//	second.next.next=new Node(1);

//		printList(second);
		System.out.println();
		printList(mergeSort(first));
	
	}

private static Node mergeSort(Node head) {
	if(head.next==null)
		return head;
	Node slow=head;
	Node fast=head.next;
	while(fast!=null && fast.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
		
	}
	
	Node second= slow.next;
	slow.next=null;
	Node left= mergeSort(head);
	Node right = mergeSort(second);
	Node merged= merge(left,right);
	
	
	return merged;
	
}

private static Node merge(Node head, Node slow) {
	
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




}
