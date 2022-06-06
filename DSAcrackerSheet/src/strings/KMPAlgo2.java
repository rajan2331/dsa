package strings;

public class KMPAlgo2 {
public static void main(String[] args) {
	 String txt = "ABABDABACDABABCABAB";
     String pat = "ABABCABAB";
     new KMPAlgo2().kmpsearch(pat, txt);
	
}

private void kmpsearch(String pat, String txt) {
		int m=pat.length();
		int n=txt.length();
		int[] lps=new int[m+1];
		makeLPS(lps,pat);
		int j=0,i=0;
		while(i<n) {
			
			if(pat.charAt(j)==txt.charAt(i))
			{
				i++;
				j++;
			}
			if(j==m) {
				System.out.println("pattern found at index =: "+(i-j));
				j=lps[j-1];
			}else if(i<n && pat.charAt(j)!=txt.charAt(i)){
			
				if(j!=0) {
					j=lps[j-1];
					
				}else {
					i++;
				}
			}
			
		}
}

private void makeLPS(int[] lps,String pat) {
	int i=0;
	int len=1;
	lps[0]=0;
	while(i<pat.length()) {
		if(pat.charAt(i)==pat.charAt(len))
		{
			len++;
			lps[i]=i;
			i++;
			
		}else {
			if(len!=0) {
				len=lps[len-1];
				
			}else {
				lps[i]=0;
				i++;
			}
			
		}
	}
	
}
}
