/**
 * 
 */
package dayseven;

import java.util.ArrayList;

import daysix.HelloWorld;

/**
 * @author admi
 *
 */
public class StudentApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		HelloWorld hw = new HelloWorld();
		ArrayList<Integer> list = new ArrayList<Integer>();

		stu.setName("Sharad");
		stu.setDeptName("Curious");
		stu.setId(15062021);
		// System.out.println(stu.id);

		if (stu.getName().equals("Rishabh")) {
			System.out.println(stu.getDeptName());
		} else if (stu.getName().equals("Sharad")) {
			System.out.println(stu.getId());
		} else {
			System.out.println("Student info doesnt exist");
		}

		Student stud1 = new Student();
		Student stud2 = new Student();
		Student stud3 = new Student();

		stud1.setName("Dheeraj");
		stud1.setDeptName("IT");
		stud1.setId(15062022);

		stud2.setName("Venu");
		stud2.setDeptName("CSE");
		stud2.setId(15062023);
		
		
		stud3.setName("Dheeraj");
		stud3.setDeptName("IT");
		stud3.setId(15062022);
		
		System.out.println("******************Hashcode of student objects************************************");
		System.out.println(stud1.hashCode());
		System.out.println(stud2.hashCode());
		System.out.println(stud3.hashCode());
		
		
		System.out.println("******************************************************");

		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(stud1);
		listOfStudents.add(stud2);

		for (int i = 0; i < listOfStudents.size(); i++) {
			System.out.println(listOfStudents.get(i).getName());
		}

		System.out.println("******************************************************");
		// New For loop for each
		for (Student stu1 : listOfStudents) {
			System.out.println(stu1.getDeptName());
		}
		
		//Example for Nested loop
		int weeks=3;
		int days=7;
		
		for(int index= 1; index<=weeks;++index) {
			System.out.println("Week:" +index);
			for(int j = 1; j<=days;++j) {
				System.out.println("Day: "+j);
				
			}
		}

		
		//break and continue
		System.out.println("************************Continue******************************");
		for(int i =1;i<=10;i++) {
			if(i>4 && i<9) {
				System.out.println("Value of i before  continue"+i);
				continue;
				
			}
		}
	System.out.println("After Continue");
	
	System.out.println("**************************break ****************************");
	for(int i =1;i<=10;i++) {
		if(i>4 && i<9) {
			System.out.println("Value of i before break---"+i);
			break;
			
		}
	}
	System.out.println("After Break");
	
	}
}
