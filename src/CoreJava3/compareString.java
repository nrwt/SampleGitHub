package CoreJava3;

import java.util.ArrayList;
import java.util.Iterator;

public class compareString {

	public void getUniqueCharactersInString(String newstr) 
	{
		
		String st1 = newstr;
		//System.out.println(st1);
        
        ArrayList<String> uniquechars = new  ArrayList<String>();
        boolean found=false;
        
		for(int i=0; i < st1.length();i++) 
		{			
			//System.out.print(st1.charAt(i)+ " ");
			for(int j=i+1; j < st1.length();j++)
			{
				//System.out.println(st1.charAt(j));
				found=false;
				//System.out.println("checking "+st1.charAt(i)+"=="+st1.charAt(j));
				String a = st1.charAt(i)+"";
				String b = st1.charAt(j)+"";
				if(a.equalsIgnoreCase(b))  
				{
					found = true;
					//System.out.println("found "+st1.charAt(i));
					break;
				}
				
				
			}
			//System.out.println(found);
			      if(!found) 
			      {
			    String ans = st1.charAt(i)+"";
			    //System.out.println(ans);
			    uniquechars.add(ans);
			    //System.out.println(uniquechars.get(i));
				//count++;
			      }
			
		}
		//System.out.println();
		System.out.println(uniquechars);

	}
	
	
	public void compare2StringsandPrintUniqueCharacters(String st1, String st2) {
		
		int count =0;
		String firstStr = st1;
		String secondStr = st2;
		boolean found = false;
        ArrayList<String> uniquechars = new  ArrayList<String>();

        for(int m=0;m<2; m++) 
        {
        	if(m==1) 
        	{
        		st1 = secondStr;
        		st2 = firstStr;
        		
        		//System.out.println("******************************");
        	}
        	
        	//System.out.println("st1 "+st1);
        	//System.out.println("st2 "+st2);
        	//System.out.println("******************************");
		for(int i=0; i < st1.length();i++) 
		{			
			//System.out.print(st1.charAt(i)+ " ");
			for(int j=0; j < st2.length();j++)
			{
				//System.out.println(st2.charAt(j));
				found=false;
				//System.out.println("checking "+st1.charAt(i)+"=="+st2.charAt(j));
				String a = st1.charAt(i)+"";
				String b = st2.charAt(j)+"";
				if(a.equalsIgnoreCase(b)) 
				{
					found = true;
					//System.out.println("found "+st1.charAt(i));
					break;
				}
				
				
			}
			
			 if(!found) 
			 {
		    String ans = st1.charAt(i)+"";
		    uniquechars.add(ans);
		    //System.out.println(uniquechars.get(i));
			//count++;
				 
		      }
			 
		}
		
        }
        
        String abc = uniquechars.toString();
        abc = abc.replace("[", "");
        abc = abc.replace("]", "");
        abc = abc.replace(",", "");
        abc = abc.replaceAll("\\W", "");
        System.out.println(abc.length());
       System.out.println(abc);
		getUniqueCharactersInString(abc);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareString cs = new compareString();
		//cs.getUniqueCharactersInString("Welcome");
		//cs.getUniqueCharactersInString("compareString");
		
	
		cs.compare2StringsandPrintUniqueCharacters("Hello", "Nandini");
		cs.compare2StringsandPrintUniqueCharacters("William", "Carriatini");
		//HeloNandi
		
	}

}
