package strings;

import java.util.Arrays;

public class LongestCommonSubsequence {
public static void main(String[] args) {
	
	String x="ABCDGH";
	String y="AEDFHR";
		int[][] dp = new int[1001][1001];
		 for (int[] row : dp) {
	         Arrays.fill(row, -1);
	     }
	System.out.println(getLCS(x,y,x.length(),y.length(),dp));
	System.out.println(getLCSTD(x,y,x.length(),y.length()));
	
	 
    StringBuilder input1 = new StringBuilder();

    // append a string into StringBuilder input1
    input1.append(x);

    // reverse StringBuilder input1
    input1.reverse();

	//System.out.println(getLongestPalindrome(x,input1.toString(),x.length(),x.length()));
}

private static int getLCS(String x, String y, int m, int n,int[][] dp) {
	
 	if(m==0|| n==0)
		return 0;
	
 	if(dp[m][n]!=-1)
 		return dp[m][n];
	if(x.charAt(m-1)==y.charAt(n-1))
		return dp[m][n]= 1+ getLCS(x, y, m-1,n-1,dp);
	else
	return	dp[m][n]= Math.max(getLCS(x, y, m,n-1,dp),getLCS(x, y, m-1,n,dp));
	
	
}

private static int getLCSTD(String x, String y, int m, int n) {
	
	int[][] dp = new int[m+1][n+1];
	 for (int[] row : dp) {
        Arrays.fill(row, -1);
    }
	 
	for(int i=0;i<m+1;i++) {
		for(int j=0;j<n+1;j++) {
			if(i==0|| j==0)
				dp[i][j]=0;
		}
	}
	
	for(int i=1;i<m+1;i++) {
		for(int j=1;j<n+1;j++) {
			if(x.charAt(i-1)==y.charAt(j-1) && i!=j)
				dp[i][j]=1+dp[i-1][j-1];
			else {
				dp[i][j]=Math.max( dp[i-1][j],dp[i][j-1]);
			}
		}
	}
	return dp[m][n];
}

private static int getLongestPalindrome(String x, String y, int m, int n) {
	
	int[][] dp = new int[m+1][n+1];
	 for (int[] row : dp) {
        Arrays.fill(row, -1);
    }
	 
	for(int i=0;i<m+1;i++) {
		for(int j=0;j<n+1;j++) {
			if(i==0|| j==0)
				dp[i][j]=0;
		}
	}
	
	for(int i=1;i<m+1;i++) {
		for(int j=1;j<n+1;j++) {
			if(x.charAt(i-1)==y.charAt(j-1))
				dp[i][j]=1+dp[i-1][j-1];
			else {
				dp[i][j]=Math.max( dp[i-1][j],dp[i][j-1]);
			}
		}
	}
	return dp[m][n];
}
}
