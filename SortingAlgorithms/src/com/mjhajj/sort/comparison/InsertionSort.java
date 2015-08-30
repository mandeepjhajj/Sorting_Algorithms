/**
 * Insertion sort working- It logically divide array in two parts.
 * Sorted and Unsorted, we start with second element and goes up to last element.
 * We check if second element is smaller than the elements before it, and if answer is yes
 * then we move the elements of sorted part to one place further until we find the correct 
 * position for our current element. 
 * 
 * Time Complexity - O(n2)
 * Best Case - O(n)
 */
package com.mjhajj.sort.comparison;

/**
 * @author MandeepSingh
 *
 */
public class InsertionSort <T extends Comparable<T>> implements ISort<T>{

	private T[] objCollections;
	
	public InsertionSort(T[] objCollections){
		this.objCollections= objCollections;
	}
	
	@Override
	public T[] sort() {
		
		for(int i=1;i<objCollections.length;i++){
			T element = objCollections[i];
			int j = i;
			//CompareTo method returns 1 if calling value is greater than argument
			while(j>0 && (objCollections[j-1].compareTo(element)) ==1 ){
				objCollections[j]= objCollections[j-1];
				j= j-1;
			}
			objCollections[j]= element;
		}
		
		return objCollections;
	}

}
