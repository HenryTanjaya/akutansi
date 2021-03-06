/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import admin.FrmAdmin;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.DbConn;
import util.Sutil;

/**
 *
 * @author FG
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    private Connection conn;

    public FrmMain() {
        initComponents();
        databaseConnection();
        setLocationRelativeTo(null);
        txtID.requestFocusInWindow();
    }

    private void databaseConnection() {
        try {
            Class.forName(DbConn.JDBC_CLASS);
            conn = DriverManager.getConnection(DbConn.JDBC_URL,
                    DbConn.JDBC_USERNAME,
                    DbConn.JDBC_PASSWORD);
            if (conn != null) {
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error:\n" + ex.getLocalizedMessage());
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

        btnActivate = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AMA | v.1");
        setMinimumSize(new java.awt.Dimension(1070, 800));
        getContentPane().setLayout(null);

        btnActivate.setText("Activate");
        btnActivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivateActionPerformed(evt);
            }
        });
        getContentPane().add(btnActivate);
        btnActivate.setBounds(290, 503, 160, 40);

        txtID.setText("admin");
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(280, 420, 175, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 460, 160, 30);

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPass.setText("admin");
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        getContentPane().add(txtPass);
        txtPass.setBounds(280, 460, 175, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/AMA - Ask Me Anything.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 320, 490, 80);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Username");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 420, 160, 30);

        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/sign_up.gif"))); // NOI18N
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignUp);
        btnSignUp.setBounds(40, 600, 490, 140);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Ooops ! If you are new in here , Sign Up & Create your Account to access !");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 550, 690, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText(">About Us");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(890, 490, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/background.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 1050, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed

    }//GEN-LAST:event_txtIDActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed

    }//GEN-LAST:event_txtPassActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        this.setVisible(false);
        FrmRegistration regis = new FrmRegistration(conn);
        regis.setVisible(true);

    }//GEN-LAST:event_btnSignUpActionPerformed

    public static String UID;
    public static String pass;

    private void btnActivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivateActionPerformed
        if ((!txtID.getText().trim().isEmpty()) && (!txtPass.getText().trim().isEmpty())) {
            checkMember();
            if (countmember > 0) {
                executeActivate();

            } else {
                Sutil.msg(this, "User unidentified!");
            }
        } else {
            Sutil.msg(this, "Some field is still empty.");
        }
    }//GEN-LAST:event_btnActivateActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       this.setVisible(false);
       FrmAbout about = new FrmAbout(conn);
       about.setVisible(true);
       
    }//GEN-LAST:event_jLabel2MouseClicked

    public int countmember;
    public String status;

    public void checkMember() {

        try {
            String sql = "SELECT  COUNT(id_member) as counter FROM akuntansi.member WHERE uid =?;";

            PreparedStatement pstatement = conn.prepareStatement(sql);
            pstatement.setString(1, txtID.getText().trim());

            ResultSet rs = pstatement.executeQuery();

            while (rs.next()) {
                countmember = rs.getInt("counter");
            }

            rs.close();
            pstatement.close();
            Sutil.msg(this, "Counter: " + countmember);

        } catch (SQLException ex) {
            System.out.println("Error:\n" + ex.getLocalizedMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivate;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables

    private void executeActivate() {
        try {
            String sql = "SELECT * FROM akuntansi.member WHERE uid =? and password=?;";

            PreparedStatement pstatement = conn.prepareStatement(sql);
            pstatement.setString(1, txtID.getText().trim());
            pstatement.setString(2, txtPass.getText().trim());

            ResultSet rs = pstatement.executeQuery();

            while (rs.next()) {
                UID = rs.getString("uid");
                pass = rs.getString("password");
            }
            
            
                if (txtID.getText().trim().toLowerCase().equals(UID) && txtPass.getText().trim().equals(pass)) {
                    FrmAdmin admin = new FrmAdmin(conn);
                    this.setVisible(false);
                    admin.setVisible(true);

                } else {
                    Sutil.msg(this, "Username/password is incorrect.");
                }

            rs.close();
            pstatement.close();
        } catch (SQLException ex) {
            System.out.println("Error:\n" + ex.getLocalizedMessage());
        }

    }
}
