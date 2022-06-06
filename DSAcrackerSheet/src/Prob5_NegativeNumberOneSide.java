import java.util.Arrays;

public class Prob5_NegativeNumberOneSide {
public static void main(String[] args) {
	
	int arr[]= {-12,11,3,-5,4};
	System.out.println(Arrays.toString(rearrange(arr,arr.length)));
}

static int[] rearrange(int arr[], int n)
{
    int j = 0, temp;
    for (int i = 0; i < n; i++) {
        if (arr[i] < 0) {
            if (i != j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
    }
    return arr;
}
}
