package Interface;

class GreetingImp implements FunctionalInterface1
{

	@Override
	public void sayHi(String name) {
		System.out.println("Hello " +name+ " !");
		
	}
	
}

public class Functional_Interface_Demo {

	public static void main(String[] args) {
		FunctionalInterface1 obj=new GreetingImp();
		obj.sayHi("Lavanya");

	}

}