package CoreJava2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	
	
	}

}
