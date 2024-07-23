package method_string_functions;

public class ReplaceAll_StringFunction 
{

	public static void main(String[] args) 
	{
		
		String Name="anuradha";
		String Name1=Name.replaceAll("a", "");
		System.out.println(Name1);
		
		//In a string function replace a with r??
		
		System.out.println(Name.replaceAll("a", "r"));
		
		// In the given string remove all the space.
		
		String s1="My name is sushri";
		System.out.println(s1.replaceAll(" ", ""));
		
		// In the given string remove all the capital letters.
		
		String s2="SUshRi";
		System.out.println(s2.replaceAll("[A-Z]", ""));
		
		//In the given string remove all the small letters.
		
		System.out.println(s2.replaceAll("[a-z]", ""));
		
		//In the given string remove all the numeric value.
		
		String s3="Anvika 2024";
		System.out.println(s3.replaceAll("[0-9]", ""));
		
		
	}
}
