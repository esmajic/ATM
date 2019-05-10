import java.util.Scanner;

public class MainATM {

	public static void main(String[] args) {

		int accountNumber, sourceAccount, targetAccount;
		int option = -1;
		String accountOwner;
		double balance, amount;

		Scanner input = new Scanner(System.in);

		do {

			System.out.println("\n=====================================");
			System.out.println("=        Welcome to my ATM          =");
			System.out.println("=====================================");
			System.out.println();

			System.out.println("Select 1 to create bank account");
			System.out.println("Select 2 to transfer funds");
			System.out.println("Select 3 to check account status");
			System.out.println("Select 0 to exit");
			System.out.println();
			System.out.println("Please, choose desired option:  ");

			option = input.nextInt();

			if (option == 1) {
				System.out.println();
				System.out.println("\nCreating bank account...");
				System.out.println("\nEnter account number (up to 5 digits):  ");
				accountNumber = input.nextInt();
				input.nextLine();
				System.out.println("Enter account's owner name:  ");
				accountOwner = input.nextLine();
				System.out.println("Enter account's balance:  ");
				balance = input.nextDouble();

				Account accounts = new Account(accountNumber, accountOwner, balance);

				System.out.println(
						"The account with the account number " + accounts.getAccountNumber() + " has been successfully created!");

			} else if (option == 2) {
				System.out.println("\nTransferring funds...");
				System.out.println("\nEnter source account:  ");
				sourceAccount = input.nextInt();
				System.out.println("Enter target account:  ");
				targetAccount = input.nextInt();
				System.out.println("Enter amount of funds to be transfered:  ");
				amount = input.nextDouble();

				MoneyTransfer transfer = new MoneyTransfer();

				transfer.moneyTransfer(sourceAccount, targetAccount, amount);

			} else if (option == 3) {
				System.out.println("\nAccount details:  ");
				System.out.println("Enter account number: ");
				accountNumber = input.nextInt();

				AccountStatus status = new AccountStatus();

				status.checkAccountStatus(accountNumber);
			}

		} while (option != 0);

		System.out.println("\nThank You for using our services. Bye bye.");
		input.close();
	}

}
