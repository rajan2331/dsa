package strings;

import java.util.ArrayList;
import java.util.List;

public class SplitBinaryString {
public static void main(String[] args) {
	
	String s = "0100110101";
	System.out.println(splitString(s));
}

private static int splitString(String s) {
	int count =0;
	int countZero=0,countOne=0;
	
	List<String> result=new ArrayList<String>();
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='0')
			countZero++;
		else	if(s.charAt(i)=='1')
			countOne++;
		
		
	if(countZero==countOne)
	{	
		count++;
	
	}
	}
	return count;
}
}

