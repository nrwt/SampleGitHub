package CoreJava2;

public class ConstructorDemo {

	public ConstructorDemo(String str) {
		System.out.println("I am in constructure");
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo c = new ConstructorDemo("hello");
	}

}
