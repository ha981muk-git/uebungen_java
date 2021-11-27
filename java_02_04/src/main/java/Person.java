/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class Person {
    private String firstName;
    private String lastName;
    private String address;
    public int age;
    private String role;
    /*
public Person(String firstName,String lastName,String address,
            int age,String role){
        this.firstName = firstName;
        this.lastName  = lastName;
        this.address   = address;
        this.age       = age;
        this.role      = role; 
    }
*/
    // Private attributes can be modified by using the public methods.
    public String modifyFirstName(String firstName){
      return  this.firstName = firstName;
    }
    public String modifylastName(String lastName){
      return  this.lastName = lastName;
    }
    public String modifyAddress(String address){
      return  this.address = address;
    }
    public int modifyAge(int age){
      return  this.age = age;
    }
    public String modifyRole(String role){
      return  this.role = role;
    }
    
    public static void main(String[] args){
        Person person = new Person();
        person.firstName = "Harry";
        person.lastName  = "Potter";
        person.address   = "london";
        person.age       = 23;
        person.role      = "Student";
        
        
        System.out.println("His name is "+person.firstName+ " " + person.lastName +
                " and he is  "+ person.age+ " years old. Now he studys magic in "+
                person.address+ " as a " + person.role+ ".");
        Numbers  num = new Numbers(2.5f);
        
        System.out.println(num.Number1); 
/* Class variables also known as static variables 
are declared with the static keyword in a class, but outside a method,
constructor or a block. Instance variables are created when an object is 
created with the use of the keyword 'new' and destroyed when the object is destroyed. */
        
    }
    
    
    
    
}
