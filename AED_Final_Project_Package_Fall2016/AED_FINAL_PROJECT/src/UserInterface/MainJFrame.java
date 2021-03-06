/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
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
/**
 *
 * @author Lenovo
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private BufferedImage image1;
    private Image image2;
    private CardLayout layout1;
    
    public MainJFrame() {
        initComponents();
        this.setSize(1350,700);
        system = dB4OUtil.retrieveSystem();
        backgroundImage("/resources/imgs/HP2.jpg");
        layout1 = (CardLayout) userProcessContainer.getLayout();
        
    }

    private void backgroundImage(String str){
        try {
            image1 = ImageIO.read(MainJFrame.class.getResource(str));
            image2 = image1.getScaledInstance(1200,800,Image.SCALE_SMOOTH);
        } catch (IOException ex) {
            Logger.getLogger(SignUpJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    JPanel panel = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
       // paint code
       super.paintComponent(g);

    // Draw the background image.
    g.drawImage(image2, 0, 0, this);
    }
    };
    
//    public void paintComponent(Graphics g) {
//    super.paintComponent(g);
//
//    // Draw the background image.
//    g.drawImage(image2, 0, 0, this);
//  }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPain = new javax.swing.JSplitPane();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        passwordTextField = new javax.swing.JPasswordField();
        logoutBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        signUpBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("User Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Password:");

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("New Farmer?? Please SignUp");

        signUpBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        signUpBtn.setText("Sign Up");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Application Login");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Page");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(loginPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(loginPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginBtn)
                .addGap(18, 18, 18)
                .addComponent(logoutBtn)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signUpBtn)
                .addContainerGap(630, Short.MAX_VALUE))
        );

        splitPain.setLeftComponent(loginPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imgs/MainJFrame1.jpg"))); // NOI18N
        userProcessContainer.add(jLabel4, "card2");

        splitPain.setRightComponent(userProcessContainer);

        getContentPane().add(splitPain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        // Get user name
        String userName = userNameTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordTextField.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        if(userNameTextField.getText().length()==0 || passwordTextField.getText().length()==0){  
        JOptionPane.showMessageDialog(null, "Please Enter all the Fields");
        return;
        }
        
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        
        if(userAccount == null)
        {
            for(Network network: system.getNetworkList())
            {
                for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
                {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount == null)
                    {
                        for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList())
                        {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if(userAccount != null)
                            {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }
                    }
                    else
                    {
                        inEnterprise = enterprise;
                        break;
                    }
                    if(inOrganization != null)
                    {
                        break;
                    }
                }
                if(inEnterprise != null)
                {
                    break;
                }
            }
        }
        if(userAccount == null)
        {
            JOptionPane.showMessageDialog(null, "Invalid Credentials!!!");
            userNameTextField.setText("");
            passwordTextField.setText("");
            return;
        }
        else
        {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("workarea", userAccount.getRole().createWorkArea(userProcessContainer, userAccount, inOrganization, inEnterprise, system));
            layout.next(userProcessContainer);
        }

        loginBtn.setEnabled(false);
        logoutBtn.setEnabled(true);
        userNameTextField.setEnabled(false);
        passwordTextField.setEnabled(false);
        
        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        logoutBtn.setEnabled(false);
        userNameTextField.setEnabled(true);
        passwordTextField.setEnabled(true);
        loginBtn.setEnabled(true);

        userNameTextField.setText("");
        passwordTextField.setText("");

        userProcessContainer.removeAll();
        JPanel blankJP = new JPanel();
        userProcessContainer.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        SignUpJPanel farmerSignUp = new SignUpJPanel(userProcessContainer,system);
        userProcessContainer.add("SignUpJPanel",farmerSignUp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_signUpBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JSplitPane splitPain;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
