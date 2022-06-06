package strings;

import java.util.Arrays;

public class EditDistance {
	public static void main(String[] args) {
		System.out.println('G'-'A');
		String s="dceccabbb";
		String t="bbefcdeabfbfa";
		System.out.println(s.length());
		System.out.println(t.length());
		System.out.println(editDistance(s,t));
	}


	private static int editDistance(String s, String t) {
		int n= s.length(), m = t.length();    
		int[][] dp = new int[n + 1][m + 1];
		for(int i = 0; i < n + 1; i++)
			Arrays.fill(dp[i], -1);   
		return minsDis(s,t,n,m,dp);
	}


	static  int minsDis(String s1, String s2,int n, int m, int[][]dp)
	{



		// If any String is empty,
		// return the remaining characters of other String
		if(n == 0)    
			return m;  
		if(m == 0)    
			return n;

		// To check if the recursive tree
		// for given n & m has already been executed
		if(dp[n][m] != -1)    
			return dp[n][m];

		// If characters are equal, execute 
		// recursive function for n-1, m-1
		if(s1.charAt(n - 1) == s2.charAt(m - 1))
		{           
			if(dp[n - 1][m - 1] == -1)
			{               
				return dp[n][m] = minsDis(s1, s2, n - 1, m - 1, dp);           
			}        
			else
				return dp[n][m] = dp[n - 1][m - 1];   
		}

		// If characters are nt equal, we need to

		// find the minimum cost out of all 3 operations.      
		else
		{           
			int m1, m2, m3;        // temp variables   
			if(dp[n-1][m] != -1)
			{    
				m1 = dp[n - 1][m];      
			}           
			else
			{   
				m1 = minsDis(s1, s2, n - 1, m, dp);      
			}            

			if(dp[n][m - 1] != -1)
			{                
				m2 = dp[n][m - 1];            
			}            
			else
			{    
				m2 = minsDis(s1, s2, n, m - 1, dp);      
			}                                   

			if(dp[n - 1][m - 1] != -1)
			{    
				m3 = dp[n - 1][m - 1];      
			}   
			else
			{   
				m3 = minsDis(s1, s2, n - 1, m - 1, dp);       
			}     
			return dp[n][m] = 1 + Math.min(m1, Math.min(m2, m3));        
		}
	}


}