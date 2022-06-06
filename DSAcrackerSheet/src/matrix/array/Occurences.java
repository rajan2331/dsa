package matrix.array;

import java.util.HashMap;
import java.util.Map;

public class Occurences {
public static void main(String[] args) {
	
	String a = "rajan";
	
	Map<Character,Integer> map = new HashMap<Character,Integer>();
	
	for(char c : a.toCharArray()) {
		int index=1;
		if(map.containsKey(c))
		map.put(c, index+1);
		else
			map.put(c, index);
			
	}
	
		
		System.out.print(map.toString());

 	
}
}
