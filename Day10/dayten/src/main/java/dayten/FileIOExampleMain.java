/**
 * 
 */
package dayten;

import java.io.File;

/**
 * @author admi
 *
 */
public class FileIOExampleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Good Afternoon its Lunch Time ");
		System.out.println(System.getProperties());
		
		File file = new File("C:\\Users\\admi\\Desktop\\output\\text.txt");
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.canRead());
	}

}
