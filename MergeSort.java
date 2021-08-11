package searchAndSorting;

public class MergeSort {
	public static void main(String[] args) {
		DataAlgorithm d =new DataAlgorithm();
		String[] arr= {"Nishu","Krati","Vanshika","Tulika","Akshara","Jay"};
		System.out.println(d);
		int start=0,end=arr.length-1;
		d.mergeSort(arr,start,end);
		DataAlgorithm.printStringArr(arr);

	}

}
