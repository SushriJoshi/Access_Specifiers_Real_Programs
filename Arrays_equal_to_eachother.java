package method_string_functions;

import java.util.Arrays;

public class Arrays_equal_to_eachother        //check if both the arrays are equal.
{

	public static void main(String[] args) 
	{
		int Rollno[]= {51,52,53,54};
		int Rollno1[]= {51,52,53,54};
		
		boolean status=Arrays.equals(Rollno, Rollno1);
		
		if(status==true)
		{
			System.out.println("Both the arrays are equal.");
		}
		else
		{
			System.out.println("Both the arrays are not equal.");
		}
	}
	
}
