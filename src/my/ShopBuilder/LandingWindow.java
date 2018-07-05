/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.ShopBuilder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prashant
 */
public class LandingWindow extends javax.swing.JFrame {

    /**
     * Creates new form LandingWindow
     */
    public LandingWindow() {
        initComponents();
        this.getRootPane().setDefaultButton(cust_search);
        this.setLocationRelativeTo(null);
        if_cust_exist.setVisible(false);
        cust_display_detail.setVisible(false);
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
        existing_cust = new javax.swing.JButton();
        new_cust = new javax.swing.JButton();
        if_cust_exist = new javax.swing.JPanel();
        cust_search_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cust_search = new javax.swing.JButton();
        cust_display_detail = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cut_display_name = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cust_display_address = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cust_display_age = new javax.swing.JLabel();
        add_items_on_new_cust = new javax.swing.JButton();
        viewItems = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        existing_cust.setText("Existing Customer");
        existing_cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existing_custActionPerformed(evt);
            }
        });

        new_cust.setText("New Customer");
        new_cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_custActionPerformed(evt);
            }
        });

        if_cust_exist.setFocusTraversalPolicyProvider(true);
        if_cust_exist.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                if_cust_existPropertyChange(evt);
            }
        });

        jLabel1.setText("Enter the existing customer ID");

        cust_search.setText("Search");
        cust_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cust_searchActionPerformed(evt);
            }
        });

        jLabel2.setText("Customer found");

        jLabel3.setText("Name");

        cut_display_name.setText("cust_display_name");

        jLabel5.setText("Address");

        cust_display_address.setText("cust_display_address");

        jLabel7.setText("Age");

        cust_display_age.setText("cust_display_age");

        add_items_on_new_cust.setText("Add Items");
        add_items_on_new_cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_items_on_new_custActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cust_display_detailLayout = new javax.swing.GroupLayout(cust_display_detail);
        cust_display_detail.setLayout(cust_display_detailLayout);
        cust_display_detailLayout.setHorizontalGroup(
            cust_display_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cust_display_detailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cust_display_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(cust_display_detailLayout.createSequentialGroup()
                        .addGroup(cust_display_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(30, 30, 30)
                        .addGroup(cust_display_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cust_display_detailLayout.createSequentialGroup()
                                .addComponent(cust_display_age)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addComponent(add_items_on_new_cust))
                            .addComponent(cust_display_address)
                            .addComponent(cut_display_name))))
                .addContainerGap())
        );
        cust_display_detailLayout.setVerticalGroup(
            cust_display_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cust_display_detailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cust_display_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cut_display_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cust_display_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cust_display_address))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cust_display_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cust_display_age))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cust_display_detailLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_items_on_new_cust)
                .addContainerGap())
        );

        javax.swing.GroupLayout if_cust_existLayout = new javax.swing.GroupLayout(if_cust_exist);
        if_cust_exist.setLayout(if_cust_existLayout);
        if_cust_existLayout.setHorizontalGroup(
            if_cust_existLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(if_cust_existLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(if_cust_existLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(if_cust_existLayout.createSequentialGroup()
                        .addComponent(cust_display_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(if_cust_existLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(if_cust_existLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cust_search)
                            .addComponent(cust_search_id, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136))))
        );
        if_cust_existLayout.setVerticalGroup(
            if_cust_existLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, if_cust_existLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(if_cust_existLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cust_search_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cust_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cust_display_detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        viewItems.setText("View Items");
        viewItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(if_cust_exist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(existing_cust)
                        .addGap(18, 18, 18)
                        .addComponent(new_cust)
                        .addGap(18, 18, 18)
                        .addComponent(viewItems)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(existing_cust)
                    .addComponent(new_cust)
                    .addComponent(viewItems))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(if_cust_exist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void if_cust_existPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_if_cust_existPropertyChange
        
    }//GEN-LAST:event_if_cust_existPropertyChange

    private void existing_custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existing_custActionPerformed
        
        if_cust_exist.setVisible(true);
    }//GEN-LAST:event_existing_custActionPerformed

    private void cust_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cust_searchActionPerformed
        // TODO add your handling code here:
        DbConnect con = new DbConnect();
        int id = Integer.parseInt(cust_search_id.getText());
        ResultSet rs = con.searchById(id);
        try {
            if(rs.next()==false){
                cut_display_name.setText("Record not found");
                cust_display_age.setText("Record not found");
                cust_display_address.setText("Record not found");
                add_items_on_new_cust.setEnabled(false);
            }else{
                try {
                    System.out.println("Result set for search "+rs);
                    cut_display_name.setText(rs.getString("NAME"));
                    cust_display_age.setText(rs.getString("AGE"));
                    cust_display_address.setText(rs.getString("ADDRESS"));
                    add_items_on_new_cust.setEnabled(true);
                } catch (SQLException ex) {
                    System.out.println(ex+" in cust_search");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex+" after cust_search");
        }
        cust_display_detail.setVisible(true);
    }//GEN-LAST:event_cust_searchActionPerformed

    private void add_items_on_new_custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_items_on_new_custActionPerformed
        new AddItems(Integer.parseInt(cust_search_id.getText())).setVisible(true);
    }//GEN-LAST:event_add_items_on_new_custActionPerformed

    private void new_custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_custActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AddCustomer().setVisible(true);
    }//GEN-LAST:event_new_custActionPerformed

    private void viewItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemsActionPerformed
        new ViewItems().setVisible(true);
    }//GEN-LAST:event_viewItemsActionPerformed

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
            java.util.logging.Logger.getLogger(LandingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandingWindow().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_items_on_new_cust;
    private javax.swing.JLabel cust_display_address;
    private javax.swing.JLabel cust_display_age;
    private javax.swing.JPanel cust_display_detail;
    private javax.swing.JButton cust_search;
    private javax.swing.JTextField cust_search_id;
    private javax.swing.JLabel cut_display_name;
    private javax.swing.JButton existing_cust;
    private javax.swing.JPanel if_cust_exist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton new_cust;
    private javax.swing.JButton viewItems;
    // End of variables declaration//GEN-END:variables
}