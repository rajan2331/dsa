package strings;

import java.util.Arrays;

public class CountPalindromicSubsequence {
public static void main(String[] args) {
	
	String s = "abcd";
	
	int[][] dp = new int[s.length()+1][s.length()+1];
	
	for(int i=0;i<s.length();i++)
		Arrays.fill(dp[i], -1);
	
	System.out.println(countPS(s,0,s.length()-1));
	System.out.println(countPSDP(s,0,s.length()-1,dp));
	
}
static long countPS(String str ,int i , int j)
{
	if(i>j)
		return 0;
  
	if(i==j)
		return 1;
	else if (str.charAt(i) == str.charAt(j))
         return countPS(str,i + 1, j) +
                 countPS(str,i, j - 1) + 1;

     else
         return  countPS(str,i + 1, j) +
                           countPS(str,i, j - 1) -
                           countPS(str,i + 1, j - 1);
 }
	
	
static int countPSDP(String str ,int i , int j,int[][] dp)
{
	if(i>j)
		return 0;
  
	if(i==j)
		return 1;
	else if (str.charAt(i) == str.charAt(j))
         return dp[i][j]=  countPSDP(str,i + 1, j,dp) +
        		 countPSDP(str,i, j - 1,dp) + 1;

     else
         return dp[i][j]=  countPSDP(str,i + 1, j,dp) +
        		 countPSDP(str,i, j - 1,dp) -
        		 countPSDP(str,i + 1, j - 1,dp);
 }
}
