package stackqueue;

public class Queue {
 int size;
 long[] queue;
 static int front;
static int rear;
 int cnt;
 
 
 public Queue(int size) {
	// TODO Auto-generated constructor stub
	 
	 this.size=size;
	 queue= new long[size];
	 front=0;
	 rear=0;
	 cnt=0;
}
 
 
 public static void main(String[] args) {
	
	 Queue q= new Queue(5);
	 q.enqueue(23);
	 q.enqueue(25);
	 q.enqueue(21);
	 q.enqueue(26);
	 q.enqueue(27);
	 print(q.queue);
	 System.out.println();
	 System.out.println(q.peek());
	 q.dequeue();
	 System.out.println();

	 print(q.queue);
	 System.out.println();
	 System.out.println(q.peek());
}


private void enqueue(int i) {

	if(cnt<size) {
	queue[rear++]=i;
	cnt++;
	}
	
}
private  long dequeue(){

	if(front<size ) {
		cnt--;
	return queue[front++];
	
	}else
		return -1;
	
}
private  long peek() {

	if(front!=rear ) {
	return queue[front];
	
	}else
		return -1;
	
}
private  static void print(long[] q) {
	int i=front;
	while(i<rear) {
		
		System.out.print(q[i] +" ");
		i++;
	}
}

}
