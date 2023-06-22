package ListInterface;
import java.util.*;
public class ArrayListpro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> list2=new LinkedList<String>();
list2.add("manu");
list2.add("10");
list2.add("java");
list2.add("java world");
System.out.println("returning element" +list2.get(1));
list2.set(1,"ramu");
for(String a:list2)
System.out.println(a);
	}

}
