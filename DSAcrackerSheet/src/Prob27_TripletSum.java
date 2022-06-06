
public class Prob27_TripletSum {
	
	public static void main(String[] args) {
		int n = 6, X = 13;
			int	arr[] = {1, 4 ,45, 6, 10, 8};
			System.out.println(find3Numbers(arr,n,X));
	}
	 
	public static boolean find3Numbers(int A[], int n, int X) { 
	    
        quickSort(A, 0, n - 1);
	    
	      for(int i=0;i<n-2;i++) {
	    	  int l=i+1;
	    	  int r=n-1;
	    	  while(l<r) {
	         if((A[i]+A[l]+A[r])==X)
	    	  return true;
	    	  if(A[l]+A[r]+A[i]<X)
	    		  l++;
	    	  else
	    		  r--;
	    	  }
	    	  
	      }
	    return false;
	    
    
    }
  static  void quickSort(int A[], int si, int ei)
    {
        int pi;

        /* Partitioning index */
        if (si < ei) {
            pi = partition(A, si, ei);
            quickSort(A, si, pi - 1);
            quickSort(A, pi + 1, ei);
        }
    }
   static int partition(int A[], int si, int ei)
    {
        int x = A[ei];
        int i = (si - 1);
        int j;

        for (j = si; j <= ei - 1; j++) {
            if (A[j] <= x) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i + 1];
        A[i + 1] = A[ei];
        A[ei] = temp;
        return (i + 1);
    }
   
} 