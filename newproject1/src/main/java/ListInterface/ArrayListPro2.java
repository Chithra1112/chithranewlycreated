package ListInterface;
import java.util.*;
public class ArrayListPro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list3=new LinkedList();
		list3.add("java");
		list3.add("hai");
		list3.add(9);
		list3.add(3);
		list3.add(7);
		list3.add(12);
		list3.addFirst("world");
		list3.addLast("new world");
		System.out.println(list3.contains("hai"));
		System.out.println(list3.indexOf(3));
		System.out.println(list3.peekLast());
		System.out.println(list3.peekFirst());
		//Collections.sort(list3);
		//for( Integer a:list3)
			System.out.println(list3);
			//System.out.println(indexOf(3))
	}

}
