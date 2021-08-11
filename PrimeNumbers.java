package searchAndSorting;

public class PrimeNumbers {
	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			if (DataAlgorithm.isPrime(i)) {
				System.out.print(i + " ");
			}
			
		}

	}
}
