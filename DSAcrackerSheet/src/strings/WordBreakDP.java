package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WordBreakDP {

	
	public static void main(String[] args) {
		List<String> B = Arrays.asList(new String[]{ "i", "like", "sam",
				"sung", "samsung", "mobile",
				"ice","cream", "icecream", 
				"man", "go", "mango" });
			String	A = "ilikesamsung";
			
			System.out.println(wordbreak(A,B));
	}
	
	public static int wordbreak(String A, List<String> B )
    {
		
		Set<String> set = new HashSet<String>();
		
		for(String s: B) {
			set.add(s);
		}
		
		boolean[] res= new boolean[A.length()];
		res[0]=false;
		
		int j=0;
		for(int i=0;i<A.length();) {
			
			if(set.contains(A.substring(i,j))){
				System.out.println(A.substring(i,j));
				res[i]=true;
				j++;
				i=j;
			}else {
				res[i]=false;
				j++;
			}
			
		}
		return res[A.length()-1]==true?1:0;
        //code here
    }
}
