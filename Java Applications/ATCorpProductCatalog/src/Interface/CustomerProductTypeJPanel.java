/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.ProductCatalog;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class CustomerProductTypeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerProductTypeJPanel
     */
    
    private JPanel userProcessContainer;
    private ProductCatalog productCatalog;
    private String productTypeSent = "";

    CustomerProductTypeJPanel(JPanel userProcessContainer, ProductCatalog productCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.productCatalog = productCatalog;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        computerCatalogBtn = new javax.swing.JButton();
        printerCatalogBtn = new javax.swing.JButton();
        hardwareCatalogBtn = new javax.swing.JButton();
        softwareCatalogBtn = new javax.swing.JButton();
        backUserTypeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));

        computerCatalogBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        computerCatalogBtn.setText("Computer Catalog");
        computerCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerCatalogBtnActionPerformed(evt);
            }
        });

        printerCatalogBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        printerCatalogBtn.setText("Printer Catalog");
        printerCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printerCatalogBtnActionPerformed(evt);
            }
        });

        hardwareCatalogBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hardwareCatalogBtn.setText("Hardware Componets");
        hardwareCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardwareCatalogBtnActionPerformed(evt);
            }
        });

        softwareCatalogBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        softwareCatalogBtn.setText("Software componets");
        softwareCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                softwareCatalogBtnActionPerformed(evt);
            }
        });

        backUserTypeBtn.setText("<<Back");
        backUserTypeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backUserTypeBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("What Do You Wish to Look For Today");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(computerCatalogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hardwareCatalogBtn))
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(softwareCatalogBtn)
                            .addComponent(printerCatalogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 211, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(backUserTypeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computerCatalogBtn)
                    .addComponent(printerCatalogBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(hardwareCatalogBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(softwareCatalogBtn)))
                .addGap(61, 61, 61)
                .addComponent(backUserTypeBtn)
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backUserTypeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backUserTypeBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
                
    }//GEN-LAST:event_backUserTypeBtnActionPerformed

    private void computerCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerCatalogBtnActionPerformed
        productTypeSent = "Computer";
        CustomerProductListJPanel productList= new CustomerProductListJPanel(userProcessContainer,productCatalog,productTypeSent);
        userProcessContainer.add("CustometProductListJPanel",productList);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_computerCatalogBtnActionPerformed

    private void printerCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printerCatalogBtnActionPerformed
        productTypeSent = "Printer";
        CustomerProductListJPanel productList= new CustomerProductListJPanel(userProcessContainer,productCatalog,productTypeSent);
        userProcessContainer.add("CustometProductListJPanel",productList);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_printerCatalogBtnActionPerformed

    private void hardwareCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardwareCatalogBtnActionPerformed
        productTypeSent = "HardwareParts";
        CustomerProductListJPanel productList= new CustomerProductListJPanel(userProcessContainer,productCatalog,productTypeSent);
        userProcessContainer.add("CustometProductListJPanel",productList);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hardwareCatalogBtnActionPerformed

    private void softwareCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_softwareCatalogBtnActionPerformed
        productTypeSent = "SoftwareProducts";
        CustomerProductListJPanel productList= new CustomerProductListJPanel(userProcessContainer,productCatalog,productTypeSent);
        userProcessContainer.add("CustometProductListJPanel",productList);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_softwareCatalogBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backUserTypeBtn;
    private javax.swing.JButton computerCatalogBtn;
    private javax.swing.JButton hardwareCatalogBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton printerCatalogBtn;
    private javax.swing.JButton softwareCatalogBtn;
    // End of variables declaration//GEN-END:variables
}
