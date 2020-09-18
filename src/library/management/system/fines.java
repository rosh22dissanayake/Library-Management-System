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
public class fines extends javax.swing.JInternalFrame {

   Connection con =null;
    PreparedStatement uc = null;
    ResultSet rs = null;
    public fines() {
        initComponents();
        
         con = dbconnect.conn();
        // DB Connection
        
        tableload();
      // Tableload
    }
 public void tableload(){
        
          try{
           String sql= "SELECT fines_no,fines_Details,fines FROM  fines"; 
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
        finesdes = new javax.swing.JTextField();
        finesno = new javax.swing.JTextField();
        addrecord = new javax.swing.JButton();
        addB3 = new javax.swing.JButton();
        reset1 = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        finesbox = new javax.swing.JTextField();
        Exit3 = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PrintTextArea = new javax.swing.JTextArea();
        Transcbox = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("LMS");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fines Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 36), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 102, 255));

        stlbl1.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl1.setText("Fines Description");

        stlbl2.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl2.setText("Fines No");

        stlbl4.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl4.setText("Fines");

        finesdes.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        finesno.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

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

        finesbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        Exit3.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        Exit3.setText("Search Fines ID");
        Exit3.setActionCommand("Search");
        Exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit3Exit1ActionPerformed(evt);
            }
        });

        searchbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Print Fines", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 20))); // NOI18N

        PrintTextArea.setColumns(20);
        PrintTextArea.setRows(5);
        jScrollPane2.setViewportView(PrintTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        Transcbox.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        Transcbox.setText("Transcript");
        Transcbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranscboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stlbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stlbl1))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(finesdes, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(finesbox, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(stlbl2)
                                .addGap(88, 88, 88)
                                .addComponent(finesno, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(Exit3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(addrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update1)
                        .addGap(27, 27, 27)
                        .addComponent(addB3)
                        .addGap(18, 18, 18)
                        .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Transcbox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stlbl2)
                            .addComponent(finesno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exit3)
                            .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stlbl1)
                            .addComponent(finesdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stlbl4)
                            .addComponent(finesbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addrecord)
                            .addComponent(update1)
                            .addComponent(addB3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset1)
                            .addComponent(Transcbox))))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fines No", "Fines Description", "Fines"
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(1340, 1340, 1340))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrecordActionPerformed

        String fino = finesno.getText();
        String fides = finesdes.getText();
        String fin = finesbox.getText();

        try{
            String q = "INSERT INTO fines (fines_no,fines_Details,fines) values ('"+fino+"','"+fides+"','"+fin+"')";
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
        
            String fino = finesno.getText();
            
        String sql = "DELETE from details where fines_no='"+fino+"'";
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
        finesdes.setText("");
        finesno.setText("");
        finesbox.setText("");
    }//GEN-LAST:event_reset1ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
         
        int x = JOptionPane.showConfirmDialog(null,"Do You want to Update");
     if (x==0){
    
       String fino = finesno.getText();
        String fides = finesdes.getText();
        String fin = finesbox.getText();

        String sql = "UPDATE fines SET fines_Details='"+fides+"',fines='"+fin+"' where fines_no='"+fino+"'";
        try{
         uc = con.prepareStatement(sql);
          uc.execute();

            tableload();
        } catch (Exception e) {

        }
     // Record Update:
    }//GEN-LAST:event_update1ActionPerformed
   }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int ro = jTable1.getSelectedRow();

        String fino = jTable1.getValueAt(ro, 0).toString();
         String fides = jTable1.getValueAt(ro, 1).toString();
          String fin= jTable1.getValueAt(ro, 2).toString();

          finesno.setText(fino);
         finesdes.setText(fides);
        finesbox.setText(fin);

    }//GEN-LAST:event_jTable1MouseClicked

    private void Exit3Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit3Exit1ActionPerformed

        String id = searchbox.getText();

        String sql = "SELECT fines_no,fines_Details,fines FROM  fines where fines_no LIKE '%"+id+"%'";
        try{
            uc = con.prepareStatement(sql);
            rs = uc.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            // Tableload
        } catch (Exception e) {

        }
    }//GEN-LAST:event_Exit3Exit1ActionPerformed

    private void TranscboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TranscboxActionPerformed
       
        PrintTextArea.append("                                ------------Print Member Fines------------ \n"
                        +"=================================\n"         
                        +"\nFines Number:\t\t" + finesno.getText()
                    +"\n"
                        +"\nFine Details:\t\t" + finesdes.getText()
                    +"\n"
                        +"\nFines:\t\t" + finesbox.getText()
                        +"\n"
                        +"\n"
                +"\nSignuter:\t\t" 
                
        );                                               
                
    }//GEN-LAST:event_TranscboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit3;
    private javax.swing.JTextArea PrintTextArea;
    private javax.swing.JButton Transcbox;
    private javax.swing.JButton addB3;
    private javax.swing.JButton addrecord;
    private javax.swing.JTextField finesbox;
    private javax.swing.JTextField finesdes;
    private javax.swing.JTextField finesno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton reset1;
    private javax.swing.JTextField searchbox;
    private javax.swing.JLabel stlbl1;
    private javax.swing.JLabel stlbl2;
    private javax.swing.JLabel stlbl4;
    private javax.swing.JButton update1;
    // End of variables declaration//GEN-END:variables
}
