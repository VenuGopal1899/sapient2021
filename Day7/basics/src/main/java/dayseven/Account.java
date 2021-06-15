/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public abstract class Account implements Language{

	public static void printInfo() {
		System.out.println("Inside static method of abstract class");
	}
	
	public void printMessage() {
		System.out.println("Inside non static method printMessage of abstract class");
	}
	public  abstract Integer getAccountNumber();
	
	
	public abstract void getType();
	
	public abstract void getVersion();
		
}
