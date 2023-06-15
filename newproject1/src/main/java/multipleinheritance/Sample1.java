package multipleinheritance;

public class Sample1 {
	final int a = 10;

	void display() {
		a = 20;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 obj = new Sample1();
		obj.display();
	}

}
