/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;

/**
 *
 * @author FG
 */
public class FrmAbout extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    private Connection conn;
    
    public FrmAbout(Connection conn) {
        this.conn=conn;
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AMA | v.1");
        setMinimumSize(new java.awt.Dimension(1070, 800));
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/AMA - About Us.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 280, 410, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/AMA - 3 Admin.gif"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 370, 450, 150);

        jLabel1.setFont(new java.awt.Font("Orator Std", 0, 15)); // NOI18N
        jLabel1.setText("C O D I N G ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 520, 110, 30);

        jLabel7.setFont(new java.awt.Font("Orator Std", 0, 15)); // NOI18N
        jLabel7.setText("C O D I N G ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 520, 130, 30);

        jLabel8.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        jLabel8.setText("D E S I G N E R");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 520, 130, 30);

        jLabel5.setFont(new java.awt.Font("Orator Std", 0, 15)); // NOI18N
        jLabel5.setText("JEFFREY.A");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 550, 100, 20);

        jLabel6.setFont(new java.awt.Font("Orator Std", 0, 15)); // NOI18N
        jLabel6.setText("FENDY.G");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 550, 80, 20);

        jLabel9.setFont(new java.awt.Font("Orator Std", 0, 15)); // NOI18N
        jLabel9.setText("HENRY.T");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 550, 80, 20);

        jLabel11.setFont(new java.awt.Font("Orator Std", 0, 24)); // NOI18N
        jLabel11.setText(" be part of the solution\"");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 650, 370, 40);

        jLabel12.setFont(new java.awt.Font("Orator Std", 0, 24)); // NOI18N
        jLabel12.setText("\"whatever the problem");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 600, 310, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/tumblr_nkqtlyLSDt1u68awfo1_400.gif"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(420, 550, 340, 210);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 50, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/background.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1070, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
       FrmMain main= new FrmMain();
       main.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
