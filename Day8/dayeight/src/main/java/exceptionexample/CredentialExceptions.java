/**
 * 
 */
package exceptionexample;

/**
 * @author admi
 *
 */
public class CredentialExceptions extends Exception{
	
	private String name;

	/**
	 * @param name
	 */
	public CredentialExceptions(String name) {
		super();
		this.name = name;
	}
	
	public CredentialExceptions() {
		
	}
	
	public String getMessage() {
		return "Invalid credentials";
	}

	@Override
	public String toString() {
		return "CredentialExceptions [name=" + name + "]";
	}
	
	

}
