/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class LinkList{
        public Link firstLink;
        
        LinkList(){
            firstLink=null;
        }
        public boolean isEmpty(){
            return(firstLink==null);
        }
        
        public void insertFirstLink(String bookName,int millionsSold){
            Link newLink = new Link(bookName,millionsSold);
            newLink.next=firstLink;
            firstLink = newLink;
        }
         public Link removeFirst(){
            Link linkReference = firstLink;
            if(!isEmpty()){
                firstLink = firstLink.next;
            }else{
                System.out.println("Empty LinkedList");
            }
            return linkReference;
      }
         
        public void display(){
        Link theLink = firstLink;
        while(theLink !=null){
            theLink.display();
            System.out.println("Next Link: "+ theLink.next);
//            System.out.println(bookName + ": "+millionsSold+",000,000");
            theLink = theLink.next;
            System.out.println();
        }
      }
        
       public Link find(String bookName){
           Link theLink = firstLink;
           if(!isEmpty()){
           while(theLink.bookName != bookName){
               if(theLink.next==null){
               return null;
               }else {
                   theLink = theLink.next;
                   }
             }
           }else{
               System.out.println("Empty LinkedList");
           }
           return theLink;
       }
       
       public Link removeLink(String bookName){
           Link currentLink = firstLink;
           Link previousLink = firstLink;
           while(currentLink.bookName != bookName){
               if(currentLink.next==null){
                   return null;
               }else{
                   previousLink = currentLink;
                   currentLink = currentLink.next;
               }
           }
           if(currentLink == firstLink){
               firstLink = firstLink.next;
           }else{
               previousLink.next = currentLink;
           }
           return currentLink;
       }
    }