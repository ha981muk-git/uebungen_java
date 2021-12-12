
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class TheQueue {
     private String[] queueArray;
     private int  queueSize;
     private int front,rear,numberOfItems = 0;
     
     
     TheQueue( int size){
         queueSize = size;
         queueArray = new String[size];
         Arrays.fill(queueArray,"-1");
     }
     
     public void insert(String input){
         if(numberOfItems+1 <=queueSize){
             queueArray[rear] = input;
             rear++;
             numberOfItems++;
             System.out.println("INSERT "+ input + "Was Added to the Queue\n");
         }else{
             System.out.println("Sorry But the Queue is Full");
         }
     }
     
     public void remove(){
         if(numberOfItems>0){
             System.out.println("REMOVE "+queueArray[front]+" Was removed from the Queue\n");
             queueArray[front]= "-1";
             front++;
             numberOfItems--;
         }else{
             System.out.println("Sorry But the Queue is Empty");
         }
     }
     
     public void peek(){
         System.out.println("The First Element is "+queueArray[front]);
     }
    
    public void displayTheQueue(){
            for(int n = 0; n < 61; n++)System.out.print("-");
            System.out.println();
            for(int n = 0; n < queueSize; n++){
                System.out.format("| %2s "+ " ", n);
            }
            System.out.println("|");
            for(int n = 0; n < 61; n++)System.out.print("-");
            System.out.println();
            for(int n = 0; n < queueSize; n++){
                if(queueArray[n].equals("-1")) System.out.print("|     ");
                else System.out.print(String.format("| %2s "+ " ", queueArray[n]));
            }
            System.out.println("|");
            for(int n = 0; n < 61; n++)System.out.print("-");
            System.out.println();
    }
    
    
    public void priorityInsert(String input){
        int i;
        if(numberOfItems==0){
            insert(input);
        }else{
            for(i =numberOfItems-1;i>=0;i--){
                if(Integer.parseInt(input)>Integer.parseInt(queueArray[i])){
                    queueArray[i+1]=queueArray[i];
                    
                }else{break;}
            }
            queueArray[i+1] = input;
            rear++;
            numberOfItems++;
        }
        
    }
    
    public static void main(String[] args) {
        TheQueue theQueue = new TheQueue(10);
        theQueue.priorityInsert("22");
        theQueue.priorityInsert("11");
        theQueue.priorityInsert("34");
        theQueue.priorityInsert("56");
        theQueue.priorityInsert("89");
        theQueue.priorityInsert("67");
        theQueue.displayTheQueue();
        theQueue.peek();
        theQueue.remove();
        theQueue.displayTheQueue();
        theQueue.peek();
        
        
        
    }
    
}
