/**
 * 
 */
package daynine;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author admi
 *
 */
public class StudentSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(10110, "Sharad", 96);
		Student student2 = new Student(11111, "Meghna", 95);
		Student student3 = new Student(10110, "Sharad", 96);

		Set<Student> studentSet = new HashSet<>();
		studentSet.add(student1);
		studentSet.add(student2);
		
		boolean flag = studentSet.add(student3);
		
		System.out.println(studentSet.size());
		System.out.println(flag);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
		
		System.out.println(studentSet);
		Iterator itr = studentSet.iterator();
		while(itr.hasNext()) {
		Student student	= (Student) itr.next();
			System.out.println(student.getAdmissionCode());
		}
		
		studentSet.remove(student1);
		System.out.println("Usage of student:---"+studentSet);
		//It removes all elements from Set.
		studentSet.clear();
		System.out.println(studentSet);
		
		Student student4 = new Student(10112, "Rishabh", 95);
		Student student5 = new Student(11114, "Venu", 94);
		Student student6 = new Student(101105, "Vaishnavi", 93);
		Set<Student> studentTreeSet =  new TreeSet<Student>();
		
		System.out.println("Is Empty :----"+studentTreeSet.isEmpty()+"-----studentTreeset size----"+studentTreeSet.size());
		studentTreeSet.add(student1);
		studentTreeSet.add(student2);
		studentTreeSet.add(student3);
		studentTreeSet.add(student4);
		studentTreeSet.add(student5);
		System.out.println("Is Empty :----"+studentTreeSet.isEmpty()+"-----studentTreeset size----"+studentTreeSet.size());
		System.out.println(studentTreeSet);
		
	}
}
