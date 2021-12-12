/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
// Test class.
// Class Write and 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Sample{
	
	public static void main(String[] args) {

		// Use synchronized list to avoid exception
		List<String> list = Collections
				.synchronizedList(new ArrayList<String>());

		Write w = new Write(list);
		Read r = new Read(list);

		w.addItem("Apple");
		w.addItem("Mange");

		r.readItem();
	}
}