import java.util.HashSet;
import java.util.Set;

public class Prob22_longestSUbSeq {
public static void main(String[] args) {
	
	int[] arr= {2,6,1,9,4,5,3};
	System.out.println(findLongestConseqSubseq(arr,arr.length));
}

static int findLongestConseqSubseq(int arr[], int N)
{
	int ans=0;
	Set<Integer> num_set= new HashSet<Integer>();
	for(int i: arr)
		num_set.add(i);
	
	 int longestStreak = 0;

     for (int num : num_set) {
         if (!num_set.contains(num-1)) {
             int currentNum = num;
             int currentStreak = 1;

             while (num_set.contains(currentNum+1)) {
                 currentNum += 1;
                 currentStreak += 1;
             }

             longestStreak = Math.max(longestStreak, currentStreak);
         }
     }

     return longestStreak;
}
}
