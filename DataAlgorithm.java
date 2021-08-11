package searchAndSorting;

public class DataAlgorithm {
	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {   // TODO Auto-generated method stub
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
