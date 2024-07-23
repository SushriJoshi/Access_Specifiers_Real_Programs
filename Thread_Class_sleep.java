package throw_throws_keywords;

import java.util.Scanner;

public class Thread_Class_sleep 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("This is thread sleep class.");
		Thread.sleep(3000);
		
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		System.out.println("Age="+age);
		
	}
	
	
}
