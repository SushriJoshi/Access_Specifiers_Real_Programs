package method_string_functions;

public class Matches_check_m_isat_middle_string 
{

	public static void main(String[] args) 
	{
		String s1="automation testing";
/*		System.out.println(s1.replaceAll(" ", ""));
		int s2=   s1.length();
		System.out.println(s2);
		 char[] word=s1.toCharArray();
		int length=word.length/2;
		
		if(length%2!=0)
		{
			
			System.out.println(word[length-1]+" "+word[length]);
		}
		
		else
		{
			System.out.println(word.length);
		}
		
	}
	     */ 
	boolean b1=s1.matches("(.*)x(.*)");
	System.out.println(b1);
		
}}
