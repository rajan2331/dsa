import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class Prob6UnionArray {

	public static void main(String[] args) {
		int[] arr1= {2,3,4,5,6};
		int[] arr2= {23,34,45,2,3};
		
		List<Integer> response= getUnion(arr1,arr2);
		for(int a:response) {
			System.out.print(a+",");
		}
		//System.out.println(StringUtils.join());
	}

	private static List<Integer> getUnion(int[] arr1, int[] arr2) {
		List<Integer> aList = new ArrayList<Integer>(arr1.length);
		List<Integer> res = new ArrayList<Integer>(arr1.length+arr2.length);
		for (int i : arr1)
		{
		    aList.add(i);
		}
		for (int i : arr1)
		{
		    aList.add(i);
		}
		List<Integer> bList = new ArrayList<Integer>(arr2.length);
		for (int i : arr2)
		{
		    bList.add(i);
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			if(!res.contains(aList.get(i)))
			res.add(aList.get(i));
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(!res.contains(bList.get(i)))
			res.add(bList.get(i));
		}
		
		return res;
	}
}
