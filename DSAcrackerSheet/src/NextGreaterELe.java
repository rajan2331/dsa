import java.util.Arrays;
import java.util.Stack;

public class NextGreaterELe {
public static void main(String[] args) {
	
	int arr[] = {13,7,6,12};
	System.out.println(Arrays.toString(nge(arr,arr.length)));
}

private static int[] nge(int[] arr, int length) {
	
	int[] nge= new int[length];
	Stack<Integer> stack =new Stack<Integer>();

	for(int i=length-1;i>=0;i--) {
		
		while(!stack.isEmpty())
		{ 
		if(arr[i]<stack.peek())
		{	nge[i]=stack.peek();
			stack.push(arr[i]);
			break;
		}else
		{
			stack.pop();
		}
		}
		if(stack.isEmpty())
		{
			nge[i]=-1;
			stack.push(arr[i]);
		}
	}	
	return nge;
}
}
