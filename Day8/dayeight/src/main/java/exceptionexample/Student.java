/**
 * 
 */
package exceptionexample;

import java.io.Serializable;

/**
 * @author admi
 *
 */
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L; //Serial Verison UID
	private int id;
	private String name;
	/**
	 * @param id
	 * @param name
	 */
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
