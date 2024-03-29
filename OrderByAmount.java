/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.demomain;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dilsh
 */
public class OrderByAmount extends javax.swing.JFrame {

    /**
     * Creates new form OrderByAmount
     */
    public OrderByAmount() {
        initComponents();
        
        Tables6();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btnback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order By Amount");

        Btnback.setBackground(new java.awt.Color(255, 0, 0));
        Btnback.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btnback.setForeground(new java.awt.Color(255, 255, 255));
        Btnback.setText("Back");
        Btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnbackActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order iD", "Customer ID", "Size", "QTY", "Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btnback)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnbackActionPerformed
       
        dispose();
        ViewReports dd =new ViewReports();
        dd.setVisible(true);
    }//GEN-LAST:event_BtnbackActionPerformed

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
            java.util.logging.Logger.getLogger(OrderByAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderByAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderByAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderByAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderByAmount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnback;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void Tables6() {
               DefaultTableModel mode2 = (DefaultTableModel) jTable1.getModel();
    
 String[] tempCustomerId = new String[Fashionshop.list.size()];
        String[] tempOrderId = new String[Fashionshop.list.size()];
        int[] tempQts = new int[Fashionshop.list.size()];
        int[] tempAmount = new int[Fashionshop.list.size()];
        String[] tempsizes = new String[Fashionshop.list.size()];
        int[] tempstatus = new int[Fashionshop.list.size()];

        for (int i = 0; i < Fashionshop.list.size(); i++) {
            tempOrderId[i] = Fashionshop.list.get(i).getOrderid();
            tempQts[i] = Fashionshop.list.get(i).getQts();
            tempAmount[i] = Fashionshop.list.get(i).getAmount();
            tempsizes[i] = Fashionshop.list.get(i).getSizes();
            tempstatus[i] = Fashionshop.list.get(i).getStatus();
            tempCustomerId[i] = Fashionshop.list.get(i).getTelephone();
        }

        for (int i = 0;  i <  Fashionshop.list.size()-1; i++) {
        
        for (int j = 0; j <  Fashionshop.list.size()-1; j++) {
            
        
             if(tempAmount[j]<tempAmount[j+1]){
            String tempz = tempOrderId[j];
            tempOrderId[j] = tempOrderId[i];
            tempOrderId[i] = tempz;

            int tempt = tempstatus[j];
            tempstatus[j] = tempstatus[i];
            tempstatus[i] = tempt;

            String tempk = tempCustomerId[j];
            tempCustomerId[j] = tempCustomerId[i];
            tempCustomerId[i] = tempk;

            int tempA = tempQts[j];
            tempQts[j] = tempQts[i];
            tempQts[i] = tempA;

            int tempB = tempAmount[j];
            tempAmount[j] = tempAmount[i];
            tempAmount[i] = tempB;

            String tempC = tempsizes[j];
            tempsizes[j] = tempsizes[i];
            tempsizes[i] = tempC;
             }
        }
        }
        mode2.setRowCount(0);
        for (int i = 0; i < Fashionshop.list.size(); i++) {

            if (tempstatus[i] == 0) {
               mode2.addRow(new Object[]{tempOrderId[i] , tempCustomerId[i],tempsizes[i],tempQts[i],tempAmount[i], "PROCESSING"});

            }
            if (tempstatus[i] == 1) {
               mode2.addRow(new Object[]{tempOrderId[i] , tempCustomerId[i],tempsizes[i],tempQts[i],tempAmount[i], "DELEVERING"});

            }
            if (tempstatus[i] == 2) {
               mode2.addRow(new Object[]{tempOrderId[i] , tempCustomerId[i],tempsizes[i],tempQts[i],tempAmount[i], "DELEVERED"});

            }

        }
    }
}
