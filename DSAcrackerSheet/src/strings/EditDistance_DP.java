package strings;

public class EditDistance_DP {
public static void main(String[] args) {
	
	
	String s="horse";
	String t="rors";
	 System.out.println(editDistanceR(s,t,s.length(),t.length()));
}

public static int editDistance(String s, String t) {

	
	if(s.length()==0 && t.length()>0)
		return t.length();
	
	if(t.length()==0 && s.length()>0)
		return s.length();
	
	int[][] dp = new int[t.length()+1][s.length()+1];

	for(int i=0;i<=t.length();i++) {

		dp[i][0]=i;
		for(int j=0;j<=s.length();j++) {
			dp[0][j]=j;
		}
	}
//		 r   o  s
//	[ [0, 1, 2, 3],
//	h [1, 0, 0, 0],
//	o [2, 0, 0, 0],
//	r [3, 0, 0, 0],
//	s [4, 0, 0, 0],
//	e [5, 0, 0, 0]]
	
	int i=1;
	int j=1;
	for( i=1;i<=t.length();i++) {


		for( j=1;j<=s.length();j++) {
			if(t.charAt(i-1)==s.charAt(j-1)) {
				dp[i][j]=Math.min(dp[i-1][j] , Math.min(dp[i][j-1], dp[i-1][j-1])) +0;
			}else {
				dp[i][j]=Math.min(dp[i-1][j] , Math.min(dp[i][j-1], dp[i-1][j-1])) +1;
			}
		}
	}

	//System.out.println(dp.toString());
	return dp[i-1][j-1] ; // dp[s.length()+1][t.length()+1];
	// Code here
}

public static int editDistanceR(String s, String t,int m,int n) {
	
	if(m==0 )
		return n;
	
	if(n==0 )
		return m;
	
	if(s.charAt(m-1)==t.charAt(n-1))
			return editDistanceR(s,t,m-1,n-1);
	else 
		return 1+ Math.min(editDistanceR(s,t,m-1,n),Math.min(editDistanceR(s,t,m,n-1),editDistanceR(s,t,m-1,n-1)));
	
	
}
}
