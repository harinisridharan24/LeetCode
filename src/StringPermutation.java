
public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "ABC";
		permutation(word.toCharArray(), 0);
	}
	
	public static void permutation(char[] letter, int currentIndex) {
		if(currentIndex == letter.length - 1) {
			System.out.println(String.valueOf(letter));
		}
		for(int i = currentIndex; i < letter.length; i++) {
			swap(letter, currentIndex, i);
			permutation(letter, currentIndex + 1);
			swap(letter, currentIndex, i);
		}
	}
	
	public static void swap(char[] ch, int i, int j) {
		char temp;
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

}
