import java.util.ArrayList;
import java.util.Arrays;

public class Prob18_CommonEle {
public static void main(String[] args) {
	
	int[] a = {1, 5, 10, 20, 40, 80};
	int[] b= {6, 7, 20, 80, 100};
	int[] c = {3, 4, 15, 20, 30, 70, 80, 120};
	ArrayList<Integer> list = commonElements(a,b,c,a.length,b.length,c.length);
	System.out.println(Arrays.asList(list));
}

static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
{
	ArrayList<Integer>  out= new ArrayList(n1);
	ArrayList<Integer>  output= new ArrayList();
	ArrayList<Integer>  finallist= new ArrayList();
	for(int i=0;i<n1;i++) {
		out.add(A[i]);
		
	}
	for(int a : B) {
		if(out.contains(a))
			output.add(a);
	}
	for(int c:C) {
		if(output.contains(c))
			finallist.add(c);
	}
	
	return output;
    // code here 
}
}
