package dp;

public class CoinChangeMin {
public static void main(String[] args) {
	int[] coins = {3,4,5};
	int sum = 4;
	System.out.println(minCoins(coins,sum,coins.length));
}

private static int minCoins(int[] coins, int sum, int n) {

	if(sum==0)
		return 0;
	if(n==0)
		return Integer.MAX_VALUE-1;
	if(n==1)
	{
		if(sum%coins[0]==0)
			return sum/coins[0];
		else
			return Integer.MAX_VALUE-1;
		
	}
	
	if(coins[n-1]<=sum)
		return Math.min(minCoins(coins,sum-coins[n-1],n)+1,minCoins(coins, sum, n-1));
	else
		return minCoins(coins, sum, n-1);
	
}
}
