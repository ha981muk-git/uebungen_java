/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class Encapsulation {
    
    public static void main(String[] args){
        Car ferrari = new Car();
        System.out.println("Brand: " +ferrari.getBrand()+
                         ", Price: "+ferrari.getPrice()+
                         ", Model: "+ferrari.getModel());
        
        ferrari.setBrand("Ferrari");
        ferrari.setPrice(75000.00);
        ferrari.setModel("Enzo");
        
        System.out.println("Brand: " +ferrari.getBrand()+
                         ", Price: " +ferrari.getPrice()+
                         ", Model: " +ferrari.getModel());
    }
}
