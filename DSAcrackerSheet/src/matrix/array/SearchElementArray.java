package matrix.array;

public class SearchElementArray {

	
	public static void main(String[] args) {
	int[][] 	matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
	int target = 4;
	System.out.println(searchMatrix(matrix,target));
	
	}
public static boolean searchMatrix(int[][] matrix, int target) { 
    boolean flag=false;
    int array=0;
    for(int i=0;i<matrix.length;i++) {
    	
    		int j=matrix[i].length-1;
    		if(target<=matrix[i][j])
    		{	array=i;
    			break;
    		}
    		
    	}
    	
    	int[] arrayContains=matrix[array];
    	for(int k:arrayContains) {
    		if(target==k)
    			flag=true;
    	}
    	
    
    return flag;

}
}
