/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class Programmer extends Employee {
    int bonus = 10000;
    public static void main(String[] args){
        Programmer p = new Programmer();
        System.out.println("Programmer Salary is : "+p.salary);
        System.out.println("Programmer Salary is : "+p.bonus);
    }
    
}
