package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AnagramTogether {
public static void main(String[] args) {
	
	String words[] = {"act","god","cat","dog","tac"};
	
	System.out.println(anagrams(words));
}

public static List<List<String>> anagrams(String[] string_list) {
	
	Map<String , ArrayList<String>> map = new HashMap<String , ArrayList<String>>();
	
	for(int i=0;i<string_list.length;i++) {
		String val = string_list[i];
		
		char[] c = val.toCharArray();        // convert to array of chars 
		java.util.Arrays.sort(c);          // sort
		String newString = new String(c);
		
		if(!map.containsKey(newString))
			map.computeIfAbsent(newString, k -> new ArrayList<>()).add(val); // (string_list[i], new ArrayList<>().add(value));	
		else {
			ArrayList<String> list = map.get(newString);
			list.add(val);
			map.put(newString, list);
		}
	}
	 List<List<String>>  res = new  ArrayList<List<String>>(); 
	for(Map.Entry<String , ArrayList<String>> en : map.entrySet()){
		res.add(en.getValue());
	}
	 
	 
	System.out.println(map);
	return res;
    // Code here
}
}
