/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import javax.swing.*;

/**
 *
 * @author Asus
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jSeparator1 = new javax.swing.JSeparator();
        newbuyer = new javax.swing.JButton();
        updatebuyer = new javax.swing.JButton();
        buyerdetails = new javax.swing.JButton();
        deletebuyer = new javax.swing.JButton();
        newproduct = new javax.swing.JButton();
        updateproduct = new javax.swing.JButton();
        productdetails = new javax.swing.JButton();
        deleteproduct = new javax.swing.JButton();
        billing = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 0, 8, 768));

        newbuyer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        newbuyer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new buyer.png"))); // NOI18N
        newbuyer.setText("New Buyer");
        newbuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbuyerActionPerformed(evt);
            }
        });
        getContentPane().add(newbuyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 190, 70));

        updatebuyer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updatebuyer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Update buyer.png"))); // NOI18N
        updatebuyer.setText("Update Buyer");
        updatebuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuyerActionPerformed(evt);
            }
        });
        getContentPane().add(updatebuyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, 190, 70));

        buyerdetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buyerdetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buyer Details.png"))); // NOI18N
        buyerdetails.setText("Buyer Details");
        buyerdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerdetailsActionPerformed(evt);
            }
        });
        getContentPane().add(buyerdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 158, 190, 70));

        deletebuyer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deletebuyer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete buyer.png"))); // NOI18N
        deletebuyer.setText("Delete Buyer");
        deletebuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuyerActionPerformed(evt);
            }
        });
        getContentPane().add(deletebuyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 234, 190, 70));

        newproduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        newproduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new product.png"))); // NOI18N
        newproduct.setText("New Product");
        newproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newproductActionPerformed(evt);
            }
        });
        getContentPane().add(newproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 310, 190, 70));

        updateproduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateproduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update product.png"))); // NOI18N
        updateproduct.setText("Update Product");
        updateproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateproductActionPerformed(evt);
            }
        });
        getContentPane().add(updateproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 386, 190, 70));

        productdetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        productdetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/details product.png"))); // NOI18N
        productdetails.setText("Product Details");
        productdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productdetailsActionPerformed(evt);
            }
        });
        getContentPane().add(productdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 462, 190, 70));

        deleteproduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteproduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete product.png"))); // NOI18N
        deleteproduct.setText("Delete Product");
        deleteproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteproductActionPerformed(evt);
            }
        });
        getContentPane().add(deleteproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 538, 190, 70));

        billing.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        billing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/billing.png"))); // NOI18N
        billing.setText("Billing");
        billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingActionPerformed(evt);
            }
        });
        getContentPane().add(billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 614, 190, 70));

        logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 690, 190, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.PNG"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
         int Logout = JOptionPane.showConfirmDialog(null, "Do you rellay want Logout", "select", JOptionPane.YES_NO_OPTION);
        if (Logout == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void newbuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbuyerActionPerformed
        // TODO add your handling code here:
        new NewBuyer().setVisible(true);
    }//GEN-LAST:event_newbuyerActionPerformed

    private void updatebuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuyerActionPerformed
        // TODO add your handling code here:
          new UpdateBuyer().setVisible(true);
    }//GEN-LAST:event_updatebuyerActionPerformed

    private void buyerdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerdetailsActionPerformed
        // TODO add your handling code here:
        new BuyerDetails().setVisible(true);
    }//GEN-LAST:event_buyerdetailsActionPerformed

    private void deletebuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuyerActionPerformed
        // TODO add your handling code here:
        new DeleteBuyer().setVisible(true);
    }//GEN-LAST:event_deletebuyerActionPerformed

    private void newproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newproductActionPerformed
        // TODO add your handling code here:
        new NewProduct().setVisible(true);
    }//GEN-LAST:event_newproductActionPerformed

    private void productdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productdetailsActionPerformed
        // TODO add your handling code here:
        new ProductDetails().setVisible(true);
    }//GEN-LAST:event_productdetailsActionPerformed

    private void updateproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateproductActionPerformed
        // TODO add your handling code here:
         new UpdateProduct().setVisible(true);
    }//GEN-LAST:event_updateproductActionPerformed

    private void deleteproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteproductActionPerformed
        // TODO add your handling code here:
         new DeleteProduct().setVisible(true);
    }//GEN-LAST:event_deleteproductActionPerformed

    private void billingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingActionPerformed
        // TODO add your handling code here:
        new Billing().setVisible(true);
    }//GEN-LAST:event_billingActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billing;
    private javax.swing.JButton buyerdetails;
    private javax.swing.JButton deletebuyer;
    private javax.swing.JButton deleteproduct;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logout;
    private javax.swing.JButton newbuyer;
    private javax.swing.JButton newproduct;
    private javax.swing.JButton productdetails;
    private javax.swing.JButton updatebuyer;
    private javax.swing.JButton updateproduct;
    // End of variables declaration//GEN-END:variables
}
