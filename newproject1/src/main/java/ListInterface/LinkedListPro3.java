package ListInterface;
import java.util.*;
public class LinkedListPro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList list1=new LinkedList();
list1.add("Java World");
list1.add("Hello");
list1.add(3);
list1.add(5);
list1.add(8);
System.out.println(list1);
list1.addFirst("india");
System.out.println(list1);
list1.addLast("Kerala");
System.out.println(list1);
System.out.println(list1.indexOf(5));
System.out.println(list1.contains(3));
System.out.println(list1.peekLast());
System.out.println(list1.peekFirst());
System.out.println(list1.pollFirst());
System.out.println(list1.pollLast());
System.out.println(list1);
	}

}
