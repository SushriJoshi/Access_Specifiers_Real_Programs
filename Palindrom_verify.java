package method_string_functions;

public class Palindrom_verify 
{
	public static void main(String[] args) {
		
	
	String name="Rotator";                     //Palandrom example  = rotator--It's reverse is also rotator. cat and act, madam amd madam, mom and mom, cat and act.
	String name1=name.toLowerCase();           // Anvika is not palandrom of it's reverse akivna
	String reverse="";
	
	for(int i=name1.length()-1;i>=0;i--)
	{
		char name2=name1.charAt(i);
		reverse=reverse+name2;
	}
	
	System.out.println(reverse);
	
	boolean result=name1.equals(reverse);
	System.out.println(result);
	
	if(result==true)
	{
		System.out.println("I am palandrom");
	}
	
	else
	{
		System.out.println("I am not a palandrom");
	}

	}

}
