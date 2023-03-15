/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mcs;

import java.io.IOException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohomed Faizal Aadil
 */
public class Login extends javax.swing.JFrame {

    Connection con = ChannellingDB.myConnection();
    //ResultSet rs = null;
    PreparedStatement pst;
    //Statement pst;
    ResultSet rs;
    
    int attempt=1;
   
    
    /**
     * Creates new form Login
     */
    public Login() throws SQLException {
        setResizable(false);
        initComponents();
        
     
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLoginUsername = new javax.swing.JTextField();
        txtLoginPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login page");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel2.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Nueva Std", 0, 18)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Nueva Std", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        txtLoginUsername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLoginUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLoginUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLoginUsernameMouseClicked(evt);
            }
        });

        txtLoginPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLoginPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLoginPasswordMouseClicked(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(183, 182, 182));
        btnLogin.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtLoginPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(txtLoginUsername)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 340, 330));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel5.setText("WELCOME TO MEDICAL CHANNELING SYSTEM");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 870, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\ICBT FI\\Sem 4\\FINAL PRO\\Now\\Final Project codes\\MCS\\Images\\Healthcare.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 0, -1, -1));

        setSize(new java.awt.Dimension(1086, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLoginUsernameMouseClicked
        // TODO add your handling code here:
        txtLoginUsername.setText("");
    }//GEN-LAST:event_txtLoginUsernameMouseClicked

    private void txtLoginPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLoginPasswordMouseClicked
        // TODO add your handling code here:
        txtLoginPassword.setText("");
    }//GEN-LAST:event_txtLoginPasswordMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtLoginUsername.getText();
        String password = txtLoginPassword.getText();
        String admin = "Admin";
        String doctor = "Doctor";
        String receptionist = "Receptionist";
        
           Base64.Encoder encoder = Base64.getEncoder();
       
        String ePassword = encoder.encodeToString(password.getBytes());
         
                  
           if (username.equals("")){
             JOptionPane.showMessageDialog(this,"Please Type your Username!","Username field empty!",JOptionPane.WARNING_MESSAGE);
             txtLoginUsername.requestFocus();
        }else if (password.equals("")){
            JOptionPane.showMessageDialog(this,"Please Type your Password!","Password field empty!",JOptionPane.WARNING_MESSAGE);  
            txtLoginPassword.requestFocus();
        }
        
        if(attempt<3){         
            try{
                
                

                            String sql = " SELECT * FROM userdetails WHERE loginUsername=? AND loginPassword=? ";
                            pst= con.prepareStatement(sql);

                            pst.setString(1,username);
                            pst.setString(2,ePassword);                  

                            rs = pst.executeQuery();

                             if((username.contains("admin")) && (password.contains("admin@MCS"))) {
                                  JOptionPane.showMessageDialog(rootPane,"Admin Login Successful!");   
                                 new Admin().setVisible(true);
                                     this.setVisible(false);   
                             }else if (rs.next()) {                  
                                String usertype = rs.getString("userType");
                                  if(usertype.equals(doctor)){
                                     JOptionPane.showMessageDialog(rootPane,"Doctor Login Successful!");
                                     new Doctor().setVisible(true);
                                     this.setVisible(false);
                                  }else if(usertype.equals(receptionist)){
                                     JOptionPane.showMessageDialog(rootPane,"Receptionist Login Successful!");
                                     new Receptionist().setVisible(true);
                                     this.setVisible(false);                                                                                                         
                                 }

                             }else{
                                     JOptionPane.showMessageDialog(this,"Login Error! Try again with Correct Credentials!"," Invalid Login Attempt "+attempt,JOptionPane.WARNING_MESSAGE);
                                     txtLoginUsername.setText("");
                                    txtLoginPassword.setText(""); 
                                 }

            }catch (Exception e){
            JOptionPane.showMessageDialog(this,e,"ERROR!",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(attempt!=2){
                JOptionPane.showMessageDialog(this,"Invalid Login Attempts Exceeded! System will now restart!"," Invalid Login Attempt "+attempt,JOptionPane.WARNING_MESSAGE);
                 Runtime r = Runtime.getRuntime();
            try {
                r.exec("shutdown -r -t 1" );
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
                this.dispose();
        }        
        attempt++;
       
        
        
               
     
        
        
        
        
       // if ((username.contains("admin")) && (password.contains("admin@MCS")))
                {
                   // new Admin().setVisible(true);
                     //this.setVisible(false);
                }
    }//GEN-LAST:event_btnLoginActionPerformed

  
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtLoginPassword;
    private javax.swing.JTextField txtLoginUsername;
    // End of variables declaration//GEN-END:variables
}