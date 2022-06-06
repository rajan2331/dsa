package matrix.array;

import java.util.Arrays;

public class MedianArray {
public static void main(String[] args) {
	
	int[][] M = {{1, 3, 5}, 
	     {2, 6, 9}, 
	     {3, 6, 9}};
	System.out.println(median(M,3,3));
}

static int median(int matrix[][], int r, int c) { 
	
	int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;

for(int i=0; i<r ; i++)
{
      
    // Finding the minimum element
    if(matrix[i][0] < min)
        min = matrix[i][0];
      
    // Finding the maximum element
    if(matrix[i][c-1] > max)
        max = matrix[i][c-1];
}
  
int desired = (r * c + 1) / 2;
while(min < max)
{
    int mid = min + (max - min) / 2;
    int place = 0;
    int get = 0;
      
    // Find count of elements smaller than mid
    for(int i = 0; i < r; ++i)
    {
          
        get = Arrays.binarySearch(matrix[i],mid);
          
        // If element is not found in the array the 
        // binarySearch() method returns 
        // (-(insertion_point) - 1). So once we know 
        // the insertion point we can find elements
        // Smaller than the searched element by the 
        // following calculation
        if(get < 0)
            get = Math.abs(get) - 1;
          
        // If element is found in the array it returns 
        // the index(any index in case of duplicate). So we go to last
        // index of element which will give  the number of 
        // elements smaller than the number including 
        // the searched element.
        else
        {
            while(get < matrix[i].length && matrix[i][get] == mid)
                get += 1;
        }
          
        place = place + get;
    }
      
    if (place < desired)
        min = mid + 1;
    else
        max = mid;
}
return min;

}
}
