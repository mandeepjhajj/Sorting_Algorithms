/**
 * 
 */
package com.mjhajj.sort.comparison;

/**
 * @author MandeepSingh
 *
 */
public class MaxPQ<T extends Comparable<T>> implements IMaxPriorityQueue<T> {

	private T[] pq;
	private int N;
	
	
	/**
	 * @param N
	 */
	@SuppressWarnings("unchecked")
	public MaxPQ(int N) {
		this.pq = (T[]) new Comparable[N+1];
	}

	/* Return true if first parameter is small than second parameter*/
	private boolean less(int i, int j){
		return pq[i].compareTo(pq[j]) < 0; 	
	}
	
	/*Swap values*/
	private void exchange(int i, int j){
		T temp = pq[i];
		pq[i] = pq[j];
		pq[j] = temp;
	}
	
	private void swim(int k) {
		while(k>1 && less(k/2,k)){
			exchange(k/2,k);
			k= k/2;
		}
		
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
	public void insert(T item) {
		
		N++;
		pq[N]= item;
		swim(N);
	}

	@Override
	public void deleteMax() {
	
		exchange(1,N--);
		pq[N+1]=null;
		sink(1);
	}

	@Override
	public T max() {
		T maxValue = pq[1];
		return maxValue;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return N == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return N;
	}

	
}
