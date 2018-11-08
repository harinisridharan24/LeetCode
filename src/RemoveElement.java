import java.util.Arrays;

/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class RemoveElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionRE soln = new SolutionRE();
		int[] result = {3,2,2,3};
		System.out.println(soln.removeElement(result, 3));

	}

}

class SolutionRE {
	public int removeElement(int[] nums, int val) {
		int j = 0;
		for(int i = 0; i < nums.length ; i++) {
			if(nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}
}
