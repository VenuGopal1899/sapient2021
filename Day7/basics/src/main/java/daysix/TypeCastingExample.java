/**
 * 
 */
package daysix;

/**
 * @author admi
 *
 */
public class TypeCastingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		String name="training";
		String numbers="1234";
		double countVar= 0;
		
		Integer.parseInt(numbers);
		Double.parseDouble(numbers);
		
		System.out.println(Integer.valueOf(count).getClass().getSimpleName());
		System.out.println(Integer.valueOf(numbers));
		//int num = (int)numbers;
		
		int num = Integer.valueOf(numbers);
		//System.out.println(num.getClass().getSimpleName());
	


	}

}
