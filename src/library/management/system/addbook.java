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

public class addbook extends javax.swing.JInternalFrame {

   Connection con =null;
    PreparedStatement uc = null;
    ResultSet rs = null;
    
    public addbook() {
        initComponents();
        con = dbconnect.conn();
        // DB Connection
        
         tableload();
      // Tableload
    }

    public void tableload(){
        
          try{
           String sql= "SELECT book_id,book_name,author_name,seller_name,stock FROM book"; 
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
        namebox = new javax.swing.JTextField();
        idbox = new javax.swing.JTextField();
        stockbox = new javax.swing.JTextField();
        addrecord = new javax.swing.JButton();
        addB3 = new javax.swing.JButton();
        reset1 = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        sellerbox = new javax.swing.JTextField();
        authorbox = new javax.swing.JTextField();
        Exit3 = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("LMS");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Book", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 36), new java.awt.Color(102, 0, 0))); // NOI18N

        stlbl1.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl1.setText("Book Name");

        stlbl2.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl2.setText("Book ID");

        stlbl4.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl4.setText("Seller Name");

        stlbl3.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl3.setText("Author_Name");

        stlbl5.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        stlbl5.setText("Stock");

        namebox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        idbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        stockbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

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

        sellerbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        authorbox.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        Exit3.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        Exit3.setText("Book ID");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 54, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stlbl1)
                                    .addComponent(stlbl3))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(authorbox, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(stlbl2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idbox, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(stlbl5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stockbox, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(stlbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sellerbox, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(addrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update1)
                        .addGap(18, 18, 18)
                        .addComponent(addB3)
                        .addGap(18, 18, 18)
                        .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Exit3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchbox)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stlbl4)
                    .addComponent(sellerbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stlbl2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stlbl5)
                    .addComponent(stockbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stlbl1))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stlbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addrecord)
                    .addComponent(addB3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset1)
                    .addComponent(update1)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit3))
                .addGap(26, 26, 26))
        );

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Auther", "Seller Name", "Stocks"
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1315, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrecordActionPerformed

        String id = idbox.getText();
        String name = namebox.getText();
        String auth = authorbox.getText();
        String sel = sellerbox.getText();
        String sto = stockbox.getText();

        try{
            String q = "INSERT INTO book (book_id,book_name,author_name,seller_name,stock) values ('"+id+"','"+name+"','"+auth+"','"+sel+"','"+sto+"')";
            uc = con.prepareStatement(q);
            uc.execute();

            tableload();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_addrecordActionPerformed

    private void addB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addB3ActionPerformed
        
        int y = JOptionPane.showConfirmDialog(null,"Do You want to Update");
        if (y==0){
        
            String id = idbox.getText();

        String sql = "DELETE from book where book_id='"+id+"'";
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
        namebox.setText("");
        idbox.setText("");
        authorbox.setText("");
        sellerbox.setText("");
        stockbox.setText("");
    }//GEN-LAST:event_reset1ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
            
    int x = JOptionPane.showConfirmDialog(null,"Do You want to Update");
     if (x==0){
    
       String id = idbox.getText();
        String name = namebox.getText();
        String auth = authorbox.getText();
        String sel = sellerbox.getText();
        String sto = stockbox.getText();

        String sql = "UPDATE book SET book_name='"+name+"',author_name='"+auth+"',seller_name='"+sel+"',stock='"+sto+"' where book_id='"+id+"'";
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

        String id = jTable1.getValueAt(ro, 0).toString();
         String name = jTable1.getValueAt(ro, 1).toString();
          String nic = jTable1.getValueAt(ro, 2).toString();
           String add = jTable1.getValueAt(ro, 3).toString();
            String phon = jTable1.getValueAt(ro, 4).toString();

            idbox.setText(id);
           namebox.setText(name);
          authorbox.setText(nic);
         sellerbox.setText(add);
        stockbox.setText(phon);

    }//GEN-LAST:event_jTable1MouseClicked

    private void Exit3Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit3Exit1ActionPerformed

        String name = searchbox.getText();

        String sql = "SELECT book_id,book_name,author_name,seller_name,stock FROM book where book_name LIKE '%"+name+"%'";
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
    private javax.swing.JTextField authorbox;
    private javax.swing.JTextField idbox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField namebox;
    private javax.swing.JButton reset1;
    private javax.swing.JTextField searchbox;
    private javax.swing.JTextField sellerbox;
    private javax.swing.JLabel stlbl1;
    private javax.swing.JLabel stlbl2;
    private javax.swing.JLabel stlbl3;
    private javax.swing.JLabel stlbl4;
    private javax.swing.JLabel stlbl5;
    private javax.swing.JTextField stockbox;
    private javax.swing.JButton update1;
    // End of variables declaration//GEN-END:variables
}
