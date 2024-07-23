package switch_case_Concept;

import java.util.Scanner;

public class SwitchCase_program 
{
	
	
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Please enter the value of a.");
	int a =s1.nextInt();
	System.out.println("Please enter the value of x.");
	int x=s1.nextInt();
	System.out.println("Please enter the value of y.");
	int y=s1.nextInt();
	
	switch(a)
	{
	case 1:
		int sum=x+y;
		System.out.println("Addition="+sum);
		break;
	case 2:
		
		int sub=y-x;
		System.out.println("Subtraction="+sub);
		break;
	case 3:
		
		int mul=x*y;
		System.out.println("Multiplication="+mul);
		break;
	
	case 4:
		
		int div=y/x;
		System.out.println("Division="+div);
		break;
	default:
		System.out.println("Please perform addition, subtraction, multiplication and division.");
	
	}
}
    	

}
