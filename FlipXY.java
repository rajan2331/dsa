package ae.dubaipolice.smartservices.anprimplementation.service;

import java.util.Arrays;

public class FlipXY {
public static void main(String[] args) {
	
	System.out.println(flip("xyxyxy"));
}

private static int flip(String string) {
	int count =0;
	char[] arr = string.toCharArray();
	if(arr[0]!='x')
		count++;
	
	if(arr[arr.length-1]!='y')
		count++;
	
	int j=arr.length-1;
	for(int i=1;i<arr.length ;i++) {
		if(i>=j)
			break;
		if(arr[i]!=arr[j])
			continue;
		else
		{
		if(i==j-1)
			continue;
		else {
			if(arr[i]!='x')
			{	arr[i]='x';
			count++;
			}
			if(arr[j]!='y')
			{
				count++;
				arr[j]='y';
			}
			
			
		}
		}
		j--;
	}
	System.out.println(Arrays.toString(arr));
	return count;
}
}
