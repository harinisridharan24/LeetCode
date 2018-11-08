/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class BuyAndSellStock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolutionBSS soln = new SolutionBSS();
		int[] result = {7,1,5,3,6,4};
		System.out.println(soln.maxProfit(result));

	}
}


class SolutionBSS {
    public int maxProfit(int[] prices) {
    	int min = Integer.MAX_VALUE, max = 0;
		for(int i = 0; i < prices.length; i++) {
			min = Math.min(min, prices[i]);
			max = Math.max(max, prices[i] - min);
		}
		return max;      
    }
}


//if(prices == null || prices.length < 2) return 0;
//int profit = 0, min = prices[0];        
//for(int i = 1; i < prices.length; i++){
//    profit = prices[i] - min > profit ? prices[i] - min : profit;
//    if(prices[i] < min) 
//    	min = prices[i];            
//}
//return profit;