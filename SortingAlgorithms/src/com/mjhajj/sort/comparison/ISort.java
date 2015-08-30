/**
 * Interface providing sort functionality along with generic type
 * Condition for generic type - Type should implement Comparable interface 
 * which means that type objects can be compared and sorted
 */
package com.mjhajj.sort.comparison;

/**
 * @author MandeepSingh
 *
 */
public interface ISort<T extends Comparable<T>>{
  public T[] sort();
}
