package edu.neumont.csc250.lab4;

import java.util.ArrayList;
import java.util.List;

public class QuickSorter<T extends Comparable> implements Sorter {

	@Override
	public void sort(List toBeSorted) {
		System.out.println(toBeSorted.toString());
		toBeSorted = quicksort(toBeSorted);
		System.out.println(toBeSorted.toString());
	}
	
	public List<T> quicksort(List<T> input){
		if(input.size() <= 1){
			return input;
		}
		T pivotPoint = input.get(input.size()/2);
		input.remove(pivotPoint);
		List<T> left = new ArrayList();
		List<T> right = new ArrayList();
		for(T item : input){
			if(item.compareTo(pivotPoint) <= 0){
				left.add(item);
			} else {
				right.add(item);
			}
		}
		List<T> result = new ArrayList();
		result.addAll(quicksort(left));
		result.add(pivotPoint);
		result.addAll(quicksort(right));
		return result;
	}
}
