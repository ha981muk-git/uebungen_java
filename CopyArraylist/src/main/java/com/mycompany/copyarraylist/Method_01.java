/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.copyarraylist;

import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author harsh
 */
// A Java program to demonstrate that simply
// assigning one array reference is incorrect
public class Method_01 {
    public static void main(String[] args)
    {
        int a[] = { 1, 8, 3 };
 
        // Create an array b[] of same size as a[]
        int b[] = new int[a.length];
 
        // Doesn't copy elements of a[] to b[],
        // only makes b refer to same location
        b = a;
 
        // Change to b[] will also reflect in a[]
        // as 'a' and 'b' refer to same location.
        b[0]++;
 
        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
 
        System.out.println("\n\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();
//        3. The Collections Class
        List<Integer> source = Arrays.asList(1,2,3);
        List<Integer> dest = Arrays.asList(4,5,6,7,8);
        Collections.copy(dest, source);
        System.out.println(dest.toString());
        System.out.println();
       
        
        List<Integer> list = Arrays.asList(1,2,3, 8, 3, 45, 56, 9);
        List<Integer> copy;
        copy = list.stream().skip(1).collect(Collectors.toList());
        List<String> strings = Arrays.asList("1","2","3", "8", "3", "45", "56", "9");
        List<String> copy_strings;
//        copy_strings = strings.stream().filter(strings->strings.length()>4).collect(Collectors.toList());
    }
}