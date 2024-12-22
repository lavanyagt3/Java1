package streamAPI;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Allterminalops {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(3,6,8,3,9,5,7);
				
		System.out.println("Numbers printed using foreach");
		numbers.stream().forEach(n->System.out.print(n + " "));
		System.out.println();
		
		
		Integer[] array=numbers.stream().toArray(Integer[]::new);
		System.out.println("Array" + Arrays.toString(array));
		
		
		int sum1=numbers.stream().reduce(0, Integer::sum);
		System.out.println("sum of numbers " + sum1);
		
		
		List<Integer> uniquenumber=numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		
		
	
		
		Optional<Integer> min1=numbers.stream().min(Integer::compareTo);
		min1.ifPresent(value->System.out.println("Minimun number " + value));
		
	
		
		Optional<Integer> max1=numbers.stream().max(Integer::compareTo);
		max1.ifPresent(value->System.out.println("Maximum number " + value));
		
		
		
		  long count =numbers.stream().count();
		  System.out.println("count of numbers " + count);
		
		  

		  
		  boolean anygreaterthan=numbers.stream().anyMatch(n->n>6);
		 System.out.println("any number greater than 6 " + anygreaterthan);
		 
		
		 
		 boolean allpositive =numbers.stream().allMatch(n->n>0);
		 System.out.println("No number are negative " +allpositive );
		 
		
		 
		 boolean nonenegative =numbers.stream().noneMatch(n->n<0);
		 System.out.println("no number are nergative " +nonenegative);
		 
		
		 
		 Optional<Integer> first=numbers.stream().findFirst();
		 first.ifPresent(value->System.out.println("first number " + value));
		 
		 Optional<Integer> any=numbers.stream().findAny();
		 any.ifPresent(value->System.out.println("any number " + value));
		 
		 
	}

}