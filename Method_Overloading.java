package org.tnsif.capgemini.c2tc.OOPs;

class Method_OverloadingImp
{
	public int add(int a,int b) 
	{
		return a+b;
	}
	public int add(int a, int b , int c) 
	{
		return a+b+c;
	}
	public double add(int a, double b)
	{
		return a+b;
	}
	
}

public class Method_Overloading {

	public static void main(String[] args) {
		Method_OverloadingImp obj= new Method_OverloadingImp();
		System.out.println(obj.add(4, 8));
		System.out.println(obj.add(2, 2.5));
		System.out.println(obj.add(4, 8,7));
	}
}

		
		

