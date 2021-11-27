/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
import java.util.*;
public class Branching {
    
    public static void main(String[] args)
{
//Create a Scammer object to get the user input
//System.in is passed as parameter to Scanner class.
//It tells to Java compiler that system input will be
//provided through console(keyboard)
Scanner reader = new Scanner(System.in);
//This is the output that says to user to type in
System.out.println("Type an integer value over the keyboard:");
//it is a reference to the Scanner object reader.
//The input typed by the user will be
//read in after the user is pressing ENTER. It will be stored
//in input.
//Input can be only integer, no other, otherwise program
//throws out
//exception
int input = reader.nextInt();
if(input > 10)
{
System.out.println("Number > 10!");
}
else if(input < 10)
{
System.out.println("Number < 10!");
}
else
{
System.out.println("Number equal to 10!");
}
}//end static void

    
}
