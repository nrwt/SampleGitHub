package JavaConcepts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS {

	
	
	@Test
	public void callMethodofPSclass() {

        //int a =3;
		method1();
		
		PS2 p2 = new PS2(3); //parametrised constructor
		int increasecount = p2.increment();
		System.out.println(increasecount);
		
		int decreasecount =p2.decrement();
		System.out.println(decreasecount);
		
		//PS3 p3 = new PS3(4);
		int MultiplyBy2 = p2.multiplyby2();
		System.out.println(MultiplyBy2);
		
		int MultiplyBy3 = p2.multiplyby3();
		System.out.println(MultiplyBy3);
		
		//above commented code can be obtained by extending ps2 class to PS3
		
	}

}
