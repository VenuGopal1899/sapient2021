/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public class Rectangle implements Polygon {

	public void getArea() {
		// TODO Auto-generated method stub
		int length =6;
		int breadth = 5;
		int area = length * breadth;
		System.out.println("The area of the rectangle is :"+area);
	}
	
	public void getSides() {
		System.out.println("I have 4 sides");
	}

}
