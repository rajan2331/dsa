import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob20LargeFact {
public static void main(String[] args) {
	
	System.out.println(Arrays.asList(factoriall(10).toString()));
}
static ArrayList<Integer> factorial(int N){
	
	int[] res = new int[500];
	res[0]=1;
	int size=1;
	for(int i=1;i<=N;i++) {
		
		size=multiply(i,res,size);
	}
	 
	ArrayList<Integer> out= new ArrayList();
	 for (int i = size - 1; i >= 0; i--)
		 out.add(res[i]);
return out;
    //code here
}
private static int multiply(Integer x,int[] res, int size) {
	int carry=0;
	for(int i=0;i<size;i++) {
		int t= res[i]*x+carry;
		res[i]=t%10;
		carry=t/10;
	}
	
	while(carry!=0) {
		 res[size] = carry % 10; 
         carry = carry / 10; 
         size++; 
	}
	return size;
}

static ArrayList<Integer> factoriall(int N){
	
	ArrayList<Integer> out= new ArrayList<Integer>();
	int size=1;
	int[] res = new int[500];
	res[0]=1;
	for(int i=1;i<N;i++) {
		size=multiplyy(i,res,size);
		
	}
	for(int j=size-1;j>=0;j--) {
		out.add(res[j]);
	}
	return out;
	
}
private static int multiplyy(int num, int[] res, int size) {
	int carry=0;
	for(int i=0;i<size;i++) {
		
		int temp= num*res[i]+carry;
		res[i]=temp%10;
		carry=temp/10;
	}
	while(carry!=0) {
		res[size]=carry%10;
		carry=carry/10;
		size++;
	}
	return size;
}

}
