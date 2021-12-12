/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoe;

/**
 *
 * @author harsh
 */
import java.util.Random;
import java.util.Scanner;
public class TicTacToe {
    public static final Random RANDOM = new Random();
    
    public static void main(String[] args) {
        Board b = new Board();
        Scanner scanner = new Scanner(System.in);
        b.displayBoard();
        System.out.println("Select turn:\n1. Computer (X) / 2. User (O): ");
        int choice = scanner.nextInt();
        
        if(choice ==Board.PLAYER_X){
            Point  p = new Point(RANDOM.nextInt(3),RANDOM.nextInt(3));
            b.placeAMove(p, Board.PLAYER_X);
            b.displayBoard();
        }
        while(!b.isGameOver()){
            boolean moveOK = true;
            
            do{
                if(!moveOK){System.out.println("Cell already filled");}
                System.out.println(" Your Name : ");
                Point userMove = new Point(scanner.nextInt(),scanner.nextInt());
                moveOK = b.placeAMove(userMove,Board.PLAYER_O);
            }while(!moveOK);
            b.displayBoard();
            if(b.isGameOver())
                break;
            b.minimax(0, Board.PLAYER_X);
            System.out.print("Computer choose position : " + b.computerMove);
            b.placeAMove(b.computerMove, Board.PLAYER_X);
            b.displayBoard();
        }
        if(b.hasPlayerWon(Board.PLAYER_X)){
            System.out.print("You Lost");
        }else if(b.hasPlayerWon(Board.PLAYER_O)){
            System.out.println("You Lost");
        }else{
            System.out.println("Draw");
        }
    }
    
}
