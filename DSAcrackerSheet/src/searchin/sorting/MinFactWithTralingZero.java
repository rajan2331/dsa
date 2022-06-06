package searchin.sorting;

public class MinFactWithTralingZero {
public static void main(String[] args) {
	System.out.println(findNum(6));
}

static int findNum(int n)
{
	int high=n*5;
	int low=0;
	
	while(low<high) {
		 int mid = (low + high) /2;

    if (check(mid, n))
        high = mid;
    else
        low = mid + 1;
	}
	
	
	return low;
}

private static boolean check(int mid,int n) {
	int count=0,f=5;
	while(f<=mid) {
		count=count+mid/f;
		f=f*5;
	}
	if(count>=n)
	return true;
	else
		return false;
}

}