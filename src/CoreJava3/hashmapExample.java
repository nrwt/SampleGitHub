package CoreJava3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(0, "Zero");
		hm.put(1, "One");
		hm.put(2, "Two");
		
		System.out.println(hm.get(1));
		System.out.println("**************************************");
		Set s = hm.entrySet();
		//System.out.println(s);
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+",");
		}
		System.out.println();
		System.out.println("**************************************");
		Iterator it1 = s.iterator();
		
		while(it1.hasNext()) {
			
			//System.out.print(it1.next()+"::::::");
			Map.Entry mp1 = (Map.Entry)it1.next();
			System.out.print(mp1.getKey()+",");
			System.out.print(mp1.getValue()+" ");
			System.out.println();
		}
		
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("Name", "ALIA");
		hm1.put("Age", "Twenty nine");
		hm1.put("city", "Delhi");
	}

}
