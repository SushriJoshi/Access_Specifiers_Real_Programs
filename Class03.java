package packg03;

import packg02.Class02;

public class Class03 extends Class02     // need to use keyword extends to inherit protected method.
{

	public static void main(String[] args) 
	{
		Class03 c1=new Class03();           // when inheritance concept involve, as we are using keyword extends, so object will be for the child class normally.
		c1.add();
		c1.sub();                     //able to access public and protected.
		Class02.ADD();
		Class02.SUB();
	}
}
