/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.klasser;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Grupp4
 */
public class ChangeManagersPage extends javax.swing.JFrame {

    private InfDB idb;
    private int agentId;
    private int selectedAgentId;
    private String selectedType;
    private int selectedNewArea;
    private int selectedNewAgent;
    private int managedAreaBySelectedAgentId;
    
    /**
     * Creates new form ChangeManagersPage
     */
    public ChangeManagersPage(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        addItemsToCmbManagerType();
        LoginPage.addAgentIdToCmb(cmbAgentId);
        LoginPage.addAgentIdToCmb(cmbNewAgentId);
        LoginPage.addAreaIdToCmb(cmbAreaId);
        setTitle("Change manager");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblChooseType = new javax.swing.JLabel();
        cmbAgentType = new javax.swing.JComboBox<>();
        lblChangeManagerHeader = new javax.swing.JLabel();
        cmbAgentId = new javax.swing.JComboBox<>();
        lblAgentId = new javax.swing.JLabel();
        btnSetType = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblErrorMessage = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        lblAgentName = new javax.swing.JLabel();
        lblShowAgentName = new javax.swing.JLabel();
        lblManageArea = new javax.swing.JLabel();
        cmbAreaId = new javax.swing.JComboBox<>();
        lblSelectNewAgentId = new javax.swing.JLabel();
        cmbNewAgentId = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblChooseType.setText("Choose type:");

        cmbAgentType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAgentTypeActionPerformed(evt);
            }
        });

        lblChangeManagerHeader.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblChangeManagerHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChangeManagerHeader.setText("Change Manager");

        cmbAgentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAgentIdActionPerformed(evt);
            }
        });

        lblAgentId.setText("Agent-ID:");

        btnSetType.setText("Set");
        btnSetType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetTypeActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblErrorMessage.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblMessage.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 255, 0));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblAgentName.setText("Name:");

        lblManageArea.setText("Manage area:");

        cmbAreaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAreaIdActionPerformed(evt);
            }
        });

        lblSelectNewAgentId.setText("Select new area manager:");

        cmbNewAgentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNewAgentIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblChangeManagerHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSetType, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblChooseType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAgentId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbAgentType, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblShowAgentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblManageArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbAreaId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblSelectNewAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbNewAgentId, 0, 86, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblChangeManagerHeader)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgentId)
                    .addComponent(lblAgentName)
                    .addComponent(lblShowAgentName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChooseType)
                    .addComponent(cmbAgentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManageArea)
                    .addComponent(cmbAreaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectNewAgentId)
                    .addComponent(cmbNewAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorMessage)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSetType)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Denna metod st�nger ner det akruella f�nstret samt �ppnar en ny "AdminMenu".
     * @param evt 
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
        new AdminMenu(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed
    /**
     * Denna metod kontrollerar ifall en agent redan �r av en specifik typ. Annars skall det g� att tilldela agenten en ny typ.
     * @param evt 
     */
    private void cmbAgentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAgentIdActionPerformed
        String anAgentId = cmbAgentId.getSelectedItem().toString();
        selectedAgentId = parseInt(anAgentId);
        lblSelectNewAgentId.setVisible(false);
        cmbNewAgentId.setVisible(false);
        lblManageArea.setVisible(false);
        cmbAreaId.setVisible(false);
        
        if(LoginPage.checkIfIsAreaManager(selectedAgentId)) {
            managedAreaBySelectedAgentId = checkCurrentAreaManaged(selectedAgentId);
        }
        
        if(selectedType.equals("Area manager")) {
            lblManageArea.setVisible(true);
            cmbAreaId.setVisible(true);
        }
        else if((selectedType.equals("Field agent")) && (LoginPage.checkIfIsAreaManager(selectedAgentId))) {
            lblSelectNewAgentId.setVisible(true);
            cmbNewAgentId.setVisible(true);
        }
        else if((selectedType.equals("Office manager")) && (LoginPage.checkIfIsAreaManager(selectedAgentId))) {
            lblSelectNewAgentId.setVisible(true);
            cmbNewAgentId.setVisible(true);
        }
        
        try {
            String sqlQuery = "select Namn from Agent where Agent_ID = " + selectedAgentId;
            String agentName = idb.fetchSingle(sqlQuery);
            lblShowAgentName.setText(agentName);
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
    }//GEN-LAST:event_cmbAgentIdActionPerformed
    /**
     * Denna metod kontrollerar om vilken typ av agent agenten �r utav och om det g�r att tilldela agenten en ny typ.
     * @param evt 
     */
    private void cmbAgentTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAgentTypeActionPerformed
        selectedType = cmbAgentType.getSelectedItem().toString();
        lblSelectNewAgentId.setVisible(false);
        cmbNewAgentId.setVisible(false);
        lblManageArea.setVisible(false);
        cmbAreaId.setVisible(false);
        
        if(selectedType.equals("Area manager")) {
            lblManageArea.setVisible(true);
            cmbAreaId.setVisible(true);
        }
        else if((selectedType.equals("Office manager")) && (LoginPage.checkIfIsAreaManager(selectedAgentId))) {
            lblSelectNewAgentId.setVisible(true);
            cmbNewAgentId.setVisible(true);
        }
        else if((selectedType.equals("Field agent")) && (LoginPage.checkIfIsAreaManager(selectedAgentId))) {
            lblSelectNewAgentId.setVisible(true);
            cmbNewAgentId.setVisible(true);
        }
    }//GEN-LAST:event_cmbAgentTypeActionPerformed
    
    /**
     * Denna metod �ndrar en agents roll samt uppdaterar databasen.
     * Metoden ger �ven ett felmeddelande om agenten redan �r utav samma typ.
     * @param evt 
     */
    private void btnSetTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetTypeActionPerformed
        try {
            if((selectedType.equals("Area manager")) && (LoginPage.checkIfIsAreaManager(selectedAgentId))) {
                lblMessage.setText("");
                lblErrorMessage.setText("This agent is already managing an area!");
            }
            else if((selectedType.equals("Area manager")) && (LoginPage.checkIfIsFieldAgent(selectedAgentId))) {
                String sqlUpdateQuery = "update Omradeschef set Agent_ID = " + selectedAgentId + " where Omrade = " + selectedNewArea + ";";
                idb.update(sqlUpdateQuery);
                
                successfulChange();
                lblErrorMessage.setText("");
            }
            else if((selectedType.equals("Area manager")) && (LoginPage.checkIfIsOfficeManager(selectedAgentId))) {
                String sqlDeleteOfficeManagerQuery = "delete from Kontorschef where Agent_ID = " + selectedAgentId;
                idb.delete(sqlDeleteOfficeManagerQuery);
                
                String sqlInsertIntoFieldAgentQuery = "insert into Faltagent values(" + selectedAgentId + ");";
                idb.insert(sqlInsertIntoFieldAgentQuery);
                
                String sqlUpdateQuery = "update Omradeschef set Agent_ID = " + selectedAgentId + " where Omrade = " + selectedNewArea + ";";
                idb.update(sqlUpdateQuery);
                
                successfulChange();
                lblErrorMessage.setText("");
            }
            else if((selectedType.equals("Field agent")) && (LoginPage.checkIfIsAreaManager(selectedAgentId))) {
                if(LoginPage.checkIfIsAreaManager(selectedNewAgent)) {
                    lblMessage.setText("");
                    lblErrorMessage.setText("New agent already manage an area!");
                }
                else {
                    if(selectedAgentId == selectedNewAgent) {
                    lblMessage.setText("");
                    lblErrorMessage.setText("Agent cannot manage an area and an office!");
                    }
                    else {
                        String sqlUpdateQuery = "update Omradeschef set Agent_ID = " + selectedNewAgent + " where Omrade = " + managedAreaBySelectedAgentId + ";";
                        idb.update(sqlUpdateQuery);
                        
                        successfulChange();
                        lblErrorMessage.setText("");
                    }
                }
            }
            else if((selectedType.equals("Field agent")) && (LoginPage.checkIfIsFieldAgent(selectedAgentId))) {
                //felmeddelande
                lblMessage.setText("");
                lblErrorMessage.setText("This agent is already a field agent!");
            }
            else if((selectedType.equals("Field agent")) && (LoginPage.checkIfIsOfficeManager(selectedAgentId))) {
                //ta bort fr�n kontorschef l�gg till i f�ltagent
                String sqlDeleteQuery = "delete from Kontorschef where Agent_ID = " + selectedAgentId + ";";
                idb.delete(sqlDeleteQuery);
                
                String sqlInsertIntoFieldAgentQuery = "insert into Faltagent values(" + selectedAgentId + ");";
                idb.insert(sqlInsertIntoFieldAgentQuery);
                
                successfulChange();
                lblErrorMessage.setText("");
            }
            else if((selectedType.equals("Office manager")) && (LoginPage.checkIfIsAreaManager(selectedAgentId))) {
                //ta bort fr�n f�ltagent och omradeschef l�gg till p� kontorschef
                if(LoginPage.checkIfIsAreaManager(selectedNewAgent)) {
                    lblMessage.setText("");
                    lblErrorMessage.setText("New agent already manage an area!");
                }
                else {
                    if(LoginPage.checkForAnOfficeManager()) {
                        if(LoginPage.checkIfIsOfficeManager(selectedNewAgent)) {
                            String sqlUpdateFieldAgent = "update Faltagent set Agent_ID = " + selectedNewAgent + " where Agent_ID = " + selectedAgentId + ";";
                            idb.update(sqlUpdateFieldAgent);
                            
                            String sqlUpdateAreaManagerQuery = "update Omradeschef set Agent_ID = " + selectedNewAgent + " where Omrade = " + managedAreaBySelectedAgentId + ";";
                            idb.update(sqlUpdateAreaManagerQuery);
                            
                            String sqlUpdateOfficeManagerQuery = "update Kontorschef set Agent_ID = " + selectedAgentId + " where Kontorsbeteckning = �rebrokontoret";
                            idb.update(sqlUpdateOfficeManagerQuery);
                            
                            successfulChange();
                            lblErrorMessage.setText("");
                        }
                        else {
                            int oldOfficeManagerId = getOfficeManagerId();
                            String sqlUpdateFieldAgent = "update Faltagent set Agent_ID = " + oldOfficeManagerId + " where Agent_ID = " + selectedAgentId + ";";
                            idb.update(sqlUpdateFieldAgent);
                            
                            String sqlUpdateAreaManagerQuery = "update Omradeschef set Agent_ID = " + selectedNewAgent + " where Omrade = " + managedAreaBySelectedAgentId + ";";
                            idb.update(sqlUpdateAreaManagerQuery);
                            
                            String sqlUpdateOfficeManagerQuery = "update Kontorschef set Agent_ID = " + selectedAgentId + " where Kontorsbeteckning = �rebrokontoret";
                            idb.update(sqlUpdateOfficeManagerQuery);
                            
                            successfulChange();
                            lblErrorMessage.setText("");
                        }
                    }
                    else {
                        String sqlInsertOfficeManagerQuery = "insert into Kontorschef values(" + selectedAgentId + ", '�rebrokontoret');";
                        idb.insert(sqlInsertOfficeManagerQuery);
                        
                        String sqlUpdateAreaManagerQuery = "update Omradeschef set Agent_ID = " + selectedNewAgent + " where Omrade = " + managedAreaBySelectedAgentId + ";";
                        idb.update(sqlUpdateAreaManagerQuery);
                        
                        String sqlDeleteFieldAgent = "delete from Faltagent where Agent_ID = " + selectedAgentId + ";";
                        idb.delete(sqlDeleteFieldAgent);
                        
                        successfulChange();
                        lblErrorMessage.setText("");
                    }
                }
            }
            else if((selectedType.equals("Office manager")) && (LoginPage.checkIfIsFieldAgent(selectedAgentId))) {
                if(LoginPage.checkForAnOfficeManager()) {
                    int oldOfficeManagerId = getOfficeManagerId();
                    
                    String sqlUpdateFieldAgent = "update Faltagent set Agent_ID = " + oldOfficeManagerId + " where Agent_ID = " + selectedAgentId + ";";
                    idb.update(sqlUpdateFieldAgent);
                    
                    String sqlUpdateOfficeManagerQuery = "update Kontorschef set Agent_ID = " + selectedAgentId + " where Kontorsbeteckning = '�rebrokontoret';";
                    idb.update(sqlUpdateOfficeManagerQuery);
                    
                    successfulChange();
                    lblErrorMessage.setText("");
                }
                else {
                    String sqlInsertOfficeManagerQuery = "insert into Kontorschef values(" + selectedAgentId + ", '�rebrokontoret');";
                    idb.insert(sqlInsertOfficeManagerQuery);
                    
                    String sqlDeleteFieldAgent = "delete from Faltagent where Agent_ID = " + selectedAgentId + ";";
                    idb.delete(sqlDeleteFieldAgent);
                    
                    successfulChange();
                    lblErrorMessage.setText("");
                }
            }
            else if((selectedType.equals("Office manager")) && (LoginPage.checkIfIsOfficeManager(selectedAgentId))) {
                //felmeddelande
                lblMessage.setText("");
                lblErrorMessage.setText("This agent is already office manager!");
            }
            
        }
        catch(InfException e) {
            lblMessage.setText("");
            lblErrorMessage.setText("Try again with different values!");
        }
    }//GEN-LAST:event_btnSetTypeActionPerformed
    /**
     * I denna metod v�ljer man area id.
     * @param evt 
     */
    private void cmbAreaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAreaIdActionPerformed
        String anAreaId = cmbAreaId.getSelectedItem().toString();
        selectedNewArea = parseInt(anAreaId);
    }//GEN-LAST:event_cmbAreaIdActionPerformed
    /**
     * I denna metod v�ljer man vilken agent man skall �ndra info om.
     * @param evt 
     */
    private void cmbNewAgentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNewAgentIdActionPerformed
        String anAgentId = cmbNewAgentId.getSelectedItem().toString();
        selectedNewAgent = parseInt(anAgentId);
    }//GEN-LAST:event_cmbNewAgentIdActionPerformed
    /**
     * Denna metod l�gger till f�rem�l (v�rden) i en kombobox.
     */
    private void addItemsToCmbManagerType() {
        String firstItem = "Field agent";
        String secondItem = "Area manager";
        String thirdItem = "Office manager";
        cmbAgentType.addItem(firstItem);
        cmbAgentType.addItem(secondItem);
        cmbAgentType.addItem(thirdItem);
    }
    
    /**
     * Denna metod skapar en ny AdminMenu, visar meddelande f�r anv�ndaren att 
     * �ndringen fungerade samt st�nger det nuvarande f�nstret (ChangeManagersPage).
     */
    private void successfulChange() {
        new AdminMenu(idb, agentId).setVisible(true);
        JOptionPane.showMessageDialog(null, "Successful change!");
        dispose();
    }
    
    /**
     * Denna metod kontrollerar vilken plats som en agent �r verksam i.
     * @param checkThisAgentsManagedArea
     * @return 
     */
    private int checkCurrentAreaManaged(int checkThisAgentsManagedArea) {
        int managingArea = 0;
        try {
            String sqlQuery = "select Omrade from Omradeschef where Agent_ID = " + checkThisAgentsManagedArea;
            String anAreaId = idb.fetchSingle(sqlQuery);
            managingArea = parseInt(anAreaId);
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
        return managingArea;
    }
    
    /**
     * Denna metod kontrollerar vilken agent som �r verksam i en viss plats.
     * @param thisAreaId
     * @return 
     */
    private int checkAgentIdForAnArea(int thisAreaId) {
        int agentIdForThisArea = 0;
        try {
            String sqlAgentIdQuery = "select Agent_ID from Omradeschef where Omrade = " + thisAreaId + ";";
            String anAgentId = idb.fetchSingle(sqlAgentIdQuery);
            agentIdForThisArea = parseInt(anAgentId);
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
        return agentIdForThisArea;
    }
    
    /**
     * Metod som h�mtar ett Agent_ID f�r den agent som �r kontorschef och sedan returnerar det v�rdet.
     * @return 
     */
    private int getOfficeManagerId() {
        int officeManagerId = 0;
        try {
            String sqlQuery = "select Agent_ID from Kontorschef where KontorsBeteckning = '�rebrokontoret';";
            String result = idb.fetchSingle(sqlQuery);
            officeManagerId = parseInt(result);
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
        return officeManagerId;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSetType;
    private javax.swing.JComboBox<String> cmbAgentId;
    private javax.swing.JComboBox<String> cmbAgentType;
    private javax.swing.JComboBox<String> cmbAreaId;
    private javax.swing.JComboBox<String> cmbNewAgentId;
    private javax.swing.JLabel lblAgentId;
    private javax.swing.JLabel lblAgentName;
    private javax.swing.JLabel lblChangeManagerHeader;
    private javax.swing.JLabel lblChooseType;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JLabel lblManageArea;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblSelectNewAgentId;
    private javax.swing.JLabel lblShowAgentName;
    // End of variables declaration//GEN-END:variables
}
