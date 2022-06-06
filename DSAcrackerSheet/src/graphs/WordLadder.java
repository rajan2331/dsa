package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
public static void main(String[] args) {
	String beginWord= "ymain";
	String endWord ="oecij";
	String[] wordArray = {"ymann","yycrj","oecij","ymcnj","yzcrj","yycij","xecij","yecij","ymanj","yzcnj","ymain"};
	List<String> wordList = new ArrayList<String>();
	for(String a : wordArray)
		wordList.add(a);
	System.out.println(ladderLength(beginWord,endWord,wordList));
	
	
}

public static  int ladderLength(String beginWord, String endWord, List<String> wordList) {
	
	int level=1;
	Set<String> set = new HashSet<String>();
	for(String s : wordList )
		set.add(s);
	
	if(!set.contains(endWord))
		return 0;
	Queue<String> queue = new LinkedList<String>();
	queue.offer(beginWord);
	
	while(!queue.isEmpty()) {
		
		int size=queue.size();
		for(int i=0;i<size;i++) {
			String curr= queue.poll();
			char[] chars= curr.toCharArray();
			
			for(int j=0;j<chars.length;j++) {
				char orig=chars[j];
				for(char c='a';c<='z';c++) {
					if(chars[j]==c)
						continue;
					chars[j]=c;
					String newWord=String.valueOf(chars);
					if(newWord.equals(endWord))
						return level+1;
					if(set.contains(newWord)) {
						queue.offer(newWord);
						set.remove(newWord);
					}	
				}
				chars[j]=orig;
			}
		}
		
		level++;
		
	}
	
	return 0;
    
}
}
