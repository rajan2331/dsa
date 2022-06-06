
public class Prob2_Max_MinEle {

	public static void main(String[] args) {
		int[] arr = {2,5,3,4,8,9,10,27,19,22};
		
		System.out.println("max ele : "+getMax(0,arr.length,arr));
		System.out.println("min ele : "+getMin(0,arr.length,arr));
		
	}

	private static Integer getMin(int i, int n, int[] arr) {
		
		return n==1?arr[i]:Math.min(arr[i],getMin(i+1,n-1,arr));
	}

	private static Integer getMax(int i , int n ,int[] arr) {
		
		return n==1?arr[i]:Math.max(arr[i],getMax(i+1,n-1,arr));
	}
}
