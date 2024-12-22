package org.tnsif.capgemini.c2tc.Constructor;

class Myclass2
{
	String color;
	int cost;
	String brand;
	
	
	//Parameterized  constructor
	Myclass2(String color, int cost ,String brand)
	{
		this.color=color;
		this.cost=cost;
		this.brand=brand;
	}
}
public class Parameterized_Constructor {

	public static void main(String[] args) {
		Myclass2 obj=new Myclass2("Black",20000700,"BMW");
		Myclass2 obj1=new Myclass2("Red",2000000,"Audi");
		System.out.println(obj.color + " "+ obj.cost+ " " +obj.brand);
		System.out.println(obj1.color + " "+ obj1.cost+ " " +obj1.brand);

	}

}