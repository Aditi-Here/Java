package Question2;

import java.util.ArrayList;

public class Book {
	private String title;
	private String author;
	private int isbn;
		
	public Book(String title, String author, int isbn) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	@Override
	public String toString() 
	{
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
	}
	
	void displayBookDetails(Book b)
	{
		System.out.println(b);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

}
