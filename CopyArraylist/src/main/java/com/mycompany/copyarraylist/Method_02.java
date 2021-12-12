/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.copyarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author harsh
 */
public class Method_02 {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Input array a[]
        int a[] = { 1, 8, 3 };
 
        // Create an array b[] of same size as a[]
        int b[] = new int[a.length];
 
        // Copying elements of a[] to b[]
        for(int i = 0; i < a.length; i++)
            b[i] = a[i];
 
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
        
        
        
//   2  The List addAll()    
        List<Integer> list = Arrays.asList(1,2,3);
        List<Integer> copy = new ArrayList<>();
        copy.addAll(list);
        System.out.println(copy.toString());
    }
}
