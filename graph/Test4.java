package com.springboot.chatapp.domain;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Nodee
{
	public int first;
	public int second;
	public int step;
	public Nodee(int first, int second, int step) {
		super();
		this.first = first;
		this.second = second;
		this.step = step;
	}
	
	
}
public class Test4 {

	public static void main(String[] args) {
		char[][] board =  {	{'X','X','X','X'},
							{'X','O','O','X'},
							{'X','X','O','X'},
							{'X','O','X','X'}};
		solve(board);
	}

	public static void solve(char[][] board) {

		int m=board.length;
		int n=board[0].length;
		boolean visited[][] = new boolean[m][n];
		Arrays.fill(visited,false);
		Queue<Nodee> queue = new LinkedList();
		for(int j=0;j<n;j++)
		{
			if(board[0][j]==0 && visited[0][j])
			{
				queue.add(new Nodee(0,j,1));
				visited[0][j]=true;
			}
			if(board[m-1][j]==0 && visited[m-1][j])
				visited[m-1][j]=true;
		}
		
		

	}
}
