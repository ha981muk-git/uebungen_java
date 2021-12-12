/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class DuplicateString {
    public static void DuplicateCharactersString(String woerter){
       //   int[] bustaben = woerter.toCharArray();
    }
    
    public static void main(String[] args){
        String str        ="Hello , I am Harsh";
        String character  = "";
        String duplicate  = "";
        System.out.println(str.charAt(0));
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            character +=str.charAt(i);
            System.out.println(character);
        }
        for(int i=0;i<str.length();i++){
            String current = Character.toString(str.charAt(i));
            if(character.contains(current)){
                if(!duplicate.contains(current)){
                    duplicate +=current +" ,";
                }
            }
            character += current;
        }
    }
}
