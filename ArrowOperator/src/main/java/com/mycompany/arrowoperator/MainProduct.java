/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrowoperator;

/**
 *
 * @author harsh
 */
package javaexample;
import java.util.ArrayList;  
import java.util.List;  
import java.util.stream.Stream;   
// Product belongs to this class
public class MainProduct{  
    public static void main(String[] args) {  
        List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung S5",17000));  
        list.add(new Product(3,"Iphone 12",100500));  
        list.add(new Product(2,"Sony Xperia",25000));  
          
        // using arrow to filter data  
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 17000);
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  
    }
}