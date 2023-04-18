package CoreJava3;

public class RearrangeString {
	
	public void modifyData(String str, String splitstr, String replacestr)
	{
		String st1 = str;
		//"tomorrow"
		//"t$m$$rr$$$w"
		//whenever there is o replace with $ and number of $ signs increase by 1 by every occurrence of o
		//int count =0;
		String replace = replacestr;
		String parts[] = st1.split(splitstr);
		String newstr[] = new String[parts.length];
		String finalstring ="";
		int len = parts.length-1;
				
		for(int i = 0; i < (parts.length-1); i++) 
		{
			//System.out.println(parts[i]);
			newstr[i] = addDollar(parts[i], i, replace);
			//System.out.println(newstr[i]);
			
			finalstring = finalstring.concat(newstr[i]);
			//System.out.println("************************");
		}
		
		finalstring = finalstring.concat(parts[len]);
		System.out.println(finalstring);

	}
	
	public String addDollar(String str, int count, String replacestr) {
		
		String abc = str;
		String replace= replacestr;
		for(int i = 0; i < count+1; i++) 
		{
			abc=abc.concat(replace);
		}
		return abc;	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RearrangeString md = new RearrangeString();
		md.modifyData("tomorrow", "o", "$");
		md.modifyData("Amnicvifgifgibnbnbih", "i", "£");
	}

}
