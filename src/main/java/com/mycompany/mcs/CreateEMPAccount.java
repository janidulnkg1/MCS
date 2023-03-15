/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mcs;

import java.awt.Color;
import java.sql.Statement;
import java.util.Base64;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohomed Faizal Aadil
 */
public class CreateEMPAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateEMPAccount
     */
    public CreateEMPAccount() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCPass = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        btnCreateEmpAcc = new javax.swing.JButton();
        lblPASS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(223, 246, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1097, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\ICBT FI\\Sem 4\\FINAL PRO\\Latest\\Final Project codes\\MCS\\Images\\icons8-employee-64.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Orator Std", 0, 36)); // NOI18N
        jLabel2.setText("EMPLOYEE CREATE ACCOUNT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(429, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        jPanel2.setBackground(new java.awt.Color(59, 172, 182));

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel3.setText("First Name");

        txtFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFnameFocusLost(evt);
            }
        });
        txtFname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFnameMouseClicked(evt);
            }
        });

        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel4.setText("Last Name");

        txtLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLnameFocusLost(evt);
            }
        });
        txtLname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLnameMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel5.setText("User Name");

        jLabel6.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel7.setText("Confirm Password");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreateEmpAcc.setText("Create Account");
        btnCreateEmpAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmpAccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(83, 83, 83)
                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPASS, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                                .addComponent(txtPass)
                                .addComponent(txtUname, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                                .addComponent(txtCPass)))))
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateEmpAcc)
                .addGap(122, 122, 122))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPASS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnCreateEmpAcc))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1070, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEmpAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmpAccActionPerformed
         String firstName = txtFname.getText();
    String lastName = txtLname.getText();
    String userName = txtUname.getText();
    String Password = txtPass.getText().trim();
    String conPassword = txtCPass.getText().trim();
    String userType = "Receptionist";
    
        Base64.Encoder encoder = Base64.getEncoder();
        
       
        
        String ePassword = encoder.encodeToString(Password.getBytes());
       
        
   int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to create a RECEPTIONIST account?", "ADD USER",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(response==JOptionPane.YES_OPTION){ 
    
            if (Password.equals(conPassword))
               {              
                 try {             
                      Statement s = ChannellingDB.myConnection().createStatement();
                 s.executeUpdate(" INSERT INTO userdetails (loginUsername,loginPassword,userType) VALUES ('"+userName+"','"+ePassword+"','"+userType+"') "); 
                  s.executeUpdate(" INSERT INTO employeedetails (eName) VALUES ('"+firstName+" "+lastName+"') ");
                 JOptionPane.showMessageDialog(this, "Employee Details have been saved!");

                    txtFname.setText(null);
                    txtLname.setText(null);
                    txtUname.setText(null);
                    txtPass.setText(null);
                    txtCPass.setText(null);

                        } 
                 catch (Exception e) {
                     JOptionPane.showMessageDialog(this,e,"ERROR!",JOptionPane.ERROR_MESSAGE);;       
                 }         
                }
            else
                {
                JOptionPane.showMessageDialog(this,"Passwords Do not Match!","Password Error",JOptionPane.ERROR_MESSAGE);
                txtPass.setText(null);
                txtCPass.setText(null);
                }
        }
    }//GEN-LAST:event_btnCreateEmpAccActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
 new Admin().setVisible(true);
this.setVisible(false);     
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        int upperCount = 0 ;
        int lowerCount = 0 ;
                             
        int digitCount = 0 ;
        String password = txtPass.getText();  
        
        if(password.equals("")){
            lblPASS.setText("Password field cannot be Empty!!");
        }else{
              
        int inputLen = password.length();
         
        for ( int i = 0 ; i < inputLen ; i ++ ) {
                char ch = password.charAt(i);
            if ( Character.isUpperCase ( ch ) ){
                upperCount ++ ;
            }else if ( Character.isLowerCase ( ch ) ){
                lowerCount ++ ;
            }else if ( Character.isDigit ( ch ) ){
                digitCount ++ ;
            }
        }
        if(upperCount >= 3 && lowerCount >= 3 && digitCount >= 1){
             //System.out.println ( " Valid password " ) ;
              lblPASS.setText("Password is Valid");
        }else{
            String up = "Uppercase letters";
            String low = "Lowercase letters";
            String digit = "Numbers";
            if ( upperCount < 3 ){
                //up = "Uppercase letters";
                JOptionPane.showMessageDialog(this, "The password did not have enough of the following: "+up+"");
            } if ( lowerCount < 3 ){
                //low = "Lowercase letters";
                JOptionPane.showMessageDialog(this, "The password did not have enough of the following: "+low+"");
            } if ( digitCount < 1 ){
                //digit = "Numbers";
                JOptionPane.showMessageDialog(this, "The password did not have enough of the following: "+digit+"");
            }
            //JOptionPane.showMessageDialog(this, "The password did not have enough of the following: "+up+" "+low+" "+digit+"");
        }
        }
    }//GEN-LAST:event_txtPassFocusLost

    private void txtFnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFnameFocusLost
        int lowerCount = 0 ;
                             
        int digitCount = 0 ;
        int charCount = 0 ;
        //txtFname.setForeground(Color.black);
        String name = txtFname.getText();  
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(this,"This textbox cannot be Empty!!");
            
        }else{
          
        String output = name.substring(0,1).toUpperCase() + name.substring(1);
        
        int inputLen = name.length();
         
          for ( int i = 0 ; i < inputLen ; i ++ ) {
                char ch = name.charAt(i);
            if ( Character.isLowerCase ( ch ) ){
                lowerCount ++ ;
            }else if ( Character.isDigit ( ch ) ){
                digitCount ++ ;
            }else if (Character.isSpaceChar(ch)){
                charCount ++ ;
            }
        }
        if(lowerCount >= 2 && digitCount == 0 && charCount == 0){
             txtFname.setText(output);
             
        }else{
             
            if ( lowerCount < 2 ){
                //low = "Lowercase letters";
                JOptionPane.showMessageDialog(this, "Enter atleast 2 lowercase letters");
            } if ( digitCount > 0 ){
                //digit = "Numbers";
                JOptionPane.showMessageDialog(this, "Digits or Numbers aren't allowed");
            } if (charCount > 0){
                JOptionPane.showMessageDialog(this, "Spaces are not allowed");
            }
            //JOptionPane.showMessageDialog(this, "The password did not have enough of the following: "+up+" "+low+" "+digit+"");
        }
        }
    }//GEN-LAST:event_txtFnameFocusLost

    private void txtFnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFnameMouseClicked
        txtFname.setText(null);
    }//GEN-LAST:event_txtFnameMouseClicked

    private void txtLnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLnameFocusLost
        int lowerCount = 0 ;
                             
        int digitCount = 0 ;
        int charCount = 0 ;
        //txtFirstName.setForeground(Color.black);
        String name = txtLname.getText();  
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(this,"This textbox cannot be Empty!!");
            
        }else{
          
        String output = name.substring(0,1).toUpperCase() + name.substring(1);
        
        int inputLen = name.length();
         
          for ( int i = 0 ; i < inputLen ; i ++ ) {
                char ch = name.charAt(i);
            if ( Character.isLowerCase ( ch ) ){
                lowerCount ++ ;
            }else if ( Character.isDigit ( ch ) ){
                digitCount ++ ;
            }else if (Character.isSpaceChar(ch)){
                charCount ++ ;
            }
        }
        if(lowerCount >= 2 && digitCount == 0 && charCount == 0){
             txtLname.setText(output);
             
        }else{
             
            if ( lowerCount < 2 ){
                //low = "Lowercase letters";
                JOptionPane.showMessageDialog(this, "Enter atleast 2 lowercase letters");
            } if ( digitCount > 0 ){
                //digit = "Numbers";
                JOptionPane.showMessageDialog(this, "Digits or Numbers aren't allowed");
            } if (charCount > 0){
                JOptionPane.showMessageDialog(this, "Spaces are not allowed");
            }
            //JOptionPane.showMessageDialog(this, "The password did not have enough of the following: "+up+" "+low+" "+digit+"");
        }
        }
    }//GEN-LAST:event_txtLnameFocusLost

    private void txtLnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLnameMouseClicked
        txtLname.setText(null);
    }//GEN-LAST:event_txtLnameMouseClicked

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
            java.util.logging.Logger.getLogger(CreateEMPAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateEMPAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateEMPAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateEMPAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateEMPAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEmpAcc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPASS;
    private javax.swing.JPasswordField txtCPass;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}