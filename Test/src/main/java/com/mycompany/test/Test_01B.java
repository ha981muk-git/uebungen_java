/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harsh
 */
public class Test_01B extends Test_01A {
    public ArrayList<Test_01> test;
    
    public void display(List<Test_01> test1){
        for(int i=0;i<test1.size();i++){
            System.out.println(test1.get(i).v);
            
        }
        
    }
}
