/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import mycode.dbconnect;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PK
 */
public class addmember extends javax.swing.JInternalFrame {
         
    Connection con =null;
    PreparedStatement uc = null;
    ResultSet rs = null;
    
    public addmember() {
        initComponents();
       
        con = dbconnect.conn();
        // DB Connection
        
        tableload();
      // Tableload
    }

    public void tableload(){
        
          try{
           String sql= "SELECT member_ID,Member_Name,NIC_No,Address,Phone_No,Email FROM member"; 
               uc = con.prepareStatement(sql);
             rs = uc.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            
        }     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        stlbl13 = new javax.swing.JLabel();
        stlbl14 = new javax.swing.JLabel();
        stlbl15 = new javax.swing.JLabel();
        stlbl16 = new javax.swing.JLabel();
        stlbl17 = new javax.swing.JLabel();
        stlbl18 = new javax.swing.JLabel();
        stnamebox = new javax.swing.JTextField();
        stnumbox = new javax.swing.JTextField();
        stphonebox = new javax.swing.JTextField();
        addrecord2 = new javax.swing.JButton();
        addB5 = new javax.swing.JButton();
        reset3 = new javax.swing.JButton();
        Exit3 = new javax.swing.JButton();
        update3 = new javax.swing.JButton();
        stadd = new javax.swing.JTextField();
        stemailbox = new javax.swing.JTextField();
        stnicbox = new javax.swing.JTextField();
        searchbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("LMS");

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Member", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 36), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        stlbl13.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl13.setText("Name");

        stlbl14.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl14.setText("Member ID");

        stlbl15.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl15.setText("Address ");

        stlbl16.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl16.setText("NIC No");

        stlbl17.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl17.setText("Phone_No");

        stlbl18.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl18.setText("Email");

        stnamebox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        stnumbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        stphonebox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        addrecord2.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        addrecord2.setText("Save Record");
        addrecord2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrecord2addrecordActionPerformed(evt);
            }
        });

        addB5.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        addB5.setText(" Delete Record");
        addB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addB5addB3ActionPerformed(evt);
            }
        });

        reset3.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        reset3.setText("Reset");
        reset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset3reset1ActionPerformed(evt);
            }
        });

        Exit3.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        Exit3.setText("Member ID");
        Exit3.setActionCommand("Search");
        Exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit3Exit1ActionPerformed(evt);
            }
        });

        update3.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        update3.setText("Update Record");
        update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update3update1ActionPerformed(evt);
            }
        });

        stadd.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        stemailbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        stnicbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        searchbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(addrecord2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(433, 433, 433))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(stlbl16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(stnicbox, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(stlbl14)
                                                .addGap(41, 41, 41))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(stlbl13)
                                                .addGap(81, 81, 81)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(stnumbox, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(stnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(22, 22, 22))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(update3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addB5)
                                .addGap(48, 48, 48)))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stlbl17)
                            .addComponent(stlbl15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stlbl18))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stphonebox, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stadd, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stemailbox, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(reset3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(Exit3)
                        .addGap(44, 44, 44)
                        .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stlbl15)
                    .addComponent(stadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stnumbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stlbl14))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stlbl17)
                    .addComponent(stphonebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stlbl13))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stlbl16)
                            .addComponent(stnicbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stlbl18)
                            .addComponent(stemailbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addrecord2)
                    .addComponent(addB5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset3)
                    .addComponent(Exit3)
                    .addComponent(update3)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Member ID", "Member Name", "NIC No", "Address", "Phone No", "Email"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addrecord2addrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrecord2addrecordActionPerformed

        String id = stnumbox.getText();
        String name = stnamebox.getText();
        String nic = stnicbox.getText();
        String add = stadd.getText();
        String phon = stphonebox.getText();
        String ema = stemailbox.getText();

        try{
            String q = "INSERT INTO member (member_ID,Member_Name,NIC_No,Address,Phone_No,Email) values ('"+id+"','"+name+"','"+nic+"','"+add+"','"+phon+"','"+ema+"')";
            uc = con.prepareStatement(q);
            uc.execute();

         tableload();
      // Tableload
        } catch (Exception e) {

        }
    }//GEN-LAST:event_addrecord2addrecordActionPerformed

    private void addB5addB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addB5addB3ActionPerformed
       
        int y = JOptionPane.showConfirmDialog(null,"Do You want to Update");
        if (y==0){
        
            String id =stnumbox.getText();

        String sql = "DELETE from member where member_ID='"+id+"'";
        try{
            uc = con.prepareStatement(sql);
            uc.execute();

            tableload();
        } catch (Exception e) {

        }
        
     }
      // Record Delete:
    }//GEN-LAST:event_addB5addB3ActionPerformed

    private void reset3reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset3reset1ActionPerformed
        stnamebox.setText("");
        stnumbox.setText("");
        stnicbox.setText("");
        stphonebox.setText("");
        stadd.setText("");
        stemailbox.setText("");
    }//GEN-LAST:event_reset3reset1ActionPerformed

    private void Exit3Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit3Exit1ActionPerformed
        
        String name = searchbox.getText();
        
         String sql = "SELECT member_ID,Member_Name,NIC_No,Address,Phone_No,Email FROM member where Member_Name LIKE '%"+name+"%'";
        try{
            uc = con.prepareStatement(sql);
            rs = uc.executeQuery();

        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
 
      // Tableload
        } catch (Exception e) {

        }
    }//GEN-LAST:event_Exit3Exit1ActionPerformed

    private void update3update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update3update1ActionPerformed
        
     int x = JOptionPane.showConfirmDialog(null,"Do You want to Update");
     if (x==0){
    
       String id = stnumbox.getText();
        String name = stnamebox.getText();
        String nic = stnicbox.getText();
        String add = stadd.getText();
        String phon = stphonebox.getText();
        String ema = stemailbox.getText();
     
        String sql = "UPDATE member SET Member_Name='"+name+"',NIC_No='"+nic+"',Address='"+add+"',Phone_No='"+phon+"',Email='"+ema+"' where member_ID='"+id+"'";
        try{
         uc = con.prepareStatement(sql);
          uc.execute();

            tableload();
        } catch (Exception e) {

        }
     }
         
    }//GEN-LAST:event_update3update1ActionPerformed
// Record Update:
    private void jPanel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3AncestorAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int ro = jTable1.getSelectedRow();
        
        String id = jTable1.getValueAt(ro, 0).toString();
         String name = jTable1.getValueAt(ro, 1).toString();
          String nic = jTable1.getValueAt(ro, 2).toString();
           String add = jTable1.getValueAt(ro, 3).toString();
            String phon = jTable1.getValueAt(ro, 4).toString();
             String ema = jTable1.getValueAt(ro, 5).toString();

             stnumbox.setText(id);
            stnamebox.setText(name);
           stnicbox.setText(nic);
          stadd.setText(add);
         stphonebox.setText(phon);
        stemailbox.setText(ema);

    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit3;
    private javax.swing.JButton addB5;
    private javax.swing.JButton addrecord2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton reset3;
    private javax.swing.JTextField searchbox;
    private javax.swing.JTextField stadd;
    private javax.swing.JTextField stemailbox;
    private javax.swing.JLabel stlbl13;
    private javax.swing.JLabel stlbl14;
    private javax.swing.JLabel stlbl15;
    private javax.swing.JLabel stlbl16;
    private javax.swing.JLabel stlbl17;
    private javax.swing.JLabel stlbl18;
    private javax.swing.JTextField stnamebox;
    private javax.swing.JTextField stnicbox;
    private javax.swing.JTextField stnumbox;
    private javax.swing.JTextField stphonebox;
    private javax.swing.JButton update3;
    // End of variables declaration//GEN-END:variables
}
