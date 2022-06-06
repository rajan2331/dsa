package graphs;

public class StepKnight {
	public static void main(String[] args) {
		
	}
	public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        findPos(KnightPos[0],KnightPos[1],TargetPos[0],TargetPos[1],N);
        return 0;
    }
	private void findPos(int row, int col, int tRow, int tCol, int n) {
		
		if (row == tRow && col == tCol)
	    {
		 
	        return;
	    }
	 
		if(validPath(row-2,col-1))
		findPos(row-2,col-1,tRow,tCol,n);
		
		if(validPath(row-2,col+1))
		findPos(row-2,col+1,tRow,tCol,n);
		
		if(validPath(row+1,col-2))
		findPos(row+1,col-2,tRow,tCol,n);
		
		if(validPath(row-1,col-2))
		findPos(row-1,col-2,tRow,tCol,n);
		
		if(validPath(row+2,col-1))
		findPos(row+2,col-1,tRow,tCol,n);
		
		if(validPath(row+2,col+1))
		findPos(row+2,col+1,tRow,tCol,n);
		
		if(validPath(row+1,col+2))
		findPos(row+1,col+2,tRow,tCol,n);
		
		if(validPath(row-1,col+2))
		findPos(row-1,col+2,tRow,tCol,n);
	}			
	
	private static boolean validPath(int row,int col) {
		
		if(row<1 ||col<1)
			return false;
		return true;
	}
}
