import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class NearlySortedArray {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 3, 12, 56, 8};
		
		int k=3;
		System.out.println(Arrays.toString(nearlySorted(arr,k)));
	}

	private static int[] nearlySorted(int[] arr, int k) {
		
		
		 PriorityQueue<Integer> queue   = new PriorityQueue<>();
		 
		 for(int i=0;i<k+1;i++)
			 queue.add(arr[i]);
		 int j=0;
		 for(int i=k+1;i<arr.length;i++) {
			 arr[j]=queue.peek();
			 j++;
			 queue.poll();
			 queue.add(arr[i]);
		 }
		 System.out.println(queue);
		  Iterator<Integer> itr = queue.iterator();
		  
	        while (itr.hasNext()) {
	            arr[j++] = queue.peek();
	            queue.poll();
	        }
	        
	       		 
		return arr;
	}
}
