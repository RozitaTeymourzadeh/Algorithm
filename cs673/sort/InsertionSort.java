/**
 * 
 */
package sort;

import java.util.Arrays;

/**
 * Insertion Sort Method
 * Best Case = O(n)
 * Average Case = O(n^2)
 * Worst Case = O(n^2) 
 * Worst Case Space = O(n) 
 * 
 * @author rozitateymourzadeh
 *
 */
public class InsertionSort {

	/**
	 * Main method to drive Insertion sort 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] list = {7, 132, 3, 42, 17, 78, 99, 23, 27, 61};
		insertionSort(list);
		System.out.println(Arrays.toString(list));
	}

	private static void insertionSort(int[] a) {
		int i = 1;
		int temp, j;
		int counterA = 0;
		int counterB = 0;
		while(i < a.length) {
			temp = a[i];
			j = i;
			// The comparison will stop in the first place that 
			//temp is NOT smaller than previous element. So loop may stop before completing one full iteration. 

			while((j > 0) && (temp > a[j - 1])){
				counterB++;
				a[j] = a[j - 1];
				j--; 		
			}
			if(temp >= a[i - 1]) {
				counterA++;
			}
			a[j] = temp;
			i++;
		}
		System.out.println(counterA + counterB);
		}
}
