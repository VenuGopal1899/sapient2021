/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public class Duck {

	public static int size;
	private static int duckCount;
	
	public Duck() {
		duckCount++;
	}
	
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}


	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Size of the duck is :"+size);
		Duck duck1 = new Duck();
		System.out.println(duck1.getSize());

	}

}
