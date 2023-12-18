package com.springboot.chatapp.domain;

import java.util.LinkedList;
import java.util.Queue;
class Triplet
{
	int first;
	int second;
	int time;
	public Triplet(int first, int second, int time) {
		this.first = first;
		this.second = second;
		this.time = time;
	}
	
	
}
public class Test {

	
	public static void main(String[] args) {
		//[2,1,1],[0,1,1],[1,0,1]
		int[][] grid= { {2,1,1 },
						{0,1,1},
						{1,0,1}};
		
		System.out.println(orangesRotting(grid));
	}
	 public static int orangesRotting(int[][] grid) {
		 	
		 	Queue<Triplet> q = new LinkedList<Triplet>();
		 	
		 	int goodOranges=0;
		 	int n=grid.length;
		 	int m=grid[0].length;
		 	for(int i=0;i<n;i++)
		 	{
		 		for(int j=0 ;j<m;j++)
		 		{
		 			if(grid[i][j]==2)
		 			{
		 				q.add(new Triplet(i,j,0));
		 			}
		 			if(grid[i][j]==1)
		 				goodOranges++;
		 		}
		 		
		 	}
		 	
		 	if(goodOranges==0)
		 		return 0;
		 	
		 	return bfs(grid,q,goodOranges);
	    }
	private static int bfs(int[][] grid, Queue<Triplet> q, int goodOranges) {
		int time=0;
		int n=grid.length;
	 	int m=grid[0].length;
	 	while(!q.isEmpty())
	 	{
	 		int[] row= {-1,0,1,0};
			int[] col= {0,1,0,-1};
			time++;
			
			for(int dir =0;dir<4;dir++)
			{
				int nRow = q.peek().first+ row[dir];
				int nCol = q.peek().second+col[dir];
				
				if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && grid[nRow][nCol]==1)
				{
					grid[nRow][nCol]=2;
					q.add(new Triplet(nRow,nCol,time));
					goodOranges--;
				}
			}
			time =q.peek().time;
			q.remove();
			if(!q.isEmpty())
				time=q.peek().time;
			
	 	}
	 	
	 	if(goodOranges>0)
	 		return -1;
		return time;
	}
}
