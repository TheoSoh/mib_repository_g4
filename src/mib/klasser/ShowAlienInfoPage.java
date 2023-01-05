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
public class ShowAlienInfoPage extends javax.swing.JFrame {

    // F�lt-deklarationer.
    private InfDB idb;
    private int agentId;
    private String selectedAlienId;
    
    /**
     * Creates new form ShowAlienInfoPage
     */
    public ShowAlienInfoPage(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        LoginPage.addAlienIdToCmb(cmbAlienId);
        setTitle("Alien information!");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbAlienId = new javax.swing.JComboBox<>();
        lblShowInfoHeader = new javax.swing.JLabel();
        lblAlienId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRegistrationDate = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblAssignedAgent = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        lblShowName = new javax.swing.JLabel();
        lblShowRegistrationDate = new javax.swing.JLabel();
        lblShowPhoneNumber = new javax.swing.JLabel();
        lblShowAssignedAgent = new javax.swing.JLabel();
        lblShowArea = new javax.swing.JLabel();
        lblRace = new javax.swing.JLabel();
        lblShowRace = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbAlienId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlienIdActionPerformed(evt);
            }
        });

        lblShowInfoHeader.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblShowInfoHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowInfoHeader.setText("Information About a Specific Alien");

        lblAlienId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAlienId.setText("Select Alien-ID:");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

        lblRegistrationDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRegistrationDate.setText("Registrationdate:");

        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneNumber.setText("Phone number:");

        lblArea.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblArea.setText("Area:");

        lblAssignedAgent.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAssignedAgent.setText("Assigned Agent-ID:");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblRace.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRace.setText("Race:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblRegistrationDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblShowPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(lblShowName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblShowRegistrationDate, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAssignedAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblShowRace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblShowArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(lblShowAssignedAgent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblShowInfoHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(lblAlienId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbAlienId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblShowInfoHeader)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAlienId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlienId))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblName)
                                    .addComponent(lblShowName))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRegistrationDate)
                                    .addComponent(lblShowRegistrationDate)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblArea)
                                    .addComponent(lblShowArea))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAssignedAgent)
                                    .addComponent(lblShowAssignedAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPhoneNumber)
                                .addComponent(lblShowPhoneNumber))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblRace)
                                .addComponent(lblShowRace)))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Denna metod �r metoden d�r man genom en kombobox v�ljer ett Alien-Id och f�r fram all information om den specifika alien-individen.
     * @param evt 
     */
    private void cmbAlienIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlienIdActionPerformed
        selectedAlienId = cmbAlienId.getSelectedItem().toString();
        
        try {
            int selectedAlienIdInt = parseInt(selectedAlienId);
            String sqlQuery = "select Registreringsdatum, Namn, Telefon, Plats, Ansvarig_Agent from Alien where Alien_ID = " + selectedAlienIdInt;
            HashMap<String, String> alienInfoRow = idb.fetchRow(sqlQuery);
            
            String showRegistrationDate = alienInfoRow.get("Registreringsdatum");
            String showName= alienInfoRow.get("Namn");
            String showPhoneNumber = alienInfoRow.get("Telefon");
            String showArea = alienInfoRow.get("Plats");
            String showAssignedAgent = alienInfoRow.get("Ansvarig_Agent");
            String showRace = getAliensRace();
            
            lblShowRegistrationDate.setText(showRegistrationDate);
            lblShowName.setText(showName);
            lblShowPhoneNumber.setText(showPhoneNumber);
            lblShowArea.setText(showArea);
            lblShowAssignedAgent.setText(showAssignedAgent);
            
            if(showRace.equals("Boglodite")) {
                lblShowRace.setText(showRace);
            }
            else if(showRace.equals("Squid")) {
                lblShowRace.setText(showRace);
            }
            else if(showRace.equals("Worm")) {
                lblShowRace.setText(showRace);
            }
            else {
                lblShowRace.setText("");
            }
            
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal Database Error!");
        }
    }//GEN-LAST:event_cmbAlienIdActionPerformed
    /**
     * Denna metod g�r att f�nstret ShowAlienInfoPage st�ngs, samt genom ett metodanrop kontrollerar om ID:et som �r inloggad har adminstatus eller inte.
     * Beroende av kontrollen �ppnas antingen ett AdminMenu-f�nster eller en AgentMenu-f�nster.
     * @param evt 
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
        if(LoginPage.checkAdminStatus(agentId)) {
            new AdminMenu(idb, agentId).setVisible(true);
        }
        else {
            new AgentMenu(idb, agentId).setVisible(true);
        }
    }//GEN-LAST:event_btnCancelActionPerformed
    /**
     * Denna metod h�mtar data fr�n databasen genom att h�mta all data fr�n de olika tabellerna "Boglodite","Squid" samt "Worm".
     * Som sedan returnerar information f�r individerna som finns i databasen.
     * @return 
     */
    private String getAliensRace() {
        String race = "";
        
        try {
            String sqlBogloditeQuery = "select * from Boglodite";
            ArrayList<HashMap<String, String>> bogloditeTable;
            bogloditeTable = idb.fetchRows(sqlBogloditeQuery);
            for(HashMap<String, String> everyBoglodite : bogloditeTable) {
                if(everyBoglodite.get("Alien_ID").equals(selectedAlienId)) {
                    race = "Boglodite";
                }
            }
            
            String sqlSquidQuery = "select * from Squid";
            ArrayList<HashMap<String, String>> SquidTable;
            SquidTable = idb.fetchRows(sqlSquidQuery);
            for(HashMap<String, String> everySquid : SquidTable) {
                if(everySquid.get("Alien_ID").equals(selectedAlienId)) {
                    race = "Squid";
                }
            }
            
            String sqlWormQuery = "select * from Worm";
            ArrayList<HashMap<String, String>> WormTable;
            WormTable = idb.fetchRows(sqlWormQuery);
            for(HashMap<String, String> everyWorm : WormTable) {
                if(everyWorm.get("Alien_ID").equals(selectedAlienId)) {
                    race = "Worm";
                }
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
        return race;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> cmbAlienId;
    private javax.swing.JLabel lblAlienId;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblAssignedAgent;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRace;
    private javax.swing.JLabel lblRegistrationDate;
    private javax.swing.JLabel lblShowArea;
    private javax.swing.JLabel lblShowAssignedAgent;
    private javax.swing.JLabel lblShowInfoHeader;
    private javax.swing.JLabel lblShowName;
    private javax.swing.JLabel lblShowPhoneNumber;
    private javax.swing.JLabel lblShowRace;
    private javax.swing.JLabel lblShowRegistrationDate;
    // End of variables declaration//GEN-END:variables
}
