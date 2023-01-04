/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.klasser;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author theosohlman
 */
public class DeleteAgentPage extends javax.swing.JFrame {

    private InfDB idb;
    private int agentId;
    private int selectedAgentId;
    private int selectedNewAreaManager;
    private String selectedAgentIdString;
    
    /**
     * Creates new form DeleteAgentPage
     */
    public DeleteAgentPage(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        LoginPage.addAgentIdToCmb(cmbAgentId);
        LoginPage.addAgentIdToCmb(cmbNewAreaManager);
        setTitle("Delete an Agent");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDeleteAgentHeader = new javax.swing.JLabel();
        cmbAgentId = new javax.swing.JComboBox<>();
        lblAgentId = new javax.swing.JLabel();
        lblAgentName = new javax.swing.JLabel();
        lblShowAgentName = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cmbNewAreaManager = new javax.swing.JComboBox<>();
        lblNewAreaManager = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDeleteAgentHeader.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblDeleteAgentHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeleteAgentHeader.setText("Delete an Agent");

        cmbAgentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAgentIdActionPerformed(evt);
            }
        });

        lblAgentId.setText("Delete this Agent-ID:");

        lblAgentName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAgentName.setText("Agent's name:");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        cmbNewAreaManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNewAreaManagerActionPerformed(evt);
            }
        });

        lblNewAreaManager.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNewAreaManager.setText("New Area Manager:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDeleteAgentHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblAgentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAgentId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNewAreaManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShowAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbNewAreaManager, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblDeleteAgentHeader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgentId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentName)
                    .addComponent(lblShowAgentName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNewAreaManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewAreaManager))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnCancel))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAgentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAgentIdActionPerformed
        selectedAgentIdString = cmbAgentId.getSelectedItem().toString();
        selectedAgentId = parseInt(selectedAgentIdString);
        
        try {
            String sqlQuery = "select Namn from Agent where Agent_ID = " + selectedAgentId;
            String agentName = idb.fetchSingle(sqlQuery);
            lblShowAgentName.setText(agentName);
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
        
        lblNewAreaManager.setVisible(false);
        cmbNewAreaManager.setVisible(false);
        
        if(LoginPage.checkIfIsAreaManager(selectedAgentId)) {
            lblNewAreaManager.setVisible(true);
            cmbNewAreaManager.setVisible(true);
        }
    }//GEN-LAST:event_cmbAgentIdActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            
            if(checkIfAgentHasEquipment()) {
                String sqlDeleteHasEquipmentQuery = "delete from Innehar_Utrustning where Agent_ID = " + selectedAgentId;
                idb.delete(sqlDeleteHasEquipmentQuery);
            }
            
            if(LoginPage.checkIfIsAreaManager(selectedAgentId)) {
                String sqlUpdateAreaManagerQuery = "update Omradeschef set "
                        + "Agent_ID = " + selectedNewAreaManager + " where Agent_ID = " + selectedAgentId + ";";
                idb.update(sqlUpdateAreaManagerQuery);
            }
            
            if(LoginPage.checkIfIsOfficeManager(selectedAgentId)) {
                String sqlDeleteOfficeManagerQuery = "delete from Kontorschef where Agent_ID = " + selectedAgentId;
                idb.delete(sqlDeleteOfficeManagerQuery);
            }
            
            if(LoginPage.checkIfIsFieldAgent(selectedAgentId)) {
                String sqlDeleteFieldAgentQuery = "delete from Faltagent where Agent_ID = " + selectedAgentId;
                idb.delete(sqlDeleteFieldAgentQuery);
            }
            
            String sqlDeleteQuery = "delete from Agent where Agent_ID = " + selectedAgentId;
            idb.delete(sqlDeleteQuery);
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        DeleteAgentPage.this.dispose();
        new AdminMenu(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cmbNewAreaManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNewAreaManagerActionPerformed
        String selectedNewAreaManagerString = cmbNewAreaManager.getSelectedItem().toString();
        selectedNewAreaManager = parseInt(selectedNewAreaManagerString);
    }//GEN-LAST:event_cmbNewAreaManagerActionPerformed
    
    private boolean checkIfAgentHasEquipment() {
        boolean hasEquipment = false;
        try {
            String sqlQuestion = "select Agent_ID from Innehar_Utrustning where Agent_ID = " + selectedAgentId + ";";
            String result = idb.fetchSingle(sqlQuestion);
            if(result != null) {
                hasEquipment = true;
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
        return hasEquipment;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> cmbAgentId;
    private javax.swing.JComboBox<String> cmbNewAreaManager;
    private javax.swing.JLabel lblAgentId;
    private javax.swing.JLabel lblAgentName;
    private javax.swing.JLabel lblDeleteAgentHeader;
    private javax.swing.JLabel lblNewAreaManager;
    private javax.swing.JLabel lblShowAgentName;
    // End of variables declaration//GEN-END:variables
}
