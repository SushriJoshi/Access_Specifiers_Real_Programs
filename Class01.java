package packg01;

import packg02.Class02;      // need to import packg02 similar to scanner class.

public class Class01
{

	public static void main(String[] args)    //Only the public method is accessible, private, protected and default are not accessible.
	{
		Class02 c1=new Class02();      //object is created for parent class o2
		c1.add();
		Class02.ADD();                //to access static method no need to create an object. classname.method name
	
	
	}
}
