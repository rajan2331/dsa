package strings;

import java.util.Arrays;

public class SmallestWindowAnotherString {
public static void main(String[] args) {
	
	String S = "timetopractice";
		String 	P = "toc";
		System.out.println(smallestWindow(S,P));
		
}
public static String smallestWindow(String s, String p)
{
	
	
	int[] arr = new int[256];
	int count=0;
	for(int i=0 ;i<p.length();i++) {
		
		if(arr[p.charAt(i)]==0)
			count++;
		arr[p.charAt(i)]++;
	}
	System.out.println(count);
	System.out.println(Arrays.toString(arr));
	int i=0,j=0;
	int start =0;
	
	int len=Integer.MAX_VALUE;
	
	
	while(j<s.length()) {
		
		arr[s.charAt(j)]--;
		if(arr[s.charAt(j)]==0)
			count--;
		
		
		if(count==0) {
			
			
		while(count==0) {	
			if(len>j-i+1) {
				len=Math.min(j-i+1,len);
				start=i;
				
				System.out.println(s.substring(start,len));
			}
			arr[s.charAt(i)]++;
			 if (arr[s.charAt(i)]> 0)
                 count++;
			 
			 i++;
		}
		}	
		
		j++;
	}	
	
		
	
	   if (len != Integer.MAX_VALUE)
	        return String.valueOf(s).substring(start, len+start);
	    else
	        return "-1";
    
}

 
}
