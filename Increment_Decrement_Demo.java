package BasicsOfJava;

public class Increment_Decrement_Demo {
	public static void main(String[] args) {
		int a=10;
		
		//post increment
		System.out.println("a++  " + a++);
		System.out.println("after post-increment a   "+ a); 
		
		//pre increment
		System.out.println("++a  " + ++a);
		
		//post decrement
		System.out.println("a--  " + a--);
		System.out.println("after post decrement a   " + a); 
		
		//pre decrement
		System.out.println("--a "+ --a);
	}

}
