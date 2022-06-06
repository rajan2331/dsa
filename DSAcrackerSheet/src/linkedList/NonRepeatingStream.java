package linkedList;

import java.util.Arrays;

public class NonRepeatingStream {
public static void main(String[] args) {
	
	System.out.println('a'-'a');
	System.out.println(FirstNonRepeating("aabc"));
}

public static String FirstNonRepeating(String A)
{
	StringBuilder sb = new StringBuilder();
	
	int[] arr = new int[26];
	
	for(char s: A.toCharArray()){
		arr[s-'a']++;
	}

	System.out.println(Arrays.toString(arr));
	return sb.toString();
    // code here
}
}
