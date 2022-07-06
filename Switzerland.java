package ae.dubaipolice.smartservices.appfcm.fcm;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Switzerland {
public static void main(String[] args) {
	System.out.println(findWord(new String[] {"W>I", "R>L", "T>Z", "Z>E", "S>W", "E>R", "L>A", "A>N", "N>D", "I>T"}));
	System.out.println(findWord(new String[] { "R>T", "A>L", "P>O", "O>R", "G>A", "T>U", "U>G"})); // PORTUGAL
}

private static String findWord(String[] strings) {
	
	Map<String,String> map = new HashMap<String,String>();
	
	for(String s : strings) 
		map.put(s.substring(0,1), s.substring(2,3));
	
	System.out.println(map);
	String first = "";
	
	String word = "";
	 for (Map.Entry<String,String> entry : map.entrySet()) {
		 if(!map.containsValue(entry.getKey()))
			 first=entry.getKey();
		 
	 }
	word=first;
	System.out.println(word);
	for(int i=0 ;i<map.size();i++)
	{	
		word =word +map.get(first);
		String ch = map.get(first);
		
		first=ch;
	}
	return word;
}

}
