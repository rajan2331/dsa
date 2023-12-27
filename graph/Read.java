package com.microservice.websocket.config;

import java.util.ArrayList;
import java.util.List;

public class Read {

	String file ="hello world";
	List<Character> li ;
	int currIndex=0;
	
	public Read()
	{
		li = new ArrayList();
		for(char c : file.toCharArray())
			li.add(c);
	}
	
	public String readd(int n)
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i=currIndex;i<li.size();i++)
		{
			if(n>0)
			{	sb.append(li.get(i));
				currIndex++;
				n--;
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		Read rd= new Read();
		System.out.println(rd.readd(7));
		System.out.println(rd.readd(7));
	}
}
