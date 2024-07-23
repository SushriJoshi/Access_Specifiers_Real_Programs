package throw_throws_keywords;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Exception 
{


	static Scanner s1=new Scanner(System.in);
	 
	public static void main(String[] args) 
	{
		try 
		{
			
			System.out.println("Enter the value of age.");
			int age=s1.nextInt();
			System.out.println("Enter the value of salary.");
			 double salary=s1.nextDouble();
			 System.out.println("Enter the weight.");
			 float weight=s1.nextFloat();
			 System.out.println("Are you a student.");
			 boolean b=s1.nextBoolean();
			 System.out.println("Enter your name.");
			 String name=s1.next();
		}
		
		catch(InputMismatchException a1)
		{
			
			System.out.println("Please fill the form again.");
			
			 
			
		}
		
		}
	
	
	}
	
	
	

