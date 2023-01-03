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
 * @author theosohlman
 */
public class AddEquipmentToAgentPage extends javax.swing.JFrame {

    private InfDB idb;
    private int agentId;
    private int selectedEquipment;
    
    /**
     * Creates new form AddEquipmentToAgentPage
     */
    public AddEquipmentToAgentPage(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        addItemsToCmbChooseEquipment();
        setTitle("Assign equipment!");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAssignEquipmentHeader = new javax.swing.JLabel();
        cmbChooseEquipment = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaEquipmentInfo = new javax.swing.JTextArea();
        lblChooseEquipment = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblSuccessMessage = new javax.swing.JLabel();
        lblErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAssignEquipmentHeader.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblAssignEquipmentHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAssignEquipmentHeader.setText("Assign equipment to yourself");

        cmbChooseEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChooseEquipmentActionPerformed(evt);
            }
        });

        txtAreaEquipmentInfo.setColumns(20);
        txtAreaEquipmentInfo.setRows(5);
        jScrollPane1.setViewportView(txtAreaEquipmentInfo);

        lblChooseEquipment.setText("Choose equipment:");

        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblSuccessMessage.setForeground(new java.awt.Color(0, 255, 0));
        lblSuccessMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSuccessMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAssignEquipmentHeader))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lblChooseEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbChooseEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAssignEquipmentHeader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbChooseEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChooseEquipment))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSuccessMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAssign)
                            .addComponent(btnCancel))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        try {
            if(checkIfEquipmentIsAssigned()) {
                String sqlDeleteQuery = "delete from Innehar_Utrustning where Utrustnings_ID = " + selectedEquipment + ";";
                idb.delete(sqlDeleteQuery);
            }
            
            String sqlInsertQuery = "insert into Innehar_Utrustning values (" + agentId + ", " + selectedEquipment + ", curdate() );";
            idb.insert(sqlInsertQuery);
            lblSuccessMessage.setText("Successfully added Equipment-ID: " + selectedEquipment);
        }
        catch(InfException e) {
            lblErrorMessage.setText("Unexpected error!");
        }
    }//GEN-LAST:event_btnAssignActionPerformed
    
    private void cmbChooseEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChooseEquipmentActionPerformed
        txtAreaEquipmentInfo.setText("");
        ArrayList<HashMap<String, String>> equipmentInfo = new ArrayList<HashMap<String, String>>();
        String chosenEquipment = cmbChooseEquipment.getSelectedItem().toString();
        selectedEquipment = parseInt(chosenEquipment);
        try {
            String sqlRowsQuestion = "select * from Utrustning;";
            equipmentInfo = idb.fetchRows(sqlRowsQuestion);
            
            for(HashMap<String, String> anEquipment : equipmentInfo) {
                if(anEquipment.get("Utrustnings_ID").equals(chosenEquipment)) {
                    txtAreaEquipmentInfo.append(anEquipment.get("Utrustnings_ID") + "\t");
                    txtAreaEquipmentInfo.append(anEquipment.get("Benamning") + "\n");
                }
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
    }//GEN-LAST:event_cmbChooseEquipmentActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        AddEquipmentToAgentPage.this.dispose();
        new EquipmentMenu(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed
    
    private void addItemsToCmbChooseEquipment() {
        String sqlQuestion = "select Utrustnings_ID from Utrustning";
        ArrayList<String> equipmentIdList = new ArrayList<String>();
        
        try {
            equipmentIdList = idb.fetchColumn(sqlQuestion);
            for(String anEquipmentId : equipmentIdList) {
                cmbChooseEquipment.addItem(anEquipmentId);
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
    }
    
    private boolean checkIfEquipmentIsAssigned() {
        boolean isAssigned = false;
        try {
            String sqlRowsQuery = "select Utrustnings_ID from Innehar_Utrustning where Utrustnings_ID = " + selectedEquipment + ";";
            String result = idb.fetchSingle(sqlRowsQuery);
            if(result != null) {
                isAssigned = true;
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
        return isAssigned;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> cmbChooseEquipment;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAssignEquipmentHeader;
    private javax.swing.JLabel lblChooseEquipment;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JLabel lblSuccessMessage;
    private javax.swing.JTextArea txtAreaEquipmentInfo;
    // End of variables declaration//GEN-END:variables
}
