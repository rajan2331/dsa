import java.util.ArrayList;
import java.util.List;

public class SumSubArray {
public static void main(String[] args) {
	//int[] arr={135 ,101 ,170 ,125, 79 ,159 ,163 ,65 ,106, 146 ,82 ,28 ,162 ,92 ,196 ,143 ,28 ,37 ,192, 5 ,103 ,154 ,93 ,183 ,22 ,117 ,119 ,96 ,48 ,127, 172, 139, 70, 113, 68, 100, 36, 95, 104 ,12 ,123 ,134};
	int[] arr= {1, 4, 20, 3, 10, 35};
	int sum =35;
	
	System.out.println(subarraySum(arr,arr.length,sum));
}
static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
{
	ArrayList<Integer> res= new ArrayList<Integer>(2);
    
    int i=0;int j=0;
    int sum=0;
    boolean flag=false;
  while(j<n) {
    	if(sum==s) {
    		flag=true;
    		res.add(i+1);
    		res.add(j);
    		break;
    	}
    	else if(sum>s) {
    		sum=sum-arr[i];
    		i++;
    		
    	}else {
    		sum=sum+arr[j];
    		j++;
    	}
    }
  	if(!flag) {
  		j--;
  		while(i<=j) {
  		sum=sum-arr[i];
  		i++;
  		if(sum==s) {
  			res.add(i);
    		res.add(j);
    		flag=true;
    		break;
  		}
  		}
  	}
  	if(!flag) {
  		res.add(-1);
  	}
    return res;
    
}
}
