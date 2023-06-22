package Exceptionhandling;

public class TrycatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int a=2/0;
	System.out.println(a);
	System.out.println("rest of the code");
}
catch(ArithmeticException e)
{
	System.out.println(e);
	System.out.println("Exception handled");
}
	}

}
