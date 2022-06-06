
public class Perm {
	public static void permute(int[] arr){
	    permuteHelper(arr, 0);
	}

	private static void permuteHelper(int[] arr, int index){
	    if(index >= arr.length - 1){ //If we are at the last element - nothing left to permute
	        //System.out.println(Arrays.toString(arr));
	        //Print the array
	        System.out.print("[");
	        for(int i = 0; i < arr.length - 1; i++){
	            System.out.print(arr[i] + ", ");
	        }
	        if(arr.length > 0) 
	            System.out.print(arr[arr.length - 1]);
	        System.out.println("]");
	        return;
	    }

	    for(int i = index; i < arr.length; i++){ //For each index in the sub array arr[index...end]

	        //Swap the elements at indices index and i
	        int t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;

	        //Recurse on the sub array arr[index+1...end]
	        permuteHelper(arr, index+1);

	        //Swap the elements back
	        t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	    }
	}
public static void main(String[] args) {
	 int[]  arr = {1,3,2};
	System.out.println(getProfit(arr));
	 permute(arr);
 }



//	getProfit(int[] arr)  
  	private static int getProfit(int[] arr ) {
 		
 		int cuts=3;
 		int start=0;
 		int temp=0;
 		int pendingCut=0;
 		int profit=0;
 		int remainder=0;
 		while(start<arr.length) {
 			pendingCut=arr[start]/cuts;
 			if(remainder == 0)
 			{	
 				
 				if(pendingCut>1)
 				{
 					profit+=pendingCut;
 					temp=arr[start]%cuts;
 					if(temp>0) 
 					profit+=getValue(temp);
 	 				remainder = cuts-temp;
 				}else {
 				profit+=getValue(arr[start]);
 				remainder = cuts-arr[start];
 				}
 				
 			}else
 			{
 				profit+=getValue(remainder);
 				
 				
 				if(pendingCut>1)
 				{
 					profit+=pendingCut;
 					temp=arr[start]%cuts;
 					if(temp>0)
 					remainder = temp-remainder;
 	 				if(remainder>0)
 	 				profit+=getValue(remainder);
 				}else {
 				remainder = arr[start]-remainder;
 				if(remainder>0)
 				profit+=getValue(remainder);
 				}
 				remainder=0;
 
 			}
 				
 			start++;
 			
 		}
 		
 		return profit;
 		
 	}

	private static int getValue(int index) {
		if(index==1)
			return -1;
		else if(index==2)
			return 3;
		else
			return 1;
		
	}
}
