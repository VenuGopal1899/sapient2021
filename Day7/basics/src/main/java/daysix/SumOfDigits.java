/**
 * 
 */
package daysix;

/**
 * @author admi
 *
 */
public class SumOfDigits {
	public static void main(String[] args) {
		try {
			double r1 = Double.parseDouble(args[0]);
			double r2 = Double.parseDouble(args[1]);
			System.out.println(r1 + r2);
		} catch (NumberFormatException nfe) {
			System.out.println("Invalid Data");
		}
	}
}
