package ae.dubaipolice.soap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
public static void main(String[] args) {
	
	int[] arr = {10,5,2,7,8,7};
	//System.out.println(getMax(arr,3).toString());
	String[] res= {"dog","cat", "hello", "cat" ,"dog", "dog" ,"hello" ,"cat" ,"world"};
	System.out.println(getDist(res,"cat","cat"));
}

private static  List<Integer>  getMax(int[] arr, int k) {
	
	 PriorityQueue<Integer> queue = new  PriorityQueue<>(Collections.reverseOrder());
	 List<Integer> res= new ArrayList();
	 int i=0;
	 while(i<arr.length) {
		 if(queue.size()==k)
		 {
			 res.add(queue.peek());
				
			 queue.remove(arr[i-k]);
			 
		 }else {
			 queue.add(arr[i]);
			 i++;
		 }
		 
	 }
	 res.add(queue.peek());
	return res;
}
	private static  int  getDist(String[] res,String initWord,String finalWord) {
		int count =0;
		if(res==null || res.length==0)
			return count;
		
		boolean counterFlg=false;
		String currentWord= "";
		int dist=Integer.MAX_VALUE;
		
		for(String word :res) {
			if(counterFlg)
				count++;
			if(word.equals(currentWord)) {
				count=count-1;
				dist =Math.min(dist, count);
			}	
			if((currentWord.equals(finalWord)&& word.equals(initWord)) || (currentWord.equals(initWord)&& word.equals(finalWord)))
			{
				count=0;
				counterFlg=true;
			}
			if(word.equals(initWord) || word.equals(finalWord)) {
				
				if(word.equals(initWord))
					currentWord=finalWord;
				else
					currentWord=initWord;
				
				counterFlg=true;
			}
		}
		
		return dist;
	}
}
