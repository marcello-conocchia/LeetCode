
public class Palindrome9 {

	public static void main(String[] args) {

		isPalindrome(6);
	}

	public static boolean isPalindrome(int x) {
		boolean palindrome = false;
		String value = Integer.toString(x);
		if(value.length() == 1) {
			palindrome = true;
			
		}
		for (int i = 0, j = value.length() - 1; i < value.length() / 2; i++, j--) {
		
			if (value.charAt(i) == value.charAt(j)) {
				
				palindrome = true;
			}else {
				palindrome = false;
				break;
			}

		}if(palindrome) {
			System.out.println("Es ist ein Palindrome");
			
		}else {
			System.out.println("Es ist kein Palindrome");
		}
		return palindrome;
	}
}
