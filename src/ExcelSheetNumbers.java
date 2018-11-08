import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class ExcelSheetNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolutionESN soln = new SolutionESN();
		System.out.println(soln.titleToNumber("ZY"));
	}
}


class SolutionESN {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
        	result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}