/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class BinaryNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionBN soln = new SolutionBN();
		soln.binaryNumber(5);

	}
}

class SolutionBN {
	public void binaryNumber(int n) {
		if(n > 1) {
			binaryNumber(n/2);
		}
		
		System.out.println(n % 2);
	}
}
