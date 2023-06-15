package Exceptionhandling;

public class Exception1 {
void display()
{
	try
	{
		int a=15/0;
	}
	catch(ArithmeticException e)
	{
	System.out.println(e);	
	}
	System.out.println("Exception handled");
	}

		// TODO Auto-generated method stub

	}


