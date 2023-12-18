package com.springboot.chatapp.domain;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Grid
{
	int first;
	int second;
	
	public Grid(int first, int second) {
		super();
		this.first = first;
		this.second = second;
		
	}
	
	
}
public class Test1 {

	public static void main(String[] args) {
	//	int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
		int[][] image = {{0,0,0},{0,0,0}};
		System.out.println(Arrays.deepToString(floodFill(image, 1, 1, 2)));
	}
	
	 public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
		 
		 	if(image[sr][sc]==color)
		 		return image;
		 	Queue<Grid> queue = new LinkedList<Grid>();
		 	
		 	int n=image.length;
		 	int m = image[0].length;
		 	queue.add(new Grid(sr,sc));
		 	int intialColor = image[sr][sc];
		 	image[sr][sc]=color;
		 	while(!queue.isEmpty())
		 	{
		 		int row[] = {-1,0,1,0};
		 		int col []= {0,1,0,-1};
		 		for(int dir=0;dir<4;dir++)
		 		{
		 			int nRow = queue.peek().first+row[dir];
		 			int nCol = queue.peek().second+col[dir];
		 			
		 			if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && image[nRow][nCol] == intialColor)
		 			{
		 				image[nRow][nCol]=color;
		 				queue.add(new Grid(nRow,nCol));
				} 
		 		}
		 		queue.remove();
		 	}
		 	
		 	
	        return image;
	    }
}
