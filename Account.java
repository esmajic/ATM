
import java.util.ArrayList;

public class Account {
	private int accountNumber;
	private String accountOwner;
	protected double balance;
	public static ArrayList<Account> accounts = new ArrayList<Account>();

	Account() {

	}

	Account(int accountNumber, String accountOwner, double balance) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.balance = balance;
		accounts.add(this);

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		Account.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountOwner=" + accountOwner + ", balance=" + balance
				+ "]";
	}

	public static int numberOfAccountsCreated() {
		return accounts.size();
	}

}
