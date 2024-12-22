package org.tnsif.capgemini.c2tc.OOPs;

class Product
{
	double price;
	
	Product(double price)
	{
		this.price=price;
	}
	double calucaluteDiscount()
	{
		return this.price*0.20;
	}
	double calculateFinalPrice()
	{
		return this.price-this.calucaluteDiscount();
	}
}


public class ThisDemo {

	public static void main(String[] args) {
		Product product=new Product(100);
		System.out.println("Final price " + product.calculateFinalPrice());
		

	}

}