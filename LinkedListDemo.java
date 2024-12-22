package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> cars=new LinkedList<>();
		cars.add("BMW");
		cars.add("Tesla");
		cars.add("Toyoto");
		cars.add("Tata");
		cars.add("Tesla");
		
		System.out.println("Car :" + cars.get(2));
		
		cars.set(3, "Audi");

		cars.remove("BMW");
		
		if(cars.contains("Toyoto"));
		{
			System.out.println("Toyoto is present");
		}
		
		for(String car:cars)
		{
			System.out.println(car);
		}
		System.out.println("No of cars "+ cars.size());
		
		cars.clear();
		System.out.println("Cars after clear operation "+ cars);
	}

}