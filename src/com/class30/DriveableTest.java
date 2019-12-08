package com.class30;

public class DriveableTest {
public static void main(String[] args) {
	Drivable obj=new Toyota();
	obj.drive();
	//obj.Drive_Fast=false;compiler will throw error as value is final
	Toyota toyota=new Toyota();
	toyota.drive();//comes from interface driveable
	toyota.stop();//comes from class car
}
}
