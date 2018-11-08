/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class DivideTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int dividend = 10;
		int divisor = 3;
		int quotient = 0;
    	while(dividend >=  divisor) {
    		dividend = dividend - divisor;
    		quotient++;
    	}
		System.out.println(quotient);

	}

}
