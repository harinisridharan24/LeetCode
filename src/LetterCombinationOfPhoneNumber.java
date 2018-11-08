import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class LetterCombinationOfPhoneNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionLPH soln = new SolutionLPH();
		System.out.println(soln.letterCombinations("34"));
	}

}

class SolutionLPH {
	public List<String> letterCombinations(String digits) {
		//since string iterates from 0 to 1, we declared null in those places as the letter in phone starts from 2
		String[] phoneLetters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		List<String> letterCombo = new ArrayList<String>();
		if(digits.length() == 0)
			return letterCombo;
		letterCombo.add("");
		for(int i = 0; i < digits.length(); i++) {
			letterCombo = combine(phoneLetters[digits.charAt(i) - '0'], letterCombo);
		}
		return letterCombo;
		
	}
	
	public List<String> combine(String digit, List<String> list) {
		List<String> result = new ArrayList<String>();
		for(int i = 0; i < digit.length(); i++) {
			for(String letters : list) {
				result.add(letters + digit.charAt(i));
			}
		}
		return result;		
	}
}