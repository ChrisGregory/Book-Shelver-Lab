package edu.neumont.csc250.lab4;

import java.util.ArrayList;
import java.util.List;

public class MergeSorter<T extends Comparable> implements Sorter{

	@Override
	public void sort(List toBeSorted) {
		System.out.println(toBeSorted.toString());
		toBeSorted = mergeSort(toBeSorted);
		System.out.println(toBeSorted.toString());
	}
	
	public List<T> mergeSort(List<T> input){
		if(input.size() <= 1){
			return input;
		}
		T midPoint = input.get(input.size()/2);
		List<T> left = new ArrayList<T>();
		List<T> right = new ArrayList<T>();
		for(T item : input){
			if(item.compareTo(midPoint) < 0){
				left.add(item);
			} else {
				right.add(item);
			}
		}
		left = mergeSort(left);
		right = mergeSort(right);
		return merge(left, right);
	}
	
	public List<T> merge(List<T> left, List<T> right){
		List<T> result = null;
		int leftIndex = 0;
		int rightIndex = 0;
		while(leftIndex + 1 <= left.size() || rightIndex + 1 <= right.size()){
			if(leftIndex + 1 <= left.size() && rightIndex + 1 <= right.size()){
				if(left.get(leftIndex).compareTo(right.get(rightIndex)) <= 0){
					result.add(left.get(leftIndex));
					leftIndex++;
				} else {
					result.add(right.get(rightIndex));
					rightIndex++;
				}
			} else if(leftIndex + 1 <= left.size()){
				result.add(left.get(leftIndex));
				leftIndex++;
			} else if(rightIndex + 1 <= right.size()){
				result.add(right.get(rightIndex));
				rightIndex++;
			}
		}	
		return result;
	}
}
