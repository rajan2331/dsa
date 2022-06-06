package searchin.sorting;

import java.util.Arrays;

public class BookAllocation {
public static void main(String[] args) {
			int N = 4;
			int A[] = {12,34,67,90};
			int M = 2;
			System.out.println(findPages(A,N,M));
	
}

public static int findPages(int[]A,int N,int M)
{
    int res=Integer.MAX_VALUE;
    if (N < M)
        return -1;
    
    int sum=0;
    
    for(int i=0;i<N;i++) {
    	sum+=A[i];
    }
    int low=0;
    Arrays.sort(A);;
    int high=sum;
    
    while(low<=high) {
    	
    	int mid=(low+high)/2;
    	 if (isPossible(A, N ,M, mid))
         {
             res = mid;
             high = mid - 1;
         }
   
         else
             low = mid + 1;
     }
	return res;
}

private static boolean isPossible(int[] a, int n, int m, int mid) {
	int students=1;
	int current_sum=0;
	for(int i=0;i<a.length;i++) {
		
		if(a[i]>mid)
			return false;
		
		if(a[i]+current_sum>mid) {
			students++;
			current_sum=a[i];
			
			if(students>m)
				return false;
		}else
			current_sum+=a[i];
	
	}
	return true;
}
}
