/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class MethodOverload {
    
    static int     myCalc(int v){
           return    v;
    }
    static float  myCalc(float v){
          return   v;
    }
    
    static double myCalc(double v1 , double v2){
           return (v1+v2);
    }
    
    public static void main(String[] args){
        int    result1   = myCalc(4);
        float  result2   = myCalc(3.43f);
        double result3   = myCalc(2.33,45.22);
        
        System.out.println("Int    Value : "+result1);
        System.out.println("float  Value : "+result2);
        System.out.println("double Value : "+result3);
    }
    
}
