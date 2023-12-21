package com.springboot.chatapp.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Pair{
	public String word;
	public Integer step;
	public Pair(String word, Integer step) {
		super();
		this.word = word;
		this.step = step;
	}
	
	
}
public class Test6 {

	public static void main(String[] args) {
		
		String beginWord = "a", endWord = "c" ;
		String[] wordList = {"a","b","c"};
		
		
		System.out.println(ladderLength(beginWord, endWord, Arrays.asList(wordList)));
		
	}
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int count=0;
        Set<String> set = new HashSet();
        for(String word : wordList)
        	set.add(word);
        
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(beginWord,1));
        
        while(!queue.isEmpty())
        {
        	String currWord= queue.peek().word;
        	Integer step= queue.peek().step;
        	count=Math.max(step, count);
        	queue.remove();
        	if(currWord.equals(endWord))
        		return count; 
        	for(int i=0;i<currWord.length();i++)
        	{
        		for(char c='a';c<='z';c++)
        		{
        			   char replacedCharArray[] = currWord.toCharArray();
                       replacedCharArray[i] = c;
                       String replacedWord = new String(replacedCharArray);
        			if(set.contains(replacedWord))
        			{
        				queue.add(new Pair(replacedWord,step+1));
        				set.remove(replacedWord);
        			}
        		}
        		
        	}
        	
        }
        
        return 0;
    }
}
