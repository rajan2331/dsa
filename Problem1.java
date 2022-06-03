package interview2;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
public static void main(String[] args) {
	String input = "hello";

	getFrequency(input);
}

private static void getFrequency(String input) {
	
	Map<Character,Integer> map = new HashMap<Character,Integer>();
	
	for(char ch :input.toCharArray()) {
		
		if(map.containsKey(ch))
			map.put(ch, map.get(ch)+1);
		else
			map.put(ch, 1);
	}
	
	System.out.println(map);
}
}
