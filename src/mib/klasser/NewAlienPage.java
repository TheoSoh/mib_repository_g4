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
 * @author Grupp4
 */
public class NewAlienPage extends javax.swing.JFrame {
    
    //F�ltdeklarationer
    private static InfDB idb;
    private int agentId;
    private String selectedRace;
    
    
    /**
     * Creates new form NewAlienPage
     */
    public NewAlienPage(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        addItemsToCmbSetRace();
        addItemsToCmbAreaId(cmbAreaId);
        addItemsToCmbAssignAgentId(cmbAssignAgentId);
        setTitle("Register new alien!");
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNewAlienHeader = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        txtAlienId = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        lblAlienId = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblAssignAgent = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        lblErrorMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbSetRace = new javax.swing.JComboBox<>();
        txtAmmount = new javax.swing.JTextField();
        lblAmmount = new javax.swing.JLabel();
        cmbAreaId = new javax.swing.JComboBox<>();
        cmbAssignAgentId = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNewAlienHeader.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblNewAlienHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewAlienHeader.setText("Register new alien");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblAlienId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAlienId.setText("Alien-ID:");

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword.setText("Password:");

        lblName.setText("Name:");

        lblPhoneNumber.setText("Phone number:");

        lblArea.setText("Area:");

        lblAssignAgent.setText("Assign Agent-ID:");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 255, 0));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblErrorMessage.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("Set Race:");

        cmbSetRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSetRaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(lblNewAlienHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAlienId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAmmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAlienId)
                                    .addComponent(txtPassword)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPhoneNumber)
                                    .addComponent(lblArea)
                                    .addComponent(lblAssignAgent))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPhoneNumber)
                                    .addComponent(cmbAreaId, javax.swing.GroupLayout.Alignment.LEADING, 0, 90, Short.MAX_VALUE)
                                    .addComponent(cmbAssignAgentId, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbSetRace, 0, 116, Short.MAX_VALUE)
                                    .addComponent(txtAmmount))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNewAlienHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlienId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlienId)
                            .addComponent(lblPhoneNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArea)
                            .addComponent(cmbAreaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAssignAgent)
                            .addComponent(cmbAssignAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegister)
                            .addComponent(btnCancel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbSetRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAmmount))))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Denna metod l�gger till f�rem�l i komboboxen som man sedan kan v�lja f�r att ge v�rdet till en specifik alien.
     */
    private void addItemsToCmbSetRace() {
        String firstRace = "Boglodite";
        String secondRace = "Squid";
        String thirdRace = "Worm";
        cmbSetRace.addItem(firstRace);
        cmbSetRace.addItem(secondRace);
        cmbSetRace.addItem(thirdRace);
    }
    /**
     * Metoden l�gger till f�rem�l i en kombobox.
     * @param fillThisBox 
     */
    private void addItemsToCmbAreaId(JComboBox<String> fillThisBox) {
        try {
            String sqlQuestion = "select Omrades_ID from Omrade";
            ArrayList<String> areaIdList = idb.fetchColumn(sqlQuestion);
            for(String anAreaId : areaIdList) {
                fillThisBox.addItem(anAreaId);
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
    }
    /**
     * Metoden l�gger till f�rem�l i en kombobox. I detta fall de agent-id:n som finns i databasen.
     * @param fillThisBox 
     */
    private void addItemsToCmbAssignAgentId(JComboBox<String> fillThisBox) {
        try {
            String sqlQuestion = "select Agent_ID from Agent";
            ArrayList<String> agentIdList = idb.fetchColumn(sqlQuestion);
            for(String anAgentId : agentIdList) {
                fillThisBox.addItem(anAgentId);
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
    }
    
    /**
     * Denna metod st�nger ner NewAlienPage och �ppnar ett ny agent eller admin-menu beroende av kontrollen.
     * @param evt 
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        NewAlienPage.this.dispose();
        if(LoginPage.checkAdminStatus(agentId)) {
            new AdminMenu(idb, agentId).setVisible(true);
        }
        else {
            new AgentMenu(idb, agentId).setVisible(true);
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * Denna metod kontrollerar genom validation-klassen via metoden "checkFourEmptyFields" att alla text-f�lt �r ifyllda.
     * Metoden kontrollerar �ven s� att r�tt datatyper anv�nds.
     * Sedan g�r metoden s� att all information som �r ifyllt i text-f�lten blir tillagda i databasen tillh�rande en ny specifik alien.
     * @param evt 
     */
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if(Validation.checkFourEmptyFields(txtAlienId, txtPassword, 
                txtName, txtPhoneNumber)) {
            lblErrorMessage.setText("Every field has to be filled!");
            
        }
        else if (Validation.checkIfTxtFieldIsOfInt(txtAlienId)) {
            try {
                int alienId = parseInt(txtAlienId.getText());
                String password = txtPassword.getText();
                String name = txtName.getText();
                String phoneNumber = txtPhoneNumber.getText();
                String selectedAreaId = cmbAreaId.getSelectedItem().toString();
                int area = parseInt(selectedAreaId);
                String selectedAgentId = cmbAssignAgentId.getSelectedItem().toString();
                int assignedAgentId = parseInt(selectedAgentId);
                String Ammount = txtAmmount.getText();
                String sqlNewAlienQuery = "insert into Alien "
                        + "values(" + alienId + ", curdate(), '" + password + "',"
                        + " '" + name + "', '" + phoneNumber + "', " + area + ", " + assignedAgentId + ");";
                idb.insert(sqlNewAlienQuery);
                
                if(!Validation.checkStringSelectedRace(selectedRace)) {
                    if(Validation.checkIfTxtFieldIsOfInt(txtAmmount)) {
                        int AmmountToInt = parseInt(Ammount);
                        String sqlSetRaceQuery = "insert into " + selectedRace + " values(" + alienId + ", " + AmmountToInt + ");";
                        idb.insert(sqlSetRaceQuery);
                        lblMessage.setText("Successful register!");
                        lblErrorMessage.setText("");
                    }
                    else {
                        lblMessage.setText("");
                        lblErrorMessage.setText("Arms/Boogies has to be correct format!");
                    }
                    
                }
                else {
                    String sqlSetRaceQuery = "insert into " + selectedRace + " values(" + alienId + ");";
                    idb.insert(sqlSetRaceQuery);
                    lblMessage.setText("Successful register!");
                    lblErrorMessage.setText("");
                }
            }
            catch(InfException e) {
                lblErrorMessage.setText("Wrong format, Alien-ID exist or Agent-ID/Area don't!");
                lblMessage.setText("");
            }
        }
        else {
            lblMessage.setText("");
            lblErrorMessage.setText("Wrong format!");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed
    
    /**
     * 
     * @param evt 
     */
    private void cmbSetRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSetRaceActionPerformed
        selectedRace = cmbSetRace.getSelectedItem().toString();
        if(selectedRace.equals("Boglodite")) {
            lblAmmount.setText("Boogies:");
            txtAmmount.setVisible(true);
        }
        else if(selectedRace.equals("Squid")) {
            lblAmmount.setText("Arms:");
            txtAmmount.setVisible(true);
        }
        else if(selectedRace.equals("Worm")) {
            lblAmmount.setText("");
            txtAmmount.setVisible(false);
        }
    }//GEN-LAST:event_cmbSetRaceActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbAreaId;
    private javax.swing.JComboBox<String> cmbAssignAgentId;
    private javax.swing.JComboBox<String> cmbSetRace;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAlienId;
    private javax.swing.JLabel lblAmmount;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblAssignAgent;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNewAlienHeader;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JTextField txtAlienId;
    private javax.swing.JTextField txtAmmount;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
