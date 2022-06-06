package linkedList;



public class DLLReverse {
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
	
		push(5);
		push(6);
		push(7);
		push(10);
		push(3);
		push(4);
		printList(head);
		reverse();
		
		printList(head);
	
	}
	

	private static void reverse() {
	Node temp = head;
		
	Node teP=null;
	while(temp!=null)
	{
		
		 teP= temp.prev;
		 temp.prev=temp.next;
		temp.next=teP;
		
		
		
		temp=temp.prev;
		
	}
	if(teP!=null)
		head=teP.prev;
	
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
