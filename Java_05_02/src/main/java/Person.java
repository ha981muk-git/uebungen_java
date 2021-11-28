/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author harsh
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private int id;
    private int age;
    private String role;
    private String academicalDegree;
    private String dateOfEntry;
    
    public int CountMember(){   
    List <Integer> m = new ArrayList<Integer>(id);
    int totolMembers = m.size();
    return totolMembers;
}
    
    public class Professor{
        
    }
    
    public class Student {
        
    }
    
    public class Tutors {
        
    }
    
}
