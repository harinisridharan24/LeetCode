/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class CountNSay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionCNS soln = new SolutionCNS();
		System.out.println(soln.countAndSay(30));
	}

}

class SolutionCNS {
	public String countAndSay(int n) {
		String result = "1";
		for(int i = 1; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			char say = result.charAt(0);
			for(int j = 1; j < result.length(); j++) {
				if(result.charAt(j) != say) {
					sb.append(count).append(say);
					say = result.charAt(j);
					count = 1;
				}
				else {
					count++;
				}
			}
			sb.append(count).append(say);
			result = sb.toString();
		}
		return result;
	}
}
