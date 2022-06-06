package strings;

import java.util.HashMap;
import java.util.Map;

public class RepeatedString {
public static void main(String[] args) {
	String arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa","dd","dd","dd","dd"};
	System.out.println(secFrequent(arr,arr.length));
	
}

  static  String secFrequent(String arr[], int N)
{
	  
	  
	  Map<String , Integer> map = new HashMap<String ,Integer>();
	  for(int i=0;i<N ;i++) {
		  if(map.containsKey(arr[i]))
		  {
			  int k= map.get(arr[i]);
			  k++;
			  map.put(arr[i], k);
		  }else {
			  map.put(arr[i], 1);
		  }
	  }
	
	//  System.out.println(map);
      int  first, second;
      first = second = Integer.MIN_VALUE;
	  for (Map.Entry<String, Integer> entry : map.entrySet()) {
		//    System.out.println(entry.getKey() + ":" + entry.getValue());
		
			  int k = entry.getValue();
			  
			  if(k>first ) {
				  second=first;
				  first=k;
				  
			  } else if(k> second && k!= first)
			  {
				  second =k;
			  }
		  }
			  
	  for (Map.Entry<String, Integer> entry : map.entrySet()) 
		  {
			  if(entry.getValue()==second)
				  return entry.getKey();
		  }
	
	 
	  return null;
	  
    // your code here
}

}
