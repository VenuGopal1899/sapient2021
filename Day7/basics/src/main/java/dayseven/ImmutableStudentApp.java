/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public class ImmutableStudentApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age age = new Age();
		age.setDay(15);
		age.setMonth(8);
		age.setYear(1947);
		
		ImmutableStudent iStudent = new ImmutableStudent(10001, "India", age);
		
		
		System.out.println();
		age.setYear(1952);
		System.out.println(ShapeType.CIRCLE);
	}

}
