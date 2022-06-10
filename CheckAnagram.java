package ae.dubaipolice.smartservices.anprimplementation.service;

public class CheckAnagram {
	static boolean[] arr = new boolean[128];
public static void main(String[] args) {
	String w="a";
	for(char c :w.toCharArray()) {
		arr[(int) c]=true;
	}
	findAnagrams("abxaba",w);
}

private static void findAnagrams(String word, String w) {

	int i=0,j=0;
	int count=0;
	
	while(i<word.length()-1) {
		if(count==w.length())
		{
			if(isAnagram(word.substring(i,j))) {
				System.out.println(i);
			}
			j--;
			i=j;
			j++;
			count=0;
		}else {
			count++;
			j++;
		}
		
	}
}

private static boolean isAnagram(String word) {
	
	
	
	for(char c : word.toCharArray()){
		
		if(arr[(int)c]==false)
			return false;
	}
	
	return true;
}
}
