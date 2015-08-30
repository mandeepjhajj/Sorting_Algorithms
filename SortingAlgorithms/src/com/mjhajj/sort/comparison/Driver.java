/**
 * It instantiate the different types of sorting classes and notes the running time.
 */
package com.mjhajj.sort.comparison;

/**
 * @author MandeepSingh
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer params[] = {100,50,40,12,1,0,20,10,33};
		ISort<Integer> selectionSort = new SelectionSort<Integer>(params);
		long startS = System.currentTimeMillis();
		Integer outputS[] = selectionSort.sort();
		long endS = System.currentTimeMillis();
		
		System.out.println("Selection Sort");
		System.out.print("Sorted array is :");
		for(int a:outputS)
			System.out.print(a+", ");
		System.out.println("\nTime taken in mili sec:"+ (endS-startS));
		
		Integer paramI[] = {100,50,40,12,1,0,20,10,33};
		ISort<Integer> insertionSort = new InsertionSort<Integer>(paramI);
		long startI = System.currentTimeMillis();
		Integer outputI[] = insertionSort.sort();
		long endI = System.currentTimeMillis();
		
		System.out.println("\nInsertion Sort");
		System.out.print("Sorted array is :");
		for(int a:outputI)
			System.out.print(a+", ");
		System.out.println("\nTime taken in mili sec:"+ (endI-startI));
		
		Integer paramM[] = {100,50,40,12,1,0,20,10,33};
		ISort<Integer> mergeSort = new MergeSort<Integer>(paramM);
		long startM = System.currentTimeMillis();
		Integer outputM[] = mergeSort.sort();
		long endM = System.currentTimeMillis();
		
		System.out.println("\nMerge Sort");
		System.out.print("Sorted array is :");
		for(int a:outputM)
			System.out.print(a+", ");
		System.out.println("\nTime taken in mili sec:"+ (endM-startM));
		
		Integer paramQ[] = {100,50,40,12,1,0,20,10,33};
		ISort<Integer> quickSort = new QuickSort<Integer>(paramQ);
		long startQ = System.currentTimeMillis();
		Integer outputQ[] = quickSort.sort();
		long endQ = System.currentTimeMillis();
		
		System.out.println("\nQuick Sort");
		System.out.print("Sorted array is :");
		for(int a:outputQ)
			System.out.print(a+", ");
		System.out.println("\nTime taken in mili sec:"+ (endQ-startQ));
		
		Integer paramQf[] = {100,50,40,12,1,0,20,10,33};
		QuickSort<Integer> quickSortf = new QuickSort<Integer>(paramQf);
		long startQf = System.currentTimeMillis();
		Integer outputQf[] = quickSortf.sort();
		long endQf = System.currentTimeMillis();
		
		System.out.println("\nFast Quick Sort");
		System.out.print("Sorted array is :");
		for(int a:outputQf)
			System.out.print(a+", ");
		System.out.println("\nTime taken in mili sec:"+ (endQf-startQf));
		
		System.out.println("\nPriority Queue Demo");
		Integer paramPQ[] = {100,50,40,12,1,0,20,10,33};
		MaxPQ<Integer> priorityQueue = new MaxPQ<Integer>(paramPQ.length);
		long startPQ = System.currentTimeMillis();
		for(int a: paramPQ){
			priorityQueue.insert(a);
		}
		int i=0;
		while(!priorityQueue.isEmpty()){
			Integer maxelement = priorityQueue.max();
			System.out.print("\nMaximum element #"+ i +": "+maxelement);
			priorityQueue.deleteMax();
			i++;
		}
		long endPQ = System.currentTimeMillis();
		System.out.println("\nTime taken in mili sec:"+ (endPQ-startPQ));
		
		Integer paramH[] = {100,50,40,12,1,0,20,10,33};
		HeapSort<Integer> heapSort = new HeapSort<Integer>(paramH);
		long startH = System.currentTimeMillis();
		Integer outputH[] = heapSort.sort();
		long endH = System.currentTimeMillis();
		
		System.out.println("\nHeap Sort");
		System.out.print("Sorted array is :");
		for(int a:outputH)
			System.out.print(a+", ");
		System.out.println("\nTime taken in mili sec:"+ (endH-startH));
	}

}
