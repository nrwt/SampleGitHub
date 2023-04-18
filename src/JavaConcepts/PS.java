package JavaConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {

	//methods and variables
	
	@BeforeMethod
	public void BfMethod() {
		System.out.println("Run me first ");
	}
	
	@AfterMethod
	public void afMethod() {
		System.out.println("Run me last ");
	}
	
	public void method1() {
		System.out.println("Inside method1 of PS class");
	}

	

}
