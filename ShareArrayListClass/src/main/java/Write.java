/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */

/*
 * This class will add elements to 
 * a shared list that is created with an Arraylist.
 */

import java.util.List;
class Write {

	private List<String> list;

	// Receive a shared list in constructor
	Write(List<String> list) {
		this.list = list;
	}

	// add items
	public void addItem(String item) {

		this.list.add(item);
	}
}
