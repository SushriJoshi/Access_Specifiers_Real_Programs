package method_string_functions;

public class String_charat 
{
public static void main(String[] args)    //charAt(index0,   indexof(char), trim, substring(start index), substring(start index, last index)
{
	String a="I love my india";
	char a1=a.charAt(0);
	System.out.println(a1);
	  int i1=a.indexOf('m');
	  System.out.println(i1);
	
	String a2="Anvika Negi";
	char name=a2.charAt(8);
	int i2=a2.indexOf('i');
	System.out.println(i2);
    System.out.println(name);
    
    String b="      Hello World     ";
    String trimmed=b.trim();
    System.out.println(trimmed);
    
    
    String c="Hello Anvika";
    String c2=c.substring(2);
    System.out.println(c2);
    
    String c3=c.substring(2, 9);
    System.out.println(c3);
    
    
    String g1="     I LIVE IN HYDERABAD      ";
    System.out.println(g1);
    char g2=g1.charAt(10);
    System.out.println("character at 10="+ g2);
    String g3=g1.trim();
    System.out.println(g3);
    int g4=		g1.indexOf("E");
    System.out.println("index of E="   +g4);
    String g5=		g1.substring(7);
    System.out.println(g5);
    String g6=		g1.substring(7,12);
    System.out.println(g6);
    
    
    
    
    
    
    
    
}
}
