import java.util.Arrays;

/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionRA soln = new SolutionRA();
		int[] result = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(soln.rotate(result, 3)));
	}
}

class SolutionRA {
    public int[] rotate(int[] nums, int k) {
    	for(int count = 1; count <= k; count++) {
        	int temp = nums[nums.length - 1];
	        for(int i = nums.length - 2; i >= 0; i--) {
	        	nums[i + 1] = nums[i];
	        }
	        nums[0] = temp;
    	}
        return nums;
    }
}


//k = k % nums.length;
//reverse(nums, 0, nums.length - 1);
//reverse(nums, 0, k - 1);
//reverse(nums, k, nums.length - 1);
//}
//private void reverse(int[] nums, int start, int end) {
//while (start < end) {
//    int tmp = nums[start];
//    nums[start++] = nums[end];
//    nums[end--] = tmp;
//}
