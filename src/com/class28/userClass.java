package com.class28;

public class userClass {
	int phoneNum;
	String name;
	
	userClass(int phoneNum,String name)
	{
		this.phoneNum=phoneNum;
		this.name=name;
	}

}

class userInfo extends userClass
{
	String address;
	userInfo( int phoneNum,String name,String address)
	{
		super( phoneNum,name);
		this.address=address;
	}
	
	void userDetails()
	{
		System.out.println(name +" "+phoneNum+" "+address);
	}
}