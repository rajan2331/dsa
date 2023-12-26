package com.microservice.websocket.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sol {
/*
Given a sorted array, find the smallest positive integer that is not the sum of a subset of the array.

For example, for the input [1, 2, 3, 10], you should return 7
*/
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,10};
		
		// 1 2 3 4 5 6 7 8 9 10
		
		// 6 - 3 3 -2 -1
		List<Integer> li = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Set<Integer> subset = new HashSet<Integer>();
		int res=1;
	     for (int i = 0; i < arr.length; i++)
	        {
	          if(arr[i] > res){
	            System.out.println(res);;
	           }
	          else{
	            res+=arr[i];
	          }
	        }
	     
		for(int i=0;i<arr.length;i++)
		{
			int sum =arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				sum=sum+arr[j];
				subset.add(sum);
				subset.add(arr[i]+arr[j]);
			}
		}
	//	System.out.println(subset);
		for(int i=1 ;i<arr[arr.length-1];i++)
		{
			if(li.contains(i))
				continue;
			if(!subset.contains(i))
			{
				System.out.println(i);
				break;
			}
		}
	}
}
