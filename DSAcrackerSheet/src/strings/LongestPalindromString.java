package strings;

public class LongestPalindromString {
	
	public static void main(String[] args) {
		
		String s="racecar";
		System.out.println(longestPalin(s));
	}
	  static int longestPalin(String S){

	     int start=0;
	     int end=0;
	       for(int i=0;i<S.length();i++) {
	    	   int len1=expandMiddle(S, i, i);
	    	   int len2=expandMiddle(S, i, i+1);
	    	int   len=Math.max(len1, len2);
	    	   if(len>start) {
	    		   start= i-((len-1)/2);
	    		   end=i+(len/2);
	    	   }
	       }
	       return end-start+1;
   }
 
 static int expandMiddle(String s ,int left,int right) {
	  
	 if(s==null || left>right)return 0;
	 
	 while(left>=0 && right<s.length()&& s.charAt(right)==(s.charAt(left))) {
		 
		 right++;
		 left--;
	 }
	 return  right -left -1;
 }
}
