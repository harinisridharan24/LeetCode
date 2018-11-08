import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class IntersectionOfTwoArrayUnique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolutionITA soln = new SolutionITA();
		int result1[] = {4,9,5};
		int result2[] = {9,4,9,8,4};
		System.out.println(Arrays.toString(soln.intersect(result1, result2)));

	}

}

class SolutionITAU {
	public int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		Set<Integer> set = new HashSet<Integer>();
		int i = 0, j = 0;
		while(i < nums1.length && j < nums2.length) {
			if(nums1[i] == nums2[j]) {
				set.add(nums1[i]);
				i++;
				j++;
			}
			else if(nums1[i] < nums2[j]) 
				i++;
			else
				j++;
		}
		int[] intersectArray = new int[set.size()];
		int k = 0;
		for(Integer numbers : set) {
			intersectArray[k++] = numbers;
		}
		return intersectArray;
	}
}