/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class BuySellStock2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolutionBSS2 soln = new SolutionBSS2();
		int[] result = {7,1,5,3,6,4};
		System.out.println(soln.maxProfit(result));

	}

}

class SolutionBSS2 {
    public int maxProfit(int[] prices) {
    	int profit = 0;
    	for(int i = 1; i < prices.length; i++) {
    		if(prices[i] > prices[i-1]) {
    			profit += prices[i] - prices[i-1];
    		}
    	}
    	return profit;
    }
}