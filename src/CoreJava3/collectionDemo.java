package CoreJava3;

import java.util.ArrayList;

public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4, 4, 5, 5, 5, 4, 6, 6, 9, 4, 10, 10, 1, 2, 7, 2, 8};
		
		//4 - 4 times
		//5 - 3
		//6 -2
		//9-1
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int len = a.length;
		int rep = 0;
		int i =0;
		int j ;
		for(i=0;i<len;i++)
		{
			if(i==0) 
			{
			arr.add(a[i]);
			rep++;
			for(j=(i+1);j<len;j++)
			{
				if(arr.contains(a[j])) {
				rep++;
				}
				
				if(j==(len-1)) {
					System.out.print(a[i]+"---------"+rep);
					
					if(rep==1) {
						System.out.print("it is a unique number");
						System.out.println();
					}
					System.out.println();
				}
			}
			
			rep =0;
			}
			else
			{
				if(arr.contains(a[i])) 
				{
					int k=3;
				}
				else
				{
					arr.add(a[i]);
					rep++;
					for(j=(i+1);j<len;j++)
					{
						if(a[i]==a[j]) {
						rep++;
						}
						
						if(j==(len-1)) {
							System.out.print(a[i]+"---------"+rep);
							
							if(rep==1) {
								System.out.print(" it is a unique number");
								System.out.println();
							}
							System.out.println();
						}
					}
					rep=0;
				}
			}
		}
	}

}
