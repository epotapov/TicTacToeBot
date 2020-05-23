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
public class Minimax {
    public static Point2D choosing () { 
        Random r = new Random();
        TheBoard.turnon[][] temp = TheBoard.board;
        ArrayList<Point2D> num = new ArrayList<Point2D>();
        //random bot used for a place holder for the time being
        for(int row = 0; row  < 3; row++) {
            for(int col = 0; col < 3; col++) {
                if(!temp[row][col].oturn && !temp[row][col].xturn) {
                    num.add(new Point2D(row,col));
                }
            }
        }
        if (num.size() > 0)
            return num.get(r.nextInt(num.size()));
        else
            return new Point2D(3,3); 
    }
}
