package Exceptionhandling;

public class MultipleCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int a=5/0;
}
catch(ArrayIndexOutOfBoundsException e)

{
System.out.println(e);
System.out.println("Array out of bounds handled");
}
catch(ArithmeticException e)
{
	System.out.println(e);
	System.out.println("Arithmetic exception handled");
}
System.out.println("rest of the code");
	}

}
