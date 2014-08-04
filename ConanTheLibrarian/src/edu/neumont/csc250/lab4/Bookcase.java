package edu.neumont.csc250.lab4;

import java.util.ArrayList;
import java.util.List;

public class Bookcase {
	protected List<Bookshelf> shelves = new ArrayList<Bookshelf>();
	protected int shelfWidth;
	
	public Bookcase(int numberOfShelves, int shelfWidth) {
		for ( int i = 0; i < numberOfShelves; i++ ) {
			shelves.add(new Bookshelf(shelfWidth));
		}
		this.shelfWidth = shelfWidth; 
	}
	
	public int getNumberOfShelves() {
		return shelves.size();
	}
	
	public int getShelfWidth() {
		return shelfWidth;
	}
	
	public Bookshelf getBookshelf(int shelf) {
		return shelves.get(shelf);
	}
	
	public boolean addBook(int shelf, Book book) {
		return shelves.get(shelf).addBook(book);
	}
	
	public boolean removeBook(int shelf, Book book) {
		return shelves.get(shelf).removeBook(book);
	}
	
	public boolean isFull() {
		for ( Bookshelf shelf : shelves ) {
			if ( !shelf.isFull() ) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isEmpty() {
		for ( Bookshelf shelf : shelves ) {
			if ( !shelf.isEmpty() ) {
				return false;
			}
		}
		return true;
	}
	
	public int scoreShelfEvenness() {
		int evenness = 0;
		for ( Bookshelf shelf : shelves ) {
			evenness += shelf.getSpaceLeft() * shelf.getSpaceLeft();
		}
		return evenness;
	}
	
	public String toString() {
		String toString = "";
		for ( Bookshelf shelf : shelves ) {
			toString += shelf + "\n";
		}
		return toString;
	}
}