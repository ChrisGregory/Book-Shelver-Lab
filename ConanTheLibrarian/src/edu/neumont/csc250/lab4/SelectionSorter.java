package edu.neumont.csc250.lab4;

import java.util.ArrayList;
import java.util.List;

public class SelectionSorter<T extends Comparable> implements Sorter {

	@Override
	public void sort(List toBeSorted) {
		System.out.println(toBeSorted.toString());
		toBeSorted = selectionSort(toBeSorted);
		System.out.println(toBeSorted.toString());
	}
	
	public List<T> selectionSort(List<T> input){
		for(int i = 0; i < input.size(); i++){
			int smallestIndex = i;
			for(int j = i+1; j < input.size(); j++){
				if(input.get(j).compareTo(input.get(smallestIndex)) < 0){
					smallestIndex = j;
				}
			}
			if(smallestIndex != i){
				T temp = input.get(smallestIndex);
				input.set(smallestIndex, input.get(i));
				input.set(i, temp);
			}
		}
		return input;
	}
}
