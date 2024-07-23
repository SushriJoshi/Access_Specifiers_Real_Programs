package access_pcfrFORmethods_insideClass;

public class Student_Class 
{

	public static void main(String[] args)    //private method in Teacher class can not be accessible to this Student class with in the same package.
	{
		Teacher_Class t1=new Teacher_Class();
		t1.add();
		t1.sub();
		t1.div();
	
	}
}
