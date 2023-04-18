package JavaConcepts;

public class CoreJavaExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 2 3 4 
		//5 6 7 
		//8 9 
		//10
		
		
		int count = 1;
		
		for(int i =4;i > 0;i--) 
		{
			
			for(int j = 1; j < (i+1); j++) 
			{
				
				System.out.print(count+" ");
				count++;
				
			}
			
			System.out.println();
		}
		
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		System.out.println("*******************");
		
		int count1 = 1;
		for(int i =4;i > 0;i--) 
		{
			
			for(int j = 5; j > i; j--) 
			{
				
				System.out.print(count1+" ");
				count1++;
				
			}
			
			System.out.println();
		}
		System.out.println("*******************");
		//1
		//1 2
		//1 2 3
		//1 2 3 4
		
		
		for(int i =1;i <= 4;i++) 
		{	
			for(int j = 1; j <= i; j++) 
			{
				System.out.print(j+" ");	
			}
			
			System.out.println();
		}
		System.out.println("*******************");
		
		int k =1;
		for(int i =1;i <= 4;i++) 
		{	
			for(int j = 1; j <= i; j++) 
			{
				System.out.print(k*3+" ");	
				k++;
			}
			
			System.out.println();
		}

	}

}
