import java.util.Arrays;

public class Prob4_012_Sort {
public static void main(String[] args) {
	
	int[] arr= {1,0,2,1,0,1};
	
	System.out.println(Arrays.toString(getsortedArray(arr)));
}

private static int[] getsortedArray(int[] arr) {
	int countZero=0,countOne=0,countTwo=0;
	int[] res=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==0)
			countZero++;
		else if(arr[i]==1)
			countOne++;
		else
			countTwo++;
	}
	
	for(int i=0;i<arr.length;i++)
	{
		if(countZero!=0) {
			res[i]=0;
			countZero--;
		}
		else if(countOne!=0)
		{
			res[i]=1;
			countOne--;
		}else
		{
			res[i]=2;
			countTwo--;
		}
	}
	
	return res;
}
}
