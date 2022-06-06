import java.util.ArrayList;
import java.util.List;

public class Prob17_PairSum {
public static void main(String[] args) {
	int [] arr= {48 ,24, 99, 51, 33, 39, 29, 83, 74, 72, 22, 46, 40, 51, 67, 37, 78, 76, 26, 28, 76, 25, 10, 65, 64, 47, 34 ,88 ,26 ,49, 86,
			73, 73, 36, 75, 5, 26, 4, 39, 99, 27, 12, 97 ,67 ,63, 15, 3 ,92, 90};
	System.out.println(getPairsCount(arr, arr.length, 50));
}

 static int getPairsCount(int arr[], int n, int k) {
	 List<Integer> compList= new ArrayList<Integer>();
	 int count=0;
	 for(int i :arr) {
		 
		 if(i<k) {
			 compList.add(k-i);
			 if(compList.contains(i))
				 count++;
	 }
	}
	 return count;
}

}