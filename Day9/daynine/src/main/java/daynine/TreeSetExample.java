/**
 * 
 */
package daynine;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author admi
 *
 */
public class TreeSetExample {


		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StudentT student1 = new StudentT(10110, "Sharad", 96);
			StudentT student2 = new StudentT(11111, "Meghna", 95);
			StudentT student3 = new StudentT(10110, "Sharad", 96);

			StudentT student4 = new StudentT(10112, "Rishabh", 95);
			StudentT student5 = new StudentT(11114, "Venu", 94);
			StudentT student6 = new StudentT(101105, "Vaishnavi", 93);
			Set<StudentT> studentTreeSet =  new TreeSet<StudentT>();
			
			System.out.println("Is Empty :----"+studentTreeSet.isEmpty()+"-----studentTreeset size----"+studentTreeSet.size());
			studentTreeSet.add(student1);
			studentTreeSet.add(student2);
			studentTreeSet.add(student3);
			studentTreeSet.add(student4);
			studentTreeSet.add(student5);
			studentTreeSet.add(student6);
			System.out.println("Is Empty :----"+studentTreeSet.isEmpty()+"-----studentTreeset size----"+studentTreeSet.size());
			System.out.println(studentTreeSet);
			System.out.println(student1.hashCode());
			System.out.println(student3.hashCode());
		}
	}
