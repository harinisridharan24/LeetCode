
public class PrintPrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		int prime;
		int num = 100;
		for(int i = 2; i <= num; i++) {
			prime = 0;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					prime = 1;
					break;
				}
			}
			if(prime == 0) {
				count++;
				System.out.println(i + " ");
			}
		}
		System.out.println("Count of prime number is :" + count);
	}

}




