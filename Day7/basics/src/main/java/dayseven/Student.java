/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public class Student {
	
	
	private int id;
	private String name;
	private String deptName;
	
	/**
	int id;
	String name;
	String deptName;
	**/
	/**
	 * @param id
	 * @param name
	 * @param deptName
	 */
	public Student(int id, String name, String deptName) {
		super();
		this.id = id;
		this.name = name;
		this.deptName = deptName;
	}
	
	
	public Student() {
		
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	/**
	 * This method calculates the square of a given number
	 * 
	 * @param number
	 * @return
	 */
	public Integer calculateSquare(Integer number) {
		
		//TODO
		//it multiples number with same number
		return number * number; 
	}

}
