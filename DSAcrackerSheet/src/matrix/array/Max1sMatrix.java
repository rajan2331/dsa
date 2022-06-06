package matrix.array;

public class Max1sMatrix {

	public static void main(String[] args) {
		int[][] arr = {{0, 1, 1, 1},
		           {0, 0, 1, 0},
		           {1, 0, 1, 0},
		           {0, 0, 0, 0}};
		
		System.out.println(rowWithMax1s(arr,4,4));
	}
	static int rowWithMax1s(int arr[][], int n, int m) {
	       
			int row = -1, i, j;
		 
	    for (i = 0, j = m - 1; i < arr.length; i++) {
	        while (j >= 0 && arr[i][j] == 1) {
	         //    System.out.println(j);
	            row = i;
	            j--;
	        }
	    }
	    return row;
	     
	    }
}
