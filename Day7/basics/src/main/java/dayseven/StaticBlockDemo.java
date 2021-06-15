/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public class StaticBlockDemo {

	private static int a;
	private static int b;
	
	public StaticBlockDemo() {
		System.out.println("I am a  constructor");
	}
	
	static {
		a=100;
		b=200;
		System.out.println("I am static block");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a+","+b);
		StaticBlockDemo sbd = new StaticBlockDemo();
	}

}
