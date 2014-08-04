package edu.neumont.csc250.lab4;

import java.util.List;


public interface Shelver {
	/**
	 * Takes a list of books and adds them to the bookcase.
	 * 
	 * @param bookcase
	 * @param books
	 */
	void shelveBooks(Bookcase bookcase, List<Book> books);
}
