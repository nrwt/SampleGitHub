package JavaConcepts;

public class PS2 extends PS3{
   int a;
	
	public PS2(int a) {
	   super(a); //parent class constructor is invoked and this should be first line in constructor
		this.a=a; //this keyword refer to current class variable defined at top of this class
	}

	
	public int increment() {
		
		a = a + 1;
		return a;
	}
	
public int decrement() {
		
		a = a - 1;
		return a;
	}

}
