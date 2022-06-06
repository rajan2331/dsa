package graphs;

import java.util.ArrayList;
import java.util.Collections;

public class RatMaze {
	public static void main(String[] args) {
		 int arr[][] = {{1, 0, 0, 0},
				 		{1, 1, 0, 1}, 
				 		{1, 1, 0, 0},
				 		{0, 1, 1, 1}};
		 System.out.println(findPath(arr,4));
	}


	public static ArrayList<String> findPath(int[][] m, int n) {
		ArrayList<String> result= new ArrayList<String>();
		
		boolean[][] visited = new boolean[n][n];
		findPath(0,0,m,n,result,visited);
		Collections.sort(result);
		return result;
		
    }

	static String path="";
	private static void findPath(int row,int col, int[][] m,int n,ArrayList<String> result,boolean[][] visited) {
		
		if(row<0||col<0|| row==n|| col==n|| visited[row][col]|| m[row][col]==0)
			return;
		 if (row == n-1 && col == n-1)
		    {
			 result.add(path);
		        return;
		    }
		 visited[row][col] = true;
		 
		if(validPath(row-1,col,n,visited,m)) {
			path=path+'U';
		findPath(row-1,col,m,n,result,visited);
		path = path.substring(0, path.length() - 1);
		}
		
		
		if(validPath(row,col+1,n,visited,m)) {
			path=path+'R';
		findPath(row,col+1,m,n,result,visited);
		path = path.substring(0, path.length() - 1);
		}
		
		
		if(validPath(row+1,col,n,visited,m)) {
			path=path+'D';
		findPath(row+1,col,m,n,result,visited);
		path = path.substring(0, path.length() - 1);
		}
		
		
		if(validPath(row,col-1,n,visited,m)) {
			path=path+'L';
		findPath(row,col-1,m,n,result,visited);
		path = path.substring(0, path.length() - 1);
		}
		
		  visited[row][col] = false;
	}
	private static boolean validPath(int row,int col,int n,boolean[][] visited,int[][] m) {
		
		if(row<0||col<0||  row==n||col==n|| visited[row][col]||m[row][col]==0)
			return false;
		return true;
	}


	
}
