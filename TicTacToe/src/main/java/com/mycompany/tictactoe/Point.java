/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoe;

/**
 *
 * @author harsh
 */
public class Point {
    public int x, y;
    
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "["+x+","+y+"]";
    }
    
}
