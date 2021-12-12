/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.copyarraylist;

/**
 *
 * @author harsh
 */

    
// Java program to demonstrate array
// copy using Arrays.copyOfRange()

// Importing Arrays class from utility package
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Main class
public class Method_06 {

	// Main driver method
	public static void main(String[] args)
	{
		// Custom input array
		int a[] = { 1, 8, 3, 5, 9, 10 };

		// Creating an array b[] and
		// copying elements of a[] to b[]
		int b[] = Arrays.copyOfRange(a, 2, 6);

		// Changing b[] to verify that
		// b[] is different from a[]

		// Iterating over array a[]
		System.out.println("Contents of a[] ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		// Iterating over array b[]
		System.out.println("\n\nContents of b[] ");
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
                
//1. The Constructor Way : -> Just pass it another List object to create a new copy out of it.
                List<Integer> list = Arrays.asList(1,2,3);
                List<Integer> copy = new ArrayList<>(list);
                System.out.println(copy.toString());
                for(int i=0;i<list.size();i++){
                    System.out.println(copy.get(i));
                }
                
                
              

   	}
}
