package throw_throws_keywords;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;

public class Multiple_trycatch 
{

	public static void main(String[] args) 
	{
		
		int Rollno[]=new int[3];  //Array
		Rollno[1]=30;
		Rollno[2]=40;
		Rollno[3]=50;
		
		try {
			Rollno[4]=60;   //getting exception on this line.
		}
		
		catch(ArrayIndexOutOfBoundsException d1) {
			System.out.println("You have exceeded the size of roll no.");
			Rollno[4]=60;
		}
		
	/*	catch(NullPointerException c1)
		{
			System.out.println("Handled NPE");
		}
		
		catch(InputMismatchException m1)
		{
			System.out.println("Handled IME");
		}
		
		catch(IllegalFormatException n1)
		{
			System.out.println("handled IFE");
		}
		*/
		finally
		{
			System.out.println("I am finally, I will always excute.");
		}
	}
}
