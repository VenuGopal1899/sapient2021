/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public interface Polygon {
	void getArea();
	
	default void getSides() {
		System.out.println("Inside defualt method getSides");
	}
}
