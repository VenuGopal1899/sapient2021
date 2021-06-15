/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public class DuckFixedApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      //System.out.println("Duck size :"+size);
      DuckFixed duck1 = new DuckFixed();
      System.out.println("Duck size :"+duck1.getSize());
      System.out.println("Total Ducks :"+DuckFixed.getDuckCount());
      
      DuckFixed duck2 = new DuckFixed();
      System.out.println("Duck size :"+duck2.getSize());
      System.out.println("Total Ducks :"+DuckFixed.getDuckCount());


	}

}
