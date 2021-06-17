/**
 * 
 */
package daynine;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * Set Example
 * @author admi
 *
 */
public class HashSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> numbers = new HashSet<>();
		/** Capacity this hashset num is 10 , it can store 10 elements  and loadfactor 0.6. Whenever a 
		 * hash set is filled 
		* by 60%, the elements are moved to a new hash table of double the size of the original hash table.
		**/
		HashSet<Integer> num = new HashSet<>(10,0.6f);  
		HashSet<Integer> number = new HashSet<Integer>();
		
		numbers.add(15);
		numbers.add(17);
		numbers.add(13);
		numbers.add(11);
		numbers.add(12);
		
		number.addAll(numbers);
		number.add(2);
		
		System.out.println("***************"+numbers.add(17));
		
		System.out.println("Number hash set value is displayed:---- "+number);
		System.out.println("Numbers hash set value is displayed:---- "+numbers);
		
		//Accessing the elements
		Iterator itr = numbers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(" - ");
			
		}
		
	}

}
