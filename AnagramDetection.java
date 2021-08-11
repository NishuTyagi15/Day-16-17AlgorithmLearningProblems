package searchAndSorting;

import java.util.Scanner;

public class AnagramDetection {
	public static void main(String[] args) {
		String str1, str2;
		Scanner S =new Scanner(System.in);
		System.out.println("enter string 1");
		str1 = S.next();
		System.out.println("enter string 2");
		str2 = S.next();
		DataAlgorithm d = new DataAlgorithm();
		boolean isAnagram = ((DataAlgorithm) d).isAnagram(str1,str2);
		if(isAnagram) {
			System.out.println("Two String are Anagram!:-)");
		}else {
			System.out.println("Two String are not Anagram!:-(");
		}
		S.close();
	}
}
