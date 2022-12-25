/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.klasser;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author jonathandroh
 */
public class ChangePasswordPage extends javax.swing.JFrame {
    
    private InfDB idb;
    
    /**
     * Creates new form ChangePasswordPage
     */
    public ChangePasswordPage(InfDB idb) {
        initComponents();
        this.idb = idb;
        addTypes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        lblOldPassword = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnChange = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtNewPassword = new javax.swing.JPasswordField();
        txtOldPassword = new javax.swing.JPasswordField();
        lblHeaderChangePassword = new javax.swing.JLabel();
        lblErrorMessage = new javax.swing.JLabel();
        lblChangeAs = new javax.swing.JLabel();
        cmbChooseType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsername.setText("Username:");

        lblOldPassword.setText("Old password:");

        lblNewPassword.setText("New password:");

        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblHeaderChangePassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblHeaderChangePassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeaderChangePassword.setText("Change password");
        lblHeaderChangePassword.setToolTipText("");
        lblHeaderChangePassword.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblErrorMessage.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblChangeAs.setText("Type of account:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lblHeaderChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(lblOldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(lblNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnCancel)
                    .addComponent(lblChangeAs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnChange)
                            .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtOldPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                            .addComponent(cmbChooseType, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeaderChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChangeAs)
                    .addComponent(cmbChooseType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOldPassword)
                    .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPassword)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnChange))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        if(Validation.checkEmptyFields(txtUsername, txtOldPassword, txtNewPassword)) {
            lblErrorMessage.setText("Please enter a username, old password and new password!");
        }
        else if(Validation.checkCmbBoxType(cmbChooseType)) {
            try {
                String agentUsername = txtUsername.getText();
                String agentOldPassword = txtOldPassword.getText();
                String agentNewPassword = txtNewPassword.getText();
                String agentQuestion = "select Losenord from Agent where Namn = '" + agentUsername + "';";
                String sqlAgentAnswer = idb.fetchSingle(agentQuestion);
                if(agentOldPassword.equals(sqlAgentAnswer)) {
                    String sqlAgentQuestion = "update Agent set Losenord = '" + agentNewPassword + "' where Namn = '" + agentUsername + "' and Losenord = '" + agentOldPassword + "';";
                    idb.update(sqlAgentQuestion);
                    JOptionPane.showMessageDialog(null, "You've successfully changed\nyour password to: " + agentNewPassword);
                }
                else {
                    lblErrorMessage.setText("Invalid username or password!");
                }
            }
            catch(InfException ex) {
                JOptionPane.showMessageDialog(null, "Internal database error");
            }
        }
        else if(!Validation.checkCmbBoxType(cmbChooseType)) {
            try {
                String alienUsername = txtUsername.getText();
                String alienOldPassword = txtOldPassword.getText();
                String alienNewPassword = txtNewPassword.getText();
                String alienQuestion = "select Losenord from Alien where Namn = '" + alienUsername + "';";
                String sqlAlienAnswer = idb.fetchSingle(alienQuestion);
                
                if(alienOldPassword.equals(sqlAlienAnswer)) {
                    String sqlAlienQuestion = "update Alien set Losenord = '" + alienNewPassword + "' where Namn = '" + alienUsername + "' and Losenord = '" + alienOldPassword + "';";
                    idb.update(sqlAlienQuestion);
                }
                else {
                    lblErrorMessage.setText("Invalid username or password!");
                }
            }
            catch(InfException ex) {
                JOptionPane.showMessageDialog(null, "Internal database error!");
            }
        }
        else {
            lblErrorMessage.setText("Unexpected error!");
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        ChangePasswordPage.this.dispose();
        new LoginPage(idb).setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed
    
    private void addTypes() {
        String agent = "Agent";
        String alien = "Alien";
        cmbChooseType.addItem(agent);
        cmbChooseType.addItem(alien);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChange;
    private javax.swing.JComboBox<String> cmbChooseType;
    private javax.swing.JLabel lblChangeAs;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JLabel lblHeaderChangePassword;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblOldPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
