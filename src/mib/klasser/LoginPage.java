package mib.klasser;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

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
public class LoginPage extends javax.swing.JFrame {
    
    private static InfDB idb;
    
    /**
     * Creates new form LoginPage.
     */
    public LoginPage(InfDB idb) {
        initComponents();
        this.idb = idb;
        addLoginAs();
        setTitle("Login page");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnChangePassword = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();
        lblLoginFail = new javax.swing.JLabel();
        lblLoginAs = new javax.swing.JLabel();
        cmbLoginAs = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblUser.setText("ID:");

        lblPass.setText("Password:");

        btnChangePassword.setText("Change password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        lblRubrik.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblRubrik.setText("MIB - Log in to gain access");

        lblLoginFail.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblLoginFail.setForeground(new java.awt.Color(255, 0, 0));
        lblLoginFail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblLoginAs.setText("Login as:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoginFail, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRubrik)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLoginAs)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(cmbLoginAs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnChangePassword)
                        .addGap(27, 27, 27)
                        .addComponent(btnLogin)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblRubrik)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoginAs)
                    .addComponent(cmbLoginAs, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblLoginFail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangePassword))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Denna metod kallas p� n�r anv�ndaren klickar p� "Login" knappen.
     * Metoden h�mtar v�rden fr�n databasen och j�mf�r dom med v�rdena som anv�ndaren har angett i textrutorna.
     * D�refter skickas man vidare till antingen AgentMenu, AdminMenu eller AlienMenu.
     * @param evt 
     */
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(Validation.checkEmptyFields(txtId, txtPassword)) {
            lblLoginFail.setText("Please enter an ID and password!");
        }
        else if (Validation.checkCmbBoxType(cmbLoginAs)) {
            try {
                if(Validation.checkIfTxtFieldIsOfInt(txtId)) {
                    String agentId = txtId.getText();
                    int agentIdInt = parseInt(agentId);
                    String agentPassword = txtPassword.getText();
                    
                    String agentQuestion = "select Losenord from Agent where Agent_ID = " + agentIdInt + ";";
                    String sqlAgentAnswer = idb.fetchSingle(agentQuestion);
                    
                    if(agentPassword.equals(sqlAgentAnswer)) {
                        if(!checkAdminStatus(agentIdInt)) {
                            dispose();
                            new AgentMenu(idb, agentIdInt).setVisible(true);
                        }
                        else {
                            dispose();
                            new AdminMenu(idb, agentIdInt).setVisible(true);
                        }
                    }
                    else {
                        lblLoginFail.setText("Invalid ID or password!");
                    }
                }
                else {
                    lblLoginFail.setText("ID must be a number!");
                }
            }
            catch(InfException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong!");
            }
        }
        else {
            try {
                if(Validation.checkIfTxtFieldIsOfInt(txtId)) {
                    String alienId = txtId.getText();
                    int alienIdInt = parseInt(alienId);
                    String alienPassword = txtPassword.getText();
                    
                    String alienQuestion = "select Losenord from Alien where Alien_ID = " + alienIdInt + ";";
                    String sqlAlienAnswer = idb.fetchSingle(alienQuestion);
                    
                    if(alienPassword.equals(sqlAlienAnswer)) {
                        dispose();
                        new AlienMenu(idb, alienIdInt).setVisible(true);
                    }
                    else {
                        lblLoginFail.setText("Invalid ID or password!");
                    }
                }
                else {
                    lblLoginFail.setText("ID must be a number!");
                }
            }
            catch(InfException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong!");
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * Denna metod st�nger LoginPage och �ppnar upp en ny JFrame som heter ChangePasswordPage.
     * @param evt 
     */
    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        dispose();
        new ChangePasswordPage(idb).setVisible(true);
    }//GEN-LAST:event_btnChangePasswordActionPerformed
    
    /**
     * Metoden anropas i kontruktorn, och den l�gger till str�ngar i en combobox.
     */
    private void addLoginAs() {
        String agent = "Agent";
        String alien = "Alien";
        cmbLoginAs.addItem(agent);
        cmbLoginAs.addItem(alien);
    }
    
    /**
     * Denna metod kontrollerar ifall det aktuella ID:t som inkommer som parameter innehar admin-status.
     * @return 
     */
    public static boolean checkAdminStatus(int agentId) {
        boolean isAdmin = false;
        try {
            String sqlQuestion = "select Administrator from Agent where Agent_ID = '" + agentId + "';";
            String result = idb.fetchSingle(sqlQuestion);
            if(result.equals("J")) {
                isAdmin = true;
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
        return isAdmin;
    }
    
    /**
     * Denna metod h�mtar v�rden fr�n Agent-tabellen samt l�gger till dom i parameternskombobox.
     * @param fillThisBox 
     */
    public static void addAgentIdToCmb(JComboBox<String> fillThisBox) {
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
     * Denna metod h�mtar v�rden fr�n Alien-tabellen samt l�gger till dom i komboboxen.
     * @param fillThisBox 
     */
    public static void addAlienIdToCmb(JComboBox<String> fillThisBox) {
        try {
            ArrayList<String> alienIdList = new ArrayList<String>();
            String sqlQuestion = "select Alien_ID from Alien";
            alienIdList = idb.fetchColumn(sqlQuestion);
            for(String anAlienId : alienIdList) {
                fillThisBox.addItem(anAlienId);
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
    }
    
    /**
     * Denna metod ger kombinationsrutan de olika f�rem�len som kan tilldelas.
     * @param fillThisBox 
     */
    public static void addAreaIdToCmb(JComboBox<String> fillThisBox) {
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
     * Metoden returnerar en boolean, och kontrollerar ifall det ID som kommer in via parametern 
     * finns med i databasens tabell Kontorschef.
     * @param checkThisId
     * @return 
     */
    public static boolean checkIfIsOfficeManager(int checkThisId) {
        boolean isOfficeManager = false;
        try {
            String sqlQuestion = "select Agent_ID from Kontorschef where Agent_ID = " + checkThisId + ";";
            String result = idb.fetchSingle(sqlQuestion);
            if(result != null) {
                isOfficeManager = true;
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
        return isOfficeManager;
    }
    
    /**
     * Metoden returnerar en boolean, och kontrollerar ifall det ID som kommer in via parametern 
     * ffinns med i databasens tabell Omradeschef.
     * @param checkThisId
     * @return 
     */
    public static boolean checkIfIsAreaManager(int checkThisId) {
        boolean isAreaManager = false;
        try {
            String sqlQuestion = "select Agent_ID from Omradeschef where Agent_ID = " + checkThisId + ";";
            String result = idb.fetchSingle(sqlQuestion);
            if(result != null) {
                isAreaManager = true;
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
        return isAreaManager;
    }
    /**
     * Metoden returnerar en boolean, och kontrollerar ifall det ID som kommer in via parametern 
     * finns med i databasens tabell Faltagent.
     * @param checkThisId
     * @return 
     */
    public static boolean checkIfIsFieldAgent(int checkThisId) {
        boolean isFieldAgent = false;
        try {
            String sqlQuestion = "select Agent_ID from Faltagent where Agent_ID = " + checkThisId + ";";
            String result = idb.fetchSingle(sqlQuestion);
            if(result != null) {
                isFieldAgent = true;
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
        return isFieldAgent;
    }
    
    /**
     * Denna metod kontrollerar om en agent �r kontorschef.
     * @return 
     */
    public static boolean checkForAnOfficeManager() {
        boolean managerExist = false;
        try {
            String sqlQuery = "select Agent_ID from Kontorschef where KontorsBeteckning = '�rebrokontoret';";
            String result = idb.fetchSingle(sqlQuery);
            if(result != null) {
                managerExist = true;
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
        return managerExist;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbLoginAs;
    private javax.swing.JLabel lblLoginAs;
    private javax.swing.JLabel lblLoginFail;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
