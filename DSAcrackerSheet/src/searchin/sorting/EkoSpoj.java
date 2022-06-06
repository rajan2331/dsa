package searchin.sorting;

import java.util.Arrays;

public class EkoSpoj {
public static void main(String[] args) {
	
	int[] arr= {4,42,40,26,46};
	int height=20;
	System.out.println(getTreeHeight(arr,height));
}
private static int getTreeHeight(int[] arr, int height) {
	
	
	int min=0;
	Arrays.sort(arr);
	int start=0;
	int end=arr.length-1;
	int mid=(start+end)/2;
	while(end>0) {
		
		int begin=0;
		int last=0;
		if(arr[mid]>=height)
		{	begin=mid;last=end;
		}else
			{begin=start;last=mid;}
		int max= getMinheightSum(arr,begin,last,arr[mid]);
		if(max==height)
			return max;
		else if(max<height)
			mid--;
		else
		{
			
		}
	}

	return min;
}
private static int getMinheightSum(int[] arr, int begin, int last,int height) {
	int a=0;
	for(int i=begin;i<last;i++) {
		a=a+(arr[i]-height);
	}
	return a;
}
}
