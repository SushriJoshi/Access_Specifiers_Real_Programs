package access_pcfrFORmethods_insideClass;

public class Matches_StringFunction {

	public static void main(String[] args) 
	{
		//Check if a given string has exact 4 letters in it.
		
		String s1="raman";
		boolean b1=s1.matches("....");      // "." indicates single character search.
		System.out.println(b1);
		
		
		//Check if the string ends with a.
		
		String s2="sushriya";               // "(.*)a" indicates multi character search.
		System.out.println(s2.matches("(.*)a"));
		
		
		//Check if the given string  starts with k.
		
		String s3="kajal";
		System.out.println(s3.matches("k(.*)"));
		
		//Check in the given string v is present or not.
		
	String s4="anvika";
	 System.out.println(s4.matches("(.*)vi(.*)"));
	 
	 // Check in the given string r is at the second place is not.
	 System.out.println(s4.matches(".r(.*)"));
		

	 //Assignment- string starts with s ends with h and 4 letters ib between.
	 
	 String s5="sushrph";
	
	 System.out.println(s5.matches("s....h"));
	        
	 

}}
