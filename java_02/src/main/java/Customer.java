/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class Customer
{
public String firstName;
public String lastName;
public int age;
public Customer(String firstName, String lastName, int age)
{
this.firstName = firstName; // this must be used otherwise it gets disturb because Constructor variable are same as class variables.
this.lastName = lastName;
this.age = age;
}
public static void main(String[] args)
{
Customer Peter = new Customer("luigi", "l",45); //age is needs to be filled 
Customer Hans = new Customer("mario", "m", 33); // needs a integer value, not float 
System.out.println("Customer A : " + Peter.firstName + " "
+ Peter.lastName + " and has the following age: " +
Peter.age); // no semi-colon , 
System.out.println("Customer B : " + Hans.firstName + " " +
Hans.lastName + " and has the following age: " + Hans.age);// no semi colon
}
}

