package linkedList;


public class EvenOdd {


	static class Node{
		public int data;
		public Node next;
		
		public Node(int data ) {
			
			this.data=data;
			this.next = null;
		}
		
	}
	
	public static void main(String[] args) {
		Node first=new Node(1);
		first.next=new Node(3);
		first.next.next= new Node(7);
		first.next.next.next=new Node(5);
		printList(first);
		System.out.println();
		printList(divide(first));
	
	}

	
	private static Node divide( Node head){
	
		Node first=head;

	Node odds=null;
	Node odde=null;
	
	Node rev=null;
	Node reve=null;
	
	while(first!=null) {
		int ele=first.data;
	if(ele%2==0 ) {
		 if(rev == null) {
			 rev = first;
			 reve = rev;
         } else {
        	 reve.next = first;
        	 reve = reve.next;
         }
	}else {
		
		
		 if(odds == null) {
			 odds = first;
			 odde = odds;
         } else {
        	 odde.next = first;
        	 odde = odde.next;
         }
	}
	first=first.next;
	}
	
	
	 if(odds == null && rev== null) {
         return null;
     }
	if(reve!=null)
	reve.next=odds;
	odde.next=null;
	
	
	if(rev!=null)
		return rev;
	else
      return odds;
      
		
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
