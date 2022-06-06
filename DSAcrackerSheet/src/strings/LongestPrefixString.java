package strings;

public class LongestPrefixString {
public static void main(String[] args) {
	
	String[] chars= {"leetcode","jeet","lee","leets"};
	System.out.println(longestCommonPrefix(chars));
//	System.out.println("AAABA".indexOf("BA"));
	
}


	 public  static String longestCommonPrefix(String[] strs) {
		    if (strs.length == 0) return "";
		    String prefix = strs[0];
		    for (int i = 1; i < strs.length; i++) {
		    //	System.out.println(strs[i]);
		    //	System.out.println(strs[i].indexOf(prefix));
		        while (strs[i].indexOf(prefix) != 0) {
		        	
		            prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
		        }        
		    }
		    return prefix;
		}
}

