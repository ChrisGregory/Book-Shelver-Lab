package edu.neumont.csc250.lab4;

import java.util.List;

public class GreedyShelver implements Shelver{

	@Override
	public void shelveBooks(Bookcase bookcase, List<Book> books) {
		QuickSorter qs = new QuickSorter();
		books = qs.quicksort(books);
		
		//Order books by width ascending.
		
		//int currentShelf = 0;
		//for each book,
			//try to put the book on currentShelf.
			//if the book doesn't fit,
			//move to the next shelf and try again.
		
		int currentShelf = 0;
		for(Book book : books){
			if(!(bookcase.getBookshelf(currentShelf).getSpaceLeft() > book.getWidth())){
				currentShelf++;
			}
			bookcase.getBookshelf(currentShelf).addBook(book);
		}	
	}
}
