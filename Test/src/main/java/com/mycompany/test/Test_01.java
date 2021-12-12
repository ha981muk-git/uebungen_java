/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.ArrayList;

/**
 *
 * @author harsh
 */
public class Test_01 extends Test_01A {
    
    
    public static void main(String[] args) {
    ArrayList <Test_01> m  = new ArrayList<>();
    Test_01 a  = new Test_01();
    Test_01 b  = new Test_01();
    Test_01 c  = new Test_01();
    Test_01 d  = new Test_01();
    Test_01 e  = new Test_01();
    Test_01 f  = new Test_01();
    Test_01B n = new Test_01B();
    
    a.v = 1;
    b.v = 23;
    c.v = 25;
    d.v = 67;
    e.v = 345;
    f.v = 2324;
    
    
    m.add(a);
    m.add(b);
    m.add(c);
    m.add(d);
    m.add(e);
    m.add(f);
    
    n.display(m);
        
    }
    
    
}
