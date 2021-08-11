package searchAndSorting;

public class PrimeAnagramAndPalindrome {
	public static void main(String[] args) {
		DataAlgorithm p = new DataAlgorithm();
		for (int i = 0; i <= 1000; i++) {
			if (DataAlgorithm.isPrime(i)) {
				for (int j = i; j < 1000; j++) {
					if (i != j) {
						if (DataAlgorithm.isPrime(j)) {
							if (p.isAnagram(String.valueOf(i), String.valueOf(j)) && p.isPalindrome(i)) {
								System.out.println(i + " " + j + " is prime and anagram and palindrome");
							}
						}
					}
				}

			}

		}

	}
}
