/**
 * 
 */
package daynine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author admi
 *
 */
public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		ArrayList<String> languages = new ArrayList<String>();
		//add elements to ArrayList
		
		languages.add("English");
		languages.add("Tamil");
		languages.add("Kannada");
		languages.add("Hind");
	
		System.out.println("ArrayList elements are :-- "+languages);
		
		List<Integer> listOfNumber = new ArrayList<Integer>();

		listOfNumber.add(1);
		listOfNumber.add(1);
		
		System.out.println("ArrayList elements are :-- "+listOfNumber);
		listOfNumber.add(5);
		listOfNumber.add(2);
		listOfNumber.add(4);
		listOfNumber.add(3);
		
		System.out.println("List elements are :-- "+listOfNumber);
		
		listOfNumber.add(2, 11);
		System.out.println("List elements are :-- "+listOfNumber);
		System.out.println("List element at index 0 :-- "+listOfNumber.get(0));
		System.out.println("List element at index 1 :-- "+listOfNumber.get(1));
		System.out.println("List element at index 2 :-- "+listOfNumber.get(2));
		System.out.println("List element at index 3 :-- "+listOfNumber.get(3));
		
		
		List<Integer> newList = new ArrayList<Integer>();
		newList.add(15);
		newList.add(17);
		newList.add(20);
		//for loop
		//for each
		//Using Iterator
		
		//for loop
		System.out.println("**********************for loop*********************");
		for (int index=0 ; index<listOfNumber.size();index++) {
			System.out.println("Element at position:- "+index+"--"+listOfNumber.get(index));
		}
		
		listOfNumber.addAll(newList);
		System.out.println(listOfNumber);
		
		
		ArrayList<Integer> [][] arry2DList= new ArrayList[3][3];
		arry2DList[0][0] = new ArrayList<Integer>();
		
		arry2DList[0][0].add(15);
		arry2DList[0][0].add(16);
		arry2DList[0][0].add(17);
		System.out.println(arry2DList[0][0]);
		
		//arry2DList[0][1] = new ArrayList<Integer>();
		// 15 16 17
		// 18 19 20
		// 21 22 23
		// new ArrayList
		/**
		for(int i=0; i <arry2DList.length;i++) {
			for(int) {
				
			}
		}**/
		
		System.out.println("**********************List inside a list  2D list*****************************");
		
		ArrayList<ArrayList<Integer>>  a = new ArrayList<ArrayList<Integer>>();
		System.out.println(a);
		
		a.add(new  ArrayList<Integer>() );
		a.get(0).add(0, 15);
		a.get(0).add(1, 16);
		a.get(0).add(2, 17);
		
		//a.add(15);
		a.add(new ArrayList<Integer>(Arrays.asList(18,19,20)));
		
		//a.get(1).add(0,21);
		a.add(new ArrayList<Integer>(Arrays.asList(21,22,23)));
		//a.get(2).addAll(listOfNumber);
		
		System.out.println(a);
	
		System.out.println(a.get(1).get(1));
		System.out.println("************Traversing through Iterator*********");
		System.out.println(listOfNumber);
		
		Iterator itr = listOfNumber.iterator();
		
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Integer element = (Integer) itr.next();
			System.out.println("Element indes is :-----"+element);
			System.out.println(listOfNumber.indexOf(element));
		}
		
		System.out.println(listOfNumber.size());
		//It will remove the element at index position 1
		listOfNumber.remove(20);
		//Here an element will be looked and if found it will remove the element
		listOfNumber.remove(Integer.valueOf(1));
		
		//listOfNumber.add(e)
		System.out.println(listOfNumber);
		System.out.println(listOfNumber.size());
}
}