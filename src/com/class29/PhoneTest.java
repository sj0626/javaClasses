package com.class29;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
iPhone obj=new iPhone();
Samsung obj1=new Samsung();
//Phone phone=new Phone();compiler gives error as it is abstract class or class is not completed.
	obj.makeCall();
	obj.playGames();
	obj.sendText();
	obj.takePictures();
	Phone phone=new iPhone();
	phone.makeCall();
	phone.playGames();
	phone.sendText();
	phone.takePictures();
	
	TaskFile obj2=new JavaFile();
	obj2.close();
	obj2.editmethod();
	obj2.open();
	TaskFile obj3=new WordFile();
	obj3.close();
	obj3.editmethod();
	obj3.open();
	TaskFile obj4=new PdfFile();
	obj4.close();
	obj4.open();
	obj4.editmethod();
	Car car=new BMW();
	Vehicle vehicle=new BMW();
	car.drive();
	car.start();
	car.stop();
	car.speed();
	vehicle.drive();
	Parent obj5=new Main();
	obj5.m1();
	obj5.m2();
	
	
	
	
	}
	

}
