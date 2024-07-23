package method_string_functions;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Scannerclassinput 
{
public static void main(String[] args)     //Arrays concept using scanner class.
{
	Scanner s1=new Scanner(System.in);

	System.out.println("Please enter the marks of students.");
	
	
		int rollno[]=new int[5];
		rollno[0]=s1.nextInt();
		rollno[1]=s1.nextInt();
		rollno[2]=s1.nextInt();
		rollno[3]=s1.nextInt();
		rollno[4]=s1.nextInt();
		
	
	System.out.println(Arrays.toString(rollno));
	
	System.out.println("Please enter the names of the students.");
	
	String Name[]=new String[5];
	Name[0]=s1.next();
	Name[1]=s1.next();
	Name[2]=s1.next();
	Name[3]=s1.next();
	Name[4]=s1.next();
	
	System.out.println(Arrays.deepToString(Name));
}
}
