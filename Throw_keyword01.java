package throw_throws_keywords;

public class Throw_keyword01 
{

	static int a=10;
	static int b=20;
	public static void main(String[] args) throws Exception
	{
		
		int sum=a+b;
		System.out.println("Addition of a and b is ="+sum);
		
	//	throw new NullPointerException();
		throw new Exception("After getting exception the program will stops executing.");
		
	}
	
}
