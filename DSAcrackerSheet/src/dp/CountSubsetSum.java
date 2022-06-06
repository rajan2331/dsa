package dp;

public class CountSubsetSum {
	public static void main(String[] args) {
		int[] arr= {2,3,5,6,8,10};
		int sum=10;
		System.out.println(countSusbset(arr,sum,arr.length));
	}

	/**
	 * @param arr
	 * @param sum
	 * @param length
	 * @return
	 */
	/**
	 * @param arr
	 * @param sum
	 * @param length
	 * @return
	 */
	private static int countSusbset(int[] arr, int sum, int length) {
	
		int[][] dp = new int[length+1][sum+1];
		
		for(int i=0 ;i<dp.length;i++) {
			
			for(int j=0;j<dp[i].length;j++) {
				if(i==0)
					dp[i][j]=0;
				if(j==0)
					dp[i][j]=1;
				
				
			}
		}	
			for(int i=1 ;i<=length;i++) {
				
				for(int j=1;j<=sum;j++) {
					
					if(arr[i-1]<=j) {
						dp[i][j] = dp[i-1][j-arr[i-1]]+dp[i-1][j];
						
					}else
						dp[i][j] = dp[i-1][j];
				}
			}
		
		
		return dp[length][sum];
	}
}
