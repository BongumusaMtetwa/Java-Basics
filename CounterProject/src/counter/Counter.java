package counter;
/**
 * Represents a counter with methods
 * @author Bongumusa
 *
 */
public class Counter {

	//instance variables
	
	/**
	 * stores internal 
	 * Defaults to 0
	 */
	int count;
	
	//methods
	/**
	 * Increments internal count
	 * @return new value of internal count
	 */
	public int increment() {
		this.count++;
		
		return this.count;
	}
	
	/**
	 * Decrements internal count
	 * @return new value of internal count
	 */
	public int decrement() {
		this.count--;
		
		return this.count;
	}
	
	/**
	 * Returns the current value of count
	 * @return the count
	 */
	public int getCount() {
		return this.count;
	}
}
