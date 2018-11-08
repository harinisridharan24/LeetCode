/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class MaximumSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolutionMSA soln = new SolutionMSA();
		int[] result = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(soln.maxSubArray(result));

	}
}


class SolutionMSA {
    public int maxSubArray(int[] nums) {
    	int max = 0, sum = 0;
    	for(int i = 0; i < nums.length; i++) {
    		if(sum < 0)
    			sum = nums[i];
    		else
    			sum += nums[i];
    		if(sum > max) {
    			max = sum;
    		}
    	}
		return max;
        
    }
}