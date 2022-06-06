package linkedList;

import linkedList.AddwoNumber.Node;

public class IntersectionLinkList {


static class Node{
		
		private int data;
		private Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	
	public static void main(String[] args) {
		Node  first=new Node(1);
		first.next=new Node(2);
		first.next.next=new Node(3);
		first.next.next.next= new Node(4);
		first.next.next.next.next=new Node(6);
		
		printList(first);
		System.out.println();
		Node  second=new Node(2);
		second.next=new Node(4);
		second.next.next=new Node(6);
		second.next.next.next=new Node(8);

		printList(second);
		System.out.println();
		printList(intesection(first,second));
	
	}

private static Node intesection(Node first,Node second) {

	
		Node inter=null;
		Node tail=null;
		
		while(first!=null && second!=null) {
			if(first.data==second.data) {
				Node newNode =new Node(first.data);
				if(inter==null)
				{	inter=newNode;
					tail=newNode;
				}else {
					tail.next=newNode;
					tail=newNode;
				}
				first=first.next;
				second=second.next;
		       
			}else if(first.data<second.data) {
				first=first.next;
				
			}else {
				second=second.next;
			}
			
			
		}
		return inter;
	}


private static  void  printList(Node first) {
		
		while(first!=null) {
			
			System.out.print(first.data+"->");
			first=first.next;
		}
		
	}



}
