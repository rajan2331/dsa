package graphs;

public class Island {
public static void main(String[] args) {
	
	char[][] grid = {{0,1,1,1,0,0,0},{0,0,1,1,0,1,0}};
	
	System.out.println(numIslands(grid));
	
}

public  static int numIslands(char[][] grid) {
	int count=0;
	int[][] visited = new int[grid.length][grid[0].length];
	for(int k=0;k<grid.length;k++) {
		for (int j = 0; j < grid[0].length; j++) {
			visited[k][j]=0;
		}
	}	
	for(int i=0;i<grid.length;i++) {
		for (int j = 0; j < grid[0].length; j++) {
			char cs = grid[i][j];
			
			if(cs==1 && visited[i][j]==0) {
			checkIsland(i,j,grid,0,visited);
			count++;
			}
			
			
		}
	}
	return count;
    // Code here
}

private  static void checkIsland(int i, int j, char[][] grid, int k,int[][] visited) {
	
		int n=grid.length;
		int m=grid[0].length;
		
	if(i<0||j<0||i>=n||j>=m)
		return ;
	if(grid[i][j]==0)
		return ;
	
	if(visited[i][j]==0) {
	visited[i][j]=1;
	checkIsland(i-1,j,grid,k,visited);
	checkIsland(i-1,j-1,grid,k,visited);
	checkIsland(i+1,j,grid,k,visited);
	checkIsland(i+1,j-1,grid,k,visited);
	checkIsland(i,j+1,grid,k,visited);
	checkIsland(i,j-1,grid,k,visited);
	checkIsland(i-1,j+1,grid,k,visited);
	checkIsland(i+1,j+1,grid,k,visited);
	
	}
	
	
}
}
