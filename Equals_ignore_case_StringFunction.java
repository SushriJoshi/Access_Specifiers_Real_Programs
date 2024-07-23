package method_string_functions;

import java.util.Arrays;

public class Equals_ignore_case_StringFunction {

	public static void main(String[] args) 
	{
		System.out.println("Equal Ignore case string function");
		String s1="SUShri";
		boolean b1=   s1.equalsIgnoreCase("sushri");
		System.out.println(b1);
		
		
		System.out.println("Is empty string function.");
		String s2="";
		System.out.println(s2.isEmpty());
		System.out.println(s1.isEmpty());
		
		System.out.println("Ends with string function.");
		String s5="sushri";
		boolean b2=      s5.endsWith("i");
		System.out.println(b2);
		
		
		System.out.println("Split string function");  //Split the given string where ever there is a space and store it in a Array.
		String s3="My name is Sushri.";
		String[] s4=s3.split(" ");     
		System.out.println(Arrays.toString(s4));
		
		 String[] q1=s3.split(" ", 2);
		 System.out.println(Arrays.toString(q1));
		 
		 
		 System.out.println("Repeat string function.");
		 String q2="Software";
		  String q3=   q2.repeat(5);
		System.out.println(q3);

	}
	
	

}
