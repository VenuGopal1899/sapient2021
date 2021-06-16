package p1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Assignment1Demo {

	  public static void main(String[] args) {
		  
		try {
		
		Expression_Evaluator ob = new Expression_Evaluator("10 + sqrt(4) + sin(90)");
		ob.evaluate();
		System.out.println(ob);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		

	}
	   

}
