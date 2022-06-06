package strings;

public class BoyMooreAlgo {
	 static int NO_OF_CHARS = 256;
	   public static void main(String []args) {
	         
	         char txt[] = "ABAAABCD".toCharArray();
	         char pat[] = "ABC".toCharArray();
	         search(txt, pat);
	    }
	  public static void badCHar(char[] str,int n,int[] badchar) {
		  
		  for(int i=0;i<  NO_OF_CHARS;i++ ) {
			  badchar[i]=0;
		  }
		  for(int j=0;j<n;j++)
			  badchar[(int)str[j]]=j;
		  
	  }
	private static void search(char[] txt, char[] pat) {
		int m=txt.length;
		int n=pat.length;
		int[] badchar=new int[NO_OF_CHARS];
		badCHar(pat,n,badchar);
		int s=0;
		
		while(s<=(m-n)) {
			int j=n-1;
			while(j>=0 && pat[j]==txt[s+j])
				j--;
			
			if(j<0) {
				
				System.out.println("pattern found at index : "+s );
				s+=(s+n)<m?n-badchar[txt[s+n]]:1;
			}else
				s+=max(1,j-badchar[txt[s+j]]);
		}
		
	}
	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		return i>j?i:j;
	}
	   
	   
}
