package strings;

public class RabinKarp {
public static	int d=256;
public static void main(String[] args) {
	
	String  text= "THIS IS A TEST TEXT";
	String   pat = "TEST";
	int q=101;
	System.out.println(search(pat, text, q));
	
}
static int search(String pat, String txt, int q) {
	
	
	int hash=1;
	int patH=0;
	
	int txtH=1;
	for(int i=0;i<pat.length()-1;i++) 
		hash=(hash*d)%q;
	
	for(int i=0;i<pat.length();i++) {
		
		patH=(d*patH+pat.charAt(i))%q;
		txtH=(d*txtH+txt.charAt(i))%q;
		
	}
	for(int j=0;j<=txt.length()-pat.length();j++) {
		
		if(patH==txtH) {
			
			for(int k=0;k<pat.length();k++) {
				if(pat.charAt(j+k)!=txt.charAt(k))
					break;
			
			if(k==pat.length())	
			return j;
			
			}
			
		
		}
		
		if(j<txt.length()-pat.length()) {
			txtH = (d*(txtH - txt.charAt(j)*hash) + txt.charAt(j+pat.length()))%q;
		     
			if(txtH<0)
				txtH=txtH+q;
		}
	}
	
	
	return -1;
	
}
}
