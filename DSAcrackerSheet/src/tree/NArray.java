package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class NArray {

	public static void main(String[] args) {
		
		
		int A[]= {1, 2, 1, 3, 1, 4, 4, 7, 4, 8, 4, 9, 3, 6, 2, 5, 6, 10, 6, 11, 6, 12};
		int B[] = {1 ,4 ,1, 3, 1, 2, 4, 9, 4, 8, 4, 7, 3, 6, 6, 12, 6 ,11 ,6 ,10, 2, 5};
		
	//	int A[] = {1, 2, 1, 3};
	//	int B[] = {1, 3, 1, 2};
		System.out.println(checkMirrorTreee(12,11,A,B));
	}
	
	static int checkMirrorTree(int n, int e, int[] A, int[] B) {
		
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> queue = new Stack<Integer>();
		for(int i=0;i<A.length;i++) {
			
			if(A[i]!=B[i])
			{
				stack.add(A[i]);
				queue.add(B[i]);
			}
			
			
		}
		System.out.println(stack);
		System.out.println(queue);
		int temp=stack.pop();
		while(!queue.isEmpty() && !stack.empty()) {
			if(stack.pop()==queue.pop() && temp==queue.pop()) {
				if(!stack.isEmpty())
				temp=stack.pop();
			}else
				return 0;
		}	
		return 1;
		
		
	}
	static int checkMirrorTreee(int n, int e, int[] A, int[] B) {
	  List<Stack<Integer>> s = new ArrayList<>();
      List<Queue<Integer>> q = new ArrayList<>();

      // initializing both list with empty stack and queue
      for (int i = 0; i <= n; i++) {
          s.add(new Stack<>());
          Queue<Integer> queue = new LinkedList<>();
          q.add(queue);
      }

         // add all nodes of tree 1 to list of stack and tree 2 to list of queue
      for (int i = 0; i < 2 * e; i += 2) {
          s.get(A[i]).push(A[i + 1]);
          q.get(B[i]).add(B[i + 1]);
      }

      System.out.println(s);
      System.out.println(q);
        // now take out the stack and queues
      // for each of the nodes and compare them
      // one by one
      for (int i = 1; i <= n; i++) {
          while (!s.get(i).isEmpty() && !q.get(i).isEmpty()) {
              int a = s.get(i).pop();
              int b = q.get(i).poll();

              if (a != b) {
                  return 0;
              }
          }
      }

      return 1;
}
	
}
