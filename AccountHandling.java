public class AccountHandling extends Account {

	AccountHandling() {

	}

	AccountHandling(int accountNumber, String accountOwner, double balance) {
		super(accountNumber, accountOwner, balance);

	}

	public void listCreatedAccounts() {

		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i));
		}
	}

	public static boolean accountUniqueNumberCheck(int accountNumber) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber() == accountNumber) {
				return true;
			}
		}
		return false;
	}

	public static boolean isAccountBalanceNegative(int accountNumber) {

		Account account = new Account();
		if (account.getBalance() < 0) {
			return true;
		}

		return false;

	}

}
