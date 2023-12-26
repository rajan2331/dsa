package com.microservice.websocket.config;

public class EncodeString {

	public static void main(String[] args) {
		
		String a = "AAAABBBCCDAA#";
		char prev= 'A';
		int count=0;
		StringBuilder sb = new StringBuilder();
		for(char c : a.toCharArray())
		{
			if(c==prev)
			{
				count++;
				
			}else
			{
				sb.append(count);
				sb.append(prev);
				prev=c;
				count=1;
			}
		}
		System.out.println(sb.toString());
	}
}
