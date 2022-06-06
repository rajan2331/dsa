package stackqueue;

public class Stack {

	long[] stack ;
	int max;
	int top;
	
	public Stack(int s) {
	max=s;
	stack=  new long[max];
	top=-1;
	
	}
	
	
	public static void main(String[] args) {
		
	      Stack theStack = new Stack(10); 
	      theStack.push(10);
	      theStack.push(20);
	      theStack.push(30);
	      theStack.push(40);
	      theStack.push(50);
	      
	      while (!theStack.isEmpty()) {
	         long value = theStack.pop();
	         System.out.print(value);
	         System.out.print(" ");
	      }
	      System.out.println("");
	   }


	private long pop() {
		return stack[top--];
		
	}


	private boolean isEmpty() {
	
		return top==-1;
	}

	  public boolean isFull() {
	      return (top == max - 1);
	   }
	private void push(int i) {
		stack[++top]=i;
		
		
	}
}

