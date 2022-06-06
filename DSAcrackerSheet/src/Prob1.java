import java.util.Arrays;

public class Prob1 {
public static void main(String[] args) {
	
	int[] arr= {2,3,5,6,7};
	int[] res=new int[arr.length];
	int j=0;
	for(int i=arr.length-1;i>=0;i--) {
		res[j]=arr[i];
		j++;
	}
	System.out.println(Arrays.toString(res));
}

		
}

