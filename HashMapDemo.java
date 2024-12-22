package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(1, 200);
		map.put(2, 200);
		map.put(3, 300);
		map.put(4, 400);
		
		
		System.out.println("Intial Map "+ map);
		
	     int valueforkey=map.get(1);
	     System.out.println("Valueforkey "+ valueforkey);
	     
	     map.put(3, 900);
	     System.out.println(map);
	     
	     map.remove(4);
	     System.out.println(map);
	     
	    boolean hashkey =map.containsKey(1);
	    System.out.println("checking if key exists" + hashkey);
	    
	    boolean hashvalue =map.containsValue(300);
	    System.out.println("checking if value exists "+hashvalue);
	    
	    int size1=map.size();
	    System.out.println(size1);
	    
	    map.clear();	    
	    System.out.println(map);
	    
	}
	

}