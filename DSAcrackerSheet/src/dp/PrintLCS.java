package dp;

import java.util.Arrays;

public class PrintLCS {
public static void main(String[] args) {
		
		String x="ABCDGH";
		String y="AEDFHR";
			
		System.out.println(getLCS(x,y,x.length(),y.length()));
		System.out.println(getLCSDP(x,y,x.length(),y.length()));
	}

	private static String getLCSDP(String x, String y, int m, int n) {int[][] dp = new int[m+1][n+1];
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
				if(x.charAt(i-1)==y.charAt(j-1) )
					dp[i][j]=1+dp[i-1][j-1];
				else {
					dp[i][j]=Math.max( dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		
		int i=m;
		int j=n;
		StringBuilder s = new StringBuilder();
		while(i>0 && j>0) {
			
			if(x.charAt(i-1)==y.charAt(j-1))
			{
				s.append(x.charAt(i-1));
				i--;
				j--;
			}else {
				if(dp[i][j-1]>dp[i-1][j])
					j--;
				else
					i--;
				
			}
		}
	
	
		return s.reverse().toString();}

	private static int getLCS(String x, String y, int m, int n) {
		if(n==0 || m==0)
			return 0;
		
		if(x.charAt(m-1)==y.charAt(n-1))
			return 1+ getLCS(x, y, m-1, n-1);
		else
			return Math.max(getLCS(x, y, m-1, n), getLCS(x, y, m, n-1));
		
	
	}
}
