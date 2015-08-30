/**
 * 
 */
package com.mjhajj.sort.comparison;

import java.lang.reflect.Array;

/**
 * @author MandeepSingh
 *
 */
public class MergeSort <T extends Comparable<T>> implements ISort<T>{

	private T[] objCollections;

	/**
	 * @param objCollections
	 */
	public MergeSort(T[] objCollections) {
		this.objCollections = objCollections;
		//this.c = c;
	}
	
	@SuppressWarnings("unchecked")
	private T[] merge(T[] left, T[] right){
		
		int leftLength = left.length;
		int rightLength = right.length;
		T[] result = (T[]) Array.newInstance(left.getClass().getComponentType(),(leftLength+rightLength));
		
		int i=0,j=0,k=0;
		while(i< leftLength && j < rightLength){
			if(left[i].compareTo(right[j]) == 1){
				result[k] = right[j];
				k++;
				j++;
			}
			else{
				result[k] = left[i];
				k++;
				i++;
			}
		}
		while(i < leftLength){
			result[k] = left[i];
			k++;
			i++;
		}
		while(j < rightLength){
			result[k] = right[j];
			k++;
			j++;
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	private T[] sort(T[] input){
	
		if(input.length <2){
			return input;
		}
		int mid = input.length/2;
			
		T[] left = (T[]) Array.newInstance(input.getClass().getComponentType(),mid);
		T[] right = (T[]) Array.newInstance(input.getClass().getComponentType(), input.length-mid);
		
		for(int i=0;i<mid;i++){
			left[i] = input[i];
		}
				
		for(int i=mid;i<input.length;i++){
			right[i-mid] = input[i];
		}
		left = sort(left);
		right = sort(right);
		T[] results = merge(left, right);
		
		return results;
	}
	
	public T[] sort(){
		try{
			objCollections = sort(objCollections);
		}catch(Exception e){
			System.out.println("Error message :"+e.getMessage());
		}
		return objCollections;
	}
}
