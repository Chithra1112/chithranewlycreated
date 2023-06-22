package ListInterface;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list1=new ArrayList();
list1.add("chithra");
list1.add("nisha");
list1.add("florence");
list1.add("chinchu");
list1.add("tijo");
list1.add(2);
list1.add(3);
Iterator itr=list1.iterator();
while (itr.hasNext())
{
	System.out.println(itr.next());
}
	
	}

}
