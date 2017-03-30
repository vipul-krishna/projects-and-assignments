/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ResearchRole;

import Business.Enterprise.Enterprise;
import Business.Organization.ResearchOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CropTestResultQueue;
import Business.WorkQueue.WorkRequest;
import UserInterface.SignUpJPanel;
import UserInterface.SystemAdminRole.ManageNetworkJPanel;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class ResearchWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResearchWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private ResearchOrganization researchOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Image image2;
    
    public ResearchWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ResearchOrganization researchOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.researchOrganization = researchOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        backgroundImage("/resources/imgs/HP2.jpg");
        populateTable();
        
    }
    
    private void backgroundImage(String str){
        try {
            BufferedImage image1 = ImageIO.read(ResearchWorkAreaJPanel.class.getResource(str));
            image2 = image1.getScaledInstance(1200,800,Image.SCALE_SMOOTH);
        } catch (IOException ex) {
            Logger.getLogger(SignUpJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Draw the background image.
    g.drawImage(image2, 0, 0, this);
  }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)researchJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : researchOrganization.getWorkQueue().getWorkRequestList()){
            
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getFarmer().getFarmerName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        researchJTable = new javax.swing.JTable();
        researchAssignToMeBtn = new javax.swing.JButton();
        researchProcessBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        plannedCropTextField = new javax.swing.JTextField();
        senderAddL1TextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        farmerNameTextField = new javax.swing.JTextField();
        senderAddLine2TextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        researchProcessBtn1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        senderZipcodeJTextField = new javax.swing.JTextField();
        farmGroundWaterLevelTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        farmLocationTempTextField = new javax.swing.JTextField();
        viewQueriesjButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        manageMajorCropInfoJButton = new javax.swing.JButton();

        researchJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(researchJTable);

        researchAssignToMeBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        researchAssignToMeBtn.setText("Assign to Me");
        researchAssignToMeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                researchAssignToMeBtnActionPerformed(evt);
            }
        });

        researchProcessBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        researchProcessBtn.setText("Process");
        researchProcessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                researchProcessBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Research Request Table");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Planned Crop:");

        plannedCropTextField.setEnabled(false);

        senderAddL1TextField.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Address Line 1:");

        farmerNameTextField.setEnabled(false);

        senderAddLine2TextField.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("AddressLine 2");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Farmer's Name:");

        researchProcessBtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        researchProcessBtn1.setText("View Request Details");
        researchProcessBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                researchProcessBtn1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Field Ground Water Level:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Zip Code:");

        senderZipcodeJTextField.setEnabled(false);

        farmGroundWaterLevelTxtField.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Field Location Temperature Range:");

        farmLocationTempTextField.setEnabled(false);
        farmLocationTempTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmLocationTempTextFieldActionPerformed(evt);
            }
        });

        viewQueriesjButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewQueriesjButton.setText("View Queries");
        viewQueriesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewQueriesjButtonActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imgs/soil research.jpg"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Conduct A New Crop Research");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        manageMajorCropInfoJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        manageMajorCropInfoJButton.setText("Manage Major Crops");
        manageMajorCropInfoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMajorCropInfoJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(manageMajorCropInfoJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewQueriesjButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 1327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(farmerNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senderAddLine2TextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senderAddL1TextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plannedCropTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(farmGroundWaterLevelTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senderZipcodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(farmLocationTempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(researchProcessBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(researchAssignToMeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)
                        .addComponent(researchProcessBtn1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(viewQueriesjButton)
                    .addComponent(jButton1)
                    .addComponent(manageMajorCropInfoJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(researchAssignToMeBtn)
                    .addComponent(researchProcessBtn1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(plannedCropTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(farmerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(senderAddL1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(senderAddLine2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(senderZipcodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(farmGroundWaterLevelTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(farmLocationTempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(researchProcessBtn)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void researchAssignToMeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_researchAssignToMeBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = researchJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a  Row");
            return;
        }
        
        
        WorkRequest request = (WorkRequest)researchJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Sent for Research"))
        {
        request.setReceiver(userAccount);
        request.setStatus("Received at Research Center");
        populateTable();
        }
        else{
             JOptionPane.showMessageDialog(null, "Request already assigned");
        }
        
    }//GEN-LAST:event_researchAssignToMeBtnActionPerformed

    private void researchProcessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_researchProcessBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = researchJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a  Row");
            return;
        }

        CropTestResultQueue request = (CropTestResultQueue)researchJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Received at Research Center"))
        {
        request.setStatus("Sample research started");

        SendResultJPanel sendResultJPanel = new SendResultJPanel(userProcessContainer, request, userAccount, enterprise);
        userProcessContainer.add("SendResultJPanel", sendResultJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        populateTable();
        }
        else
        {
          JOptionPane.showMessageDialog(null, "Please assign a valid request");  
        }
    }//GEN-LAST:event_researchProcessBtnActionPerformed

    private void researchProcessBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_researchProcessBtn1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = researchJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a  Row");
            return;
        }
        
        CropTestResultQueue request = (CropTestResultQueue)researchJTable.getValueAt(selectedRow, 0);
        plannedCropTextField.setText(request.getPlannedCropType());
        farmerNameTextField.setText(String.valueOf(request.getSender()));
        senderAddL1TextField.setText(request.getFarmerAddressLine1());
        senderAddLine2TextField.setText(request.getFarmerAddressLine2());
        senderZipcodeJTextField.setText(String.valueOf(request.getFarmerAddressZip()));
        farmGroundWaterLevelTxtField.setText(String.valueOf(request.getLocationGroundWaterLevel()));
        farmLocationTempTextField.setText(String.valueOf(request.getLocationTemerature()));
    
    }//GEN-LAST:event_researchProcessBtn1ActionPerformed

    private void viewQueriesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewQueriesjButtonActionPerformed
        // TODO add your handling code here:
        ViewQueriesJPanel viewQueriesJPanel = new ViewQueriesJPanel(userProcessContainer,userAccount,researchOrganization,enterprise);
        userProcessContainer.add("ViewQueriesJPanel", viewQueriesJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewQueriesjButtonActionPerformed

    private void farmLocationTempTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmLocationTempTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_farmLocationTempTextFieldActionPerformed

    private void manageMajorCropInfoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMajorCropInfoJButtonActionPerformed
        // TODO add your handling code here:
        ManageGeneralCropInfoJPanel manageGeneralCropInfoJPanel = new ManageGeneralCropInfoJPanel(userProcessContainer,userAccount,researchOrganization,enterprise);
        userProcessContainer.add("ManageGeneralCropInfoJPanel", manageGeneralCropInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageMajorCropInfoJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       ConductResearchJPanel conductResearchJPanel = new ConductResearchJPanel(userProcessContainer, userAccount, enterprise);
       userProcessContainer.add("conductingResearchJPanel", conductResearchJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField farmGroundWaterLevelTxtField;
    private javax.swing.JTextField farmLocationTempTextField;
    private javax.swing.JTextField farmerNameTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageMajorCropInfoJButton;
    private javax.swing.JTextField plannedCropTextField;
    private javax.swing.JButton researchAssignToMeBtn;
    private javax.swing.JTable researchJTable;
    private javax.swing.JButton researchProcessBtn;
    private javax.swing.JButton researchProcessBtn1;
    private javax.swing.JTextField senderAddL1TextField;
    private javax.swing.JTextField senderAddLine2TextField;
    private javax.swing.JTextField senderZipcodeJTextField;
    private javax.swing.JButton viewQueriesjButton;
    // End of variables declaration//GEN-END:variables
}