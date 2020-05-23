/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day03;

/**
 *
 * @author MB-study
 */
public class MultiArrayGame {
    public static void main(String[] args) {
        char[][] game = new char[3][3];
        game[0][0] = 'O';
        game[0][2] = 'X';
        game[2][2] = 'O';
        game[1][1] = 'X';
        print(game);
        game[2][0] = 'O';
        print(game);
    }
    
    public static void print(char[][] g) {
        for(int i=0;i<g.length;i++) {
            for(int j=0;j<g[i].length;j++) {
                System.out.print(g[i][j]+"|");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
}
