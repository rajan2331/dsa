package linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8 {
public static void main(String[] args) {
	
	List<Integer> ss = new ArrayList<Integer>();
	ss.add(3);
	ss.add(4);
	ss.add(5);
	ss.add(6);
	ss.add(7);
	ss.add(9);
	
	Map<Boolean, Integer> result = ss.stream().collect(Collectors.partitioningBy(e->e%2==0 ,Collectors.summingInt(Integer::intValue)));
	System.out.println(result);
	
}
}
