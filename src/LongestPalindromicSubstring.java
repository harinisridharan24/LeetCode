/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class LongestPalindromicSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	SolutionLPS soln = new SolutionLPS();
	System.out.println(soln.longestPalindrome("babad"));

	}

}

class SolutionLPS {
    /**
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
    	if(s == null || s.length() < 1)
    		return "";
    	int start = 0, end = 0;
    	for(int i = 0; i < s.length(); i++) {
    		int length1 = expandAtCenter(s, i, i);
    		int length2 = expandAtCenter(s, i, i+1);
    		int maxLength = Math.max(length1, length2);
    		if(maxLength > end - start) {
    			start = i - (maxLength - 1)/2;
    			end = i + maxLength / 2;
    		}
    	}
    	return s.substring(start, end + 1);
    }
    
    private int expandAtCenter(String s, int left, int right) {
    	while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
    		left--;
    		right++;
    	}
    	return right-left-1;
    }
}