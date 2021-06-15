/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public class AccountApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account savingacc = new SavingAccount();
		SavingAccount sbacc = new SavingAccount();
		Account currentacc =  new CurrentAccount();
		
		System.out.println(savingacc.getAccountNumber());
		System.out.println(currentacc.getAccountNumber());
		Account.printInfo();
		savingacc.printMessage();
		//savingacc.printInfo();
		
		sbacc.printSavingAccountInfo();
		
		sbacc.getType();
		sbacc.getVersion();
		System.out.println("**********************");
		savingacc.getType();
		savingacc.getVersion();
		
	
		
		//Account savingacc = new SavingAccount();
		/**
		printInformation(new SavingAccount());
		printInformation(new CurrentAccount());
		**/
	}

	public static void printInformation(Account a) {
		System.out.println(a.getAccountNumber());
	}
}
