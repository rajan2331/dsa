package ae.dubaipolice.dpsvolunteer.implementation;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Java8Streams {
/**
 * 
 *   Reference Questions :   // https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062
 */
	public static void main(String[] args) {

		List<Integer> list =  Arrays.asList(1,32,14,56,8,32,16,1);
	
		// even nums
		List<Integer> li = list.stream().filter(i->i%2==0).collect(Collectors.toList());  
		System.out.println(li.toString());
		
		// starts with 1 
		
		list.stream().filter(i->i.toString().startsWith("1")).forEach(System.out::println);  
	
		/**  duplicate **/
		list.stream().filter(i-> Collections.frequency(list, i)>1).collect(Collectors.toSet()).forEach(System.out::println); 
	
		 /**  find first element in list**/
		list.stream().findFirst().ifPresent(System.out::println); 
	
		/** count the number of elements **/
		long count = list.stream().count();  
	
		System.out.println(count); // sysout
	
		int max = list.stream().max(Integer::compare).get();
		System.out.println(max);

		String input = "Java articles are Awesome";

		 /****  first non -repeated char  **/
		Character character = input.chars()
		  .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
          .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
          .entrySet()
          .stream()
          .filter(entry -> entry.getValue() == 1L)
          .map(entry -> entry.getKey())
          .findFirst() 
          .get(); 
         System.out.println(character);
         
         /****   first repeated character**/
         
         Character character2 = input.chars()
         .mapToObj(s-> Character.toLowerCase(Character.valueOf((char)s)))
         .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap ::new , Collectors.counting()))
         .entrySet()
         .stream()
         .filter(entry->entry.getValue()>1L)
         .map(entry->entry.getKey())
         .findFirst()
         .get();
         System.out.println(character2);   
        
         /** sorted **/
         list.stream().sorted().forEach(System.out::print);
         
         System.out.println();
         /** Descending order **/
         list.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
         
       
	}

}
