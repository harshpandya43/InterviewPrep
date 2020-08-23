package SortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {64,25,12,22,11};
		SelectionSort s = new SelectionSort();
		s.sort(arr);
		for(int a : arr) {
			System.out.print(a+ " ");
		}
	}
	
	public void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;		
		}
	}

}
