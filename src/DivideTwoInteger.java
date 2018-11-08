/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class DivideTwoInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolutionDI soln = new SolutionDI();
		System.out.println(soln.divide(10, -3));

	}

}


class SolutionDI {
    public int divide(int dividend, int divisor) {
    	int sign = 1;
    	if((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
    		sign = -1;
    	}
    	long ldividend = Math.abs((long) dividend);
    	long ldivisor = Math.abs((long) divisor);
    	if(ldivisor == 0)
    		return Integer.MAX_VALUE;
    	if(ldividend == 0 || ldividend < ldivisor)
    		return 0;
    	long result = ldivide(ldividend, ldivisor);
    	int answer;
    	if(result > Integer.MAX_VALUE) {
    		answer = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    	}
    	else {
    		answer = (int) result * sign;
    	}
		return answer;
    	
        
    }

	private long ldivide(long ldividend, long ldivisor) {
		if(ldividend < ldivisor)
			return 0;
		
		long sum = ldivisor;
		long multiple = 1;
		while((sum + sum) <= ldividend) {
			sum += sum;
			multiple += multiple;
		}
		return multiple + ldivide(ldividend - sum, ldivisor);
	}
}