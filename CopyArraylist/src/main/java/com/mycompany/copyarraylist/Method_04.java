/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.copyarraylist;

/**
 *
 * @author harsh
 */
public class Method_04 {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input array
        int a[] = { 1, 8, 3 };
 
        // Creating an array b[] of same size as a[]
        int b[] = new int[a.length];
 

        
//Parameters System.arraycopy()
//src − This is the source array.
//srcPos − This is the starting position in the source array.
//dest − This is the destination array.
//destPos − This is the starting position in the destination data.
//length − This is the number of array elements to be copied.

        // Copying elements of a[] to b[]
        System.arraycopy(a, 0, b, 0, 3);
 
        // Changing b[] to verify that
        // b[] is different from a[]
        b[0]++;
 
        // Display message only
        System.out.println("Contents of a[] ");
 
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
 
        // Display message only
        System.out.println("\n\nContents of b[] ");
 
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}
