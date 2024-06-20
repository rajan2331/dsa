package ae.gov.dubaipolice.sas.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayCons {

	public static void main(String[] args) {
	
	//int[] arr = {1, 1, -10, 3, -10, 3, -10};
	int[] arr = {-9, 8};
	Map<Integer,Integer> map = new HashMap();
	
	for(int a : arr)
	{
		if(map.containsKey(a))
		map.put(a, map.get(a)+1);
		else
			map.put(a, 1);
	}
	int max = Integer.MIN_VALUE;
	int key =0;
	for(Entry<Integer, Integer> entry : map.entrySet())
	{
		if(entry.getValue()>max)
		{
			max=entry.getValue();
			key=entry.getKey();
		}
	}
	int count =3;
	for(int i =0 ;i<arr.length-1;i++)
	{
		if(arr[i]==key)
			continue;
		if(count>0)
		{
		if(arr[i+1]==key && arr[i]!=key)
		{	arr[i]=key;
			count--;
		}
		}
	}
	
	int ans =0;
	for(int ele : arr)
	{
		if(key==ele)
		{
			ans++;
		}
	}
	System.out.println(ans);
	}

}
