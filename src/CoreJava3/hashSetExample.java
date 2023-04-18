package CoreJava3;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet , LinkedHashSet, TreeSet implement set interface
		//does not accept duplicate values
		//there is no guarantee that elements can store in sequential order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("1stElement");
		hs.add("2ndElement");
		hs.add("Student");
		hs.add("student");
		hs.add("rahul");
		hs.add("maya");
		hs.add("advik");
		
		System.out.println(hs);
		hs.add("11stElement");
		System.out.println(hs);
		
		System.out.println(hs.size());
		hs.remove("student");
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("Student"));
		
		//explain iterator
		
		Iterator<String> it = hs.iterator();
		System.out.println("****************************");
		
		while(it.hasNext()) {
			System.out.print(" "+it.next()+",");
		}
		
		// that is how we iterate through the objects in Set interface using the interface called iterator
	}

}
