/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class BinaryTree {
    
    Node root;
    public void addNode(int key,String name){
        Node newNode = new Node(key,name);
        if(root==null){
            root = newNode;
        }else{
            Node focusNode = root;
            Node parent;
            while(true){
                parent = focusNode;
                if(key <focusNode.key){
                    focusNode = focusNode.leftChild;
                    return;
                }else {
                    focusNode = focusNode.rightChild;
                    if(focusNode==null){
                        parent.rightChild=newNode;
                        return;
                    }
                    
                }
                
            }
        }
    }
    
    
    public void inOrderTraverseTree(Node focusNode){
        if(focusNode!=null){
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }
    
    
    public void preOrderTraverseTree(Node focusNode){
        if(focusNode!=null){
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.leftChild);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }
    
    public void postOrderTraverseTree(Node focusNode){
        if(focusNode!=null){
            inOrderTraverseTree(focusNode.leftChild);
            inOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }
    
    public static void main(String[] args) {
        
        
        BinaryTree theTree = new BinaryTree();
        theTree.addNode(23, "Harsh");
        theTree.addNode(43, "sh");
        theTree.addNode(26, "arsh");
        theTree.addNode(13, "Darsh");
        theTree.addNode(33, "Farsh");
        theTree.addNode(63, "Garsh");
        theTree.addNode(30, "Larsh");
        theTree.addNode(100, "Yarsh");
        theTree.inOrderTraverseTree(theTree.root);
        
         System.out.println();
         System.out.println();
        theTree.preOrderTraverseTree(theTree.root);
        System.out.println();
        System.out.println();
        theTree.postOrderTraverseTree(theTree.root);
    }
    
}

class Node{
    int key;
    String name;
    
    Node leftChild;
    Node rightChild;
    
    Node(int key, String name){
        this.key = key;
        this.name =name;
    }
    
    public String toString(){
        return name+ " has a key "+ key;
    }
}