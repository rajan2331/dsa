package searchin.sorting;

public class DoubleHelix {
public static void main(String[] args) {
	
	int[] A = {3 ,5 ,7 ,9 ,20 ,25 ,30 ,40 ,55 ,56 ,57, 60, 62};
	int[] B= {1, 4, 7 ,11 ,14 ,25 ,44 ,47 ,55 ,57, 100};
	System.out.println(getIntersection(A,B));
 }

private static int getIntersection(int[] a, int[] b) {
	int i=0;
	int j=0;
	int max_sum=0;
	int temp1=0;
	int temp2=0;
	while(i<a.length && j<b.length) {
		if(a[i]==b[j])
		{
			max_sum=max_sum+Math.max(temp1, temp2)+a[i];
			temp1=0;
			temp2=0;
			i++;
			j++;
		
		}else if(a[i]<b[j]) {
			temp1=a[i]+temp1;
			i++;
			
		}else {
			temp2=b[j]+temp2;
			j++;
			
		}
		
		
	}
	while(i<a.length) {
		temp1=+a[i];
		i++;
	}
	while(j<b.length) {
		temp2=+b[j];
	j++;
	}
	
	max_sum=max_sum+Math.max(temp1, temp2); 
	return max_sum;
}
}
