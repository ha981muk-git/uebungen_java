/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class ArrayStructures {
    private int[] theArray = new int[50];
    private int arraySize = 10;
    public void generateRandomArray(){
        for( int i =0;i<arraySize;i++){
           theArray[i] = (int)(Math.random()*10)+10; // craeting random values
        }
    }
    public void printArray(){
        System.out.println("----------");
        for(int i=0;i<arraySize;i++){
            System.out.print("| "+ i + " | ");
            System.out.println(theArray[i]+ " |");
            System.out.println("----------");
        }
    }
    
    public void printHorzArray(int i, int j){

        for(int n = 0; n < 51; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < arraySize; n++){
            System.out.print("| " + n + "  ");
        }
        System.out.println("|");
        for(int n = 0; n < 51; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < arraySize; n++){
            System.out.print("| " + theArray[n] + " ");
        }
        System.out.println("|");
        for(int n = 0; n < 51; n++)System.out.print("-");
        System.out.println();
        // END OF FIRST PART
        // ADDED FOR BUBBLE SORT
        if(j != -1){
            // ADD THE +2 TO FIX SPACING
            for(int k = 0; k < ((j*5)+2); k++)System.out.print(" ");
            System.out.print(j);
        }
        // THEN ADD THIS CODE
        if(i != -1){
            // ADD THE -1 TO FIX SPACING
            for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();
    }
    
    public int getValueIndex(int index){
        if(index<arraySize) return theArray[index]; // getting index value
        return 0;
    }
    
    public boolean doesArrayContainThisValue(int searchValue){ // checking if array contains the value
        boolean valueInArry = false;
        for(int i=0;i<arraySize;i++){
            if(theArray[i]==searchValue){       
                valueInArry=true;
            }
        }
        return valueInArry;
        
    }
    
    public void deleteIndex(int index){
        if(index<arraySize){
            for(int i=index;i<(arraySize-1);i++){ // index is replaced with other value, causes to delete or removal of value
                theArray[i]=theArray[i+1];
            }
            arraySize--;
        }
    }
    
    public void insertValue(int value){
        if(arraySize<50){
        theArray[arraySize] = value;
        arraySize++;  
      }
    }
    
    public String linearSearchForValue(int value){ // linear search 
        boolean valueInArray = false;
        
        String indexWithValue = "";
        System.out.println("The Value was found in the following index :");
        for(int i=0;i<arraySize;i++){
            if(theArray[i]==value){
                valueInArray=true;
                 System.out.print(i+" ");
                 indexWithValue=i+" ";
            }
            printHorzArray(i, -1);
        }
        if(!valueInArray){
                indexWithValue="None";
                System.out.println(indexWithValue);
            }
        
             System.out.println();
             return indexWithValue;
    }
    
    public void bubbleSort(){
        for( int i=arraySize-1;i>1;i--){
            for(int j=0;j<i;j++){
                if(theArray[j]>theArray[j+1]){
                    swapValues(j,j+1);
                    printHorzArray(i, j);
                }
                printHorzArray(i, j);
            }
            
        }
    }
    
    public void swapValues(int indexOne,int indexTwo){
        int temp = theArray[indexOne];
        theArray[indexOne]=theArray[indexTwo];
        theArray[indexTwo]=temp;
    }
    
    public void binarySearchForValue(int value){
        int lowIndex = 0;
        int highIndex = arraySize-1;
        while(lowIndex<=highIndex){
            int middleIndex = (lowIndex+highIndex)/2;
            if(theArray[middleIndex]<value) lowIndex = middleIndex+1;
            else if(theArray[middleIndex]>value) highIndex = middleIndex-1;
            else{
                System.out.println("\nFound a Match for "+ value+ " at Index " +middleIndex);
                lowIndex = highIndex+1;  // making lowindex >=highIndex so that it will breaks the while loop              
            }
            printHorzArray(middleIndex, -1);
        }
    }
    
    
    public void selectionSort(){
        for(int x=0;x<arraySize;x++){
            int minimum = x;
            for(int y=x;y<arraySize;y++){
                if(theArray[minimum]>theArray[y]){
                    minimum = y;
                }
            }
            swapValues(x, minimum);
            printHorzArray(x, -1);
        }
    }
    
    public void insertionSort(){
        for(int i=1;i<arraySize;i++){
            int j=i;
            int toInsert= theArray[i];
            while((j>0)&&(theArray[j-1]>toInsert)){
                theArray[j]=theArray[j-1];
                j--;
                printHorzArray(i, j);
            }
            theArray[j]=toInsert;
            printHorzArray(i, j);
            System.out.println("\nArray[i] = "+ theArray[i]+" Array[j] = "+theArray[j]+ " toInerst = "+ toInsert);
        }
    }
    
    
    
    public static void main(String[] args){
        ArrayStructures newArray = new ArrayStructures();
        newArray.generateRandomArray();
        newArray.printArray();
        
        System.out.println(newArray.getValueIndex(3));
        System.out.println(newArray.doesArrayContainThisValue(23));
        newArray.deleteIndex(5);// void type does not require the  System.out.println();
        newArray.printArray();
        newArray.insertValue(34);
        System.out.println();
        System.out.println();
        newArray.printArray();
        newArray.linearSearchForValue(14);
        newArray.printHorzArray(-1, -1);

        newArray.bubbleSort();
        System.out.println("Binary Search Starts");
        newArray.binarySearchForValue(34);
        System.out.println("Binary Search Ends");
        
         System.out.println("selection sort starts");
         newArray.selectionSort();
         System.out.println("insertion sort starts");
         newArray.insertionSort();


        
    }
    
}
