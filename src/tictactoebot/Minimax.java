/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoebot;

import java.util.*;
import javafx.geometry.Point2D; 
/**
 *
 * @author Edward Potapov
 */
public class Minimax { //algorithm adapted from the Coding Train
    public static Point2D choosing () { 
        int globalbest = -2;
        TheBoard.turnon[][] temp = TheBoard.board;
        Point2D p = new Point2D(3,3);
        for(int row = 0; row  < 3; row++) {
            for(int col = 0; col < 3; col++) {
                if(!temp[row][col].oturn && !temp[row][col].xturn) {
                    temp[row][col].oturn = true;
                    int c = algo(temp, true);
                    temp[row][col].oturn = false;
                    if (c > globalbest) {
                        globalbest = c;
                        p = new Point2D(row, col);
                    }
                }
            }
        }
        return p;
    }
    static int algo(TheBoard.turnon[][] temp,boolean turn) {
        Integer tboard = TheBoard.minimaxWinner(temp);
        if (tboard != null) {
            return tboard;
        }
        if(turn) {
            int c = 2;
            for(int row = 0; row  < 3; row++) {
                for(int col = 0; col < 3; col++) {
                    if(!temp[row][col].oturn && !temp[row][col].xturn) {
                        temp[row][col].xturn = true;
                        int current = algo(temp, false);
                        temp[row][col].xturn = false;
                        c = Math.min(current, c);
                    }
                }
            }
            return c;
        } else {
            int c = -2;
            for(int row = 0; row  < 3; row++) {
                for(int col = 0; col < 3; col++) {
                    if(!temp[row][col].oturn && !temp[row][col].xturn) {
                        temp[row][col].oturn = true;
                        int current = algo(temp, true);
                        temp[row][col].oturn = false;
                        c = Math.max(current, c);
                    }
                }
            }
            return c;
        }
    }
}
