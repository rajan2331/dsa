package com.springboot.chatapp.domain;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Triplets{
	public int first;
	public int second;
	public int third;
	public Triplets(int first, int second, int third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}
}
public class Test3 {
	public static void main(String[] args) {
	//	int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
		int[][] mat = {{0,0,0},
					   {0,1,0},
					   {1,0,1}};
		System.out.println(Arrays.deepToString(updateMatrix(mat)));
	}

	private static int[][] updateMatrix(int[][] mat) {
		
		int m=mat.length;
		int n= mat[0].length;
		Queue<Triplets> queue = new LinkedList();
		int visited[][] = new int[m][n];
		int dist[][] = new int[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if(mat[i][j]==0)
				{
					queue.add(new Triplets(i,j,0));
					visited[i][j]=1;
				}else
				{
					visited[i][j]=0;
				}
			}
		}
		int[] row= {-1,0,1,0};
		int[] col = {0,1,0,-1};
		while(!queue.isEmpty())
		{
			
			 int first = queue.peek().first; 
		        int second = queue.peek().second; 
			int steps = queue.peek().third; 
			queue.remove();
			mat[first][second] = steps; 
			for(int dir=0;dir<4;dir++)
			{
				int nrow = first +row[dir];
				int ncol = second+col[dir];
				  if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n
				            && visited[nrow][ncol] == 0)  {
				                    visited[nrow][ncol] = 1; 
				                    queue.add(new Triplets(nrow, ncol, steps+1));  
				            } 
			}
			
			
			
		}
		return mat;
	}
}
