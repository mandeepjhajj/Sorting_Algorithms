/**
 * 
 */
package com.mjhajj.sort.comparison;

/**
 * @author MandeepSingh
 *
 */
public class HeapSort<T extends Comparable<T>> implements ISort<T>{

	private T[] objCollections;
	private int N=0;

	/**
	 * @param objCollections
	 */
	public HeapSort(T[] objCollections) {
		this.objCollections = objCollections;
		this.N = objCollections.length;
	}

	private boolean less(int i, int j){
		i--;j--;
		return objCollections[i].compareTo(objCollections[j]) < 0;
	}
	
	private void exchange(int i, int j){
		i--;j--;
		T temp = objCollections[i];
		objCollections[i]=objCollections[j];
		objCollections[j]=temp;
	}
	
	private void sink(int k){
		while(2*k <= N){
			int j = 2*k;
			
			if(j<N && less(j,j+1)) j++;
			if(!less(k,j)) break;
			exchange(k,j);
			k=j;
		}
	}
	
	@Override
	public T[] sort() {
				
		for(int i= N/2;i>=1;i--){
			sink(i);
		}
		while(N>1){
			exchange(1,N--);
			sink(1);
		}
		return objCollections;
	}
}
