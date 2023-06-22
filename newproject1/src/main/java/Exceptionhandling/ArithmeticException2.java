package Exceptionhandling;

public class ArithmeticException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 20 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Arithmetic Exception handled");
	}

}
