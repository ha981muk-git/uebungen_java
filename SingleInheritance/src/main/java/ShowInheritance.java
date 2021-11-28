/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class ShowInheritance {
    public static void main(String[] args){
        B obj = new B();
        obj.methodA();
        obj.methodB();
        
        System.out.println("");
        System.out.println("");
        
        C object = new C();
        object.methodA();
        object.methodB();
        object.methodC();
        System.out.println("");
        System.out.println(object.v1);
    }
}
