package strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WordBreak {

	public static void main(String[] args) {

		ArrayList<String> dictionary = new ArrayList<String>();
		String temp_dictionary[] = {"mobile","samsung","sam","sung",
				"man","mango","icecream","and",
				"go","i","like","ice","cream"};


		for (String temp :temp_dictionary)
		{
			dictionary.add(temp);
		}

		System.out.println(wordBreak("ilikesamsung",dictionary));

	}
	public static int wordBreak(String A, ArrayList<String> B)
	{
        int i,j,k,n=B.size();
        TreeSet<String> mp = new TreeSet<String>(); 
        for(i=0;i<n;i++)
            mp.add(B.get(i));
    
        int len = A.length();

        ArrayList<Boolean> dp = new ArrayList<Boolean>(len + 1);
        for(i=0;i<len;i++)
            dp.add(i,false);
            
        dp.add(0,true);
    
        for(i = 1; i <= len; i++) {
            for(j = 0; j <len; j++) {
                if(dp.get(j)  && mp.contains(A.substring(j, i) )) {
                	System.out.println(A.substring(j,i));
                    dp.add(i,true);
                    break;
                }
            }
        }
        
        if(dp.get(len))
            return 1;
        return 0;    
            
    }
}
