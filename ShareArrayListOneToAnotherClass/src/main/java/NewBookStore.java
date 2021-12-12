/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */

import java.util.ArrayList;
class NewBookStore {

	private ArrayList<Book> books;

	public void getAllBooksFromMainStore(ArrayList<Book> list) {
		// first syntax
		this.books = list;
		// Second syntax
		// this.books = (ArrayList<Book>) list.clone();

	}

	public void printBooks() {
		for (Book b : this.books) {
			System.out.println(b.getName() + " " + b.getId());
		}
	}
}
