package CoreJava2;

public class ChildDemo extends PraentDemo{
	
	public ChildDemo() {
		
		System.out.println("child class constructor");
	}

	String str = "I m in childdemo class";
    public void getData() 
    {
	
        System.out.println(str); 
        System.out.println(super.str);

		
	}
    
    
    
    public void method1() {
    	
    	super.method1();
		System.out.println("I am method1 in child class");
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildDemo cd = new ChildDemo();
		cd.getData();
		cd.method1();
	}

}
