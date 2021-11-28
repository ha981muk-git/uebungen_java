
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
   private int age;
   private String date;
   
   public void getInput(Person per){
       Scanner sc     = new Scanner(System.in);
       
       System.out.println("Enter Person's First Name :");
       String fName   = sc.nextLine();
       per.firstName  = fName; // this is required to get input Methods
       
       System.out.println("Enter Person's Last Name :");
       String lName   = sc.nextLine();
       per.lastName   = lName;
       
       System.out.println("Enter Person's age :");
       int t          = sc.nextInt();     
       per.age        = t;
       
       System.out.println("Enter Person's date of birth in format dd.mm.yyyy:");
       String dBirth  = sc.nextLine();
       String d       = sc.nextLine(); 
       per.date       = dBirth = d;
   }
   
   public void printOut(Person per){
       
       System.out.println(per.firstName+ " "
                        + per.lastName+"'s date of birth is "
                        + per.date+" and now his age is "
                        + per.age +".");
   }
   
     void SortByAge(List <Person> m){
       // finding length of arraylist
       
       
  
       //List <Person> per = new ArrayList<>(man);
       int len = m.size();
      // int index =0;
      // m.get((index+0)%m.size()).age = ;
       
       for(int j= 0;j<len;j++){
           for(int index=0;index<len;index++){
               if(m.get(index%m.size()).age > m.get(index+1).age){
                  SwapString(m.get(index%m.size()).firstName,m.get(index+1).firstName);
                  SwapString(m.get(index%m.size()).lastName,m.get(index+1).lastName);
                  SwapInteger(m.get(index%m.size()).age,m.get(index+1).age);
                  SwapString(m.get(index%m.size()).date,m.get(index+1).date);

               }   
           }  
       }     
   }
   
    void SwapString(String o,String c){
       
       String temp;
       temp = o;
          o = c;
          c = temp;
   }
    void SwapInteger(int o,int c){
       int temp;
       temp = o;
          o = c;
          c = temp;
   }
   
   
           
           
   public static void main(String[] args){
               
        ArrayList <Person> man = new ArrayList<>();
               Person ram = new Person();
               ram.firstName = "a";
               ram.lastName  = "m";
               ram.age       =  23;
               ram.date      = "1";
              // ram.getInput(ram);
               man.add(ram);
                     // ram.printOut(ram);
            
              
               Person lax = new Person();
               lax.firstName = "b";
               lax.lastName  = "n";
               lax.age       =  53;
               lax.date      = "5";
               man.add(lax);
               //lax.getInput(lax);
               
         
               Person rax = new Person();
               rax.firstName = "c";
               rax.lastName  = "o";
               rax.age       =  3;
               rax.date      = "4";
               //rax.getInput(rax);
               man.add(rax);
               
               
               Person lam = new Person();
               lam.firstName = "d";
               lam.lastName  = "p";
               lam.age       =  20;
               lam.date      = "11";
               ///lam.getInput(lam);
               man.add(lam);
               
               Person rob = new Person();
               rob.firstName = "e";
               rob.lastName  = "q";
               rob.age       =  29;
               rob.date      = "4";
               //rob.getInput(rob);
                man.add(rob);
               
              
               
               ram.printOut(ram);
               rax.printOut(rax);
               rob.printOut(rob);
               lam.printOut(lam);
               lax.printOut(lax);
               
               
               
              
              
             Person test = new Person();
               
               test.SortByAge(man);
               System.out.println();
     
            for(int i =0;i<man.size()-1;i++){
            test.printOut(man.get(i));
       }
               
               
              //Person [] man = {ram,rax,lam,rob};
               
             //  man.ageSort(man);
           }
    
}
 