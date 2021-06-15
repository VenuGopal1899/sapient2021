/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public class CurrentAccount extends Account{
	private int accountNumber;
	@Override
	public Integer getAccountNumber() {
		// TODO Auto-generated method stub
		Account.printInfo();
		return accountNumber+2;
	}

}
