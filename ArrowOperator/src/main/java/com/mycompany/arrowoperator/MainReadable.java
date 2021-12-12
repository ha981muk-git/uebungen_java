///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.arrowoperator;
//
///**
// *
// * @author harsh
// */
//
//import java.util.ArrayList;  
//import java.util.List;  
//import java.util.stream.Stream; 
//
//interface Runnable {
//
//    Runnable r = new Runnable() {
//        @Override
//        public void run(){
//            System.out.print("Run method");
//        }; 
//};
//    
//}
//
//
//public class MainReadable{  
//    public static void main(String[] args) {  
//        
//        // using arrow  
//        Runnable r = ()->{  
//            System.out.println("Thread is running...");  
//        };
//        Thread t2 = new Thread((java.lang.Runnable) r);  
//        t2.start();  
//    }
//}