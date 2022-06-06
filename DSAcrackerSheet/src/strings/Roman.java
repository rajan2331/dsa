package strings;

public class Roman {

	
	public static void main(String[] args) {
		
		String s= "XIV";
		System.out.print(romanToDecimal(s));
	}
	
	public static int romanToDecimal(String str) {
		
		int total=0;
		int i;
		for( i=0;i<str.length()-1;i++) {
			
			if(getNumber(str.charAt(i))<getNumber(str.charAt(i+1)))
				total=total- getNumber(str.charAt(i)) ;//- getNumber(str.charAt(i+1)) );
			else
				total=total+getNumber(str.charAt(i))  ; //+getNumber(str.charAt(i+1)) ;

			
		}
	
			total=total+getNumber(str.charAt(i));
		return total;
        // code here
    }
	
	static int getNumber(char c){
		
		switch(c)
	      {
		 case 'I':
		   return 1;
		 case 'V':
		  return 5;
		 case 'X':
		   return 10;
		 case 'L':
	           return 50;
		 case 'C':
	           return 100;
		 case 'D':
	           return 500;
		 case 'M':
	           return 1000;
		 default:
			   return 0;
	      }
	}
}
