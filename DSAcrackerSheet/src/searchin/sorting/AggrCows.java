package searchin.sorting;

import java.util.Arrays;

public class AggrCows {
	public static int[] arr = {1,2,8,4,9};
	public static int c=3; public static int n=5;
public static void main(String[] args) {

		
		System.out.println(getMinLargestDist(arr,n,c));
}

private static int getMinLargestDist(int[] arr, int n, int c) {
	
	Arrays.sort(arr);
	int res=0;
	int low=1; int mid=0;
	int high=arr[arr.length-1]-arr[0];
	while(low<=high) {
		mid=(high+low)/2;
		if(placeCows(mid)) {
			res=mid;
			low=mid+1;		
		}else
			high=mid-1;
	}
	
	return res;
}

private static boolean placeCows(int mid) {
	int cows_placed=1;
	int last_pos=arr[0];
	for(int i=1;i<n;i++) {
		if(arr[i] - last_pos>=mid) {
			++cows_placed;
			last_pos=arr[i];
		}
		if(cows_placed==c)
			return true;
	}
	return false;
}


}
