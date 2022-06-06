package dp;

public class SubsetSum {
public static void main(String[] args) {
	int[] arr= {1,2,3};
	int sum=4;
	System.out.println(subsetSum(arr,sum,arr.length));
	System.out.println(countSusbset(arr,sum,arr.length));
}

private static boolean subsetSum(int[] arr, int sum,int n) {
	boolean[][] dp= new boolean[n+1][sum+1];
	for(int i=0;i<dp.length;i++) {
		for(int j=0;j<dp[i].length;j++) {
			if(i==0)
				dp[i][j]=false;
			
			if(j==0)
				dp[i][j]=true;
		}
	}
	

	for(int i=1;i<=n;i++) {
		for(int j=1;j<=sum;j++) {
			if(arr[i-1]<=j) {
				
				dp[i][j]= dp[i-1][j-arr[i-1]] ||  dp[i-1][j];
			}else {
				dp[i][j] = dp[i-1][j];
			}
			
		}
	
	
	
}
	return dp[n][sum];
}

private static boolean subsetSumR(int[] arr, int sum,int n) {
	if( sum==0)
		return true;
	if(n==0)
		return false;
		
		
		if(sum>arr[n-1])
			return subsetSumR(arr,sum-arr[n],n-1);
		else
		return subsetSumR(arr,sum-arr[n],n-1) || subsetSumR(arr,sum-arr[n],n-1);
	}
	

private static int countSusbset(int[] arr, int sum,int n) {
	int[][] dp= new int[n+1][sum+1];
	for(int i=0;i<dp.length;i++) {
		for(int j=0;j<dp[i].length;j++) {
			if(i==0)
				dp[i][j]=0;
			
			if(j==0)
				dp[i][j]=1;
		}
	}
	

	for(int i=1;i<=n;i++) {
		for(int j=1;j<=sum;j++) {
			if(arr[i-1]<=j) {
				
				dp[i][j]= dp[i-1][j-arr[i-1]] +  dp[i-1][j];
			}else {
				dp[i][j] = dp[i-1][j];
			}
			
		}
	
	
	
}
	return dp[n][sum];
}


}
