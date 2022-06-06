package strings;

public class CountSay {

	public static void main(String[] args) {
		
		int n=3;
		System.out.println(countAndSay(n));
		
	}
	public static String countAndSay(int n) {
		
		if(n==1)
			return "1";
		if(n==2)
			return "11";
		
		String a="11";
		for(int i=3;i<=n;i++) {
			String tmp="";
			a=a+'x';
			int len=a.length();

			int cnt=1;
			char []arr = a.toCharArray();
			for (int j = 1; j < len; j++)
	        {
	       
	            if (arr[j] != arr[j - 1])
	            {
	       
	                tmp += cnt + 0;
	 
	                tmp += arr[j - 1];
	 
	        
	                cnt = 1;
	            }
	
	            else cnt++;
	        }
			   a = tmp;
		}
		
		return a;
    }
}
