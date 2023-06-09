/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mcs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Mohomed Faizal Aadil
 */
public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form Doctor
     */
    public Doctor() {
        setResizable(false);
        initComponents();
         tblAppointments.setAutoCreateRowSorter(true);
           show_doctor();
        tblShowDoctors.setAutoCreateRowSorter(true);
    }

     public ArrayList<Doctors> doctorList(){
        ArrayList<Doctors> doctorList = new ArrayList<>();
        try{
                    Connection con = ChannellingDB.myConnection();                  
                    String sql = "SELECT * FROM doctordetails";
                    PreparedStatement pst = con.prepareStatement(sql);

                 ResultSet rs = pst.executeQuery();
                 Doctors doctor;

                 while(rs.next()){
                     doctor =new Doctors(rs.getInt("dID"),rs.getString("dName"),rs.getString("dSpeciality"));
                    doctorList.add(doctor);   
                 
                 }
        }catch(Exception e){
            System.out.println(e);
        }
        return doctorList;
    }
    
    public void show_doctor(){
            ArrayList<Doctors> list = doctorList();
            DefaultTableModel model = (DefaultTableModel) tblShowDoctors.getModel();
            Object[] row = new Object [3];
            for(int i=0;i<list.size();i++){
                
                row[0]=list.get(i).getdName();
                row[1]=list.get(i).getdSpeciality();
                model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAppointments = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFee = new javax.swing.JTextField();
        txtDName = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblShowDoctors = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(223, 246, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\ICBT FI\\Sem 4\\FINAL PRO\\Now\\Final Project codes\\MCS\\Images\\icons8-doctor-64.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Orator Std", 0, 36)); // NOI18N
        jLabel2.setText("DOCTOR");

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\ICBT FI\\Sem 4\\FINAL PRO\\Now\\Final Project codes\\MCS\\Images\\icons8-search-40.png")); // NOI18N

        txtSearch.setBackground(new java.awt.Color(223, 246, 255));
        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 100));

        jPanel2.setBackground(new java.awt.Color(59, 172, 182));

        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Calculate Total");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment No", "Appointment Date", "Appointment Time", "Patient Title", "Patient First Name", "Patient Last Name", "Patient Contact No", "Patient Age", "Doctor Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAppointments.getTableHeader().setReorderingAllowed(false);
        tblAppointments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAppointmentsKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblAppointments);

        jLabel10.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel10.setText("Fee per session Rs.");

        jLabel11.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel11.setText("Doctor Name");

        txtDName.setEnabled(false);

        tblShowDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Name", "Doctor Speciality"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblShowDoctors.getTableHeader().setReorderingAllowed(false);
        tblShowDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowDoctorsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblShowDoctors);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFee, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtDName))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtDName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1070, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login logout = null;
        try {
            logout = new Login();
        } catch (SQLException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex,"ERROR!",JOptionPane.ERROR_MESSAGE);
        }
        logout.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String search = txtSearch.getText();
        DefaultTableModel dtm = (DefaultTableModel) tblAppointments.getModel();

        try {
            Statement s = ChannellingDB.myConnection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex,"DATABASE ERROR!",JOptionPane.ERROR_MESSAGE);
        }

        int r = tblAppointments.getRowCount();
        while(r-- > 0){
            dtm.removeRow(r);
        }
        try{
            ResultSet rs;
            rs = getAppointmentDet.getData(search);

            while(rs.next()){
                 String ptitle = rs.getString("pTitle");
                String pFname = rs.getString("pFname");
                 String pLname = rs.getString("pLname");
                 String pcontactno = rs.getString("pContactno");
                 String page = rs.getString("pAge");
                 String dname = rs.getString("dName");
                 
                Base64.Decoder decoder;
                decoder = Base64.getDecoder();
                    byte[] Ptitle = decoder.decode(ptitle);
                    String dPtitle = new String(Ptitle);
                    
                    byte[] PFname = decoder.decode(pFname);
                    String dPFname = new String(PFname);
                    
                      byte[] PLname = decoder.decode(pLname);
                    String dPLname = new String(PLname);
                    
                    byte[] Page = decoder.decode(page);
                    String dPage = new String(Page);
                    
                
        
                java.util.Vector v = new java.util.Vector();
                
                v.add(rs.getString("AppointmentNo"));
                v.add(rs.getString("AppointmentDate"));
                v.add(rs.getString("AppointmentTime"));
                v.add(dPtitle);
                v.add(dPFname);
                v.add(dPLname);
                v.add(pcontactno);
                 v.add(dPage);
                  v.add(dname);

                dtm.addRow(v);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this,ex,"ERROR!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tblAppointmentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAppointmentsKeyReleased

    }//GEN-LAST:event_tblAppointmentsKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String Doctor = txtDName.getText();
        
        
        try{
           String Fee=txtFee.getText();
           int cost=Integer.parseInt(Fee);
           int tot = 0;
           Connection con=ChannellingDB.myConnection();
        
           String query = "select count(*) from appointment where dName=?";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1,Doctor);
            
            //Executing the query
            
            
            ResultSet rs = stmt.executeQuery();
            //Retrieving the result
            rs.next();
            int count = rs.getInt(1);
            tot = count*cost;
            //System.out.println(tot);
            JOptionPane.showMessageDialog(this, "The Total Income is "+tot);
           }catch(Exception e){
           JOptionPane.showMessageDialog(this, e);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblShowDoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowDoctorsMouseClicked
        int i=tblShowDoctors.getSelectedRow();
        TableModel model=tblShowDoctors.getModel();

        txtDName.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_tblShowDoctorsMouseClicked

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAppointments;
    private javax.swing.JTable tblShowDoctors;
    private javax.swing.JTextField txtDName;
    private javax.swing.JTextField txtFee;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
