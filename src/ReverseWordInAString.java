

public class ReverseWordInAString {

	public static void main(String[] args) {
		SolutionRWS soln = new SolutionRWS();
		System.out.println(soln.reverseWords("my name is harini"));
	}

}

class SolutionRWS {
	public String reverseWords(String s) {
		String[] split = s.split(" ");
		StringBuilder reverse = new StringBuilder();
		for(int i = split.length -1; i >= 0; i--) {
			if(!split[i].equals("")) {
				reverse.append(split[i]).append(" ");
			}
		}
		return reverse.length() == 0 ? "" : reverse.substring(0, reverse.length() - 1);
	}
}



//public String reverseWords(String s) {
