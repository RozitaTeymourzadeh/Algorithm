package sort;

import java.util.Arrays;

public class QuickSort {
	int counter = 0;
	/**
	 * Main method to drive Quick Sort 
	 * @param args
	 */
	public static void main(String[] args) {
//		int[] list = {7, 132, 3, 42, 17, 78, 99, 23, 27, 61};
//		int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int[] list = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//		int[] list = {10,10};
//		System.out.println(Arrays.toString(list));
//		QuickSort qs = new QuickSort();
//		qs.quickSort(list);
//		System.out.println(qs.counter);
//		System.out.println(Arrays.toString(list));
		int[] array = {3,8,2,1,4};
		partitionExam(0,4,array);
	}

	
	/**
	 * Quick Sort algorithm with partitioning
	 * @param a
	 */
	public int[] quickSort(int[] array) {
		if (array == null || array.length < 2) {
			return array;
		}
		quickSort(0, array.length - 1, array);
		return array;
	}

	private void quickSort(int left, int right, int[] array) {
		if (left >= right) {
			return;
		}
		int index = partition(left, right, array);
		quickSort(left, index - 1, array);
		quickSort(index + 1, right, array);
	}

	public int partition(int left, int right, int[] array) {
		int pivotIndex = (int)(Math.random() * (right - left + 1)) + left;
		this.counter++;
		int pivot = array[pivotIndex];
		swap(pivotIndex, right, array);
		int i = left;
		int j = right - 1;
		while (i <= j) {
			if (array[i] <= pivot) {
				i++;
			} else if (array[j] > pivot) {
				j--;
			} else {
				swap(i++, j--, array);
			}
		}
		swap(i, right, array);
		return i;
	}

	private static void swap(int left, int right, int[] array) {
		int tmp = array[left];
		array[left] = array[right];
		array[right] = tmp;
	}
	
	public static int partitionExam(int low, int high, int[] array) {
		int pivot = array[low];
		int i = low;
		for(int j = low + 1; j <= high ; j++) {
			if (array[j] <= pivot) {
				i = i + 1;
				swap(i, j, array);
			     for (int z = 0; z < array.length; z++) {
			         if (z > 0) {
			            System.out.print(", ");
			         }
			         System.out.print(array[z]);
			      }
				System.out.println(" i " + i +" j " +j);
			}
		}
		swap(i, low, array);
	     for (int z = 0; z < array.length; z++) {
	         if (z > 0) {
	            System.out.print(", ");
	         }
	         System.out.print(array[z]);
	      }
		System.out.println(" i " + i +" low " + low);
		return i;
	}
}



