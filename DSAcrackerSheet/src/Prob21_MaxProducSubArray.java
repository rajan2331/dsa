
public class Prob21_MaxProducSubArray {

	public static void main(String[] args) {
	//	int[] arr= {8 ,-2, -2, 0, 8, 0, -6, -8, -6, -1};
		int[] arr= {-8 ,5 ,3 ,1 ,6};
		System.out.println(maxProduct(arr,arr.length));
	}
	
	  static long maxProduct(int[] arr, int n) {
		  
		  long max_sum=arr[0]; long min_sum=arr[0];
		 long maxProduct=arr[0];
		 for(int i=1;i<n;i++) {
			 if(arr[i]<0)
			 {
				 long temp = max_sum;
	                max_sum = min_sum;
	                min_sum =temp;
			 }
			 
			 max_sum=Math.max(max_sum*arr[i], arr[i]);
			 min_sum=Math.min(min_sum*arr[i],arr[i]);
			 maxProduct = Math.max(maxProduct, max_sum);
		 }
		 
		return maxProduct;
	    }

	  static long maxProductt(int[] arr, int n) {
		  
		  long max=arr[0];
		  long min=arr[0];
		  long result=arr[0];
		  long temp_max=0;
		  for(int i=1;i<n;i++) {
			  
			  temp_max= Math.max(arr[i]*max, Math.max(arr[i]*max, arr[i]));
			  min= Math.min(arr[i]*max, Math.min(arr[i]*min, arr[i]));
			  max=temp_max;
			  result=Math.max(max, result);
		  }
		  return result;
	  }
		  
		  
	
}
