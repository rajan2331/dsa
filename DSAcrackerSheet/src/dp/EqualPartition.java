package dp;

public class EqualPartition {

	public static void main(String[] args) {
		int arr[] = {1,5,5,11};
		System.out.println(equalPartition(arr.length,arr));
	}
	static int equalPartition(int N, int arr[])
    {
        int sum=0;
        for(int i:arr)
        sum=sum+i;
        if(sum%2==0)
      return  subsetSum(arr,N,sum/2)==true?1:0;
      else
      return 0;
    }
    
    static boolean subsetSum(int[] arr,int n,int sum){
        
        if(n==0 )
        return false;
        if(sum==0)
        return true;
        
        
        if(arr[n-1]<=sum){
            
            return subsetSum(arr,n-1,sum-arr[n-1])|| subsetSum(arr,n-1,sum);
        }else{
            return subsetSum(arr,n-1,sum);
        }
    }
}
