package dp;

public class EqualParition {
	public static void main(String[] args) {
		int arr[] = {1,5,5 ,10} ;
		int sum=0;
		for(int i:arr) {
			sum=sum+i;
		}
		System.out.println(equalPartition(arr,sum));
	}

	private static boolean equalPartition(int[] arr, int sum) {
		
		if(sum%2!=0)
			return false;
		else 
			return subsetSum(arr,sum/2,arr.length);
		
		
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
}
