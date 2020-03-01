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
public class BasicBot {
    class sections {
        int xwellness;
        int owellness;
        sections (ArrayList<TheBoard.turnon> one, ArrayList<Point2D> two) {
            int xnumb = 0;
            int onumb = 0;
            
            for(int i = 0; i < one.size(); i++){
                if(one.get(i).xturn)
                    xnumb++;
                else if(one.get(i).oturn)
                    onumb++;
            }
            if(xnumb > 0 && onumb > 0) {
                xwellness = 0;
                owellness = 0;
            } else {
                xwellness = xnumb;
                owellness = onumb;
            }
            
        }
    }
    public static Point2D choosing () {
        Random r = new Random();
        TheBoard.turnon[][] temp = TheBoard.board;
        ArrayList<Point2D> num = new ArrayList<Point2D>();
        ArrayList<sections> choose = new ArrayList<sections>();
        
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
