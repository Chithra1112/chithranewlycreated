package Exceptionhandling;

public class NumberFormat {
void sample1()
{
	try
	{
		String s="hai";
		int sum=Integer.parseInt(s);
		
	}
	catch(NumberFormatException e)
	{
	System.out.println(e);	
	System.out.println("Number Format Exception handled");
	}
}
public static void main(String args[])
{
	NumberFormat obj=new NumberFormat();
	obj.sample1();
}
}
	


