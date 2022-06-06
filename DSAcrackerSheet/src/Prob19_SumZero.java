import java.util.HashSet;
import java.util.Set;

public class Prob19_SumZero {
public static void main(String[] args) {
	int sum[] = {1,2,0,3,4,5};
	System.out.println(findsum(sum,sum.length));
 }
static boolean findsum(int arr[],int n)
{
    int min= 0;
    Set<Integer> temp = new HashSet<Integer>();
    
    for(int i=0;i<n;i++) {
    	
    		min=min+arr[i];
    		
    	if(min==0 || temp.contains(min) || arr[i]==0) 
    		return true;
    	temp.add(min);
    }
    return false;
}
}
