package searchin.sorting;

import java.util.Arrays;

public class ProductSubArray {
public static void main(String[] args) {
	int nums[]= {10,3,4,5,6}; // 3600
	int n=nums.length;
	System.out.println(Arrays.toString(productExceptSelf(nums,n)));
}

public static long[] productExceptSelf(int nums[], int n) 
{ 
	long[] prefix = new long[n];
	long[] suffix = new long[n];
	long[] result=new long[n];
	prefix[0]=1;
	suffix[n-1]=1;
	for(int i=1;i<n;i++)
		prefix[i]=prefix[i-1]*nums[i-1];
	
	for(int i=n-2;i>=0;i--) {
		suffix[i]=suffix[i+1]*nums[i+1];
	}
	System.out.println(Arrays.toString(prefix));
	System.out.println(Arrays.toString(suffix));
	for(int i=0;i<n;i++) {
		result[i]=prefix[i]*suffix[i];
	}
	
    return result;
} 
}
