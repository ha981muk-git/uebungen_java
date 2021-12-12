/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class ReverseString {
    
    public static void main(String[] args){
        String r= reverse("dog");
        System.out.println(r);
    }
    
  public static String reverse(String s){
 //Method-1 
      String current = "";
      
      for(int i=0;i<=s.length()-1;i++){
          current +=s.charAt(s.length()-1-i);
      }
      return current;
  }
    
}
