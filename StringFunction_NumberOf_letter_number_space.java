package method_string_functions;

import java.util.Arrays;

public class StringFunction_NumberOf_letter_number_space 
{

	static int Count_of_digits=0;
	static int Count_of_Alphabets=0;
	static int Count_of_Space=0;
	static int Count_of_SpecialCharacters=0;
	
	public static void main(String[] args) 
	{
		
		String s1="Abinash got 90 Percent marks in 4236T exam @#$%^";
		char[] c1=s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		
		for(int i=0; i<s1.length();i++)
		{
		boolean b1=Character.isDigit(c1[i]);
		System.out.println(b1);
		
		if(b1==true)
		{
			Count_of_digits++;
		}
		
		boolean b2=Character.isLetter(c1[i]);
		System.out.println(b2);
		
		if(b2==true)
		{
			Count_of_Alphabets++;
		}
		
		boolean b3=		Character.isSpaceChar(c1[i]);
		System.out.println(b3);
		
		if(b3==true)
		{
			Count_of_Space++;
		}
		
		
		System.out.println("The number of digits in the given string are -> "+Count_of_digits);
		System.out.println("The number of alphabets in the given string are -> "+Count_of_Alphabets);
		System.out.println("The number of spaces in the given string are -> "+Count_of_Space);
		
		
		int i4=s1.length();
		int sum=Count_of_digits+Count_of_Alphabets+Count_of_Space;
		int Special_Characters=i4-sum;
		System.out.println(Special_Characters);
	}
	}
}
