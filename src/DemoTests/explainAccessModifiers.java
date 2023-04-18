package DemoTests;

public class explainAccessModifiers {

	
	//there are 4 access modifiers
	//public private protected and default
	//If there is nothing written in method, that means it is default modifier and this method can be accessed anywhere in package
	//so we can acess abc class anywhere in package...we just need to create an object of this class in the class where we are accessing it
	
	//but if we go out of this package and try to access this menthod abc in another package,  we cannot access even if we import this package
	//so default methods cannot be accesed outside the package. It can be accessed anywhere within the package. In order to access this method
	//outside the package the access modifier should be public as in method access.
	//same applies to variables..
	
	//public : visible to everywhere
	//private : cannot access methods and variables outside the class
	
	//protected: It same as default + one more benefit . protected methods and variables can be accesed by classes of other packages 
	
	//that extend (inherit) the class which has protected methods or variables defined.
	
	
	void abc() 
	{
		
	}
	
	public void access() 
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
