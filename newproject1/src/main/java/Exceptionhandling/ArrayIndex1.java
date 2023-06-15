package Exceptionhandling;

public class ArrayIndex1 {
void sample()
{
	try
	{
		int a[]=new int[6];
		a[9]=25;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
		System.out.println("Array out of bound exceptn handled");
	}
}
}
