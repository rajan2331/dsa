package searchin.sorting;

public class RotatedArrayEle {
public static void main(String[] args) {
	
	{
		int[] arr= {4,5,6,7,0,0,1,2};
		
		System.out.println(search(arr,0));
	}
	
}
static int search(int[] nums, int target) {
	
	
	int low=0,high=nums.length-1;
	while(low<=high) {
		int mid =(low+high)/2;
		
	if(nums[mid]==target)
		return mid;
	if(nums[low]<=nums[mid]) {
		if(target<=nums[mid] && target>=nums[low]) {
			high=mid-1;
		}else
			low=mid+1;
	}else
	{
		if(target>=nums[mid] && target<=nums[high]) {
			low=mid+1;
		}else
			high=mid-1;
	}
	
	}
	return -1;
}
}
