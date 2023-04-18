package JavaConcepts;

public class PS3 {
  int a;
	public PS3(int a) {
		
		this.a=a; //this keyword refer to current class variable defined at top of this class
	}

	
	public int multiplyby2() {
		
		a = a * 2;
		return a;
	}
	
   public int multiplyby3() {
		
		a = a * 3;
		return a;
	}
}
