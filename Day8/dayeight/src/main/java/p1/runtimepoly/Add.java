package p1.runtimepoly;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Add extends Airthmetic{

	@Override
	public double cal(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	
	public String cal(String dt, int days) {
		
		
		//Specifying date format that matches the given date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Calendar c = Calendar.getInstance();
		try{
		 
			//Setting the date to the given date
		    
			c.setTime(sdf.parse(dt));
		 
		}catch(ParseException e){
			e.printStackTrace();
		 }
		c.add(Calendar.HOUR_OF_DAY, days);
		
		//Date after adding the days to the given date
		String newDate = sdf.format(c.getTime());  
		
		return newDate;
	}
	
	
	public String cal(String dt1, String dt2) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		try{
		 
			//Setting the date to the given date
		    
			c.setTime(sdf.parse(dt1));
			c1.setTime(sdf.parse(dt2));
		 
		}catch(ParseException e){
			e.printStackTrace();
		 }
		
		
		c.add(Calendar.YEAR, c1.get(Calendar.YEAR));
		c.add(Calendar.MONTH, c1.get(Calendar.MONTH));
		c.add(Calendar.DATE, c1.get(Calendar.DATE));
		c.add(Calendar.HOUR_OF_DAY, c1.get(Calendar.HOUR_OF_DAY));
		c.add(Calendar.MINUTE, c1.get(Calendar.MINUTE));

		String newDate = sdf.format(c.getTime());  
		
		return newDate;
	}

}
