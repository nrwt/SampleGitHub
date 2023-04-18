package CoreJava2;

public class StaticVar {
	
	 String name;//this is instance variable means it depends on object
	 String add;
	 static String city = "Mumbai";//but this does not depend on instance..it belong to class and called class variables
	 //all other variables in class which are not static are instance variables
	 //and variables in constructor are local variables
	 
	 //another important note.. static methods will only accept static variables
	 
	 static int i;
	 int j=0;
	 
	 //there is another thing called static block, so all variables inside this block are static
	 /*
	  String city;
	  int k ;
	  static{
	  
	  city= "Delhi";
	  i = 4;
	  }
	  */
	
	public StaticVar(String name, String add) {
	
		this.name = name;
		this.add = add;
		
		i++;
		j++;
		System.out.println("static variable "+i);
		System.out.println("non static variable "+j);
		
	}
	
	public static void getCity() {
		
		System.out.println(city);
	}
	
	public void getAddress() {
		System.out.println(add+" "+city);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		StaticVar.i=4;
		StaticVar obj = new StaticVar("Veena", "45 Street Manhati");
		obj.getAddress();
		//System.out.println(name+""+add+""+city);
		obj = new StaticVar("Bob", "34 Street new street");
		//System.out.println(name+""+add+""+city);
		obj.getAddress();
		StaticVar.getCity();
		
	}

}
