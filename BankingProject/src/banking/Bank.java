package banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts
 * @author BongumusaMtetwa
 *
 */
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creates new instance of Bank class
		Bank bank = new Bank();
		
		//calls the run method in the bank class
		bank.run();

	}
	/**
	 * runs the program by initializing and managing bank accounts and customers
	 */
	public void run() {
		System.out.println("Welcome to the Bank! What is your name?");
		
		//Create scanner to get user input
		Scanner scanner = new Scanner(System.in);
		
		//get the next token(word), which is the customer's name
		String name = scanner.next();
		
		System.out.println("Hello " + name + "! We are creating a cheking and savings accounts for you.");
		
		//creates customer with given name
		Customer customer = new Customer(name);
		
		//get address
		System.out.println("What is your address?");
		
		//get the next token (word), which is the customer address
		String address = scanner.next();
		
		//set the customer's address
		customer.setAddress(address);
		
		//create a checking account for customer
		BankAccount  checkingAccount = new BankAccount("Checking",customer);
		
		//create a savings account for customer
		BankAccount savingsAccount = new BankAccount("Savings",customer);
		
		
		//gets and prints the customer info associated with the checking account
		System.out.println();
		System.out.println("customer Info: ");
		System.out.println(checkingAccount.getCustomerInfo());
		
		//get and print info for the checking account
		System.out.println("checking account : ");
		System.out.println(checkingAccount.getAccountInfo());
		
		//get and print info for the savings account
		System.out.println("savings account : ");
		System.out.println(savingsAccount.getAccountInfo());
		
		
		//deposits
		
		//into checking account
		System.out.println();
		System.out.println("Amount (decimal) to deposit into your checking account?");
		//get next token as a double
		double amount = scanner.nextDouble();
		//deposit into checking account
		checkingAccount.deposit(amount);
		
		//into savings account
		System.out.println();
		System.out.println("Amount (decimal) to deposit into savings account?");
		//get next token as a double
		amount = scanner.nextDouble();
		//deposit into the savings account
		savingsAccount.deposit(amount);
		
		//check balances
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		//withdrawals
		
		//from checking account
		System.out.println();
		
		System.out.println("Amount (decimal) to withdraw in checking account?");
		amount = scanner.nextDouble();
		
		//withdraw from checking account
		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			
			//e.printStackTrace();
			
			//prints custom error message from withdraw method
			System.out.println(e.getMessage());
		}
		
		//from savings account
		System.out.println();
		
		System.out.println("Amount (decimal) to withdaraw in savings account?");
		amount =scanner.nextDouble();
		
		//withdraw from savings account
		try {
			savingsAccount.withdraw(amount);
		}
		catch (Exception e) {
			//e.printstacktrace();
			
			//prints custom message from withdraw method
			System.out.println(e.getMessage());
		}
		
		//check balances
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		scanner.close();
	}
}
