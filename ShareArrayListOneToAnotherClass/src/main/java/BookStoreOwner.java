/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class BookStoreOwner {

	public static void main(String[] args) {
		// Add book objects to the ArrayList of the storage class
		MainBookStore s = new MainBookStore();
		s.add(new Book("OOP Concepts Booster", 1));
		s.add(new Book("IT Jobs Made Easy for Freshers", 2));
		s.add(new Book("Head First Design Patterns", 3));

		// Create object of new book store
		NewBookStore bs = new NewBookStore();
		// Get book list to the new Store from main store;
		bs.getAllBooksFromMainStore(s.getAllBooks());
		bs.printBooks();

	}
}