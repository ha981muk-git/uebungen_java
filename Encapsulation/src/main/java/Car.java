/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class Car {
    
       private String brand;
       private double price;
       private String model;
       
       public String getBrand(){
           return brand;
       }
       public double getPrice(){
           return price;
       }
       public String getModel(){
           return model;
       }
       
       public void setBrand(String newVal){
           brand = newVal;
       }
       
       public void setPrice(double newVal){
           price = newVal;
       }
       public void setModel(String newVal){
           model = newVal;
       }
}
