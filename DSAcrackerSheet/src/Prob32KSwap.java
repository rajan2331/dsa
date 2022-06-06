
/*
 * Given an array of n positive integers and a number k. 
 * Find the minimum number of swaps required to bring all the numbers less than or equal to k together.
 */
public class Prob32KSwap {
public static void main(String[] args) {
	int arr[ ] = {10 ,12, 20, 20, 5 ,19, 19, 12, 1, 20, 1}; 
	int  K = 6;
	System.out.println(minSwap(arr,arr.length,K));
	
}
public static int minSwap (int arr[], int n, int k) {
	int count = 0;
	for (int i = 0; i < n; ++i)
	if (arr[i] <= k)
	    ++count;
	
	// Find unwanted elements in current
	// window of size 'count'
	int bad = 0;
	for (int i = 0; i < count; ++i)
	if (arr[i] > k)
	    ++bad;
	
	// Initialize answer with 'bad' value of
	// current window
	int ans = bad;
	for (int i = 0, j = count; j < n; ++i, ++j) {
	
	// Decrement count of previous window
	if (arr[i] > k)
	    --bad;
	
	// Increment count of current window
	if (arr[j] > k)
	    ++bad;
	
	// Update ans if count of 'bad'
	// is less in current window
	ans = Math.min(ans, bad);
	}
	return ans;}


}
