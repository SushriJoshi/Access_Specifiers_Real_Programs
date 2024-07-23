package throw_throws_keywords;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Secondtype_Try_Catch 
{
	


	static Scanner s1=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		try {
		System.out.println("Please enter the value of age");
		int age=s1.nextInt();
		System.out.println("Age="+age);
		
		System.out.println("Please enter the value of salary");
		double salary=s1.nextDouble();
		System.out.println("Salary="+salary);
		
		System.out.println("Please enter your weight");
		float weight=s1.nextFloat();
		System.out.println("weight="+weight);
		
		System.out.println("Please enter your name");
		String name=s1.next();
		System.out.println("Name="+name);
		}
		
		catch(InputMismatchException a1)
		{
			System.out.println("Please enter valid inputs");
			
			System.out.println("Please enter the value of age");
			Scanner s2=new Scanner(System.in);
			int age=s2.nextInt();
			System.out.println("Age="+age);
			
			System.out.println("Please enter the value of salary");
			Scanner s3=new Scanner(System.in);
			double salary=s3.nextDouble();
			System.out.println("Salary="+salary);
			
			System.out.println("Please enter your weight");
			Scanner s4=new Scanner(System.in);
			float weight=s4.nextFloat();
			System.out.println("weight="+weight);
			
			System.out.println("Please enter your name");
			Scanner s5=new Scanner(System.in);
			String name=s5.next();
			System.out.println("Name="+name);
			
		}
	}
	
}
