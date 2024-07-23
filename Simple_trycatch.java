package throw_throws_keywords;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Simple_trycatch 
{

	public static void main(String[] args) 
	{
		
		try {
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter your height");
		int height=s1.nextInt();
		System.out.println("height="+height);
		}
		
		catch(InputMismatchException a1)
		{
			System.out.println("please enter valid inputs.");
			Scanner s2=new Scanner(System.in);
			System.out.println("please enter your height");
			int height=s2.nextInt();
			System.out.println("height="+height);
			
			
		}
		
		finally {
			System.out.println("I will always execute");
		}
	}
}
