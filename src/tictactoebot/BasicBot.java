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
    static class sections {
        int xwellness;
        int owellness;
        Point2D location;
        sections (TheBoard.turnon[] one, Point2D[] two) {
            int xnumb = 0;
            int onumb = 0;
            ArrayList<Point2D> locations = new ArrayList<Point2D>();
            for(int i = 0; i < one.length; i++){
                if(one[i].xturn)
                    xnumb++;
                else if(one[i].oturn)
                    onumb++;
                else {
                    locations.add(two[i]);
                }
            }
            if(xnumb > 0 && onumb > 0) {
                xwellness = 0;
                owellness = 0;
            } else {
                xwellness = xnumb;
                owellness = onumb;
            }
            if(xwellness > 0 && 0 != locations.size()) {
                Random r = new Random();
                location = locations.get(r.nextInt(locations.size()));
            }
            if(owellness > 0 && 0 != locations.size()) {
                Random r = new Random();
                location = locations.get(r.nextInt(locations.size()));
            } else if (xwellness + owellness == 3) {
                location = new Point2D(3,3);
            }
        }
    }
    public static Point2D choosing () { //rough around the edges kind of bot/logic could improve 
        Random r = new Random();
        TheBoard.turnon[][] temp = TheBoard.board;
        ArrayList<Point2D> num = new ArrayList<Point2D>();
        ArrayList<sections> choose = new ArrayList<sections>();
        choose.add(new sections(new TheBoard.turnon[]{temp[0][0],temp[0][1],temp[0][2]}, new Point2D[]{new Point2D(0,0), new Point2D(0,1), new Point2D(0,2)}));
        choose.add(new sections(new TheBoard.turnon[]{temp[1][0],temp[1][1],temp[1][2]}, new Point2D[]{new Point2D(1,0), new Point2D(1,1), new Point2D(1,2)}));
        choose.add(new sections(new TheBoard.turnon[]{temp[2][0],temp[2][1],temp[2][2]}, new Point2D[]{new Point2D(2,0), new Point2D(2,1), new Point2D(2,2)}));
        choose.add(new sections(new TheBoard.turnon[]{temp[0][0],temp[1][0],temp[2][0]}, new Point2D[]{new Point2D(0,0), new Point2D(1,0), new Point2D(2,0)}));
        choose.add(new sections(new TheBoard.turnon[]{temp[0][1],temp[1][1],temp[2][1]}, new Point2D[]{new Point2D(0,1), new Point2D(1,1), new Point2D(2,1)}));
        choose.add(new sections(new TheBoard.turnon[]{temp[0][2],temp[1][2],temp[2][2]}, new Point2D[]{new Point2D(0,2), new Point2D(1,2), new Point2D(2,2)}));
        choose.add(new sections(new TheBoard.turnon[]{temp[0][0],temp[1][1],temp[2][2]}, new Point2D[]{new Point2D(0,0), new Point2D(1,1), new Point2D(2,2)}));
        choose.add(new sections(new TheBoard.turnon[]{temp[0][2],temp[1][1],temp[2][0]}, new Point2D[]{new Point2D(0,2), new Point2D(1,1), new Point2D(2,0)}));
        
        int iXwell = 0;
        int iX = 3;
        int iOwell = 0;
        int iO = 3;
        for(int i = 0; i < 8; i++) {
            if(choose.get(i).owellness > iOwell) {
                iO = i;
                iOwell = choose.get(i).owellness;
            }
            if(choose.get(i).xwellness > iXwell) {
                iX = i;
                iXwell = choose.get(i).xwellness;
            }
        }
        if(iXwell > iOwell || (iXwell == iOwell && iOwell != 2)) {
            return choose.get(iX).location;
        } else if(iOwell > iXwell || iOwell == 2) {
            return choose.get(iO).location;
        } 
        return null;    
        /* //random bot
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
            return new Point2D(3,3); */
        
    }
}
