import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class CountPrimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolutionCP soln = new SolutionCP();
		System.out.println(soln.countPrimes(10));

	}
}


class SolutionCP {
	public int countPrimes(int n) {
		int count = 0;
		boolean[] isPrime = new boolean[n];
		for(int i = 2; i < n ; i++) {
			if(!isPrime[i]) {
				for(int j = 2; j * i < n; j++) {
					isPrime[j*i] = true;
				}
				count++;
			}
		}
		return count;
	}
}
		
				