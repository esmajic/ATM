public class AccountStatus extends MoneyTransfer {

	AccountStatus() {

	}

	AccountStatus(int accountNumber, String accountOwner, double balance, double amount) {
		super(accountNumber, accountOwner, balance, amount);
	}

	static Account status = new Account();

	@Override
	public String toString() {
		return "AccountStatus [amount=" + amount + ", balance=" + balance + "]";
	}

	public void checkAccountStatus(int accountNumber) {
		if (!isAccountNumberValid(accountNumber)) {
			System.out.println("Source account number does not exist. Please, try again.");
			System.out.println("");

		} else {

			System.out.println(
					"Account number :  " + accounts.get(getNumberAccountIndex(accountNumber)).getAccountNumber());
			System.out.println(
					"Account owner :  " + accounts.get(getNumberAccountIndex(accountNumber)).getAccountOwner());
			System.out.println("Account balance :  " + accounts.get(getNumberAccountIndex(accountNumber)).getBalance());
		}

	}

	public static int getNumberAccountIndex(int accountNumber) {
		int i;
		for (i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber() == accountNumber) {
				return i;
			}
		}
		return i;
	}
}
