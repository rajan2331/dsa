
public class Prob8_ContnigiousSumrray {
public static void main(String[] args) {
	
	int[] arr= {1,2,3,-2,5}; //9
//	int[] arr2={-1,-2,-3,-4};//-1
	System.out.println(getConitgiousSumSubArray(arr));
}

private static long getConitgiousSumSubArray(int[] arr) {
	
	
	long temp_sum=0;
    long max_sum=Integer.MIN_VALUE;
    for(int i:arr){
       
        temp_sum=temp_sum+i;
        
        if(temp_sum<max_sum)
         max_sum=temp_sum;
         
         if(temp_sum<0)
         temp_sum=0;
    }
     return max_sum;
//	int max_sum=Integer.MIN_VALUE;
//	int temp_sum=0;
//	for(int i=0;i<arr.length;i++) {
//		temp_sum=temp_sum+arr[i];
//		if(max_sum<temp_sum)
//			max_sum=temp_sum;
//		if(temp_sum<0)
//			temp_sum=0;
//	}
//	return max_sum;
}
}
