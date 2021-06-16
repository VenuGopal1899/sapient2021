/**
 * 
 */
package exceptionexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author admi
 *
 */
public class StudentPersistMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentOne= new Student(20211,"Sharad");
		Student studentTwo= new Student(20212,"Vaishnavi");
		Student studentThree= new Student(20213,"Munazza");
		
		//Serialization
		FileOutputStream fout = null;
		ObjectOutputStream out = null;
		try {
			fout = new FileOutputStream("C:\\Users\\admi\\Desktop\\output\\output.txt");
			out = new ObjectOutputStream(fout);
			out.writeObject(studentOne);
			out.writeObject(studentTwo);
			out.writeObject(studentThree);

			System.out.println("Serialization is successfully executed");
			fout.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Deserialize 
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\admi\\\\Desktop\\\\output\\\\output.txt"));
			Student stud1 = (Student)in.readObject();
			Student stud2 = (Student)in.readObject();
			Student stud3 = (Student)in.readObject();
			in.close();
			
			System.out.println(stud1.getId() + "  "+stud1.getName());
			System.out.println(stud2.getId() + "  "+stud2.getName());
			System.out.println(stud3.getId() + "  "+stud3.getName());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
