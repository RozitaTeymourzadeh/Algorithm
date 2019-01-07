/**
 * 
 */
package dataStructure;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Write a code to find odd appearance of element in the array
 * Only one value has odd appearance
 * @author rozitateymourzadeh
 *
 */
public class HashMapDS {

	public HashMap<Integer, Integer> findOddValue(int[] input) {
		if (input == null || input.length == 0) {
			System.out.println("The input data is invalid!");
		}
		HashMap<Integer, Integer> result = new HashMap<Integer, Integer>(); 
		for (int i = 0; i < input.length ; i++) {
			if(result.containsKey(input[i])) {
				result.remove(input[i]);
			} else {
				result.put(input[i], 1);
			}
		}
		return result;
	}

	public static void main (String[] args) {
		int[] input = {1, 2, 3, 6, 1, 2, 3};
		System.out.println("Input array is: " + Arrays.toString(input));
		HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
		HashMapDS hmds = new HashMapDS();
		result = hmds.findOddValue(input);
		System.out.println("The value with Odd times appearance is: " + result.keySet().toString());	
	}
}
