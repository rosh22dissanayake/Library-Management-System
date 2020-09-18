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
public class bookissue extends javax.swing.JInternalFrame {

   Connection con =null;
    PreparedStatement uc = null;
    ResultSet rs = null;
    public bookissue() {
        initComponents();
        
         con = dbconnect.conn();
        // DB Connection
        
        tableload();
      // Tableload
    }

   public void tableload(){
        
          try{
           String sql= "SELECT issue_id,member_id,member_name,book_id,book_name,issue_date,return_date FROM details"; 
               uc = con.prepareStatement(sql);
             rs = uc.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            
        }     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        stlbl1 = new javax.swing.JLabel();
        stlbl2 = new javax.swing.JLabel();
        stlbl4 = new javax.swing.JLabel();
        stlbl3 = new javax.swing.JLabel();
        stlbl5 = new javax.swing.JLabel();
        stlbl6 = new javax.swing.JLabel();
        idbox = new javax.swing.JTextField();
        issueidbox = new javax.swing.JTextField();
        issuebox = new javax.swing.JTextField();
        addrecord = new javax.swing.JButton();
        addB3 = new javax.swing.JButton();
        reset1 = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        bnamebox = new javax.swing.JTextField();
        returnbox = new javax.swing.JTextField();
        namebox = new javax.swing.JTextField();
        stlbl7 = new javax.swing.JLabel();
        bidbox = new javax.swing.JTextField();
        Exit3 = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("LMS");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book  Issue & Return", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 36), new java.awt.Color(102, 0, 0))); // NOI18N

        stlbl1.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl1.setText("Member_ID");

        stlbl2.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl2.setText("Book_Issue_ID");

        stlbl4.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl4.setText("Book  Name");

        stlbl3.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl3.setText("Member _Name");

        stlbl5.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl5.setText("Issue Date");

        stlbl6.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl6.setText("Return Date");

        idbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        issueidbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        issuebox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        addrecord.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        addrecord.setText("Save Record");
        addrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrecordActionPerformed(evt);
            }
        });

        addB3.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        addB3.setText(" Delete Record");
        addB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addB3ActionPerformed(evt);
            }
        });

        reset1.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        reset1.setText("Reset");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });

        update1.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        update1.setText("Update Record");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });

        bnamebox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        returnbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        namebox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        stlbl7.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl7.setText("Book_ ID");

        bidbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        Exit3.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        Exit3.setText("Search Book Issue ID");
        Exit3.setActionCommand("Search");
        Exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit3Exit1ActionPerformed(evt);
            }
        });

        searchbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(addrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addB3)
                .addGap(27, 27, 27)
                .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Exit3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stlbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stlbl3))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(stlbl1)
                        .addGap(56, 56, 56)
                        .addComponent(idbox, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(stlbl2)
                        .addGap(27, 27, 27)
                        .addComponent(issueidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(stlbl4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stlbl6)
                            .addComponent(stlbl5))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(issuebox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(issueidbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stlbl2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stlbl4)
                            .addComponent(bnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stlbl5)
                        .addComponent(issuebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stlbl1))
                    .addComponent(idbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stlbl6)
                    .addComponent(returnbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stlbl3)
                    .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stlbl7)
                    .addComponent(bidbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Exit3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(update1)
                        .addComponent(addB3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reset1)
                        .addComponent(addrecord)))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Issue ID", "Member ID", "Member Name", "Book ID", "Book Name", "Issue Date", "Return Date"
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrecordActionPerformed

        String iid = issueidbox.getText();
        String id = idbox.getText();
        String name = namebox.getText();
        String bid = bidbox.getText();
        String bname = bnamebox.getText();
        String iss = issuebox.getText();
        String ret = returnbox.getText();

        try{
            String q = "INSERT INTO details (issue_id,member_id,member_name,book_id,book_name,issue_date,return_date) values ('"+iid+"','"+id+"','"+name+"','"+bid+"','"+bname+"','"+iss+"','"+ret+"')";
            uc = con.prepareStatement(q);
            uc.execute();

            tableload();
      // Tableload
        } catch (Exception e) {

        }
    }//GEN-LAST:event_addrecordActionPerformed

    private void addB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addB3ActionPerformed
        
        int y = JOptionPane.showConfirmDialog(null,"Do You want to Update");
        if (y==0){
        
            String iid = issueidbox.getText();
            
        String sql = "DELETE from details where issue_id='"+iid+"'";
        try{
            uc = con.prepareStatement(sql);
            uc.execute();

            tableload();
        } catch (Exception e) {

        }
        
     }
      // Record Delete:
    }//GEN-LAST:event_addB3ActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        idbox.setText("");
        issueidbox.setText("");
        namebox.setText("");
        bidbox.setText("");
        issuebox.setText("");
        bnamebox.setText("");
        returnbox.setText("");
    }//GEN-LAST:event_reset1ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        
     int x = JOptionPane.showConfirmDialog(null,"Do You want to Update");
     
     if (x==0){
    
        String iid = issueidbox.getText();
        String id = idbox.getText();
        String name = namebox.getText();
        String bid = bidbox.getText();
        String bname = bnamebox.getText();
        String iss = issuebox.getText();
        String ret = returnbox.getText();
     
        String sql = "UPDATE details SET member_id='"+id+"',member_name='"+name+"',book_id='"+bid+"',book_name='"+bname+"',issue_date='"+iss+"',return_date='"+ret+"' where issue_id='"+iid+"'";
        try{
         uc = con.prepareStatement(sql);
          uc.execute();

            tableload();
        } catch (Exception e) {

        }
     }
         
    // Record Update:

    }//GEN-LAST:event_update1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    int ro = jTable1.getSelectedRow();
        
        String iid = jTable1.getValueAt(ro, 0).toString();
         String id = jTable1.getValueAt(ro, 1).toString();
          String name = jTable1.getValueAt(ro, 2).toString();
           String bid = jTable1.getValueAt(ro, 3).toString();
            String bname = jTable1.getValueAt(ro, 4).toString();
             String iss = jTable1.getValueAt(ro, 5).toString();
              String ret = jTable1.getValueAt(ro, 6).toString();
        
             issueidbox.setText(iid);
            idbox.setText(id);
           namebox.setText(name);
           bidbox.setText(bid);
          bnamebox.setText(bname);
         issuebox.setText(iss);
        returnbox.setText(ret);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void Exit3Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit3Exit1ActionPerformed

        String id = searchbox.getText();

        String sql = "SELECT issue_id,member_id,member_name,book_id,book_name,issue_date,return_date FROM details where issue_id LIKE '%"+id+"%'";
        try{
            uc = con.prepareStatement(sql);
            rs = uc.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            // Tableload
        } catch (Exception e) {

        }
    }//GEN-LAST:event_Exit3Exit1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit3;
    private javax.swing.JButton addB3;
    private javax.swing.JButton addrecord;
    private javax.swing.JTextField bidbox;
    private javax.swing.JTextField bnamebox;
    private javax.swing.JTextField idbox;
    private javax.swing.JTextField issuebox;
    private javax.swing.JTextField issueidbox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField namebox;
    private javax.swing.JButton reset1;
    private javax.swing.JTextField returnbox;
    private javax.swing.JTextField searchbox;
    private javax.swing.JLabel stlbl1;
    private javax.swing.JLabel stlbl2;
    private javax.swing.JLabel stlbl3;
    private javax.swing.JLabel stlbl4;
    private javax.swing.JLabel stlbl5;
    private javax.swing.JLabel stlbl6;
    private javax.swing.JLabel stlbl7;
    private javax.swing.JButton update1;
    // End of variables declaration//GEN-END:variables
}
