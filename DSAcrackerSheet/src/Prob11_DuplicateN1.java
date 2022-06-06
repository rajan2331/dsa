
public class Prob11_DuplicateN1 {
public static void main(String[] args) {
	int[] arr= {1,3,4,2,2};
	System.out.println(getDUplicate(arr));
}

private static int getDUplicate(int[] nums) {
	
	
	int slow=nums[0];
	int fast=nums[0];
	
	do {
		slow=nums[slow];
		fast=nums[nums[fast]];
		
	}while(slow!=fast) ;
	
	fast=nums[0];
	while(slow!=fast)
	{
		slow=nums[slow];
		fast=nums[fast];
	}
	return slow;
}
}
