package linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import linkedList.DLLPairSum.Node;

public class DLLTriplet {


	
	static Node head;
	
	static class Node{
		Node next;
		Node prev;
		int data;
		public Node(int data) {
			this.data=data;
		}
		
	}
	
	public static void main(String[] args) {
	
		//push(13);
	//	push(12);
		push(9);
		push(8);
		push(6);
		push(5);
		push(4);
		push(2);
		push(1);
		printList(head);
		
		List<Integer[]> res= getPair(15);
		for(Integer[] a:res)
			System.out.println(Arrays.toString(a));
		
	
	}

	private static List<Integer[]> getPair( int k) {
		List<Integer[]> result= new ArrayList<Integer[]>();
		Node pe=head;
		Node temp =head;
		
		while(temp.next!=null) {
			temp=temp.next;
		//	temp=temp.next;
			
		}
		while(pe!=null) {
			
			Node first =pe.next;
			Node last = temp;
			
			while(first!=null && last !=null && first.data!=last.data && last.next!=first) {
				
				if((k-pe.data)==first.data+last.data) {
					Integer[] a = new Integer[3];
					a[0]=pe.data;
					
					a[1]=first.data;
					a[2]=last.data;
					result.add(a);
					first=first.next;
					last=last.prev;
				}else if((k-pe.data)>first.data+last.data)
					first=first.next;
				else
					last=last.prev;
			}
			pe=pe.next;
		}
		return result;
		
	}

	private static void push(int data) {
	
		Node newNode= new Node(data);
		newNode.next=head;
		newNode.prev=null;
		if(head!=null)	
		head.prev=newNode;
		
		head=newNode;
		
	}

	
	
	private static void printList(Node node) {
		Node back=null;
	
		
	while(node!=null) {
		System.out.print(node.data +"-> ");
		back=node;
		node=node.next;
	}
	
	System.out.println();
	/*while(back!=null) {
		System.out.print(back.data +"-> ");
		back=back.prev;
	}*/
	}

}
