/**
 * 
 */
package exceptionexample;

/**
 * @author admi
 *
 */
public class ExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int a;
		try {

			a = 22 / x;

			System.out.println("This will be bypassed.");
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Division by zero.");
		}
		// System.out.println("After catch statement.");

		finally {
			a = 15 / 0;
			System.out.println("Inside Finally");
		}
	}

}
