package sort;

public class MergeSort {
	
	public MergeSort() {
		
	}
	/* main step: divide , merge sort, merge */
	
	public int[] mergeSort(int[] arr, int low, int high) {
		if(low < high) {
			int mid = (low + high) / 2 ;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
		return arr;
	}
	
	/* merge: compare and sort  */
	public int[] merge(int[] arr, int low, int mid, int high) {
		int m = mid - low + 1;
		int n = high - mid;
		int[] left = new int[m];
		int[] right = new int[n];
		
		// copy arr to temp array 
		for (int i = 0; i < m ; i++) {
			left[i] = arr[low + i];
		}
		for (int j = 0; j < n; j++) {
			right[j] = arr[mid + 1 +j];
		}
		
		// compare and  place value in arr
		int i = 0; 
		int j = 0;
		int k = low;
		
		while (i < m && j < n) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		// fill the arr with remaining value 
		while (i < m) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j < n) {
			arr[k] = right[j];
			k++;
			j++;
		}
		return arr;
	}


	
	public static void main(String[] args) {
		int arr[] = {9, 3, 7, 5, 6, 4, 8, 2};
		System.out.println("Unsorted Array is: ");
		for(int i= 0; i <arr.length ; i++) {
			System.out.println(arr[i]);
		}
		MergeSort ms = new MergeSort();
		ms.mergeSort(arr, 0, 7);
		System.out.println("Sorted Array is: ");
		for (int i= 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
