package dp;

import java.util.Arrays;

public class MinCostCutStick {
	public static void main(String[] args) {
		
		int  n = 7;
		int[] cuts = {1,3,4,5};
		System.out.println(minCost(n, cuts));
	}
	
	 public static  int minCost(int n, int[] cuts) {
	        
	 	 Arrays.sort(cuts);
    	 int ans = minCost(0,n,0,cuts.length-1,cuts);
      	return ans;
}
private static int minCost(int rodsi , int rodei , int cutsi , int cutei,int[] cuts) 
{
	if(rodei<=rodsi || cutei < cutsi)
		return 0;
	
	int ans = Integer.MAX_VALUE;
	for( int si=cutsi; si<=cutei; si++)
	{
		int currCut = cuts[si];
		int currCost = rodei - rodsi;
		int left = minCost(rodsi,currCut,cutsi,si-1,cuts);
		int right = minCost(currCut,rodei,si+1,cutei,cuts);
		int cost = currCost + left + right;
		ans = Math.min(cost,ans);
	}
	return ans;
}
}
