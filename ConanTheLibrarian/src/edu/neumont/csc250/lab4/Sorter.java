package edu.neumont.csc250.lab4;

import java.util.List;



public interface Sorter<T extends Comparable<T>> {
	/**
	 * Sorts a list in-place (meaning that it will not return a new array but instead modify the contents of the array passed in.)
	 * 
	 * @param toBeSorted
	 */
	void sort(List<T> toBeSorted);

}
