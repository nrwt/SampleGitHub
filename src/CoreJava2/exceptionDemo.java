package CoreJava2;

//one try block can be catched by multiple catch blocks
//catch should be followed by try block
//finally block executed irrespective of exception thrown or not and try block should be there for finally block
//we can also use try and finally without catch
//is there any way where finally block will not be executed..when we try to stop jvm forcefully. means press red button forcefully



public class exceptionDemo 
{

	

	
	public void getData() {
		
		System.out.println("i am in getData");
	}
	public static void main(String[] args) 
	{
		int a = 3;
		int b = 7;
		int c = 0;
		try {
			
			int[] ar = {1, 2, 3, 4};
			
			System.out.println(ar[4]);
			
			int k = b/c;
		// TODO Auto-generated method stub
		System.out.println("In Main");
		
		exceptionDemo ed =new exceptionDemo();
		ed.getData();
        }
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		catch(IndexOutOfBoundsException ib) {
			System.out.println(ib.getMessage());
		}
		catch(Exception e) 
		{
        	System.out.println("in catch block");
		}
		finally
		{
			System.out.println("I am in finally block");
			//it is used to close the browser and delete the cookies
		}
	}

}

