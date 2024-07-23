package packg01;

import access_pcfrFORmethods_insideClass.Access_pc_Constructor;

public class Access_pc_Constructor03     //we can not inherit constructors. so using extends also protected constructor can not be accessed.
{


	public static void main(String[] args) 
	{
		new Access_pc_Constructor03();
		new Access_pc_Constructor(100);    //only public constructor is accessible outside the package
		
}
}