/**
 * 
 */
package exceptionexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author admi
 *
 */
public class BufferedReaderDemo {

public static void main(String[] args) {
String myName= getMyName();
System.out.println("My Name: "+ myName);
}

private static String getMyName() {
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name: ");
String name = null;
try {
	name = bufferedReader.readLine();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return name;

}




}
