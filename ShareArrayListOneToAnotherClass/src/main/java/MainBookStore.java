/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
import java.util.ArrayList;
class MainBookStore {
	private ArrayList<Book> books;

	public ArrayList<Book> getAllBooks() {
		return books;
	}

	public MainBookStore() {
		books = new ArrayList<Book>();
	}

	public void add(Book object) {
		books.add(object);
	}
}