import java.util.Arrays;

import org.omg.PortableInterceptor.DISCARDING;

/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class PLusOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionPO soln = new SolutionPO();
		int result[] = {1, 2, 3};
		System.out.println(Arrays.toString(soln.plusOne(result)));
	}

}

class SolutionPO {
	public int[] plusOne(int[] digits) { 
		for(int i = digits.length-1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			else {
				digits[i] = 0;
			}
		}
		int[] array = new int[digits.length + 1];
		array[0] = 1;	
		return array;
	}
}





