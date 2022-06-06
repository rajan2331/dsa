
public class Prob3_KthEleArray {

	public static void main(String[] args) {
		int[] arr= {3,2,4,5,6,7};
		int k=3;
		int n=arr.length;
		System.out.println(getKthSmallElement(arr,k));
	}

	private static int getKthSmallElement(int[] arr, int k) {
		int l=0,r=arr.length-1;
		int index=r+1-k;
	//	int pivot=partition(arr,l,r);
		while(l<r) {
			 int pivot = partition(arr, l, r);
	            if (pivot < index) l = pivot + 1; 
	            else if (pivot > index) r = pivot - 1;
	            else return arr[pivot];
	        }
	        return arr[l];
	    }
	
    static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] < pivot) {
                i += 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }
}
