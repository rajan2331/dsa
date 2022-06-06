package searchin.sorting;

public class ActivityProblem {
public static void main(String[] args) {
	int  start[]  =  {1, 3, 0, 5, 8, 5};
    int  finish[] =  {2, 4, 6, 7, 9, 9};

   System.out.println(getMaxActivity(start,finish));
}

private static int getMaxActivity(int[] start, int[] finish) {
	int max=1;
	int init=0;
	for(int i=1;i<=start.length-1;i++) {
		if(start[i]>=finish[init])
		{	max++;
			++init;
		}
	}
	
	return max;
}
}

