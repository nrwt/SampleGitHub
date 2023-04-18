package CoreJava2;

import java.text.SimpleDateFormat;
import java.util.Calendar;



public class CalendarDemo {
	
	public void github() {
		System.out.println("created by gitstuff master first guy");
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalendarDemo cd = new CalendarDemo();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		System.out.println(sd.format(cal.getFirstDayOfWeek()));
		System.out.println(Calendar.DAY_OF_MONTH);
		System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println(Calendar.DATE);
		//dsdf
		//sfasf
		//sfasfasfasf
		
		//writing someting to check gitHub functionality
	
		System.out.println("Code update by another person who clone the code from Repo");
	   ////  now code is pulled by gitstuff again and he update the code again
		
		System.out.println("code updated by Gitstuff guy who is first guy");
	    cd.github();
	}

}
