package CoreJava2;

public class thisDemo {
	
	int a = 2;
	
	public void getData() {
		
		int a = 5;
		int b = this.a*10;
		System.out.println(a);
		
		//this refers to class level that means current object-- object scope lies in class level
		System.out.println(this.a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo td = new thisDemo();
		td.getData();
	}

}
