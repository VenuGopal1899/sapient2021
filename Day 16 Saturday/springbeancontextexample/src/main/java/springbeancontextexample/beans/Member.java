/**
 * 
 */
package springbeancontextexample.beans;

/**
 * @author admi
 *
 */
public class Member {
	
	private int id;
	private String memberName;
	/**
	 * @param id
	 * @param memberName
	 */
	public Member(int id, String memberName) {
		super();
		this.id = id;
		this.memberName = memberName;
	}
	
	public Member() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	public void displayMessage() {
		System.out.println("Member information--"+id + "----"+memberName);
	}

}
