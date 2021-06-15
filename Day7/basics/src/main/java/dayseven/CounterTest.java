/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public class CounterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter a  = new Counter();
		Counter b  = new Counter();
		a.increment();
		b.increment();
		String str = null;
		System.out.println(a.getCount());
		System.out.println(b.getCount());
		System.out.println(str);
		
		Age age = new Age();
		age.getDay();
	}

}
