package method_string_functions;

public class StringFunctions 
{

	public static void main(String[] args)      //To upper case and To lower case.
	{
		String name="ram";
		System.out.println("Name of the boy="+name);
		
		//tolowercase();
		//touppercase();
		
		String a1=name.toUpperCase();
		System.out.println(a1);
		int lengthofthename=name.length();
		System.out.println(lengthofthename);
		
		
		String a2="MY NAME IS SUSHRI";
				System.out.println(a2);
		String a3=a2.toLowerCase();
		System.out.println(a3);
		int length=a3.length();
		System.out.println(length);
		
		String s="SUSHRI";
		System.out.println(s);
	    String s1=s.toLowerCase();
	    System.out.println(s1);
	    int i1=s1.length();
	    System.out.println(i1);
	    
	    String t="i love my india";
	    String t1=t.toUpperCase();
	    System.out.println(t1);
	    int i2=t1.length();
	    System.out.println(i2);
	    
	    String b="my name is sushri";
	    System.out.println("My name="+b);
	    String b1=b.toUpperCase();
	    System.out.println("My name in uppercase="+b1);
	    int b2=b.length();
	    System.out.println(b2);
	    
	    
	    
	}
}
