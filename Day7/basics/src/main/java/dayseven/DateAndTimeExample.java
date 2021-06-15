/**
 * 
 */
package dayseven;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 * @author admi
 *
 */
public class DateAndTimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.getCalendarType());
		System.out.println(date);
		
		// A date in ISO format(yyyy-MM-dd) without time
		LocalDate localDate =  LocalDate.now();
		
		System.out.println(localDate);
		System.out.println(LocalDate.of(2020, 6, 15));
		System.out.println(LocalDate.now().minus(1,ChronoUnit.MONTHS));
		System.out.println(LocalDate.now().minus(2,ChronoUnit.MONTHS));
		System.out.println(LocalDate.now().plusDays(1));
		
	}

}
