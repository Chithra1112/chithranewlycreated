package Exceptionhandling;

public class NullPointer {
void sample1()
{
	try
	{
	String s=null;
	System.out.println(s.length());
}
catch(NullPointerException e)	
	{
	System.out.println("Null format exception handled");
	System.out.println(e);
	}
}
public static void main(String args[])
{
	NullPointer o=new NullPointer();
	o.sample1();
}
}