import java.util.Arrays;

public class Prob12_MErgeArray {
public static void main(String[] args) {
	int arr1[] = {1, 3, 5, 7};
	int arr2[] = {0, 2, 6, 8, 9};
	
	System.out.println(merge(arr1,arr2,arr1.length,arr2.length));
	
	
}

static String merge(int arr1[], int arr2[], int n, int m) {
	
	 int i = 0, j = 0, k = n - 1;
     while (i <= k && j < m) {
         if (arr1[i] < arr2[j])
             i++;
         else {
             int temp = arr2[j];
             arr2[j] = arr1[k];
             arr1[k] = temp;
             j++;
             k--;
         }
     }
		
		
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	return null;
	
	
    // code here
}

private static void swap(int i, int j) {
	
	
}
}
