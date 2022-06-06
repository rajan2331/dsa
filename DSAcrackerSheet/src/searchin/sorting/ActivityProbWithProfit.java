package searchin.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivityProbWithProfit {
 public static void main(String[] args) {
	List<Job> jobs= new ArrayList<Job>();
	
	jobs.add(new Job(1,2,50));
	jobs.add(new Job(3,5,20));
	jobs.add(new Job(6,19,100));
	jobs.add(new Job(2,100,200));
	System.out.println(maxProfit(jobs));
	
}

private static int maxProfit(List<Job> jobs) {
	Comparator<Job> compareByPersonRole = (Job o1, Job o2) ->
	o1.start.compareTo( o2.start);
	Collections.sort(jobs, compareByPersonRole);
	
// 1,2,50 2,100,200 3,5,20  6,19,100)
	 int end1 = 0, end2 = 0, temp1 = 0, sum = 0, temp2 = 0, max = 0;
	for(int i=0;i<jobs.size();i++) {
		end1=jobs.get(i).end;
		end2=jobs.get(i).end;
		temp1=jobs.get(i).profit;
		temp2=jobs.get(i).profit;
		for(int j=i+1;j<jobs.size();j++) {
			if(jobs.get(j).start>=end1)
			{
				temp1=temp1+jobs.get(j).profit;
				end1=jobs.get(j).end;
			}else if(jobs.get(j).start>=end2) {
			temp2=temp2+jobs.get(j).profit;
			end2=jobs.get(j).end;
			}
		}

		max=Math.max(temp1, temp2);
		sum=Math.max(sum, max);
	}
	
	
	return sum;
}


public static class Job{
	public Integer start;
	public Integer end;
	public Integer profit;
	
	public Job(Integer start,Integer end,Integer profit) {
		this.start=start;
		this.end=end;
		this.profit=profit;
				
	}

	
}
}







