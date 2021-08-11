package searchAndSorting;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String str = DataAlgorithm.getFromFile
				     ("C:\\Users\\tyagi\\eclipse-workspace\\DataStrLearningProblems\\src\\searchAndSorting\\Names");
		String[] strArr = str.split(",");
		DataAlgorithm.bubbleSort(strArr);
		DataAlgorithm.printStringArr(strArr);
		System.out.println("Enter key to search : ");
		String key = S.next();
		int index = DataAlgorithm.stringBinarySearch(strArr, key);
		if (index >= 0)
			System.out.println("Key found at index " + index + " which is " + strArr[index]);
		else if(index==-1) {
			System.out.println("Key not found. Please Enter a Valid Key!");
		}
		
		S.close();
	}
}
