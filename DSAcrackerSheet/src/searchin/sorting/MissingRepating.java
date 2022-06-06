
package searchin.sorting;

public class MissingRepating {
public static void main(String[] args) {
	int[] arr = {1,3,3};
	System.out.println();
}

static int[] findTwoElement(int arr[], int n) {
    int[] res = new int[2];
    
    for(int i=0;i<=arr.length-1;i++)
    {
    	int abs =Math.abs(arr[i]);
    	if(arr[abs-1]>0)
    	arr[abs-1]=-arr[abs-1];
    	else
    		res[0]=abs;
    	
    }
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]>0)
    		res[1]=i+1;
    }

    return res;
}
}
