/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        showDate();
        showTime();

    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
        Datebox.setText(s.format(d));
    }

    void showTime() {

        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                Timebox.setText(s.format(d));
            }
        }).start();    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label1 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        jDesktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        Datebox = new javax.swing.JLabel();
        Timebox = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LMS");
        setForeground(new java.awt.Color(0, 153, 153));

        Label1.setFont(new java.awt.Font("Monotype Corsiva", 0, 55)); // NOI18N
        Label1.setText(" Library Management System");

        Label3.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        Label3.setText("Add Members");

        Label4.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        Label4.setText("Add Books");

        Label5.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        Label5.setText("Book Issue & Return");

        Label6.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        Label6.setText("Fines Details");

        Btn1.setBackground(new java.awt.Color(0, 51, 255));
        Btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/btn1.jpg"))); // NOI18N
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn2.setBackground(new java.awt.Color(51, 102, 255));
        Btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/JJD.jpg"))); // NOI18N
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn3.setBackground(new java.awt.Color(51, 51, 255));
        Btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/report.jpg"))); // NOI18N
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn4.setBackground(new java.awt.Color(0, 51, 255));
        Btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/JJD.jpg"))); // NOI18N
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1448, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        Datebox.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        Datebox.setForeground(new java.awt.Color(0, 0, 204));
        Datebox.setText("Date");

        Timebox.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        Timebox.setForeground(new java.awt.Color(0, 0, 204));
        Timebox.setText("Time");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/search2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Label4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(80, 80, 80)
                                .addComponent(Timebox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(Datebox, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Datebox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Timebox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Label3)
                                    .addComponent(Label4)
                                    .addComponent(Label5)
                                    .addComponent(Label6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(Btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(14, 14, 14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))))
                .addComponent(jDesktopPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        jDesktopPane.removeAll();
        addmember am = new addmember();
        jDesktopPane.add(am).setVisible(true);
        // AddMember:
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        jDesktopPane.removeAll();
        addbook ab = new addbook();
        jDesktopPane.add(ab).setVisible(true);
        // AddBooks:
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        jDesktopPane.removeAll();
        bookissue bi = new bookissue();
        jDesktopPane.add(bi).setVisible(true);
        // BookIssueReturn:
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        jDesktopPane.removeAll();
        fines fi = new fines();
        jDesktopPane.add(fi).setVisible(true);
        // FinesDetails:
    }//GEN-LAST:event_Btn4ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JLabel Datebox;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Timebox;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

   
}
