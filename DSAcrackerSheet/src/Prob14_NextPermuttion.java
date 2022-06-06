import java.util.Arrays;

public class Prob14_NextPermuttion {
public static void main(String[] args) {
	int[] nums = {1,3,2};
	nextPermutation(nums);
	
	
}
public static void nextPermutation(int[] nums) {
    int n=nums.length;
    int decEle=0;
    int index=0;
    if(nums.length<2)
    	return;
	for(int i=n-2;i>=1;i--) {
		if(nums[i]<nums[i+1]) {
			index=i;
			break;
		}
		}
	System.out.println(decEle);
	if(index>=0) {
		for(int j=n-1;j>=index;j-- ) {
			if(nums[index]<nums[j]) {
				swap(nums,index,j);
				break;
			}
		}
	}
	int start =index+1;
	int end=n-1;
	while (start < end)
    {
		swap(nums,start,end);
        start++;
        end--;
    }
	System.out.println(Arrays.toString(nums));
	
}
public static void swap(int[] nums,int i,int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
}
