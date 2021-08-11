package searchAndSorting;

import java.io.*;
import java.util.Arrays;

public class DataAlgorithm {
	public static String getFromFile(String path) {
		BufferedReader bufferReader = null;
		String str = "";
		try {
			bufferReader = new BufferedReader(new FileReader(path));
			str = bufferReader.readLine();
			bufferReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	public static void bubbleSort(String[] arr) {
		String temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j-1].compareTo(arr[j]) > 0) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;

				}
			}
		}
	}

	public static void printStringArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int stringBinarySearch(String[] arr, String key) {
		int start = 0, end = arr.length - 1, mid;
		bubbleSort(arr);
		while (start <= end) {
			mid = start + end / 2;

			if (arr[mid].equals(key)) {
				return mid;
			}
			else if (arr[mid].compareTo(key) < 0) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1;
	}
	
	public static int[] intInsertionSort(int[] arr) {
		int key;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
	
	public static void printIntArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] intBubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		return arr;

	}
	
	public void mergeSort(String[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);

			merge(arr, start, mid, end);
		}

	}
	private void merge(String[] arr, int start, int mid, int end) {
		int p = start, q = mid + 1;
		String[] newArr = new String[end - start + 1];
		int j = 0;
		for (int i = start; i <= end; i++) {
			if (p > mid)
				newArr[j++] = arr[q++];
			else if (q > end)
				newArr[j++] = arr[p++];
			else if (arr[p].compareTo(arr[q]) < 0)
				newArr[j++] = arr[p++];
			else
				newArr[j++] = arr[q++];
		}
		for (int k = 0; k < j; k++) {
			arr[start++] = newArr[k];
		}
	}
	
	public boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}

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
	
	public boolean isPalindrome(int num) {
		int rem, sum = 0;
		int temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum) {
			return true;
		} else {
			return false;
		}
	}
}
