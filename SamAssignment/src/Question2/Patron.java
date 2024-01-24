package Question2;

import java.util.ArrayList;
import java.util.List;

public class Patron {

	private String name;
	private int id;
	private List<Book> booksBorrowed = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public List<Book> getBooksBorrowed() {
		return booksBorrowed;
	}
	public void setBooksBorrowed(List<Book> booksBorrowed) {
		this.booksBorrowed = booksBorrowed;
	}
	@Override
	public String toString() {
		return "Patron [name=" + name + ", id=" + id + ", booksBorrowed=" + booksBorrowed + "]";
	}
	
	

	public Patron(String name, int id, List<Book> booksBorrowed) {
		super();
		this.name = name;
		this.id = id;
		this.booksBorrowed = booksBorrowed;
	}
	
	public Patron(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	void displayPatronDetails(Patron p)
	{
		System.out.println(p);
	}
}
