/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dynamicprogramming;

import java.util.Arrays;

/**
 *
 * @author harsh
 */
public class MinimumCostPath {
    
    public static void main(String[] args){
        
    int[][]array = {{2,8,4,1,6,4,2},
                   {6,0,9,5,3,8,5},
                   {1,4,3,4,0,6,5},
                   {6,4,7,2,4,6,1},
                   {1,0,3,7,1,2,7},
                   {1,5,3,2,3,0,9},
                   {2,2,5,1,9,8,2}};
    
    int [][] dp = new int[6][6];
    
    
    
    for (int m =dp.length-1; m>=0;m--){
       for(int n=dp[0].length-1;n>=0;n--){
           if(m==dp.length-1&&n == dp[0].length-1){
               dp[m][n]=array[m][n];
           }else if(m==dp.length-1){
               System.out.println(Arrays.deepToString(dp));
               System.out.println();
               dp[m][n] = dp[m][n+1]+array[m][n];
           }else if(n==dp[0].length-1){
               System.out.println(Arrays.deepToString(dp));
                System.out.println();
               dp[m][n] = dp[m+1][n]+array[m][n];
           }else{
               System.out.println(Arrays.deepToString(dp));
                System.out.println();
               dp[m][n]=Math.min(dp[m+1][n],dp[m][n+1]+array[m][n]);
              
           }
        }
       System.out.println(Arrays.deepToString(dp));
       }
        System.out.println(Arrays.deepToString(dp));
        System.out.println("Minimum cost = "+dp[0][0]);
    
    }
}
