
public class Prob28_TrappWaterProb {
public static void main(String[] args) {
	int arr[]   = {2, 0, 2};
	System.out.println(trappingWater(arr,arr.length));
}
static int trappingWater(int arr[], int n) {
    
int sum=0;
int left[]= new int[n];
int right[]=new int[n];
left[0]=arr[0];
for(int j=1;j<=n-1;j++) {
	  left[j]=Math.max(left[j-1],arr[j]);
}
right[n-1]=arr[n-1];
for(int j=n-2;j>=0;j--) {
	  right[j]=Math.max(right[j+1],arr[j]);
}
for(int i=0;i<arr.length;i++) {
 
 sum=sum+Math.min(right[i], left[i])-arr[i];
}
return sum;


} 
}
