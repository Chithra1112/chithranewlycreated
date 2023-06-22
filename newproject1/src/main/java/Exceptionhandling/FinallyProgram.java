package Exceptionhandling;

public class FinallyProgram {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int a=25/5;
	System.out.println(a);
}
catch(NullPointerException e)
{
System.out.println(e);	
}
finally
{
	System.out.println("finally block is always executed");
}
System.out.println("rest of the code");
	}

}
