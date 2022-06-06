package graphs;

import java.util.Arrays;

public class FloodFill {
public static void main(String[] args) {
	
	int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
	int sr = 1,  sc = 1, newColor = 2;
	for (int i = 0; i < image.length; i++) {
		System.out.println(Arrays.toString(image[i]));
		
	}
	floodFill(image,sr,sc,newColor);
	for (int i = 0; i < image.length; i++) {
		System.out.println(Arrays.toString(image[i]));
		
	}
}
	
public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
      
	int color = image[sr][sc];
    if (color != newColor)floodFillUtil(image ,sr,sc,image[sr][sc],newColor);
		return image;
    }

private static void floodFillUtil(int[][] image, int row, int col, int color,int newColor) {
	int M = image.length;
    int N = image[0].length;
	if(row<0||col<0|| row>=M| col>=N|| image[row][col]!=color)
		return;
	
	
		image[row][col]=newColor;
	if(validPath(row-1,col,N,M))
	floodFillUtil(image,row-1,col,color,newColor);
	
	if(validPath(row,col-1,N,M))
	floodFillUtil(image,row,col-1,color,newColor);
	
	if(validPath(row+1,col,N,M))
	floodFillUtil(image,row+1,col,color,newColor);
	
	if(validPath(row,col+1,N,M))
	floodFillUtil(image,row,col+1,color,newColor);
	
}

private static boolean validPath(int row,int col,int n,int m) {
	
	if(row<0||col<0||  row>=n||col>=n)
		return false;
	return true;
}
}
