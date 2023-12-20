package com.springboot.chatapp.domain;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Count{
	int first;
	int second;
	public Count(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	
}
public class Test5 {

	public static void main(String[] args) {
		
		int[][] grid = {{0,1,1,0},
						{0,0,1,0},
						{0,0,1,0},
						{0,0,0,0}};
		int[][] grid2 = {
						{0,0,0,0},
						{1,0, 1,0},
						{0,1,1,0},
						{0,0,0,0}};
		System.out.println(numEnclaves(grid2));
		
	}
	
    public static int numEnclaves(int[][] grid) {
        int max=0;
        int m=grid.length;
        int n=grid[0].length;
        Queue<Count> queue = new LinkedList();
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++)
        {
        	Arrays.fill(visited[i], false);
        }
        for(int i=0;i<m;i++)
        {
        for(int j=0;j<n;j++)
        {
        	// first row
        	if(i==0 || j==0|| i==m-1|| j==n-1)
        	{
        			queue.add(new Count(i,j));
        			visited[i][j]=true;
        	}
        }	
        
        }
        int[] row = {-1,0,1,0};
        int[] col = {0,1,0,-1};
        while(!queue.isEmpty())
        {
        	int first =  queue.peek().first;
        	int second = queue.peek().second;
        	queue.remove();
        	for(int dir=0;dir<4;dir++)
        	{
        		int nrow=first+row[dir];
        		int ncol= second+col[dir];
        		
        		if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && !visited[nrow][ncol] && grid[nrow][ncol]==1)
        		{
        			visited[nrow][ncol]=true;
        			queue.add(new Count(nrow,ncol));
        		}
        	}
        }
        
        for (int i = 0; i < m; i++) {
        	{
        		for (int k = 0; k < n; k++) {
					
					if(!visited[i][k] && grid[i][k]==1)
					{
	                    max++; 
					}
				}
        	}
			
		}
        
        return max;
    }
}
