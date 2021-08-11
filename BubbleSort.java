package searchAndSorting;

public class BubbleSort {
public static void main(String[] args) {
		
		int[] intArr = { 1, 5, 10, 2, 6, 7, 9, 3};
		System.out.println("Before sorting");
		DataAlgorithm.printIntArr(intArr);
		DataAlgorithm.intBubbleSort(intArr);
		System.out.println("After sorting");
		DataAlgorithm.printIntArr(intArr);
	}
}
