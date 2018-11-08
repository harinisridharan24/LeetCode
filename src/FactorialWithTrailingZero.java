/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class FactorialWithTrailingZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolutionFTZ soln = new SolutionFTZ();
		System.out.println(soln.trailingZeroes(10));

	}

}

class SolutionFTZ {
    public int trailingZeroes(int n) {
    	int count = 0;
    	while(n > 0) {
    		n /=5;
    		count += n;
    	}
    	return count;
    }
}