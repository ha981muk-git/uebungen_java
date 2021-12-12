
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class HashFunction {
    
    String[] theArray;
    int arraySize ;
    int itemsInArray=0;
    
    
    public static void main(String[] args) {
        HashFunction theFunc = new HashFunction(30);
        String[] elementsToAdd = {"1","22","23","12"};
        theFunc.hashFunction1(elementsToAdd, theFunc.theArray);
        theFunc.displayTheHashFunction();
        
        String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
                "235", "802", "900", "723", "699", "1", "16", "999", "890",
                "725", "998", "978", "988", "990", "989", "984", "320", "321",
                "400", "415", "450", "50", "660", "624" };
        
          HashFunction theFunc2 = new HashFunction(50);
          theFunc2.hashFunction2(elementsToAdd2, theFunc2.theArray);
          theFunc2.displayTheHashFunction();
          theFunc2.findKey("214");
          theFunc2.displayTheHashFunction();

        
    }
    public void hashFunction1(String[] stringsForArray, String[] theArray){
        for(int n= 0;n<stringsForArray.length;n++){
            String newElementVal = stringsForArray[n];
            theArray[Integer.parseInt(newElementVal)] = newElementVal;
            
        }
    }
    
    public void hashFunction2(String[] stringsForArray, String[] theArray){
         for(int n= 0;n<stringsForArray.length;n++){
            String newElementVal = stringsForArray[n];
            int arrayIndex = Integer.parseInt(newElementVal)%29;
             System.out.println("Modulus Index= "+arrayIndex+" for value "+newElementVal);
             
             
             while(theArray[arrayIndex] == "-1"){
             ++arrayIndex;
             System.out.println("Collision Try "+ arrayIndex+" Instead");
             arrayIndex %= arraySize;   
             }
             theArray[arrayIndex] = newElementVal;
        }
        
    }
    
    public String findKey(String key){
        int arrayIndexHash = Integer.parseInt(key);
        int arrayIndex = Integer.parseInt(key)%29;
        while(theArray[arrayIndexHash] == "-1"){
            if(theArray[arrayIndexHash]==key){
                System.out.println(key + " was Found in Index "+arrayIndexHash);
                return theArray[arrayIndexHash];
            }
            ++arrayIndexHash;
            arrayIndexHash %= arrayIndex;
        }
        return null;
        
    }
    public void displayTheHashFunction(){
            for(int n = 0; n < 61; n++)System.out.print("-");
            System.out.println();
            for(int n = 0; n < arraySize; n++){
                System.out.format("| %2s "+ " ", n);
            }
            System.out.println("|");
            for(int n = 0; n < 61; n++)System.out.print("-");
            System.out.println();
            for(int n = 0; n < arraySize; n++){
                if(theArray[n].equals("-1")) System.out.print("|     ");
                else System.out.print(String.format("| %2s "+ " ", theArray[n]));
            }
            System.out.println("|");
            for(int n = 0; n < 61; n++)System.out.print("-");
            System.out.println();
    }
    
    HashFunction(int size){
        arraySize = size;
        theArray = new String[arraySize];
        Arrays.fill(theArray, "-1");
    }
}
