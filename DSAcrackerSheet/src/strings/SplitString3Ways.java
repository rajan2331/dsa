package strings;

import java.util.HashMap;
import java.util.Map;

public class SplitString3Ways {

	public static void main(String[] args) {
		String s = "01010" ;
	//	System.out.println(3/3);
		System.out.println(split(s));
		
	}

	private static int split(String s) {
		int total_cnt=0;
		for(char a:s.toCharArray())
		{
			if(a=='0') {
				total_cnt++;
			}
			
			}
		if(total_cnt%3!=0)
			return 0;
		
		int k=total_cnt/3;
		Map<Integer,Integer> map=new HashMap<>();
		int res=0,sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='0')
				sum++;
			if(sum==2*k && map.containsKey(k) && i>0&&i<s.length()) {
				res+=map.get(k);
			}
			map.put(sum, map.getOrDefault(sum,0)+1);
			
		}
		
		
		return res;
	}
}
