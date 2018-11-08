import java.util.Scanner;

/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class ProductOfTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener the first number: ");
		int number1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int number2 = sc.nextInt();
		int product = product(number1, number2);
		System.out.println("The product of " +number1 + " and " +number2 + " is " +product);
	}

	private static int product(int number1, int number2) {
		int product = 0;
		for(int i = 0; i < number2; i++) {
			product = product + number1;
		}
		return product;
	}

}
