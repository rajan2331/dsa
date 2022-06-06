package searchin.sorting;

import java.util.Arrays;

public class RotiPrata {
public static void main(String[] args) {
	int[] arr= {1 ,2,3,4};
	int prata=10;
	System.out.println(getMinPrata(arr,prata));
}

private static int getMinPrata(int[] arr, int prata) {

	Arrays.sort(arr);
	int low=0;int high=arr.length*prata;
	int res=0;
	while(low<=high) {
		int mid=(low+high)/2;
		if(!checkPrata(arr,mid,prata))
		{	low=mid+1;}
		else {
			res=mid;	high=mid-1;}
	}
	return res;
}

private static boolean checkPrata(int[] arr, int mid, int prata) {
	int pratas=0;
	int time=0;
	int a=1;
	for(int i=0;i<arr.length;i++) {
		time=0;a=1;
		while(time<=mid) {
			time=time+arr[i]*a;
			pratas++;
			a++;
		}
		pratas--;
	}
	if(pratas>=prata)
		return true;
	

	return false;
}
}

