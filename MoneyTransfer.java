public class MoneyTransfer extends AccountHandling {

	double amount;

	MoneyTransfer() {

	}

	MoneyTransfer(int accountNumber, String accountOwner, double balance, double amount) {
		super(accountNumber, accountOwner, balance);
		this.amount = amount;

	}

	public void moneyTransfer(int sourceAccount, int targetAccount, double amount) {

		if (!isAccountNumberValid(sourceAccount)) {
			System.out.println("\nSource account number does not exist. Please, try again.");

		} else if (!isAccountNumberValid(targetAccount)) {
			System.out.println("\nTarget account number does not exist. Please, try again.");

		} else if (accounts.size() < 2) {
			System.out.println("\nSorry, number of created accounts is insufficient! Please, try again.");

		} else if (isAccountBalanceNegative(sourceAccount)) {
			System.out.println("\nSorry, source account balance is negative! Please, try again.");

		} else if (((accounts.get(getSourceAccountIndex(sourceAccount)).getBalance()) - amount) < 0) {
			System.out.println("\nAmount can not be transferred. Insufficient funds. Please, try again.");

		} else if (accountUniqueNumberCheck(sourceAccount) == false
				|| accountUniqueNumberCheck(targetAccount) == false) {
			System.out.println("\nSource account or target account does not exist. Please, try again.");

		} else {

			accounts.get(getTargetAccountIndex(targetAccount))
					.setBalance(amount + accounts.get(getTargetAccountIndex(targetAccount)).getBalance());
			accounts.get(getSourceAccountIndex(sourceAccount))
					.setBalance(accounts.get(getSourceAccountIndex(sourceAccount)).getBalance() - amount);
			System.out.println("\nFunds are successfuly transfered.");
		}
	}

	public static int getSourceAccountIndex(int accountNumber) {
		int i;
		for (i = 0; i < accounts.size(); i++) {
			while (accounts.get(i).getAccountNumber() == accountNumber) {
				return i;
			}
		}
		return i;
	}

	public static int getTargetAccountIndex(int accountNumber) {
		int i;
		for (i = 0; i < accounts.size(); i++) {
			while (accounts.get(i).getAccountNumber() == accountNumber) {
				return i;
			}
		}
		return i;
	}

	public static boolean isAccountNumberValid(int accountNumber) {
		for (int i = 0; i < accounts.size(); i++) {
			while (accounts.get(i).getAccountNumber() == accountNumber) {
				return true;
			}
		}
		return false;

	}
}
