
/*
 * Given an array of size n and a range [a, b]. The task is to partition the array around the range such that array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified array.
 */
public class Prob313waypartiotion {

	public static void main(String[] args) {
	int	n = 5;
			int	A[] = {1, 2, 3, 3, 4};
				int a=1,b=2;
				threeWayPartition(A,a,b);
				
	}
	public static void threeWayPartition(int array[], int a, int b)
    {
	       
	      int start=0;
	      int end=array.length-1;
	      
	      for(int i=0;i<=end;) {
	    	  
	    	  if(array[i]<a) {
	    		  
	    		  int temp=array[start];
	    		   array[start]=array[i];
	    		  array[i]=temp;
	    		  start++;
	    		  i++;
	    	  }
	    	  else if(array[i]>b) {
	    		  int temp=array[end];
	   		   array[end]=array[i];
	   		  array[i]=temp;
	   		  end--;
	    	  }else
	    		  i++;
	    		  
	    		  
	      }
	    
	    }
}
