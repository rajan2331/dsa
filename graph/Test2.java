package com.springboot.chatapp.domain;


import java.util.HashMap;
import java.util.Map;

public class Test2 {
	
	 Map<Integer,Integer>  bookList=new HashMap<>();
	public static void main(String[] args) {
		Test2 book = new Test2();
//		System.out.println(book.book(0, 0));
		System.out.println(book.book(10, 20));
		System.out.println(book.book(15, 25));
		System.out.println(book.book(20, 30));
		
		
	}
	// [[], [10, 20], [15, 25], [20, 30]]
	
	 public boolean book(int start, int end) {
		 
		if(bookList.isEmpty())
		{
			bookList.put(start, end);
			return true;
		}
		
		for(int i : bookList.keySet())
		{
			if(Math.max(start,i)<Math.min(end,bookList.get(i)))
            {
                return false;
            }
        }
		bookList.put(start,end);
        return true;
		
	 } 
}
