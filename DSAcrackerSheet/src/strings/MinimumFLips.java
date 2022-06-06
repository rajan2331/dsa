package strings;

public class MinimumFLips {

	public static void main(String[] args) {
		
		String s = "001";
		
		System.out.println(minFlips(s));
	}
	
		public static int minFlips(String S) {
			
			char initZ='0';
			char initO='1';
			int countZ=0;
			int countO=0;
			for(int i=0;i<S.length();i++) {
				if(initZ==S.charAt(i))
					initZ=flip(initZ);
				else
				{
					countZ++;
					initZ=flip(initZ);
				}
			}
			for(int i=0;i<S.length();i++) {
				if(initO==S.charAt(i))
					initO=flip(initO);
				else
				{
					countO++;
					initO=flip(initO);
				}
			}
			
			return Math.min(countZ, countO);
		}

			private static char flip(char initZ) {
				
				return initZ=='0'?'1':'0' ;
			}
}
