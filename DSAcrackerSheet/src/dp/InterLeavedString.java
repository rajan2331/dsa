package dp;

public class InterLeavedString {
public static void main(String[] args) {
	String a = "XYZ";

		String 	b = "ABC";
		String c= "XYAZBCD";
		System.out.println(isInterLeave(a, b, c));
		
	
}

public static  boolean isInterLeave(String a,String b,String c)
{
    //   String nextA=a.substring(0, 1);
     //  String nextB = b.substring(0, 1);
       int k=0,l=0;
       for(int i=0 ;i<c.length();i++) {
    	 
    	   if(k<a.length() && a.charAt(k)==(c.charAt(i))) {
    		  k++;
    	   }else if(l<b.length() && b.charAt(l)==(c.charAt(i)))
    	   {		  l++;
    	   }else {
    		   return false;
    	   }
       }
    	  if(k<a.length() || l<b.length()) 
    		  return false;
    		   
    		   
 return true;
}
}
