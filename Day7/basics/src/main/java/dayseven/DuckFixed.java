/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public class DuckFixed {

	private int size;
	private static int duckCount;
	
	public DuckFixed() {
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
	
	public static int getDuckCount() {
		return duckCount;
	}
}
