package dateexamples;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class Example1 {

	@Test
	public void testDate() {
		Date d1=new Date();
		System.out.println(d1);
		/*
		MM/dd/yyyy	01/02/2018
		dd-M-yyyy hh:mm:ss	02-1-2018 06:07:59
		dd MMMM yyyy	02 January 2018
		dd MMMM yyyy zzzz	02 January 2018 India Standard Time
		E, dd MMM yyyy HH:mm:ss z	Tue, 02 Jan 2018 18:07:59 IST
		 */
		SimpleDateFormat ft=new SimpleDateFormat("MM-dd-yyyy");
		System.out.println(ft.format(d1));
	}
	
	@Test
	public void testDate2() {
		Calendar cal  = Calendar.getInstance();	    
	    cal.add(Calendar.DATE, -10);
	    
	    SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
	  System.out.println(s.format(new Date(cal.getTimeInMillis())));
	}
}
