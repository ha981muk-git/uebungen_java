/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 * Java task 4 
 * 
 */
class Numbers {
    public float v1 = 23.25f;
    public void infoOuter(){System.out.println("This is the outer class Numbers."); }
   
    private class FloatNumber{//By changing it to private it shows an Error
    public float v2 = 2.5f;  
    public void infoInner(){System.out.println("This is the inner class FloatNumber");}} 
    
   public float displayInteger(){   //make the inner class private and access the class through a method.
   FloatNumber num = new FloatNumber();
   return num.v2;
   }
   
   FloatNumber num = new FloatNumber();
   float zahl = num.v2;
   public void displayInfoInner(){
       FloatNumber num = new FloatNumber();
       num.infoInner();    
   }
}

