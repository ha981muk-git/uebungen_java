/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
/*
 * Read class will read elements form a shared list
 */
import java.util.List;
class Read {

	private List<String> list;

	// Receive shared list in constructor
	Read(List<String> list) {
		this.list = list;
	}

	// Read the items
	public void readItem() {

		for (String item : list) {
			System.out.println(item.toString());
		}

	}

}