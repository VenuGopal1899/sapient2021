/**
 * 
 */
package dayseven;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author admi
 *
 */
public class RegExApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("school");
		Pattern pattern1 = Pattern.compile("[0-9]");//[abc]
		//Matcher matcher1 = pattern1.matcher("I study class 4 Thank you !");
		Matcher matcher1 = pattern1.matcher("I study class  Thank you !");
		Matcher matcher = pattern.matcher("I am in a school");
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("Pattern Found");
		}else {
			System.out.println("Pattern Not Found");
		}
		
		
		if(matcher1.find()) {
			System.out.println("Digit Found");
		}else {
			System.out.println("Digit Not Found");
		}
	}

}
