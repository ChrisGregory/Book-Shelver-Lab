package edu.neumont.csc250.lab4;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
	protected List<Book> books = new ArrayList<Book>();
	protected int width;
	protected int spaceLeft;
	
	public Bookshelf(int width) {
		this.width = width;
		this.spaceLeft = width;
	}
	
	public boolean isEmpty() {
		return books.isEmpty();
	}
	
	public boolean isFull() {
		return spaceLeft == 0;
	}
	
	public boolean addBook(Book book) {
		if ( book.getWidth() <= spaceLeft && books.add(book) ) {
			spaceLeft -= book.getWidth();
			return true;
		}
		return false;
	}
	
	public boolean removeBook(Book book) {
		if ( books.remove(book) ) {
			spaceLeft += book.getWidth();
			return true;
		}
		return false;
	}
	
	public int getShelfWidth() {
		return width;
	}
	
	public int getSpaceLeft() {
		return spaceLeft;
	}
	
	public String toString() {
		String toString = "=============================================\n";
		for ( Book book : books ) {
			toString += book + " | ";
		}
		toString += "\n=============================================";
		return toString;
	}
}
