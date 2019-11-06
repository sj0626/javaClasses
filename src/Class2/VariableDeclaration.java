package Class2;

public class VariableDeclaration {
	public static void main(String[] args) {
//1.declaring the variable num1 will hold value of int 
		// assigning/initializing value of 123 to it
		int num1 = 123;
		int num2 = 6767;
		int num3 = 786876;
		char num4 = 'A';
		// 2.declare variable first and then assign value

		int n1;
		n1 = 56;
		int n2;
		n2 = 7676;
		int n3;
		n3 = 767;
		// 3. declare all variable together and then assign value
		int number1, number2, number3;
		number1 = 12;
		number2 = 15;
		number3 = 676;
		System.out.println(n1);
// reassigned value to same variable
		n3 = 1000;
		char myVariable;
		myVariable='^';
		System.out.println(myVariable);
		number2=number1;//12
		System.out.println(number2);
		//number2=false-compile time error asking to change datatype of variable
		//number2 to boolean// variables can be declared only once
		// the value you assign to variables should be of the datatype you declared
		// values can be changed laterv in the program
	}
}