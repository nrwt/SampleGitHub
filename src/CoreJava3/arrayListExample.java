package CoreJava3;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("1stElement");
		al.add("2ndElement");
		al.add("Student");
		al.add("Student");
		
		//arrayList is dynamic in size inlike array(where we need to declare the size at start)
		
		System.out.println(al);
		
		al.add(0, "Student");
		System.out.println(al);
		//al.remove(1);
		//System.out.println(al);
		System.out.println(al.get(2));
		
		//check if text present in arraylist
		
		System.out.println(al.contains("testing"));
		System.out.println(al.contains("Student"));
		System.out.println(al.isEmpty());
		System.out.println("Size of array is = "+al.size());

		//find what is index of string student
		
		System.out.println(al.indexOf("Student"));
		Iterator<String> it = al.iterator();
		
		System.out.println("***********************************");
		
		while(it.hasNext()) {
			
			System.out.print(it.next()+",");
		}
	}

}
