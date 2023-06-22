package Exceptionhandling;

public class ThrowProgram {
public static void validate(int age)
{
	if(age<18)
	{
		throw new ArithmeticException("The person is not eligible to vote"); 
		
	}
		else
		{
		System.out.println("The person is eligible to vote");	
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
validate(5);
System.out.println("rest of the code");
	}

}
