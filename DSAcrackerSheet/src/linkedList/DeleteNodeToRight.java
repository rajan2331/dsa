package linkedList;

import linkedList.LinkList.Node;

public class DeleteNodeToRight {


	static class Node{
		public int data;
		public Node next;
		
		public Node(int data ) {
			
			this.data=data;
			this.next = null;
		}
		
	}
	
	public static void main(String[] args) {
		Node first=new Node(12);
		first.next=new Node(15);
		first.next.next= new Node(10);
		first.next.next.next=new Node(11);
		first.next.next.next.next=new Node(5);
		first.next.next.next.next.next=new Node(6);
		first.next.next.next.next.next.next=new Node(2);
		first.next.next.next.next.next.next.next=new Node(3);
		printList(first);
		System.out.println();
		printList(deleteToright(first));
	// 12->15->10->11->5->6->2->3
	}

	private static Node deleteToright(Node first) {
		
		
		if(first==null)
			return null;
		
		Node revers= reverse(first);
		Node current = revers;
		
        Node max = revers;
        Node temp;
 
        while (current != null && current.next != null) {
            if (current.next.data < max.data) {
                temp = current.next;
                current.next = temp.next;
                temp = null;
            }
 
            else {
                current = current.next;
                max = current;
            }
        }
    
		first=reverse(revers);
		
		return first;
		}

	private static  void  printList(Node first) {
		
		while(first!=null) {
			
			System.out.print(first.data+"->");
			first=first.next;
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
