
/**
 * Represents a customer
 */
public class Customer {
	//instance variables
	
	//name of customer
	String name;
	
	//constructor
	public Customer(String name) {
		this.name=name;
	}
	
	//returns name of customer
	public String toString() {
		//returns the name of the customer to be printed by Java
		return this.name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new customer
		Customer c = new Customer("Bonga");
		//this will try to convert the customer c to a string by calling the toString method
		System.out.println("c = "+ c);
		
		    int[] arr = {10, 20, 30, 40, 50};
		    for(int i = 0; i <= 5; i++)       
		    {
		        System.out.print(" " + arr[i]); 
		    } 
		}

	}

