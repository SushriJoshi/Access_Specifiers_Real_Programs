package method_string_functions;

public class String_Reverse_Function {

	public static void main(String[] args) 
	{
		System.out.println("First way to reverse.");
		/*		String name="Sushri";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			//System.out.println("n");
			System.out.println(name.charAt(i));   //remove ln
			System.out.print(name.charAt(i)); 
		}
		
		*/
		System.out.println("Second way to reverse");
		
		String name="SUSHRI";
		String input=name.toLowerCase();   //sushri
		String reverse="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			reverse=reverse+c1;
			//System.out.println(reverse);
		}
		
		System.out.println(reverse);
		 boolean result=input.equals(reverse);
		 System.out.println(result);
		  if(result=true)
		  {
			  System.out.println("I am pelindrom.");
		  }
		
		  else
		  {
			  System.out.println("I am not pelindrom.");
		  }
		
		  
		  
	}
		
		
		
		
		

}
