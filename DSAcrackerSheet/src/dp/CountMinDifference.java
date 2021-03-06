package dp;

public class CountMinDifference {
public static void main(String[] args) {

	int arr[] = {1,5,5 ,10} ;
	int diff=1;
	System.out.println(countMin(arr,diff));

}

private static int countMin(int[] arr, int diff) {
	
	
	int sum = 0;
	for(int i : arr)
		sum=+i;
	
	int subsetSum = (sum+diff)/2;
	
	
	return subsetSum(arr,subsetSum,arr.length);
}

private static int subsetSum(int[] arr, int sum,int n) {
	int dp[][]  = new int[n+1][sum+1];
	for(int i =0 ;i<dp.length;i++) {
		for(int j=0;j<dp[i].length;j++){
			if(i==0)
				dp[i][j]=0;
			if(j==0)
				dp[i][j]=1;
		}
	}
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=sum;j++) {
			
			if(arr[i-1]<=j) {
				
				dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
			}else
				dp[i][j] = dp[i-1][j];
		}
	}
	
	return dp[n][sum];
}
}
