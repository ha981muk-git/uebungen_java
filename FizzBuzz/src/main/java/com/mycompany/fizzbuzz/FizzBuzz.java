/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fizzbuzz;

/**
 *
 * @author harsh
 */
public class FizzBuzz {
    
    public static void main(String[] args){
        
        printFizzBuzz(100);
        
    }
    
    public static void printFizzBuzz(int n){
        for(int i=1;i<=n;i++){
            if((i%3==0)&&(i%5==0)){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
        
        System.out.println();
        System.out.println();
        int number = 1;
        while (number <= 100) {
            System.out.println(number % 15 == 0 ? "FizzBuzz" : number % 3 == 0 ? "Fizz" : number % 5 == 0 ? "Buzz" : number);
            number++;
        }
    }
}
