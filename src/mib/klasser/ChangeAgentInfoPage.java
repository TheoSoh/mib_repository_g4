/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.klasser;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Grupp4
 */
public class ChangeAgentInfoPage extends javax.swing.JFrame {

    //H�r p�b�rjas deklaration av f�lt.
    private InfDB idb;
    private int agentId;
    private int selectedAgentId;
    //H�r slutar deklarationen av f�lt.
    
    /**
     * Creates new form ChangeAlienInfoPage
     * @param idb
     * @param agentId 
     */
    public ChangeAgentInfoPage(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        LoginPage.addAgentIdToCmb(cmbAgentId);
        addItemsToCmbInfoToChange();
        setTitle("Change agent Info");
    }
    
    /**
     * 
     */
    private void addItemsToCmbInfoToChange() {
        String firstValue = "Name";
        String secondValue = "Phone number";
        String thirdValue = "Employment date";
        String fourthValue = "Admin status";
        String fifthValue = "Password";
        String sixthValue = "Area";
        cmbInfoToChange.addItem(firstValue);
        cmbInfoToChange.addItem(secondValue);
        cmbInfoToChange.addItem(thirdValue);
        cmbInfoToChange.addItem(fourthValue);
        cmbInfoToChange.addItem(fifthValue);
        cmbInfoToChange.addItem(sixthValue);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblChangeInfoHeader = new javax.swing.JLabel();
        cmbAgentId = new javax.swing.JComboBox<>();
        lblAgentId = new javax.swing.JLabel();
        cmbInfoToChange = new javax.swing.JComboBox<>();
        lblChangeThis = new javax.swing.JLabel();
        txtNewValue = new javax.swing.JTextField();
        lblNewValue = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblSuccessMessage = new javax.swing.JLabel();
        lblErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblChangeInfoHeader.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblChangeInfoHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChangeInfoHeader.setText("Change an agent's information");

        cmbAgentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAgentIdActionPerformed(evt);
            }
        });

        lblAgentId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAgentId.setText("Agent-ID:");

        lblChangeThis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblChangeThis.setText("Info to change:");

        lblNewValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNewValue.setText("Insert new value here:");

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

        lblSuccessMessage.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblSuccessMessage.setForeground(new java.awt.Color(0, 255, 0));
        lblSuccessMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblErrorMessage.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSuccessMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblChangeInfoHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNewValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblChangeThis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbInfoToChange, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblChangeInfoHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgentId))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbInfoToChange, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChangeThis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewValue))
                .addGap(18, 18, 18)
                .addComponent(lblSuccessMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnChange)
                        .addComponent(btnCancel))
                    .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * 
     * @param evt 
     */
    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        try {
            if(Validation.checkEmptyTxtField(txtNewValue)) {
                lblErrorMessage.setText("Enter a new Value!");
            }
            else {
                String selectedInfo = cmbInfoToChange.getSelectedItem().toString();
                String newValue = txtNewValue.getText();
                
                if(selectedInfo.equals("Name")) {
                    String sqlUpdateQuery = "update Agent set Namn = '" + newValue + "' where Agent_ID = " + selectedAgentId + ";";
                    idb.update(sqlUpdateQuery);
                    lblErrorMessage.setText("");
                    lblSuccessMessage.setText("Updated Name to " + newValue);
                }
                else if(selectedInfo.equals("Phone number")) {
                    String sqlUpdateQuery = "update Agent set Telefon = '" + newValue + "' where Agent_ID = " + selectedAgentId + ";";
                    idb.update(sqlUpdateQuery);
                    lblErrorMessage.setText("");
                    lblSuccessMessage.setText("Updated Phone number to " + newValue);
                }
                else if(selectedInfo.equals("Employment date")) {
                    String sqlUpdateQuery = "update Agent set Anstallningsdatum = '" + newValue + "' where Agent_ID = " + selectedAgentId + ";";
                    idb.update(sqlUpdateQuery);
                    lblErrorMessage.setText("");
                    lblSuccessMessage.setText("Updated Employment date to " + newValue);
                }
                else if(selectedInfo.equals("Admin status")) {
                    if((newValue.equals("J")) || (newValue.equals("j"))) {
                        String sqlUpdateQuery = "update Agent set Administrator = 'J' where Agent_ID = " + selectedAgentId + ";";
                        idb.update(sqlUpdateQuery);
                        lblErrorMessage.setText("");
                        lblSuccessMessage.setText("Updated Admin status to J");
                    }
                    else if((newValue.equals("N")) || (newValue.equals("n"))) {
                        String sqlUpdateQuery = "update Agent set Administrator = 'N' where Agent_ID = " + selectedAgentId + ";";
                        idb.update(sqlUpdateQuery);
                        lblErrorMessage.setText("");
                        lblSuccessMessage.setText("Updated Admin status to N");
                    }
                    else {
                        lblSuccessMessage.setText("");
                        lblErrorMessage.setText("Enter J or N as value. J = admin, N = not admin!");
                    }
                }
                else if(selectedInfo.equals("Password")) {
                    String sqlUpdateQuery = "update Agent set Losenord = '" + newValue + "' where Agent_ID = " + selectedAgentId + ";";
                    idb.update(sqlUpdateQuery);
                    lblErrorMessage.setText("");
                    lblSuccessMessage.setText("Updated Password to " + newValue);
                }
                else if(selectedInfo.equals("Area")) {
                    if(Validation.checkIfTxtFieldIsOfInt(txtNewValue)) {
                        int newIntValue = parseInt(newValue);
                        String sqlUpdateQuery = "update Agent set Omrade = " + newIntValue + " where Agent_ID = " + selectedAgentId + ";";
                        idb.update(sqlUpdateQuery);
                        lblErrorMessage.setText("");
                        lblSuccessMessage.setText("Updated Area to " + newIntValue);
                    }
                    else {
                        lblSuccessMessage.setText("");
                        lblErrorMessage.setText("Enter a valid Area-ID!");
                    }
                }
            }
        }
        catch(InfException e) {
            lblErrorMessage.setText("Invalid value!");
            lblSuccessMessage.setText("");
        }
        
        
    }//GEN-LAST:event_btnChangeActionPerformed
    
    /**
     * 
     * @param evt 
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        ChangeAgentInfoPage.this.dispose();
        new AdminMenu(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * 
     * @param evt 
     */
    private void cmbAgentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAgentIdActionPerformed
        String selectedAgentIdString = cmbAgentId.getSelectedItem().toString();
        selectedAgentId = parseInt(selectedAgentIdString);
    }//GEN-LAST:event_cmbAgentIdActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChange;
    private javax.swing.JComboBox<String> cmbAgentId;
    private javax.swing.JComboBox<String> cmbInfoToChange;
    private javax.swing.JLabel lblAgentId;
    private javax.swing.JLabel lblChangeInfoHeader;
    private javax.swing.JLabel lblChangeThis;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JLabel lblNewValue;
    private javax.swing.JLabel lblSuccessMessage;
    private javax.swing.JTextField txtNewValue;
    // End of variables declaration//GEN-END:variables
}
