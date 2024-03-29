/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.klasser;

import static java.lang.Integer.parseInt;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Grupp4
 */
public class NewCommunicationPage extends javax.swing.JFrame {
    /**
     * f�ltdeklarationer.
     */
    private InfDB idb;
    private int agentId;
    
    /**
     * Creates new form NewCommunicationPage.
     * @param idb
     * @param agentId 
     */
    public NewCommunicationPage(InfDB idb,int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        setTitle("Register new Communication!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        lblAddNewCommunicationHeader = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblTransferTechnology = new javax.swing.JLabel();
        lblEquipmentId = new javax.swing.JLabel();
        txtEquipmentId = new javax.swing.JTextField();
        txtTransferTechnology = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        btnAddCommunication = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblText = new javax.swing.JLabel();
        lblErrorText = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAddNewCommunicationHeader.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAddNewCommunicationHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddNewCommunicationHeader.setText("Add New Communication");

        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescription.setText("Description:");

        lblTransferTechnology.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTransferTechnology.setText("Transfer technology:");

        lblEquipmentId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipmentId.setText("Equipment-ID:");

        btnAddCommunication.setText("Add");
        btnAddCommunication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCommunicationActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblText.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblText.setForeground(new java.awt.Color(0, 255, 0));
        lblText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblErrorText.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblErrorText.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(lblAddNewCommunicationHeader)
                .addGap(0, 111, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblErrorText, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(lblText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddCommunication, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEquipmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTransferTechnology, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEquipmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtTransferTechnology, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddNewCommunicationHeader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEquipmentId)
                    .addComponent(txtEquipmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescription))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTransferTechnology, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTransferTechnology))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddCommunication)
                            .addComponent(btnCancel)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblErrorText, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Denna metod st�nger ner NewCommunicationPage samt �ppnar en ny EquipmentMenu.
     * @param evt 
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
        new EquipmentMenu(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed
    
    /**
     * Denna metod l�gger till ny kommunikationsutrustning genom att h�mta de v�rden som �r ifyllda i parametrarna till databasen samt
     * utf�r en kontroll genom validation-klassen f�r att kontrollera att alla f�lt �r ifyllda.
     * @param evt 
     */
    private void btnAddCommunicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCommunicationActionPerformed
        if(Validation.checkThreeEmptyTxtFields(txtEquipmentId, txtDescription, txtTransferTechnology)) {
            lblText.setText("");
            lblErrorText.setText("Every field has to be filled!");
        }
        else {
            try {
                if(Validation.checkIfTxtFieldIsOfInt(txtEquipmentId)) {
                    int equipmentId = parseInt(txtEquipmentId.getText());
                    String description = txtDescription.getText();
                    String transferTechnology = txtTransferTechnology.getText();
                
                    String sqlSecondQuestion = "insert into Utrustning values (" + equipmentId + ", '" + description + "');";
                    idb.insert(sqlSecondQuestion);
                
                    String sqlQuestion = "insert into Kommunikation values (" + equipmentId + ", '" + transferTechnology + "');";
                    idb.insert(sqlQuestion);
                    
                    lblText.setText("Successful register!");
                    lblErrorText.setText("");
                }
                else {
                    lblText.setText("");
                    lblErrorText.setText("ID must be correct number format!");
                }
            }
            catch(InfException e) {
                lblText.setText("");
                lblErrorText.setText("ID already exist!");
            }
        }
    }//GEN-LAST:event_btnAddCommunicationActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCommunication;
    private javax.swing.JButton btnCancel;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAddNewCommunicationHeader;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblEquipmentId;
    private javax.swing.JLabel lblErrorText;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTransferTechnology;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtEquipmentId;
    private javax.swing.JTextField txtTransferTechnology;
    // End of variables declaration//GEN-END:variables
}
