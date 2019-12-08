package com.class27;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj=new syntaxStudent();
obj.displayInfo();
System.out.println("----------");
syntaxStudent stu=new syntaxStudent();
System.out.println("---------------");
stu.course();
stu.displayInfo();
stu.research();
System.out.println("-----------");
Student [] stuArray= {new syntaxStudent(),new collegeStudent(),new schoolStudent()};
for( Student stuArray1:stuArray)
{
	stuArray1.displayInfo();
}
	
	
	Animal animal=new Monkey();
	animal.whoAMI();
	Examples obj1=new smallExample();
	String str=obj1.hello("Hello");
	String str1=obj1.hello("hello", "hi");
	System.out.println(str);
	System.out.println(str1);

}
}