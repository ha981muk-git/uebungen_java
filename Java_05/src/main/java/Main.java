/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class Main {
    
    public static void main(String[] args){
        Numbers num      = new Numbers(); //  instantiate Outer Class
        
        // this two lines are useful when inner and outer class are public
        //Numbers.FloatNumber fnum = num.new FloatNumber(); //  instantiate Inner Class if public  
        //System.out.println("Result : "+(num.v1/fnum.v2)); //->can access v2 easily 
        num.displayInteger();
        num.displayInfoInner();
        //Numbers.FloatNumber fnum = Numbers.new FloatNumeber();
        
        
       
       //->In case of Static Inner Class
       //->OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        
       System.out.println("Result : "+(num.v1 - num.zahl)); // 
       //   While inner class is private we can only access if inner class is 
       //-> instantiate in Outer class and made variable and methods in Outer class
    }  
}
