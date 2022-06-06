
public class Prob30MinnSubArray {
public static void main(String[] args) {
long 	A[] = {1, 4, 45, 6, 0, 19};
long	x  =  51;

System.out.println(sb(A,A.length,x));
}
public static long sb(long a[], long n, long x) {

 
   long length=n+1;
   long min_sum=0;
   int l=0;int r=0;
   while(r<n) {
	   
	   while(min_sum<=x && r<n) {
		   min_sum+= a[r++];
	   }
	   
	   while(min_sum>x && l<n) {
		   if(r-l<length)
			   length=r-l;
		   
		   min_sum-=a[(l++)];
	   }
   }
   
   return length;

}
}
