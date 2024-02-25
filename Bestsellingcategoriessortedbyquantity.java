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
public class Bestsellingcategoriessortedbyquantity extends javax.swing.JFrame {

    /**
     * Creates new form Bestsellingcategoriessortedbyquantity
     */
    public Bestsellingcategoriessortedbyquantity() {
        initComponents();
        Table();
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
        TblItembyqty = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Item By Qty");

        Btnback.setBackground(new java.awt.Color(255, 0, 0));
        Btnback.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btnback.setForeground(new java.awt.Color(255, 255, 255));
        Btnback.setText("Back");
        Btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnbackActionPerformed(evt);
            }
        });

        TblItembyqty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Size", "QTY", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblItembyqty);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnbackActionPerformed
       dispose();
        ViewReports vv =new ViewReports();
       vv.setVisible(true);
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
            java.util.logging.Logger.getLogger(Bestsellingcategoriessortedbyquantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bestsellingcategoriessortedbyquantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bestsellingcategoriessortedbyquantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bestsellingcategoriessortedbyquantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bestsellingcategoriessortedbyquantity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnback;
    private javax.swing.JTable TblItembyqty;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void Table() {
        
     DefaultTableModel mode2 = (DefaultTableModel) TblItembyqty.getModel();

         String[] Sizechart = {"XS", "S", "M", "L", "XL", "XXL"};
                int[] tempQts = new int[Sizechart.length];
        int [] tempAmount = new int [Sizechart.length];
        String[] tempsizes = new String[Sizechart.length];
        for (int i = 0; i < Sizechart.length; i++) {
            int fullQts = 0;
            int fullAmount = 0;
            boolean condition = false;
            for (int j = 0; j < Fashionshop.list.size(); j++) {
                if (Sizechart[i].equals(Fashionshop.list.get(j).getSizes())) {
                    tempsizes[i] = Sizechart[i];
                    fullQts += Fashionshop.list.get(j).getQts();
                    fullAmount += Fashionshop.list.get(j).getAmount();
                    condition = true;
                }

            }
            if (!condition) {

                tempsizes[i] = Sizechart[i];
            }
            tempQts[i] = fullQts;
            tempAmount[i] = fullAmount;

        }
        for (int i = 0; i < Sizechart.length - 1; i++) {
            for (int j = 0; j < Sizechart.length - 1; j++) {
                if (tempQts[j] < tempQts[j + 1]) {
                    int tempA = tempQts[j];
                    tempQts[j] = tempQts[j + 1];
                    tempQts[j + 1] = tempA;

                    int tempB = tempAmount[j];
                    tempAmount[j] = tempAmount[j + 1];
                    tempAmount[j + 1] = tempB;

                    String tempC = tempsizes[j];
                    tempsizes[j] = tempsizes[j + 1];
                    tempsizes[j + 1] = tempC;
                }
            }
        }
         mode2.setRowCount(0);
        for (int i = 0; i < Sizechart.length; i++) {

            mode2.addRow(new Object[]{tempsizes[i],tempQts[i],tempAmount[i]});  

        }
    }
}