/**
 * 
 */
package exceptionexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.security.auth.login.CredentialException;

/**
 * @author admi
 *
 */
public class CredentialExceptionsTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			getCredentials();
		} catch (CredentialException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Welcome to the App");
	}

	private static void getCredentials() throws CredentialException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("Enter userId: ");
			String userid = reader.readLine();
			if (!userid.equals("admin")) {
				throw new CredentialException(userid);
			}

		} catch (IOException e) {

		}
	}
}
