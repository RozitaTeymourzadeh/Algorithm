/**
 * 
 */
package sort;

/**
 * @author rozitateymourzadeh
 *
 */
public class QuckSortDualPivot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void quickSortDualPointer(int[] array, int low, int high) {
		
		int pivotIndex = partition(array, low, high);
		quickSortDualPointer(array, low, pivotIndex - 1);
		quickSortDualPointer(array, pivotIndex + 1 , high);
	}
	
	public int partition(int[] array, int low, int high) {
		int pivotIndex = 0;
		// to be implemented
		return pivotIndex;
	}

}
