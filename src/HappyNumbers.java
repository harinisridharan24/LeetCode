import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionHN soln = new SolutionHN();
		System.out.println(soln.isHappy(19));

	}
}

class SolutionHN {
	public boolean isHappy(int n) {
		Set<Integer> numbers = new HashSet<Integer>();
		while(numbers.add(n)) {
			int sum = 0;
			while(n != 0) {
				sum += (int)Math.pow(n%10, 2);
				n = n/10;
			}
	    if(sum == 1)
	    	return true; 
	    n = sum;
		}
	    return false;
	}
}