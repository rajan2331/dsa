import java.util.HashSet;
import java.util.Set;

public class Prob26_ArraySubset {
public static void main(String[] args) {
	long a1[] = {11, 1, 13, 21, 3, 7};
	long a2[] = {11, 3, 7, 1};
	
	System.out.println(isSubset(a1,a2,a1.length,a2.length));
}

public static String isSubset( long a1[], long a2[], long n, long m) {
	
	
	Set<Long> num_set= new HashSet<Long>();
	for(long a : a1)
		num_set.add(a);
	
	for(long b:a2) {
		if(num_set.contains(b))
			return "No";
		
	}
	return "Yes";
    
    
}
}
