package ListInterface;
import java.util.*;
public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> list=new ArrayList<String>();
	list.add("New");
	list.add("java");
	list.add("World");
	list.add("Hai");
	System.out.println(list);
	Iterator itr=list.iterator();
	
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
	list.remove(1);
	int size=list.size();
	list.add(1,"Chithra");
	System.out.println(list);
	System.out.println(size);
	System.out.println(list);
	
System.out.println(list.contains("hello"));
	System.out.println("returning element is " + list.get(3));
	System.out.println("returning element is " + list.set(2,"hello"));
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	}

}
