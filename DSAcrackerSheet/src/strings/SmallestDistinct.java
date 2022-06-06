package strings;

import java.util.HashSet;
import java.util.Set;

public class SmallestDistinct {
public static void main(String[] args) {
	
	String s ="AABBBCBBAC";  
//	int[] a = new int[256];

	System.out.println(findSubString(s));
	
}

public static String findSubString( String str) {
	
	
	
	
	
	
	Set<Character> set = new HashSet<Character>();
	for(int i=0 ; i<str.length();i++) 
		set.add(str.charAt(i));
		
	int j=0,k=0;
	int len=Integer.MAX_VALUE;
	int start =0,end=0;
	while(j<=k) {
		if(checkValidString(str.substring(j,k),set) ){
			if(k-j<len)
			{	len=k-j;
			
			start=j;
			end=k;
			System.out.println(str.substring(start,end));
			}
			j++;
			
			
		}else if(k<str.length())
		{
			
				k++;
		}else
			j++;
			
			
	}
  
	return str.substring(start,end);
}
static boolean	 checkValidString(String a ,Set<Character> s) {
	int[] arr = new int[256];
	for(int i=0 ;i<a.length();i++) {
		arr[a.charAt(i)]++;
	}
	
	for(char ch : s) {
		
		if(arr[ch]==0)
			return false;
			
	}
	
	return true;
	
	 
}
}
