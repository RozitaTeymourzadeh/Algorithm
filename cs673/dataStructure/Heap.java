/**
 * 
 */
package dataStructure;

import java.util.Arrays;

/**
 * Design MinHeap
 * Taken from Hacker Rank
 * @author Rozita Teymourzadeh
 *
 */
public class Heap {
	private int capacity = 10;
	private int size = 0;
	int[] items = new int[capacity];

	/* Parent, Left , right utility */
	public int getLeftChildIndex(int parentIndex) {
		return 2 * parentIndex + 1;
	}

	public int getRightChildIndex(int parentIndex){
		return 2 * parentIndex + 2;
	}

	public int getParentIndex(int childIndex) {
		return (childIndex - 1) / 2;
	}

	public boolean hasLeftChild(int index) {
		return getLeftChildIndex(index) < size; 
	}

	public boolean hasRightChild(int index) {
		return getRightChildIndex(index) < size;
	}

	public boolean hasParent(int index) {
		return getParentIndex(index) >= 0;
	}

	public int leftChild(int index) {
		return items[getLeftChildIndex(index)];
	}

	public int rightChild(int index) {
		return items[getRightChildIndex(index)];
	}

	public int parent(int index) {
		return items[getParentIndex(index)];
	}

	/* Swap */
	public void swap(int indexOne, int indexTwo) {
		int temp = items[indexOne];
		items[indexOne] = items[indexTwo];
		items[indexTwo] = temp;
	}

	/* Array capacity check */
	public void ensureExtraCapacity() {
		if(size == capacity) {
			items = Arrays.copyOf(items, capacity * 2);
			capacity *= 2;
		}
	}

	/* peek function to take element in root parent */
	public int peek() {
		if (size == 0) throw new IllegalStateException();
		return items[0];
	}

	/* poll function to return root value and replace leaf to the root node */
	public int poll() {
		if (size == 0) throw new IllegalStateException();
		int item = items[0];
		items[0] = items[size - 1];
		size --;
		heapifyDown();
		System.out.println("polled item is :" + item);
		return item;
	}

	/* add function to insert element from the root*/
	public void add(int item) {
		ensureExtraCapacity();
		items[size] = item;
		size ++;
		heapifyUp();
	}

	/* heapifyUp to bubble element to upper length of heap based on the order*/
	public void heapifyUp() {
		int index = size - 1;
		while(hasParent(index) && parent(index) > items[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}

	public void heapifyDown() {
		int index = 0;
		while(hasLeftChild(index)){
			int smallerChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
				smallerChildIndex = getRightChildIndex(index);
			}
			if (items[index] < items[smallerChildIndex]) {
				break;
			} else {
				swap(index, smallerChildIndex);
			}
			index = smallerChildIndex;
		}
	}
	public void printHeap() {
		System.out.println(Arrays.toString(items));
	} 

	public static void main(String[] args) {

		Heap heap = new Heap();
		heap.add(10);
		heap.printHeap();
		heap.add(3);
		heap.printHeap();
		heap.add(11);
		heap.printHeap();
		heap.add(4);	
		heap.printHeap();
		heap.add(10);
		heap.printHeap();
		heap.add(3);
		heap.printHeap();
		heap.add(1);
		heap.printHeap();
		heap.add(19);	
		heap.printHeap();
		heap.add(13);
		heap.printHeap();
		System.out.println("Min Heap Implemented!!");
	}
}
