import java.util.HashMap;
import java.util.Map;

public class DecodeWays {

	public static void main(String[] args) {
		SolutionDW soln = new SolutionDW();
		System.out.println(soln.numDecodings("226"));
	}

}


class SolutionDW {
	public int numDecodings(String s) {
		if(s.length() == 0 || s == null)
			return 0;
		int n = s.length();
		int[] array = new int[n+1];
		array[0] = 1;
		array[1] = s.charAt(0) == '0' ? 0 : 1;
		for(int i = 2; i <= n; i++) {
			char c1 = s.charAt(i-1);
			char c2 = s.charAt(i-2);
			if(c1 >= '1' && c1 <= '9')
				array[i] += array[i-1];
			if(c2 == '1' || c2 == '2' && c1 >= 0 && c1 <= '6')
				array[i] += array[i-2];
		}
		return array[n];
	}
}


//
//if(s == null || s.length() == 0)
//	return 0;
//int n = s.length();
//int[] array = new int[n+1];
//array[0] = 1;
//array[1] = s.charAt(0) != '0' ? 1 : 0;
//for(int i = 2; i <= n; i++) {
//	int firstDigit = Integer.valueOf(s.substring(i-1, i));
//	System.out.println("First: " + firstDigit);
//	int secondDigit = Integer.valueOf(s.substring(i-2, i));
//	System.out.println("Second: " + secondDigit);
//	if(firstDigit >= 1 && firstDigit <= 9)
//		array[i] += array[i-1];
//	if(secondDigit >= 10 && secondDigit <= 26)
//		array[i] += array[i-2];
//	
//}
//return array[n];