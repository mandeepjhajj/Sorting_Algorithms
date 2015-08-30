/**
 * Selection Sort Working - We keep track of minimum element as we iterate through collection.
 * We then swap the minimum element with the current element.
 * 
 * Time Complexity - O(n2)
 *
 */
package com.mjhajj.sort.comparison;

public class SelectionSort<T extends Comparable<T>> implements ISort<T> {

	private T[] objCollection;
		
	/**
	 * @param objCollection
	 */
	public SelectionSort(T[] objCollection) {
		this.objCollection = objCollection;
	}

	@Override
	public T[] sort() {
		
		try{
			if(objCollection != null){
				int min=0;
				for(int i=0;i<objCollection.length-1;i++){
					min = i;
					for(int j= i+1;j<objCollection.length;j++){
						//CompareTo method returns 1 if calling value is greater than argument
						if(objCollection[min].compareTo(objCollection[j]) == 1){
							min = j;
						}
					}
					if(min != i){
						T temp = objCollection[min];
						objCollection[min] = objCollection[i];
						objCollection[i] = temp;		
					}
				}
			}	
		}catch(Exception e){
			System.out.println("Error occured"+e.getMessage());
		}
		
		return objCollection;
	}
	

}
