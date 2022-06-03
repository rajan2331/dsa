package interview;

import java.util.HashSet;

public class UniqueCharacters {
public static void main(String[] args) {
	uniquecharss("LOS ANGELESO", "LAS VEGASV");
}

static int chars = 26;


public static void printUniqueChars(String s1,
                                   String s2)
{
    String str1 = s1.toLowerCase();
    String str2 = s2.toLowerCase();
    int result[] = new int[chars];
    for (int i = 0; i < chars; i++)
    {
        result[i] = 0;
    }

    int l1 = str1.length();
    int l2 = str2.length();

    
    for (int i = 0; i < l1; i++)
    {
    	
        result[str1.charAt(i) - 'a'] = 1;
    }

   
    for (int i = 0; i < l2; i++)
    {
         
        if (result[str2.charAt(i) - 'a'] == 1
            || result[str2.charAt(i) - 'a'] == -1)
        {
            result[str2.charAt(i) - 'a'] = -1;
        }
         
      
        else
        {
            result[str2.charAt(i) - 'a'] = 2;
        }
    }
   
    for (int i = 0; i < chars; i++)
    {
        if (result[i] == 1 || result[i] == 2)
        {
            System.out.print((char) (i + 'a') + " ");
        }
    }
}

 static void  uniquecharss(String a, String b) {
	
	 // Assumption order of characters is not required
    HashSet<Character> h1 = new HashSet<Character>(), h2 = new HashSet<Character>();
    for(int i = 0; i < a.length(); i++) {
        h1.add(a.charAt(i));
    }
    for(int i = 0; i < b.length(); i++){
        h2.add(b.charAt(i));
    }

   
   
    for(Character i : h1){
        if(!h2.contains(i))
         System.out.print(i+" ");
        
       
     }

     for(Character i : h2){
        if(!h1.contains(i)){
        	System.out.print(i+" ");
        	
        };
     }

 
  
}
}
