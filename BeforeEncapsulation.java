package org.tnsif.capgemini.c2tc.OOPs;

class Human
{
	 int age;
	String name;
}


public class BeforeEncapsulation {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.age=25;
		obj.name="Lavanya";
		obj.age=24;
		obj.name="Sam";
		System.out.println("Age is "  +obj.age);
		System.out.println("Name is " +obj.name);

	}

}