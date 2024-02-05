package ae.gov.dubaipolice.sas.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CourseSchedII {
	  public static  int[] findOrder(int numCourses, int[][] prerequisites) { ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	  
	  for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
	  for(int i=0;i<prerequisites.length;i++)
	  {
		  adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
	  }
	  
	  int[] indegree = new int[numCourses];
	  for(int i=0;i<numCourses;i++)
	  {
		  for(int it:adj.get(i))
			  indegree[it]++;
	  }
	  
	  Queue<Integer> st = new LinkedList();
	  
	  for(int i=0;i<numCourses;i++)
	  {
		  if(indegree[i]==0)
			  st.add(indegree[i]);
	  }
	  int[] ans= new int[numCourses];
	  int index=0;
	  while(!st.isEmpty())
	  {
		  int node =st.poll();
		  ans[index++]=node;
		  for(int it : adj.get(node))
		  {
			  indegree[it]--;
			  if(indegree[it]==0)
				  st.add(it);
		  }
	  }
	  if (index == numCourses) return ans;
        int[] arr = {};
  return arr;
}
	  
	  
	  
	  public static void main(String[] args) {
		  int numCourses = 4; 
		  int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};
		  
		  
		  System.out.println(Arrays.toString(findOrder(numCourses,prerequisites)));
	}
}
