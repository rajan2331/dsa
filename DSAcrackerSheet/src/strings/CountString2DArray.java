package strings;

public class CountString2DArray {
public static void main(String[] args) {
	
	char[][] arr = {
            {'D','D','D','G','D','D'},
            {'B','B','D','E','B','S'},
            {'B','S','K','E','B','K'},
            {'D','D','D','D','D','E'},
            {'D','D','D','D','D','E'},
            {'D','D','D','D','D','G'}
           };
	String s= "GEEKSBE";
	
	System.out.println(getCnt(arr,s));
}

private static int getCnt(char[][] arr, String s) {
	
	int totalCount=0;
	for(int i=0 ;i<arr.length;i++) {
		for(int j=0 ; j <arr.length;j++) {
			
			
			totalCount=totalCount+	rec(arr,i,j,s,0);
			
		}
	}
	return totalCount;
}


  static  int rec(char[][] arr,int i,int j,String s,int x ){
	  int count=0;
	  if(i>=0 &&i<arr.length && j>=0 && j<arr.length &&arr[i][j]==s.charAt(x))
	  {	  char match= s.charAt(x);
	      x+=1;
	  
	      arr[i][j] = 0;

       if (x == s.length())
       {
    	   count = 1;
       }
       else
       {
         
    	   count = count+rec(arr,i,j-1,s,x);
	   
    	   count = count+rec(arr,i,j+1,s,x);
	   count = count+rec(arr,i+1,j,s,x);
	   count = count+rec(arr,i-1,j,s,x);
	   
       }
       arr[i][j]=match;
	  }
	   return count;
  }
   
}
