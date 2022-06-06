package searchin.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class MinSwapToSortArray {
	public static void main(String[] args) {
		int nums[]= {2, 8, 5, 4};
		System.out.println(minSwaps(nums));
	}

	 public static int minSwaps(int nums[])
	{
		 int ans=0;
		 int temp[]=Arrays.copyOfRange(nums, 0, nums.length);
		 HashMap<Integer,Integer> map=  new HashMap<Integer,Integer>();
		 Arrays.sort(temp);
		 for(int i=0;i<nums.length;i++) {
			 map.put(nums[i],i);
		 }
		 
		 for(int i=0;i<nums.length;i++) {
			 
			 if(nums[i]!=temp[i]) {
				 int init = nums[i];
				 ans++;
				 swap(nums,i,map.get(temp[i]));
				 map.put(init, map.get(temp[i]));
				 map.put(temp[i], i);
			 }
		 }
		return ans;
	        // Code here
	 }
	 public static void swap(int[] arr, int i, int j)
	    {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
}
