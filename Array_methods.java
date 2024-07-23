package method_string_functions;

import java.util.Arrays;

public class Array_methods 
{

	
	public static void main(String[] args)   //What if I want to store five students roll numbers together.
	{
		int RollNo[]=new int[5];
		RollNo[0]=50;
		RollNo[1]=59;
		RollNo[2]=57;
		RollNo[3]=56;
		RollNo[04]=55;
		
/*		System.out.println("First method to print data without Array concept.");  //This is not ideal way.
		System.out.println(RollNo[0]);
		System.out.println(RollNo[1]);
		System.out.println(RollNo[2]);
		System.out.println(RollNo[3]);
		System.out.println(RollNo[4]);
		
		System.out.println("Second method to print data using for loop.");   //We should be little advance to print using Array method.
		for(int i=0;i<=4;i++)
		{
			System.out.println(RollNo[i]);
		}
*/	
		System.out.println("Printing homogeneous data using arrays functions.");
		System.out.println(Arrays.toString(RollNo));
		
		
		//To store 5 names together.
		
		String name[]=new String[5];
		name[0]="Manisha";
		name[1]="rita";
		name[2]="Beauty";
		name[3]="Sourav";
		name[4]="Prachi";
		
		System.out.println(Arrays.deepToString(name));
		
		
		
		
	}
}
