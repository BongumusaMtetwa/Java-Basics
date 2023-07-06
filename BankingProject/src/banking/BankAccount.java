package banking;
/**
 * 
 * ============Start from 4:24======================
 * Represents a checking/savings account for a customer
 * @author BongumusaMtetwa
 *
 */

public class BankAccount {
	/**
	 * Types of accounts (checking or savings)
	 */
	//instance variables
	String accountType;
	
	//balance for bank account
	double balance;
	
	//Customer for this account
	Customer customer;
	
	/**
	 * Fixed amount for quick withdrawals
	 */
	double fastCashamount;
	//constructor
	/**
	 * Creates a bank account of given type for given customer
	 * @param accountType for bank account
	 * @param customer for bank account
	 */
	public BankAccount(String accountType,Customer customer) {
		
		this.accountType =accountType;
		this.customer=customer;
		
		//set initial default value for fast cash amount 
		this.fastCashamount = 60;
		
	}
	
	//methods
	/*Deposits the given amount, if greater than 0
	 * Deposits the given amount
	 * @param amount to add to balance
	 */
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	/**
	 * Withdraws the given amount from balance
	 * @param amount to withdraw from balance
	 * @throws Exception  if given amount is larger than available balance
	 */
	public void withdraw(double amount) throws Exception {
		if(amount > this.balance) {
			throw new Exception("Amount is greater than the available balance.");
		}
		this.balance -=amount;
	}
	
	
	/**
	 * Withdraws the fast cash amount
	 * @throws Exception if given fast cash amount is greater than available amount
	 */
	public void fastWithdraw() throws Exception {
		
		this.withdraw(this.fastCashamount);
	}
	
	/**
	 * Sets the fast cash amount, if greater than 0
	 * @param amount to set as fast cash
	 */
	public void setFastCashAmount(double amount) {
		if(amount >0) {
		this.fastCashamount = amount;
		}
	}

	
	/**
	 * Returns account type and balance for this bank account
	 * @return string with all the account info
	 */
	public String getAccountInfo() {
		return this.accountType + ":"+ this.balance;
	}
	
	/**
	 * Returns the customer name and address for this bank account
	 * @return string with all the info
	 */
	public String getCustomerInfo() {
		System.out.print("Customer name : ");
		return this.customer.getName() + "\nAddress : " + this.customer.getAddress();
	}
	
}
