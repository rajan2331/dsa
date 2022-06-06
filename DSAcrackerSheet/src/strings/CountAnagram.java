package strings;

import java.util.HashSet;
import java.util.Set;

public class CountAnagram {
public static void main(String[] args) {
	
	String s ="a b c d run urn urn";
	 System.out.println(countAnagrams(s));
}

private static int countAnagrams(String s) {
	//List<String> list = new ArrayList<String>();
	String[] splited = s.split("\\s+");
	Set<String> setString= new HashSet<String>();
	for(int i=0;i<splited.length;i++) {
		if(!setString.contains(splited[i]))
			setString.add(splited[i]);
	}

	Set<Integer> set= new HashSet<Integer>();
	
	int count=0;
	
	for(String word : setString) {
		if(!set.contains(getAsciCount(word)))
			set.add(getAsciCount(word));
		else {
		//	if(getAsciCount(splited[i]))
			count++;
		}
	}

	return count;
}
public static int getAsciCount(String s) {
	int sum=0;
	for(char c:s.toCharArray()) {
		sum=sum+c;
	}
	return sum;
}
}
