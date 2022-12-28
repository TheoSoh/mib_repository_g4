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
public class ChangeAlienInfoPage extends javax.swing.JFrame {

    private InfDB idb;
    private int agentId;
    private String selectedValueAlienId;
    private String selectedRaceAlienId;
    private String selectedNewRace;
    /**
     * Creates new form ChangeAlienInfoPage
     */
    public ChangeAlienInfoPage(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        addItemsToCmbNewRace();
        addItemsToCmbAlienId();
        addItemsToCmbInfoToChange();
    }
    
    private void addItemsToCmbNewRace() {
        String firstRace = "Boglodite";
        String secondRace = "Squid";
        String thirdRace = "Worm";
        cmbNewRace.addItem(firstRace);
        cmbNewRace.addItem(secondRace);
        cmbNewRace.addItem(thirdRace);
    }
    
    private void addItemsToCmbInfoToChange() {
        String firstValue = "Registrationdate";
        String secondValue = "Password";
        String thirdValue = "Name";
        String fourthValue = "Phone number";
        String fifthValue = "Area";
        String sixthValue = "Assigned Agent";
        cmbInfoToChange.addItem(firstValue);
        cmbInfoToChange.addItem(secondValue);
        cmbInfoToChange.addItem(thirdValue);
        cmbInfoToChange.addItem(fourthValue);
        cmbInfoToChange.addItem(fifthValue);
        cmbInfoToChange.addItem(sixthValue);
    }
    
    private void addItemsToCmbAlienId() {
        try {
            ArrayList<String> alienIdList = new ArrayList<String>();
            String sqlQuestion = "select Alien_ID from Alien";
            alienIdList = idb.fetchColumn(sqlQuestion);
            for(String anAlienId : alienIdList) {
                cmbValueAlienId.addItem(anAlienId);
                cmbRaceAlienId.addItem(anAlienId);
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
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

        lblChangeInfoHeader = new javax.swing.JLabel();
        cmbValueAlienId = new javax.swing.JComboBox<>();
        lblValueAlienId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbInfoToChange = new javax.swing.JComboBox<>();
        lblChangeThis = new javax.swing.JLabel();
        txtNewValue = new javax.swing.JTextField();
        lblNewValue = new javax.swing.JLabel();
        btnChangeInfo = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        cmbNewRace = new javax.swing.JComboBox<>();
        btnSetNewRace = new javax.swing.JButton();
        lblSetNewRace = new javax.swing.JLabel();
        lblRaceAlienId = new javax.swing.JLabel();
        cmbRaceAlienId = new javax.swing.JComboBox<>();
        btnCancel = new javax.swing.JButton();
        lblRaceSuccessMessage = new javax.swing.JLabel();
        lblValueSuccessMessage = new javax.swing.JLabel();
        lblValueErrorMessage = new javax.swing.JLabel();
        lblRaceErrorMessage = new javax.swing.JLabel();
        txtAntal = new javax.swing.JTextField();
        lblAntal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblChangeInfoHeader.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblChangeInfoHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChangeInfoHeader.setText("Change alien's information");

        cmbValueAlienId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbValueAlienIdActionPerformed(evt);
            }
        });

        lblValueAlienId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblValueAlienId.setText("Alien-ID:");

        lblChangeThis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblChangeThis.setText("Info to change:");

        lblNewValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNewValue.setText("Insert new value here:");

        btnChangeInfo.setText("Change");
        btnChangeInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeInfoActionPerformed(evt);
            }
        });

        cmbNewRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNewRaceActionPerformed(evt);
            }
        });

        btnSetNewRace.setText("Set Race");
        btnSetNewRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetNewRaceActionPerformed(evt);
            }
        });

        lblSetNewRace.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSetNewRace.setText("Set new race:");

        lblRaceAlienId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRaceAlienId.setText("Alien-ID:");

        cmbRaceAlienId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRaceAlienIdActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblRaceSuccessMessage.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblRaceSuccessMessage.setForeground(new java.awt.Color(0, 255, 0));
        lblRaceSuccessMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblValueSuccessMessage.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblValueSuccessMessage.setForeground(new java.awt.Color(0, 255, 0));
        lblValueSuccessMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblValueErrorMessage.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblValueErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblValueErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblRaceErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblRaceErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblAntal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblChangeInfoHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRaceAlienId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSetNewRace, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(lblAntal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbNewRace, 0, 130, Short.MAX_VALUE)
                            .addComponent(txtAntal)
                            .addComponent(cmbRaceAlienId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSetNewRace, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(lblRaceSuccessMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRaceErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblNewValue, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(lblChangeThis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValueAlienId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbInfoToChange, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNewValue, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(cmbValueAlienId, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnChangeInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(lblValueSuccessMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValueErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblChangeInfoHeader)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbValueAlienId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValueAlienId)
                    .addComponent(lblValueErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbInfoToChange, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChangeThis)
                    .addComponent(btnChangeInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewValue)
                    .addComponent(lblValueSuccessMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbRaceAlienId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblRaceAlienId, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbNewRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSetNewRace)
                                .addGap(3, 3, 3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAntal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAntal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRaceErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSetNewRace)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRaceSuccessMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetNewRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetNewRaceActionPerformed
        int intAlienIdSelected = parseInt(selectedRaceAlienId);
        String antal = txtAntal.getText();
        int intAntal = parseInt(antal);
        String aliensOldRace = aliensRace();
        
        if((selectedNewRace.equals("Boglodite")) && (aliensOldRace.equals("Squid")) || (aliensOldRace.equals("Worm"))) {
            String sqlNewRaceQuery = "insert into Boglodite values(" + intAlienIdSelected + ", " + intAntal + ");";
            String sqlOldRaceQuery = "delete from " + aliensOldRace + " where Alien_ID = " + intAlienIdSelected + ";";
            try {
                idb.insert(sqlNewRaceQuery);
                idb.delete(sqlOldRaceQuery);
                lblRaceSuccessMessage.setText("Success!");
                lblRaceErrorMessage.setText("");
            }
            catch(InfException e) {
                JOptionPane.showMessageDialog(null, "Internal database error!");
            }
        }
        else if((selectedNewRace.equals("Squid")) && (aliensOldRace.equals("Boglodite")) || (aliensOldRace.equals("Worm"))) {
            String sqlNewRaceQuery = "insert into Squid values(" + intAlienIdSelected + ", " + intAntal + ");";
            String sqlOldRaceQuery = "delete from " + aliensOldRace + " where Alien_ID = '" + intAlienIdSelected + "';";
            try {
                idb.insert(sqlNewRaceQuery);
                idb.delete(sqlOldRaceQuery);
                lblRaceSuccessMessage.setText("Success!");
                lblRaceErrorMessage.setText("");
            }
            catch(InfException e) {
                JOptionPane.showMessageDialog(null, "Internal database error!");
            }
        }
        else if((selectedNewRace.equals("Worm")) && (aliensOldRace.equals("Squid")) || (aliensOldRace.equals("Boglodite"))) {
            String sqlNewRaceQuery = "insert into Worm values(" + intAlienIdSelected + ");";
            String sqlOldRaceQuery = "delete from " + aliensOldRace + " where Alien_ID = '" + intAlienIdSelected + "';";
            try {
                idb.insert(sqlNewRaceQuery);
                idb.delete(sqlOldRaceQuery);
                lblRaceSuccessMessage.setText("Success!");
                lblRaceErrorMessage.setText("");
            }
            catch(InfException e) {
                JOptionPane.showMessageDialog(null, "Internal database error!");
            }
        }
        else if((selectedNewRace.equals("Boglodite")) && (aliensOldRace.equals(""))) {
            String sqlNewRaceQuery = "insert into Boglodite values(" + intAlienIdSelected + ", " + intAntal + ");";
            try {
                idb.insert(sqlNewRaceQuery);
                lblRaceSuccessMessage.setText("Success!");
                lblRaceErrorMessage.setText("");
            }
            catch(InfException e) {
                JOptionPane.showMessageDialog(null, "Internal database error!");
            }
        }
        else if((selectedNewRace.equals("Squid")) && (aliensOldRace.equals(""))) {
            String sqlNewRaceQuery = "insert into Squid values(" + intAlienIdSelected + ", " + intAntal + ");";
            try {
                idb.insert(sqlNewRaceQuery);
                lblRaceSuccessMessage.setText("Success!");
                lblRaceErrorMessage.setText("");
            }
            catch(InfException e) {
                JOptionPane.showMessageDialog(null, "Internal database error!");
            }
        }
        else if((selectedNewRace.equals("Worm")) && (aliensOldRace.equals(""))) {
            String sqlNewRaceQuery = "insert into Worm values(" + intAlienIdSelected + ");";
            try {
                idb.insert(sqlNewRaceQuery);
                lblRaceSuccessMessage.setText("Success!");
                lblRaceErrorMessage.setText("");
            }
            catch(InfException e) {
                JOptionPane.showMessageDialog(null, "Internal database error!");
            }
        }
    }//GEN-LAST:event_btnSetNewRaceActionPerformed

    private String aliensRace() {
        String race = "";
        
        try {
            String sqlBogloditeQuery = "select * from Boglodite";
            ArrayList<HashMap<String, String>> bogloditeTable;
            bogloditeTable = idb.fetchRows(sqlBogloditeQuery);
            for(HashMap<String, String> everyBoglodite : bogloditeTable) {
                if(everyBoglodite.get("Alien_ID").equals(selectedRaceAlienId)) {
                    race = "Boglodite";
                }
            }
            
            String sqlSquidQuery = "select * from Squid";
            ArrayList<HashMap<String, String>> SquidTable;
            SquidTable = idb.fetchRows(sqlSquidQuery);
            for(HashMap<String, String> everySquid : SquidTable) {
                if(everySquid.get("Alien_ID").equals(selectedRaceAlienId)) {
                    race = "Squid";
                }
            }
            
            String sqlWormQuery = "select * from Worm";
            ArrayList<HashMap<String, String>> WormTable;
            WormTable = idb.fetchRows(sqlWormQuery);
            for(HashMap<String, String> everyWorm : WormTable) {
                if(everyWorm.get("Alien_ID").equals(selectedRaceAlienId)) {
                    race = "Worm";
                }
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
        return race;
    }
    
    private void btnChangeInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeInfoActionPerformed
        String selectedInfo = cmbInfoToChange.getSelectedItem().toString();
        int selectedIntValueAlienId = parseInt(selectedValueAlienId);
        String newValue = txtNewValue.getText();
        int newIntValue = 0;
        String sqlQuery = "";
        sqlQuery = "update Alien set " + selectedInfo + " = '" + newValue + "' where Alien_ID = " + selectedIntValueAlienId;
        
        if(Validation.checkEmptyTxtField(txtNewValue)) {
            lblValueErrorMessage.setText("Enter Value!");
        }
        else {
            try {
                lblValueErrorMessage.setText("");
                idb.update(sqlQuery);
                lblValueSuccessMessage.setText("Success!");
            }
            catch(InfException e) {
                lblValueErrorMessage.setText("DB Error!");
            }
        }
    }//GEN-LAST:event_btnChangeInfoActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        ChangeAlienInfoPage.this.dispose();
        if(checkAdminStatus()) {
            new AdminMenu(idb, agentId).setVisible(true);
        }
        else {
            new AgentMenu(idb, agentId).setVisible(true);
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cmbNewRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNewRaceActionPerformed
        selectedNewRace = cmbNewRace.getSelectedItem().toString();
        if(selectedNewRace.equals("Boglodite")) {
            lblAntal.setText("Antal boogies:");
            txtAntal.setVisible(true);
        }
        else if(selectedNewRace.equals("Squid")) {
            lblAntal.setText("Antal armar:");
            txtAntal.setVisible(true);
        }
        else if(selectedNewRace.equals("Worm")) {
            lblAntal.setText("");
            txtAntal.setVisible(false);
        }
    }//GEN-LAST:event_cmbNewRaceActionPerformed

    private void cmbValueAlienIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbValueAlienIdActionPerformed
        selectedValueAlienId = cmbValueAlienId.getSelectedItem().toString();
    }//GEN-LAST:event_cmbValueAlienIdActionPerformed

    private void cmbRaceAlienIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRaceAlienIdActionPerformed
        selectedRaceAlienId = cmbRaceAlienId.getSelectedItem().toString();
    }//GEN-LAST:event_cmbRaceAlienIdActionPerformed
    
    private boolean checkAdminStatus() {
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChangeInfo;
    private javax.swing.JButton btnSetNewRace;
    private javax.swing.JComboBox<String> cmbInfoToChange;
    private javax.swing.JComboBox<String> cmbNewRace;
    private javax.swing.JComboBox<String> cmbRaceAlienId;
    private javax.swing.JComboBox<String> cmbValueAlienId;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAntal;
    private javax.swing.JLabel lblChangeInfoHeader;
    private javax.swing.JLabel lblChangeThis;
    private javax.swing.JLabel lblNewValue;
    private javax.swing.JLabel lblRaceAlienId;
    private javax.swing.JLabel lblRaceErrorMessage;
    private javax.swing.JLabel lblRaceSuccessMessage;
    private javax.swing.JLabel lblSetNewRace;
    private javax.swing.JLabel lblValueAlienId;
    private javax.swing.JLabel lblValueErrorMessage;
    private javax.swing.JLabel lblValueSuccessMessage;
    private javax.swing.JSeparator separator;
    private javax.swing.JTextField txtAntal;
    private javax.swing.JTextField txtNewValue;
    // End of variables declaration//GEN-END:variables
}
