/**
 * 
 */
package com.mjhajj.sort.comparison;

/**
 * @author MandeepSingh
 *
 */
public interface IMaxPriorityQueue<T extends Comparable<T>> {
	
	public void insert(T item);
	public void deleteMax();
	public T max();
	public boolean isEmpty();
	public int size();

}
