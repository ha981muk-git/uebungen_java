
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
       
       for(int index=0;index<len-1;++index){
           for(int j=index;j<len-1;++j){
               if(m.get((index+0)%m.size()).age > m.get((index+1)%m.size()).age){
                  SwapString(m.get((index+0)%m.size()).firstName,m.get((index+1)%m.size()).firstName);
                  SwapString(m.get((index+0)%m.size()).lastName,m.get((index+1)%m.size()).lastName);
                  SwapInteger(m.get((index+0)%m.size()).age,m.get((index+1)%m.size()).age);
                  SwapString(m.get((index+0)%m.size()).date,m.get((index+1)%m.size()).date);

               }
               
           }
           
       }
       System.out.println();
       System.out.println();
       System.out.println();
       for(int i =0;i<len;i++){
           (m.get((i)%m.size())).printOut(m.get((i)%m.size()));
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
               
        List <Person> man = new ArrayList<>();
               Person ram = new Person();
               ram.getInput(ram);
               man.add(ram);
                     // ram.printOut(ram);
            
              
               Person lax = new Person();
               lax.getInput(lax);
               man.add(lax);
         
               Person rax = new Person();
               rax.getInput(rax);
               man.add(rax);
               
               
               Person lam = new Person();
               lam.getInput(lam);
               man.add(lam);
               
               Person rob = new Person();
               rob.getInput(rob);
                man.add(rob);
               
              
               
               ram.printOut(ram);
               rax.printOut(rax);
               rob.printOut(rob);
               lam.printOut(lam);
               lax.printOut(lax);
               
               
               
              
              
             Person test = new Person();
               
               test.SortByAge(man);
               
               
              //Person [] man = {ram,rax,lam,rob};
               
             //  man.ageSort(man);
           }
    
}
