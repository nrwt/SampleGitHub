package DemoTests;

public class ArrayDemo extends AnotherDemoClasstoCheckExtendKeyword{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a =4;
		//array is a container which store multiple values of same type
		
		int ar[] = new int[5];
		String str[] = new String[6];
		
		ar[0]=2;
		ar[1]=52;
		ar[2]=32;
		ar[3]=22;
		ar[4]=12;
		
		
		for (int i =0; i<ar.length; i++) 
		{
			
			if(i==(ar.length-1))
			{
			System.out.print(ar[i]+" ");
			}else 
			{
				System.out.print(ar[i]+", ");
			}
		}
		
		System.out.println();
		System.out.println("Element of arr1 is below");
		
		//another way to initialise an array is below
		int arr1[] = {4, 7, 45, 23, 12, 23, 8, 10};
		
		for (int i =0; i<arr1.length; i++) 
		{
			
			if(i==(arr1.length-1))
			{
			System.out.print(arr1[i]+" ");
			}else 
			{
				System.out.print(arr1[i]+", ");
			}
		}
		
		//now lets learn Multidimentional arrays
		
		System.out.println();
		
		
		int multiarr[][] = new int[3][2];
		multiarr[0][0]=9;
		multiarr[0][1]=8;
		
		multiarr[1][0]=7;
		multiarr[1][1]=91;
		
		multiarr[2][0]=8;
		multiarr[2][1]=3;
		
		System.out.println("*************************");
		System.out.println("Multidimentional arrays");
		System.out.println();
		
		for (int i =0; i < 3; i++) 
		{
			
			for (int j =0; j<2; j++) 
			{
			
			System.out.print(multiarr[i][j]+", ");
			}
			System.out.println();
		}
		
		System.out.println("*************************");
		System.out.println("Two dimensional arrays");
		
		int TwoDarray[][] = {{1,15,6},{8,1,11},{7,2,1}};
		
		for (int i =0; i < 3; i++) 
		{
			
			for (int j =0; j<3; j++) 
			{
			
			System.out.print(TwoDarray[i][j]+", ");
			}
			System.out.println();
		}
		
		System.out.println("*************************");
		System.out.println("Print smallest number of above Two Dimensional array");
		
		int num=0;
		for (int i =0; i < 3; i++) 
		{
			
			for (int j =0; j<3; j++) 
			{
				
				if(i==0 && j ==0) {
					num = TwoDarray[i][j];
				}else if(num > TwoDarray[i][j]) 
				{
					num=TwoDarray[i][j];
				}
				
			
			}
			
		}
		System.out.println("Smallest number = "+num );
		
		
		//next assignment is wherever you get minimum number what the max number in that column
		System.out.println("*************************");
		System.out.println("Print smallest number of above Two Dimensional array and "
				+ "wherever you get minimum number what the max number in that column");
		
		int minnum=0;
		int row =0;
		int column=0;
		int maxnum=0;
		for (int i =0; i < 3; i++) 
		{
			
			for (int j =0; j<3; j++) 
			{
				
				if(i==0 && j ==0) 
				{
					minnum = TwoDarray[i][j];
				}else if(minnum > TwoDarray[i][j]) 
				{
					minnum=TwoDarray[i][j];
					row=i;
					column=j;
				}
				
			
			}
			
			if(i==2) 
			{
				for(int k =0; k<3;k++) 
				{
					
					if(k==0) 
					{
						maxnum = TwoDarray[k][column];
					}else if(maxnum < TwoDarray[k][column]) 
					{
						maxnum = TwoDarray[k][column];
					}
					
				}
			}
			
		}
		System.out.println("The smallest number is = "+minnum+" in "+row+"TH row and "+column+"TH column.");
		System.out.println("And Lagest number in "+column+"TH column is "+maxnum);
		
		
		
		//----------------------------------------------
		//understand packages ...create object below to call method of that class
		
		//AnotherDemoClasstoCheckExtendKeyword ab =  new AnotherDemoClasstoCheckExtendKeyword();
		//ab.checkExtendKeyword();
		
		// so from above I understand that if classes are in same package we can access methods of other classese 
		//if we create object of that class as explained above... but if we use extend keyword means extend another class
		//then we need not to create object of that class to access its methods infact we can access methods from object of same class itself
		//as shown below
		
		
		ArrayDemo ad = new ArrayDemo();
		ad.checkExtendKeyword();
		
}
}
