package dp;

import java.util.Arrays;

public class ShortesSuperSequence {
public static void main(String[] args) {
	
	String str1 = "bbbaaaba", str2 = "bbababbb";
	
	//"bbabaaababb"     bbbab
	System.out.println(shortestCommonSupersequence(str1,str2));
}
public static  String shortestCommonSupersequence(String str1, String str2) {
    
	
	String lcs = getLCS(str1,str2,str1.length(),str2.length());
	
	String str = "";
	int x=0;
	int y=0;
	
	for(char  c : lcs.toCharArray()) {
		
		while(str1.charAt(x)!=c)
			str+=str1.charAt(x++);
	
		while(str2.charAt(y)!=c)
			str+=str2.charAt(y++);
		
		str+=c;
		x++;
		y++;
	}
	
	return str.toString()+str1.substring(x)+str2.substring(y);
}
private static String getLCS(String x, String y, int m, int n) {int[][] dp = new int[m+1][n+1];
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
}
