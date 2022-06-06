package searchin.sorting;

import java.util.Arrays;

public class CountInversion {
public static void main(String[] args) {
	
	
	int[] arr= {5,3,2,4,1};
	System.out.println(mergeSort(arr,0,arr.length-1));
}


private static Integer mergeSort(int[] arr, int low, int high) {

	int count=0;
	if(low<high) {
	int mid=(low+high)/2;
	 count+=mergeSort(arr,low,mid);
	count+=mergeSort(arr,mid+1,high);
	 count += merge(arr,low,mid,high);
	}
	return count;
}

// 5 3 
private static Integer merge(int[] arr, int low, int mid,int high) {
	
//	System.out.println(Arrays.toString(arr) +"low "+low+" mid "+mid+" high "+high);
	 int[] arr1 = Arrays.copyOfRange(arr, low, mid + 1);
	 int count=0;
     int[] arr2 = Arrays.copyOfRange(arr, mid + 1, high + 1);
	int first=0;int second=0;int k=low;
	while(first<arr1.length && second<arr2.length) {
		 if (arr1[first] <= arr2[second])
             arr[k++] = arr1[first++];
         else {
             arr[k++] = arr2[second++];
             count += (mid + 1) - (low + first);
         }
     }
     while (first < arr1.length)
         arr[k++] = arr1[first++];
     while (second < arr2.length)
         arr[k++] = arr2[second++];
	return count;
}



}
