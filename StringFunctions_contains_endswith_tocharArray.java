package method_string_functions;

import java.util.Arrays;

public class StringFunctions_contains_endswith_tocharArray 
{

	public static void main(String[] args) 
	{
	
		String Name="I am Sushri";     //ends with function.
		String Name1="Abinash";
		boolean b=Name.endsWith("Sushri");
		System.out.println("My name ends with Sushri ="+b);
		
		boolean b1=Name.contains("am");            //contains function.
		System.out.println("My name contains am ="+b1);
		
		
		boolean b2=Name1.equals(Name);     //equals function.
		System.out.println(b2);
		
		String s1="Abinash";              //tocharArray function to convert in to Array.
		char[] s2=s1.toCharArray();
		System.out.println(Arrays.toString(s2));
	}
}
