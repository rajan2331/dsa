import java.util.Arrays;

public class Prob9_MinnimumHeights {

	public static void main(String[] args) {
		
		int[] arr= {2 ,6 ,3, 4, 7, 2, 10, 3, 2, 1};
		System.out.println(getMinn(arr,4,arr.length));
	}

	private static int getMin(int[] arr, int k,int n) {
 
        Arrays.sort(arr);
        int min_elem, max_elem;
        int ans = arr[n-1] - arr[0];
        
        for (int i=1 ; i<=n-1; i++){
            
            if(arr[i] < k)
                continue;
         
            max_elem = Math.max(arr[i-1] + k, arr[n-1] - k );
            min_elem = Math.min(arr[0] + k, arr[i] - k );
            ans = Math.min(ans, max_elem - min_elem);
        }
        return ans;
        
	
	}
	private static int getMinn(int[] arr, int k,int n) {
		 
        Arrays.sort(arr);
        int min_elem, max_elem;
        int ans = arr[n-1] - arr[0];
        int min=arr[0]+k;
        int max=arr[n-1]-k;
        
        for (int i=0 ; i<=n-2; i++){

        	min_elem=Math.min(min, arr[i+1]-k);
        	max_elem=Math.max(max, arr[i]+k);
        	if(min_elem<0)
        		continue;
        	ans = Math.min(ans, max_elem-min_elem);
        }
        return ans;
        
	
	}
}
