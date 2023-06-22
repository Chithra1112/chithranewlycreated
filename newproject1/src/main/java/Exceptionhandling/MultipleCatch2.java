package Exceptionhandling;

public class MultipleCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int a[]=new int[5];
	//a[10]=20;
	//System.out.println(a[10]);
	a[5]=30/0;
	System.out.println(a[5]);
}

catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e);
	System.out.println("Array index exception handled");
}
catch(ArithmeticException e)
{
	System.out.println(e);
	System.out.println("Arithmetic exception handled");
}
	}
}
