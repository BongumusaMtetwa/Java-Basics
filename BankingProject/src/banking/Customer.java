package banking;

/**
 * Represents a customer of a bank account
 * @author BongumusaMtetwa
 *
 */

public class Customer {
	
	//instance variables
	
	//Name of the customer
	String name;
	
	//Customer address
	String addresss;
	
	
	//constructor
	/**
	 * Creates a customer with the given name
	 * @param name of customer
	 */
	public Customer(String name) {
		//sets instance variable to given name
		this.name=name;
		
	}
	
	//methods
	
	/**
	 * sets the address of customer to the given address
	 * @param address for customer
	 */
	public void setAddress(String address) {
		//
		this.addresss=address;
	}
	
	
	/**
	 * Returns customer's name
	 * @return name of customer
	 */
	public String getName() {
		
		return this.name;
	}
	
	/**
	 * Returns cutsomer's address
	 * @return address of customer
	 */
	public String getAddress() {
		
		return this.addresss;
	}

}
