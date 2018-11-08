
public class Factorial {

	public static void main(String[] args) {
		SolutionF soln = new SolutionF();
		System.out.println(soln.factorial(5));

	}

}


class SolutionF{
	public int factorial(int n) {
		if(n == 0 || n == 1)
			return n;
		int product = 1;
		for(int i = 1; i <= n; i ++)
			product *= i;
		return product;
//		return n * factorial(n-1);
	}
}

