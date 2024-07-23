package throw_throws_keywords;

import java.util.Scanner;

public class Exception_Handling 
{
	
	static Scanner s1=new Scanner(System.in);    //scanner class and the variables are declared globally.
	static int b=s1.nextInt();
	static int c=s1.nextInt();
	public static void main(String[] args) throws InterruptedException 
	{
		
		int mod=b/c;
		System.out.println(mod);
		
		Thread.sleep(30000);
		System.out.println("Exception");
		
		
	}
	
}
