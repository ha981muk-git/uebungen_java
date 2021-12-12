/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.copyarraylist;

/**
 *
 * @author harsh
 */

    
// Java program to demonstrate Copying of Array
// using clone() method

// Main class
public class Method_03 {

	// Main driver method
	public static void main(String[] args)
	{
		// Input array a[]
		int a[] = { 1, 8, 3 };

		// Copying elements of a[] to b[]
		int b[] = a.clone();

		// Changing b[] to verify that
		// b[] is different from a[]
		b[0]++;

		// Display message for better readability
		System.out.println("Contents of a[] ");

		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		// Display message for better readability
		System.out.println("\n\nContents of b[] ");

		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
	}
}

