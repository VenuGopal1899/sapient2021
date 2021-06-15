/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public class SavingAccount extends Account implements Language,AnotherInterface {
	private int accountNumber;
	@Override
	public Integer getAccountNumber() {
		// TODO Auto-generated method stub
		return accountNumber+1;
	}
	
	public void printSavingAccountInfo() {
		System.out.println("Inside Saving acc printSavingAccountInfo");
	}

	@Override
	public void getType() {
		// TODO Auto-generated method stub
		System.out.println("SAving");
	}

	@Override
	public void getVersion() {
		// TODO Auto-generated method stub
		System.out.println(111111);
	}

	



	

}
