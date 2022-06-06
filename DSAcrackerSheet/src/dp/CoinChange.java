package dp;

public class CoinChange {
 public static void main(String[] args) {
	
	 int arr[] = {1,2,3};
	 int sum =5;
	 System.out.println(coinChangeWays(arr,sum,arr.length));
}

private static int coinChangeWays(int[] arr, int sum,int n) {
	
	
	if(n==0)
		return 0;
	if(sum==0)
		return 1;
	
	if(arr[n-1]<=sum) {
		
		return coinChangeWays(arr,sum,n-1)+coinChangeWays(arr, sum-arr[n-1], n);
	}else
		return coinChangeWays(arr, sum, n-1);
	
}
}
