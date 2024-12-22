package org.tnsif.capgemini.c2tc.OOPs;

public class Abstraction {

	public static void main(String[] args) {
		MaheshDemo obj=new RameshDemo();
		obj.calling();
		obj.AIIntegration();
		obj.SatelliteComm();
		obj.HealthMontoring();
	}

}
abstract class MaheshDemo
{ 
	public void calling() 
	{
		System.out.println("calling");
	}
	
	public abstract void AIIntegration();
	public abstract void SatelliteComm();
	public abstract void HealthMontoring();
	
}

abstract class SureshDemo extends MaheshDemo 
{
	public void AIIntegration()
	{
		System.out.println("Phone is integrated with AIIntegration");
	}
	
}

class RameshDemo extends SureshDemo             
{

	@Override
	public void SatelliteComm() {
		System.out.println("Phone is integrated with SatelliteComm ");
		
	}

	@Override
	public void HealthMontoring() {
		System.out.println("Phone is integrated with HealthMontoring");
		
	}
	
}