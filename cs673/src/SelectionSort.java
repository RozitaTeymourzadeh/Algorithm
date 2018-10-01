/**
 * 
 */
package src;

import java.util.Arrays;

/**
 * Selection Sort Method
 * Algorithm		Time Complexity			Space Complexity
 * 					Best	Average	Worst	Worst
 * Selection Sort	Ω(n^2)	Θ(n^2)	O(n^2)	O(1)
 * @author rozitateymourzadeh
 *
 */
public class SelectionSort {

	/**
	 * Main method to drive selection sort 
	 */
	public static void main(String[] args) {
		int[] list = {7, 132, 3, 42, 17, 78, 99, 23, 27, 61};
		selectionSort(list);
		System.out.println(Arrays.toString(list));
	}

	/*
	 * Selection Sort Model
	 * Number of comparison = 45 times = 9+8+7+6+5+4+3+2+1
	 * Algorithm descriotion: It iterates through the 10 elements and conducts 9 comparison. 
	 * index holds the index of maximum element in one iteration.
	 * Second iteration starts from outer loop with 9 elements in second iteration. 
	 * */
	public static void selectionSort(int[] a) {
		int index;
		int temp;
		int counter = 0;

		for(int i = 0; i <= a.length-1; i++) {
			index = i;
			for(int j = i + 1; j < a.length ; j++) {
				counter++;
				if(a[j] > a[index]) {
					index = j;
				}
			}
			temp = a[index];
			a[index] = a[i];
			a[i]= temp;	
		}
		System.out.println(counter);
	}
}

