/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.demomain;

import static com.mycompany.demomain.SearchOrder.calculateAmount;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dilsh
 */
public class Delete extends javax.swing.JFrame {

    /**
     * Creates new form Delete
     */
    public Delete() {
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

        jLabel5 = new javax.swing.JLabel();
        Btnback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtOID = new javax.swing.JTextField();
        Btnsearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCID = new javax.swing.JLabel();
        lblsize = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        lblstatus = new javax.swing.JLabel();
        Btndelete = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btnback.setBackground(new java.awt.Color(255, 0, 0));
        Btnback.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btnback.setForeground(new java.awt.Color(255, 255, 255));
        Btnback.setText("Back");
        Btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnbackActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Order ID   :");

        Btnsearch.setBackground(new java.awt.Color(0, 153, 153));
        Btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        Btnsearch.setText("Search");
        Btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsearchActionPerformed(evt);
            }
        });

        jLabel2.setText("Customer ID      :  ");

        jLabel3.setText("Size                   :");

        jLabel4.setText("QTY                   :");

        jLabel6.setText("Amount             :");

        jLabel7.setText("Status                :");

        lblQty.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblQtyAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Btndelete.setBackground(new java.awt.Color(153, 0, 0));
        Btndelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btndelete.setForeground(new java.awt.Color(255, 255, 255));
        Btndelete.setText("Delete");
        Btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Btnback))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtOID, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(lblCID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblsize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(Btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtOID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsize, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnbackActionPerformed
        dispose();
        Fashionshop kk = new Fashionshop();
        kk.setVisible(true);
    }//GEN-LAST:event_BtnbackActionPerformed

    private void BtndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtndeleteActionPerformed
         String orderID = TxtOID.getText();
         L1:for (int i = 0; i < Fashionshop.list.size(); i++) {
          Order x =Fashionshop.list.get(i);
          
          if(x.getOrderid().equals(orderID)){
              
              if(x.getStatus()==0){
          int index =i;
          String statusName [] = {"Yes"," No"};
        int st =JOptionPane.showOptionDialog(null,"Do you want to delete this order ?","Delete Confirmation",0,JOptionPane.QUESTION_MESSAGE, null,statusName,statusName[0]);
          
        if(st==0){
       Fashionshop.list.remove(index);
       JOptionPane.showMessageDialog(this, "Order Deleted !");
       dispose();
            Delete D = new Delete();
            D.setVisible(true);
            
        }
       else if(st==1){
            
            dispose();
            Delete D = new Delete();
            D.setVisible(true);
        } 
          
              } 
          }
         }
         
         L2 : for (int i = 0; i < Fashionshop.list.size(); i++) {
            
       Order x =Fashionshop.list.get(i);
          if(x.getStatus()==1||x.getStatus()==2){
          
         JOptionPane.showMessageDialog(this, "Order Can't Delete  Because Order is not Processing Mode!");
          dispose();
            Delete D = new Delete();
            D.setVisible(true);
            break L2 ;
            
          }
       
          }
        
        
    }//GEN-LAST:event_BtndeleteActionPerformed

    private void BtnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsearchActionPerformed
         String orderID = TxtOID.getText();
        for (int i = 0; i < Fashionshop.list.size(); i++) {
            Order s4 = Fashionshop.list.get(i);
            if (s4.getOrderid().equals(orderID)) {


                int amount = calculateAmount(s4.getSizes(), s4.getQts());
                lblCID.setText(s4.getTelephone());
                lblsize.setText(s4.getSizes());
                lblQty.setText(Integer.toString(s4.getQts()));
                lblAmount.setText(Integer.toString(amount));

                if (s4.getStatus() == 0) {
                    lblstatus.setText("PROCESSING ! ");
                } else if (s4.getStatus() == 1) {
                    lblstatus.setText("DELEVERING !");
                } else if (s4.getStatus() == 2) {

                    lblstatus.setText("DELEVERED !");
                }
            }
        }
    }//GEN-LAST:event_BtnsearchActionPerformed

    private void lblQtyAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblQtyAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblQtyAncestorAdded

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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnback;
    private javax.swing.JButton Btndelete;
    private javax.swing.JButton Btnsearch;
    private javax.swing.JTextField TxtOID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblCID;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblsize;
    private javax.swing.JLabel lblstatus;
    // End of variables declaration//GEN-END:variables
}
