/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */

public class Customer {
    public String firstName;
    public String lastName;
    public int age;
public Customer(String firstNamen, String lastNamen, int ages) // variables name changed 
{
firstName = firstNamen; // similar variable which has been changed for correction 
lastName = lastNamen;   // similar variable which has been changed for correction
age = ages;             // similar variable which has been changed for correction
}
public static void main(String[] args)
{
Customer Peter = new Customer("luigi", "l",25); // age missing and put to 25 
Customer Hans = new Customer("mario", "m", 33); // float number instead of integer 33.23 Error so changed with 33 integer value 

System.out.println("Customer A : " + Peter.firstName + " " + Peter.lastName + " and has the following age: " + Peter.age); // ";" missing 
System.out.println("Customer B : " + Hans.firstName + " " + Hans.lastName + " and has the following age: " + Hans.age); // ";" missing


  }

//  Default Constructor : A constructor is called "Default Constructor" when it doesn't have any parameter.
// No-arg Constructor  : A constructor is called "No-arg Constructor" when it doesn't have any parameter.
// Parameterized Constructor : A constructor which has a specific number of parameters is called a parameterized constructor.

//Why use the parameterized constructor?
//The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.
    
}
