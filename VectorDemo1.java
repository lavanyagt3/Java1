package Collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
	    List<Integer> numbers=new Vector<>();
	    
	    numbers.add(10);
	    numbers.add(20);
	    numbers.add(30);
	    numbers.add(40);
	    
	    System.out.println("First number "+ numbers.get(0));
	    
	    numbers.set(1,25);
	    
	    numbers.remove(3);
	    
	    System.out.println(numbers);
	    
	    if(numbers.contains(10))
	    {
	    	System.out.println("10 is present");
	    }

	    for(Integer num  :numbers)
	    {
	    	System.out.println(num);
	    }
	    
	    System.out.println("Size of vector data " + numbers.size());
	    
	    numbers.clear();
	    System.out.println("List after clear operation" + numbers);
	}
	
	

}