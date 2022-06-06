import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Prob29_ChocloateDistribution {
public static void main(String[] args) {
	int N = 8, M = 5;
			long[] A = {3, 4, 1, 9, 56, 7, 9, 12};
			ArrayList<Long> a = new ArrayList<Long>();
			for(long b : A)
				a.add(b);
			System.out.println(findMinDiff(a,N,M));
}

public static long findMinDiff (ArrayList<Long> a, long n, long m)
{
	
	Collections.sort(a);
	long min_diff=Integer.MAX_VALUE;
	for(long i=0;i+m-1<n;i++) {
		
		long diff=a.get((int) (i+m-1))-a.get((int) i);
		if(diff<min_diff)
			min_diff=diff;
	}
	return min_diff;
    // your code here
}
}
