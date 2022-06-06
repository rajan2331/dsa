package strings;

public class CountReversalsParanthesis {
public static void main(String[] args) {
	String exp="}{{}}{{{";
	System.out.println(countRev(exp));
	
}
static int countRev (String s)
{
     
    int len=s.length();
    if(len%2!=0)
    	return -1;
    
    int left_char=0,right_char=0;
    for(int i=0;i<s.length();i++) {
    	
    	char ch= s.charAt(i);
    	
    	if(ch=='{')
    		left_char++;
    	else {
    		if(left_char==0)
    			right_char++;
    		else
    			left_char--;
    			
    		
    	}
    }
    
    return (int)(Math.ceil((0.0 + left_char) / 2)
            + Math.ceil((0.0 + right_char) / 2));
}
}
