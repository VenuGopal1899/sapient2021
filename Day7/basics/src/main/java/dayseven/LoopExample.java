/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public class LoopExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************************While Loop  Example**************************************");
		int counter = 0;

		while (counter < 10) {
			System.out.println("Sapient");
			counter++;

		}
		System.out.println("****************************2D Array Example**************************************");
		int marks[][] = { { 85, 68, 90 }, { 56, 67, 78, 5 }, { 98, 89, 85 }, { 84, 85 } };
		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = 0; j < marks[i].length; j++) {
				System.out.print(marks[i][j] + " ");
			}
		}
		System.out.println("****************************String Example**************************************");
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		String s5 ="Good Afternoon";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println("****************************");
		System.out.println(s3 == s4);
		System.out.println("****************************");
		System.out.println(s3.equals(s4));
		System.out.println("****************************");
		System.out.println(s1 == s2);
		
		String s6 = "FB";
		String s7 = "Ea";
		System.out.println(s6.hashCode());
		System.out.println(s7.hashCode());
		System.out.println(s6.equals(s7));
		System.out.println(s6 == s7);
		
		
		
		
		

	}

}
