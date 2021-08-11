package searchAndSorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] intArr = { 1, 5, 2, 6, 7, 9, 3 };
		System.out.println("Before sorting");
		DataAlgorithm.printIntArr(intArr);
		DataAlgorithm.intInsertionSort(intArr);
		System.out.println("After sorting");
		DataAlgorithm.printIntArr(intArr);
		

	}

}
