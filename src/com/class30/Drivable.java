package com.class30;

public interface Drivable {
	//public static final variables ,final variables are called constant variables
//	public abstract void drive();
	boolean Drive_Fast=true;//compiler will assign static final and it has to be uppercase
	void drive();//compiler will add access modifiers on its own like public abstract.

}
class Cars{
	public void stop()
	{
		System.out.println("Cars stops when u put break");
	}
}

class Toyota extends Cars implements Drivable
{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Toyota can drive");
		
	}
	
}
