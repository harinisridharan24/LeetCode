
public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionCS soln = new SolutionCS();
		System.out.println(soln.climbStairs(3));
	}

}

class SolutionCS {
    public int climbStairs(int n) {
    	int a = 1, b = 2 , c=0;
    	if(n < 0)
    		return 0;
    	if(n == 1)
    		return 1;
    	if(n == 2)
    		return 2;
    	for(int i = 3; i <= n ; i++) { 
    		c = a + b;
    		a = b;
    		b = c;
    	}
    	return c;
    }
}