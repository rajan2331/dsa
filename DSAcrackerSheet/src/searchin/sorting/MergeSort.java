package searchin.sorting;

import java.util.Arrays;

public class MergeSort {
public static void main(String[] args) {
	int arr[] = {3,5,1,2,6};
	 
	System.out.println(Arrays.toString(mergeSort(arr,0,arr.length-1)));
}

private static int[] mergeSort(int[] arr,int low,int high) {
	
	if(low<high)
	{
		int mid=(low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
		
	}
	return arr;
}

private static void merge(int[] arr, int low, int mid, int high) {

	int[] arr1=Arrays.copyOfRange(arr, low, mid+1);

	int[] arr2=Arrays.copyOfRange(arr, mid+1, high+1);
	
	int i=0,j=0,k=low;
	
	while(i<arr1.length && j<arr2.length) {
		if(arr1[i]<=arr2[j]) {
			arr[k]=arr1[i];
			k++;i++;
		}else
		{
			arr[k]=arr2[j];
			k++;j++;
		}
		
	}
	while(i<arr1.length) {
		arr[k]=arr1[i];
		k++;i++;
	}
	while(j<arr2.length) {
		arr[k]=arr2[j];
		k++;j++;
	}
}
	

}
