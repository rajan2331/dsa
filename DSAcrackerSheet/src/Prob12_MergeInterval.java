import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob12_MergeInterval {
public static void main(String[] args) {
	
	int[][] interval ={{1,3},{2,8},{8,10},{15,18}};
	System.out.println(Arrays.deepToString(mergee(interval)));
	
}

public static int[][] merge(int[][] intervals) {
	List<List<Integer>> resint = new ArrayList<List<Integer>>();
	List<Integer> items= new ArrayList<Integer>();
	items.add(intervals[0][0]);
	items.add(intervals[0][1]);
	resint.add(items);
	for(int i=1; i<intervals.length; i++){
        if(intervals[i][0] > resint.get(resint.size() - 1).get(1)){
            List<Integer> item = new ArrayList<Integer>();
            item.add(intervals[i][0]);
            item.add(intervals[i][1]);
            resint.add(item);
        } else {
            if(resint.get(resint.size() - 1).get(1) < intervals[i][1])
            resint.get(resint.size()-1).set(1,intervals[i][1]);
        }
    }

    int[][] result = new int[resint.size()][2];
    for(int i=0; i<resint.size(); i++){
        result[i][0] = resint.get(i).get(0);
        result[i][1] = resint.get(i).get(1);
    }

    return result;
    
}
public static int[][] mergee(int[][] intervals) {
	Arrays.sort(intervals ,(arr1,arr2)-> Integer.compare(arr1[0],arr2[0]));

	List<int[]> outArr = new ArrayList();
	outArr.add(intervals[0]);
	int[] current_interval=outArr.get(0);
	for(int[] interval:intervals) {
		int curr_begin=current_interval[0];
		int curr_end=current_interval[1];
		int next_begin=interval[0];
		int next_end=interval[1];

		if(curr_end>=next_begin) {
			current_interval[0]=curr_begin;
			current_interval[1]=Math.max(curr_end, next_end);
		}else
		{
			current_interval=interval;
			outArr.add(current_interval);
		}

	}
	
	return outArr.toArray(new int[outArr.size()][]);
}
}
