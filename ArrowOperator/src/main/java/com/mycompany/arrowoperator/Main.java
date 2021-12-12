/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrowoperator;

/**
 *
 * @author harsh
 */
// Drawable class belongs to this Class
public class Main {
    public static void main(String[] args) {
        int width = 20;  
        // arrow operator  
        Drawable d2=()->{  
            System.out.println("Drawing width:  "+width);  
        };  
        d2.draw();  
    }
}
