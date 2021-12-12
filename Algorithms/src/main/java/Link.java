/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class Link {
    public String bookName;
    public int millionsSold;
    public Link next;
    
    public Link(String bookName,int millionsSold){
        this.bookName = bookName;
        this.millionsSold=millionsSold;
    }
    
public void display(){
     System.out.println(bookName + ": "+millionsSold+",000,000");
}
    
    public String toString(){
        return bookName;
    }
    
    
     public static void main(String[] args){
        
     LinkList theLinkList = new LinkList();
     theLinkList.insertFirstLink("don", 21);
     theLinkList.insertFirstLink("doasd", 29);
     theLinkList.insertFirstLink("dofasdfn", 2);
     theLinkList.insertFirstLink("dsdf on", 3);
     theLinkList.insertFirstLink("dofsd fn", 2000);
     theLinkList.display();
    } 
}
