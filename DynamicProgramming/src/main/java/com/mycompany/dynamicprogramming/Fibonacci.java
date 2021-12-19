/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dynamicprogramming;

import java.util.Scanner;

/**
 *
 * @author harsh
 */
public class Fibonacci {
    
    public static void main(String[] args) {
        
        System.out.println("Plese  enter the number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fibo = fibo(n);// n-te fibonacci zahlen
        System.out.println(n);
        System.out.println(fibo);
        
        System.out.println();
        System.out.println();
        
        for(int i=0;i<=n;i++){//ausgibt 
             System.out.println(i+" = "+fibo(i));
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(n+" = "+fiboSpeichern(n, new int[n+1]));
        System.out.println(n-2+" = "+fiboSpeichern(n-2, new int[n+1-2]));
        System.out.println(n-7+" = "+fiboSpeichern(n-7, new int[n+1-7]));
        System.out.println(n-11+" = "+fiboSpeichern(n-11, new int[n+1-11]));
        System.out.println(n-15+" = "+fiboSpeichern(n-15, new int[n+1-15]));
        
        
    }
    
    public static int fibo(int n){ // Funktion fuer Fabonacci Zahlen
        if(n==0|| n ==1){
            return n;
        }
       return fibo(n-1)+fibo(n-2);
    }
    
    public static int fiboSpeichern(int n,int[] dp){ // Funktion fuer Fabonacci Zahlen durch Dynamische Programmierung
        if(n==0|| n ==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        
        int fib = fiboSpeichern(n-1,dp)+fiboSpeichern(n-2,dp);
        dp[n]=fib;
        
       return fib;
    }
    
}
