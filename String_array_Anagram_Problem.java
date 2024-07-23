package method_string_functions;

import java.util.Arrays;

public class String_array_Anagram_Problem {

	public static void main(String[] args) 
	{
		String A1="elbow";       //eagle and angel are not anagram
		String A2="below";
		{
			if(A1.length()!=A2.length())
			{
				System.out.println("It is not an anagram.");
			}
			
			else
			{
			
				System.out.println("Need to check whether it is a anagram or not. If the characters in both the string are equal and also the length,then it is an anagram.");
				
				char[] C1=A1.toCharArray();
				char[] C2=A2.toCharArray();
				Arrays.sort(C1);
				Arrays.sort(C2);
				
				System.out.println("String A1 in Array and sorted ="  +Arrays.toString(C1));
				System.out.println("String A1 in Array and sorted ="  +Arrays.toString(C2));
				
				boolean B1=Arrays.equals(C1, C2);
				System.out.println(B1);
				
				if(B1=true)
				{
					System.out.println("Two strings are Anagram.");
				}
				else
				{
					System.out.println("Two strings are not Anagram.");
				}
			}
			
			
		}

		
	}

}
