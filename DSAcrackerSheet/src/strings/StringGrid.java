package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringGrid {
public static void main(String[] args) {
	
	char[][] arr = 
				{{'a','b','a','b'},
				{'a','b','e','b'},
				{'e','b','e','b'}};
String s= "abe";
	
	System.out.println(Arrays.deepToString(searchWord(arr,s)));
	
}

public static int[][] searchWord(char[][] grid, String word)
{
	int[][] res= new int[grid.length][grid.length];
	int total=0;
	int k=0;
	for(int i=0;i<grid.length;i++ ) {
		int arr[]=new int[2];
		for(int j=0;j<grid[i].length;j++) {
			
			
			if(grid[i][j]==word.charAt(k) ) {
				
				for(int p=1;p<9;p++) {
					 
					
					
					
				}
				
			}
			
			
		}
		
	}
	return res;
}

private static int searchWord(char[][] grid, int i, int j, String word, int k) {
	
	List<Integer> list = new ArrayList<Integer>();
	
	
	for(int p=0;p<7;p++) {
		
		
	}
	int count=0;
	boolean flag1=false;
	if(i>=0 && j>=0 && i<grid.length && j<grid[i].length && grid[i][j]==word.charAt(k)) {
		
		char match = word.charAt(k);
		grid[i][j]=0;
		k++;
	if(k==word.length())
		count =1;
		else {
		if(flag1 || count==0) {
		count+= searchWord(grid,i-1,j,word,k); flag1=true;}  // -1 0
		else if(flag1 || count==0) {
		count+= searchWord(grid,i,j-1,word,k);flag1=true;}	//	0 -1
		else if(flag1 || count==0) {
		count+= searchWord(grid,i+1,j,word,k);flag1=true;}	//	1 0
		else if(flag1 || count==0) {
		count+= searchWord(grid,i,j+1,word,k);flag1=true;}		//	0	1
		else if(flag1 || count==0) {
		count+= searchWord(grid,i-1,j-1,word,k);flag1=true;}	//	-1	-1
		else if(flag1 || count==0) {
		count+= searchWord(grid,i+1,j+1,word,k);flag1=true;}	//	1 1
		else if(flag1 || count==0) {
		count+= searchWord(grid,i-1,j+1,word,k);flag1=true;}	//	-1 1
		else if(flag1 || count==0) {
		count+= searchWord(grid,i+1,j-1,word,k);flag1=true;}    // 1 -1
		
	}
	grid[i][j]=match;
	}
	return count;
}
}
