/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoebot;

import java.awt.Color;
import javafx.geometry.Point2D; 

/**
 *
 * @author Edward Potapov
 */
public class TheBoard extends javax.swing.JFrame { //comment
    class turnon {
        boolean xturn;
        boolean oturn;
        public turnon() {
            xturn = false;
            oturn = false;
        }
    }
    static turnon[][] board = new turnon[3][3];
    boolean turn;
    boolean won;
    boolean basicOrnot;
    public TheBoard() {
        initComponents();
        setResizable(false);
        turn = true;
        won = false;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        BasicBotButton.setEnabled(false);
        basicOrnot = true;
        b1.setForeground(Color.black);
        b2.setForeground(Color.black);
        b3.setForeground(Color.black);
        b4.setForeground(Color.black);
        b5.setForeground(Color.black); //hello
        b6.setForeground(Color.black);
        b7.setForeground(Color.black);
        b8.setForeground(Color.black);
        b9.setForeground(Color.black);
        for(int row = 0; row < 3; row++) {
            for(int col = 0; col < 3; col++) {
                board[row][col] = new turnon();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        RestartBut = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        BasicBotButton = new javax.swing.JButton();
        MiniMaxButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        RestartBut.setText("Restart");
        RestartBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b1.setFocusable(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b2.setFocusable(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b3.setFocusable(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b4.setFocusable(false);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b5.setFocusable(false);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b6.setFocusable(false);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b7.setFocusable(false);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b8.setFocusable(false);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b9.setFocusable(false);
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        BasicBotButton.setText("BasicAlgo");
        BasicBotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasicBotButtonActionPerformed(evt);
            }
        });

        MiniMaxButton.setText("MiniMax");
        MiniMaxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiniMaxButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RestartBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BasicBotButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MiniMaxButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RestartBut)
                    .addComponent(BasicBotButton)
                    .addComponent(MiniMaxButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        board[0][0].xturn = true;
        b1.setText("X");
        b1.setEnabled(false);
        winner();
        if(!won) {
            if(basicOrnot) {
                outside(BasicBot.choosing());
            } else {
                outside(Minimax.choosing());
            }
            winner();
        }
        /*if(!(board[0][0].xturn || board[0][0].oturn)) { //for two players
            if(turn) {
                board[0][0].xturn = true;
                b1.setText("X");
                turn = false;
            } else {
                board[0][0].oturn = true;
                b1.setText("O");
                turn = true;
            }
            winner();
        } */
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        board[0][1].xturn = true;
        b2.setText("X");
        b2.setEnabled(false);
        winner();
        if(!won) {
            if(basicOrnot) {
                outside(BasicBot.choosing());
            } else {
                outside(Minimax.choosing());
            }
            winner();
        }
        /*if(!(board[0][1].xturn || board[0][1].oturn)) {
            if(turn) {
                board[0][1].xturn = true;
                b2.setText("X");
                turn = false;
            } else {
                board[0][1].oturn = true;
                b2.setText("O");
                turn = true;
            }
            winner();
        }*/
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        board[0][2].xturn = true;
        b3.setText("X");
        b3.setEnabled(false);
        winner();
        if(!won) {
            if(basicOrnot) {
                outside(BasicBot.choosing());
            } else {
                outside(Minimax.choosing());
            }
            winner();
        }
        /*if(!(board[0][2].xturn || board[0][2].oturn)) {
            if(turn) {
                board[0][2].xturn = true;
                b3.setText("X");
                turn = false;
            } else {
                board[0][2].oturn = true;
                b3.setText("O");
                turn = true;
            }
            winner();
        }*/
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        board[1][0].xturn = true;
        b4.setText("X");
        b4.setEnabled(false);
        winner();
        if(!won) {
            if(basicOrnot) {
                outside(BasicBot.choosing());
            } else {
                outside(Minimax.choosing());
            }
            winner();
        }
        /*if(!(board[1][0].xturn || board[1][0].oturn)) {
            if(turn) {
                board[1][0].xturn = true;
                b4.setText("X");
                turn = false;
            } else {
                board[1][0].oturn = true;
                b4.setText("O");
                turn = true;
            }
            winner();
        }*/
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        board[1][1].xturn = true;
        b5.setText("X");
        b5.setEnabled(false);
        winner();
        if(!won) {
            if(basicOrnot) {
                outside(BasicBot.choosing());
            } else {
                outside(Minimax.choosing());
            }
            winner();
        }
        /*if(!(board[1][1].xturn || board[1][1].oturn)) {
            if(turn) {
                board[1][1].xturn = true;
                b5.setText("X");
                turn = false;
            } else {
                board[1][1].oturn = true;
                b5.setText("O");
                turn = true;
            }
            winner();
        }*/
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        board[1][2].xturn = true;
        b6.setText("X");
        b6.setEnabled(false);
        winner();
        if(!won) {
            if(basicOrnot) {
                outside(BasicBot.choosing());
            } else {
                outside(Minimax.choosing());
            }
            winner();
        }
        /*if(!(board[1][2].xturn || board[1][2].oturn)) {
            if(turn) {
                board[1][2].xturn = true;
                b6.setText("X");
                turn = false;
            } else {
                board[1][2].oturn = true;
                b6.setText("O");
                turn = true;
            }
            winner();
        }*/
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        board[2][0].xturn = true;
        b7.setText("X");
        b7.setEnabled(false);
        winner();
        if(!won) {
            if(basicOrnot) {
                outside(BasicBot.choosing());
            } else {
                outside(Minimax.choosing());
            }
            winner();
        }
        /*if(!(board[2][0].xturn || board[2][0].oturn)) {
            if(turn) {
                board[2][0].xturn = true;
                b7.setText("X");
                turn = false;
            } else {
                board[2][0].oturn = true;
                b7.setText("O");
                turn = true;
            }
            winner();
        }*/
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        board[2][1].xturn = true;
        b8.setText("X");
        b8.setEnabled(false);
        winner();
        if(!won) {
            if(basicOrnot) {
                outside(BasicBot.choosing());
            } else {
                outside(Minimax.choosing());
            }
            winner();
        }
        /*if(!(board[2][1].xturn || board[2][1].oturn)) {
            if(turn) {
                board[2][1].xturn = true;
                b8.setText("X");
                turn = false;
            } else {
                board[2][1].oturn = true;
                b8.setText("O");
                turn = true;
            }
            winner();
        }*/
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        board[2][2].xturn = true;
        b9.setText("X");
        b9.setEnabled(false);
        if(!won) {
            if(basicOrnot) {
                outside(BasicBot.choosing());
            } else {
                outside(Minimax.choosing());
            }
            winner();
        }
        /*if(!(board[2][2].xturn || board[2][2].oturn)) {
            if(turn) {
                board[2][2].xturn = true;
                b9.setText("X");
                turn = false;
            } else {
                board[2][2].oturn = true;
                b9.setText("O");
                turn = true;
            }
            winner();
        }*/
    }//GEN-LAST:event_b9ActionPerformed
    
    void outside(Point2D p) {
        if(p == null) //quick fix 
            return;
        if(p.getX() == 0 && p.getY() == 0) {
            board[0][0].oturn = true;
            b1.setText("O");
            b1.setEnabled(false);
        }
        if(p.getX() == 0 && p.getY() == 1) {
            board[0][1].oturn = true;
            b2.setText("O");
            b2.setEnabled(false);
        }
        if(p.getX() == 0 && p.getY() == 2) {
            board[0][2].oturn = true;
            b3.setText("O");
            b3.setEnabled(false);
        }
        if(p.getX() == 1 && p.getY() == 0) {
            board[1][0].oturn = true;
            b4.setText("O");
            b4.setEnabled(false);
        }
        if(p.getX() == 1 && p.getY() == 1) {
            board[1][1].oturn = true;
            b5.setText("O");
            b5.setEnabled(false);
        }
        if(p.getX() == 1 && p.getY() == 2) {
            board[1][2].oturn = true;
            b6.setText("O");
            b6.setEnabled(false);
        }
        if(p.getX() == 2 && p.getY() == 0) {
            board[2][0].oturn = true;
            b7.setText("O");
            b7.setEnabled(false);
        }
        if(p.getX() == 2 && p.getY() == 1) {
            board[2][1].oturn = true;
            b8.setText("O");
            b8.setEnabled(false);
        }
        if(p.getX() == 2 && p.getY() == 2) {
            board[2][2].oturn = true;
            b9.setText("O");
            b9.setEnabled(false);
        }
    }
    
    static Integer minimaxWinner(turnon[][] t) {
        Integer rtype = null;
        if (t[0][0].xturn && t[0][1].xturn && t[0][2].xturn)
            rtype = -1;
        else if ((t[0][0].oturn && t[0][1].oturn && t[0][2].oturn))
            rtype = 1;
        else if (t[1][0].xturn && t[1][1].xturn && t[1][2].xturn)
            rtype = -1;
        else if (t[1][0].oturn && t[1][1].oturn && t[1][2].oturn)
            rtype = 1;
        else if (t[2][0].xturn && t[2][1].xturn && t[2][2].xturn)
            rtype = -1;
        else if (t[2][0].oturn && t[2][1].oturn && t[2][2].oturn)
            rtype = 1;
        else if (t[0][0].xturn && t[1][0].xturn && t[2][0].xturn)
            rtype = -1;
        else if (t[0][0].oturn && t[1][0].oturn && t[2][0].oturn)
            rtype = 1;
        else if (t[0][1].xturn && t[1][1].xturn && t[2][1].xturn)
            rtype = -1;
        else if (t[0][1].oturn && t[1][1].oturn && t[2][1].oturn)
            rtype = 1;
        else if (t[0][2].xturn && t[1][2].xturn && t[2][2].xturn)
            rtype = -1;
        else if (t[0][2].oturn && t[1][2].oturn && t[2][2].oturn)
            rtype = 1;
        else if (t[0][0].xturn && t[1][1].xturn && t[2][2].xturn)
            rtype = -1;
        else if (t[0][0].oturn && t[1][1].oturn && t[2][2].oturn)
            rtype = 1;
        else if (t[0][2].xturn && t[1][1].xturn && t[2][0].xturn)
            rtype = -1;
        else if (t[0][2].oturn && t[1][1].oturn && t[2][0].oturn)
            rtype = 1;
        else {
            int num = 0;
            for(int row = 0; row  < 3; row++) {
                for(int col = 0; col < 3; col++) {
                    if(t[row][col].oturn || t[row][col].xturn) {
                        num++;
                    }
                }
            }
            if (num == 9) {
                rtype = 0;
            }
        }
        return rtype;
    }
    
    void winner() {
        if ((board[0][0].xturn && board[0][1].xturn && board[0][2].xturn) || (board[0][0].oturn && board[0][1].oturn && board[0][2].oturn)) {
            b1.setForeground(Color.green);
            b2.setForeground(Color.green);
            b3.setForeground(Color.green);
            endgame(false);
        }
        if ((board[1][0].xturn && board[1][1].xturn && board[1][2].xturn) || (board[1][0].oturn && board[1][1].oturn && board[1][2].oturn)) {
            b4.setForeground(Color.green);
            b5.setForeground(Color.green);
            b6.setForeground(Color.green);
            endgame(false);
        }
        if ((board[2][0].xturn && board[2][1].xturn && board[2][2].xturn) || (board[2][0].oturn && board[2][1].oturn && board[2][2].oturn)) {
            b7.setForeground(Color.green);
            b8.setForeground(Color.green);
            b9.setForeground(Color.green);
            endgame(false);
        }
        if ((board[0][0].xturn && board[1][0].xturn && board[2][0].xturn) || (board[0][0].oturn && board[1][0].oturn && board[2][0].oturn)) {
            b1.setForeground(Color.green);
            b4.setForeground(Color.green);
            b7.setForeground(Color.green);
            endgame(false);
        }
        if ((board[0][1].xturn && board[1][1].xturn && board[2][1].xturn) || (board[0][1].oturn && board[1][1].oturn && board[2][1].oturn)) {
            b2.setForeground(Color.green);
            b5.setForeground(Color.green);
            b8.setForeground(Color.green);
            endgame(false);
        }
        if ((board[0][2].xturn && board[1][2].xturn && board[2][2].xturn) || (board[0][2].oturn && board[1][2].oturn && board[2][2].oturn)) {
            b3.setForeground(Color.green);
            b6.setForeground(Color.green);
            b9.setForeground(Color.green);
            endgame(false);
        }
        if ((board[0][0].xturn && board[1][1].xturn && board[2][2].xturn) || (board[0][0].oturn && board[1][1].oturn && board[2][2].oturn)) {
            b1.setForeground(Color.green);
            b5.setForeground(Color.green);
            b9.setForeground(Color.green);
            endgame(false);
        }
        if ((board[0][2].xturn && board[1][1].xturn && board[2][0].xturn) || (board[0][2].oturn && board[1][1].oturn && board[2][0].oturn)) {
            b3.setForeground(Color.green);
            b5.setForeground(Color.green);
            b7.setForeground(Color.green);
            endgame(false);
        }
    }
    
    void endgame(boolean endorstart) {
            won = true;
            b1.setEnabled(endorstart);
            b2.setEnabled(endorstart);
            b3.setEnabled(endorstart);
            b4.setEnabled(endorstart);
            b5.setEnabled(endorstart);
            b6.setEnabled(endorstart);
            b7.setEnabled(endorstart);
            b8.setEnabled(endorstart);
            b9.setEnabled(endorstart);
    }
    
    private void RestartButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButActionPerformed
        endgame(true);
        turn = true;
        won = false;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b1.setForeground(Color.black);
        b2.setForeground(Color.black);
        b3.setForeground(Color.black);
        b4.setForeground(Color.black);
        b5.setForeground(Color.black);
        b6.setForeground(Color.black);
        b7.setForeground(Color.black);
        b8.setForeground(Color.black);
        b9.setForeground(Color.black);
        for(int row = 0; row < 3; row++) {
            for(int col = 0; col < 3; col++) {
                board[row][col] = new turnon();
            }
        }
    }//GEN-LAST:event_RestartButActionPerformed

    private void BasicBotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasicBotButtonActionPerformed
        BasicBotButton.setEnabled(false);
        MiniMaxButton.setEnabled(true);
        basicOrnot = true;
    }//GEN-LAST:event_BasicBotButtonActionPerformed

    private void MiniMaxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiniMaxButtonActionPerformed
        BasicBotButton.setEnabled(true);
        MiniMaxButton.setEnabled(false);
        basicOrnot = false;
    }//GEN-LAST:event_MiniMaxButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TheBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BasicBotButton;
    private javax.swing.JButton MiniMaxButton;
    private javax.swing.JButton RestartBut;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton8;
    // End of variables declaration//GEN-END:variables
}
