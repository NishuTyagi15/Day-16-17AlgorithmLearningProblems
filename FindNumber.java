package searchAndSorting;

public class FindNumber {
	public static void main(String[] args) { 
		int n = Integer.parseInt("3");  // TODO Auto-generated method stub
		int range = (int) Math.pow(2, n);
		System.out.println("Range is 0 to " + range);
		DataAlgorithm.numberInMind(range);
	}
}