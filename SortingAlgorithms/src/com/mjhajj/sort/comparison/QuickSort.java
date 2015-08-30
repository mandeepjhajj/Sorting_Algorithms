/**
 * 
 */
package com.mjhajj.sort.comparison;

/**
 * @author MandeepSingh
 *
 */
public class QuickSort <T extends Comparable<T>> implements ISort<T>{

	private T[] objCollections;

	/**
	 * @param objCollections
	 */
	public QuickSort(T[] objCollections) {
		this.objCollections = objCollections;
	}


	private void exchange(T[] input, int i, int j){
		T temp = input[i];
		input[i]= input[j];
		input[j]= temp;
	}
	
	private int partition(T[] input, int low, int high){
		int i = low, j = high+1;
		T v = input[low];
		
		while(true){
			/*Stop when we find a element greater than partitioning element*/
			while(input[++i].compareTo(v) < 0){
				if(i == high)
					break;
			}
			/*Stop when we find the element less than partitioning element*/
			while(input[--j].compareTo(v)> 0){
				if(j == low){
					break;
				}
			}
			if(i>=j) break;
			exchange(input, i, j);
		}
		exchange(input, low, j);
		return j;
	}
	
	private void sort(T[] input,int low, int high){
		if(high <= low)
			return;
			
		int j = partition(input, low, high);
		sort(input, low, j-1);
		sort(input, j+1, high);
		
	}
	
	@Override
	public T[] sort() {
		try{
			sort(objCollections,0,objCollections.length-1);
		}catch(Exception e){
			System.out.println("\nError Message : "+e.getMessage());
		}
		return objCollections;
	}
	
	/* 3 way Partition */
	private void fastSort(T[] input, int low, int high){
		
		if(high <=low) return;
		
		int lt = low, i =low+1, gt = high;
		T v = input[low];
		while(i<=gt){
			
			int compValue = input[i].compareTo(v);
			if( compValue < 0) exchange(input, lt++, i++);
			else if( compValue > 0) exchange(input, --gt, i);
			else i++;
		}
		fastSort(input, low, lt-1);
		fastSort(input, gt+1, high);
	}
	
	public T[] fastSort(){
		try{
			fastSort(objCollections,0,objCollections.length-1);
		}catch(Exception e){
			System.out.println("\nError message :"+e.getMessage());
		}
		return objCollections;
	}
	
}
