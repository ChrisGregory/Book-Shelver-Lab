package edu.neumont.csc250.lab4;

public class Book implements Comparable<Book> {
	protected String title;
	protected int width;
	protected int height;
	
	public Book(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public String toString() {
		return title + ": (width, height) = (" + width + "," + height + ")";
	}

	@Override
	public int compareTo(Book o) {
		return new Integer(this.height).compareTo(o.height);
	}
}
