/**
 * 
 */
package exceptionexample;

/**
 * @author admi
 *
 */
public class ExceptionCallStackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(divideArray(args));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Division by zero ");
		}
		
	}

	private static int divideArray(String[] array) throws Exception {
		String s1 = array[0];
		String s2 = array[1];
		return divideStrings(s1, s2);
	}
	
	private static int divideStrings(String s1, String s2) throws Exception {
		int i1 = Integer.parseInt(s1);  
		int i2 = Integer.parseInt(s2);  
		return divideInts(i1, i2);
		}

	private static int divideInts(int i1, int i2) throws Exception{  
		return i1 / i2;
	}

}
