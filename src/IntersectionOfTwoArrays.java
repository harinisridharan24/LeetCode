import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class IntersectionOfTwoArrays {

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


class SolutionITA {
    public int[] intersect(int[] nums1, int[] nums2) {
//    	Arrays.sort(nums1);
//    	Arrays.sort(nums2);
//    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//    	List<Integer> list = new ArrayList<Integer>();
//    	for(int i = 0; i < nums1.length; i++) {
//    		if(map.containsKey(nums1[i]))
//    			map.put(nums1[i], map.get(nums1[i]) + 1);
//    		else
//    			map.put(nums1[i], 1);
//    	}
//    	for(int i = 0; i < nums2.length; i++) {
//    		if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
//    			list.add(nums2[i]);
//    			map.put(nums2[i], map.get(nums2[i]) - 1);
//    		}
//    	}
//    	int[] intersectArray = new int[list.size()];
//    	for(int i = 0; i < list.size(); i++) {
//    		intersectArray[i] = list.get(i);
//    	}
//    	return intersectArray;
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	int[] intersectArray = new int[Math.max(nums1.length, nums2.length)];
    	int i = 0, j= 0, k = 0;
    	while(i < nums1.length && j < nums2.length) {
    		if(nums1[i] == nums2[j]) {
    			intersectArray[k++] = nums1[i];
    			i++;
    			j++;
    		}
    		else if(nums1[i] < nums2[j]) {
    			i++;
    		}
    		else {
    			j++;
    		}
    	}
    	return Arrays.copyOfRange(intersectArray, 0, k);
    }
}