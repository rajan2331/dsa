package strings;

public class LongestPrefic {
public static void main(String[] args) {
	
	String[] strs = {"dog","racecar","car"};
	
	System.out.println(longestCommonPrefix(strs));
	
}

	public  static String longestCommonPrefix(String[] strs) {
		StringBuilder sb= new StringBuilder();
		int len=Integer.MAX_VALUE;
		for(int i=0 ;i<strs.length;i++) {
			len=Math.min(len, strs[i].length());
		}
		boolean flag=false;
		for(int j=0;j<len;j++) {
			
			
		
		for(int i=0 ;i<strs.length-1;i++) {
			
			if(strs[i].charAt(j)==strs[i+1].charAt(j))
				flag=true;
			else
			{	
				flag=false;
				break;
			}
		}
		if(flag)
			sb.append(strs[0].charAt(j));
			else
				break;
		}
		return sb.toString();
	    
	
	    }
}
