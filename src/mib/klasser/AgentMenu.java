/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.klasser;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Grupp4
 */
public class AgentMenu extends javax.swing.JFrame {
    
    private InfDB idb;
    private int agentId;
    private String selectedAreaIdCommander;
    
    
    /**
     * Creates new form agentMeny
     */
    public AgentMenu(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        lblAgentId.setText("Your Agent-id: " + agentId);
        setTitle("Agent Menu");
        addItemsToCmbAreaId(cmbCommanderArea);
        addItemsToCmbAreaId(cmbShowForArea);
        Validation.addRaceToCmb(cmbShowByRace);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgentAdminHeader = new javax.swing.JLabel();
        btnNewAlien = new javax.swing.JButton();
        btnChangeInfo = new javax.swing.JButton();
        lblAlienVal = new javax.swing.JLabel();
        cmbShowForArea = new javax.swing.JComboBox<>();
        lblAliensInArea = new javax.swing.JLabel();
        lblAliensByRace = new javax.swing.JLabel();
        cmbShowByRace = new javax.swing.JComboBox<>();
        btnAddedWhen = new javax.swing.JButton();
        lblAgent = new javax.swing.JLabel();
        btnAddEquipment = new javax.swing.JButton();
        btnShowAlienInfo = new javax.swing.JButton();
        lblSearchAreaBoss = new javax.swing.JLabel();
        cmbCommanderArea = new javax.swing.JComboBox<>();
        lblAgentId = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAreaCommander = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAliens = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaAliensByRace = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgentAdminHeader.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblAgentAdminHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgentAdminHeader.setText("MIB - Agent menu");

        btnNewAlien.setText("Register New");
        btnNewAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAlienActionPerformed(evt);
            }
        });

        btnChangeInfo.setText("Change Info");
        btnChangeInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeInfoActionPerformed(evt);
            }
        });

        lblAlienVal.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lblAlienVal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlienVal.setText("Aliens");

        cmbShowForArea.setToolTipText("");
        cmbShowForArea.setName(""); // NOI18N
        cmbShowForArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbShowForAreaActionPerformed(evt);
            }
        });

        lblAliensInArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAliensInArea.setText("Aliens in Area");

        lblAliensByRace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAliensByRace.setText("All aliens by race");

        cmbShowByRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbShowByRaceActionPerformed(evt);
            }
        });

        btnAddedWhen.setText("Added Between (Date)");
        btnAddedWhen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddedWhenActionPerformed(evt);
            }
        });

        lblAgent.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lblAgent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgent.setText("Agent");

        btnAddEquipment.setText("Add New Equipment");
        btnAddEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEquipmentActionPerformed(evt);
            }
        });

        btnShowAlienInfo.setText("Show Info");
        btnShowAlienInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAlienInfoActionPerformed(evt);
            }
        });

        lblSearchAreaBoss.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblSearchAreaBoss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearchAreaBoss.setText("Choose Area-ID below to see who's commander there");

        cmbCommanderArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCommanderAreaActionPerformed(evt);
            }
        });

        lblAgentId.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N

        lblAreaCommander.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblAreaCommander.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtAreaAliens.setColumns(20);
        txtAreaAliens.setRows(5);
        jScrollPane1.setViewportView(txtAreaAliens);

        txtAreaAliensByRace.setColumns(20);
        txtAreaAliensByRace.setRows(5);
        jScrollPane2.setViewportView(txtAreaAliensByRace);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(lblAgentAdminHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSearchAreaBoss, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(lblAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAreaCommander, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(btnAddEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(cmbCommanderArea, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAlienVal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAliensInArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnChangeInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNewAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(cmbShowForArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(65, 65, 65))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbShowByRace, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddedWhen, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnShowAlienInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAliensByRace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblAgentAdminHeader)
                .addGap(10, 10, 10)
                .addComponent(lblAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddEquipment)
                .addGap(18, 18, 18)
                .addComponent(lblSearchAreaBoss)
                .addGap(8, 8, 8)
                .addComponent(cmbCommanderArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAreaCommander, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblAlienVal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewAlien)
                    .addComponent(btnAddedWhen))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangeInfo)
                    .addComponent(btnShowAlienInfo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAliensByRace)
                    .addComponent(lblAliensInArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbShowByRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbShowForArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAlienActionPerformed
        AgentMenu.this.dispose();
        new NewAlienPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnNewAlienActionPerformed

    private void btnChangeInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeInfoActionPerformed
        AgentMenu.this.dispose();
        new ChangeAlienInfoPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnChangeInfoActionPerformed

    private void cmbShowForAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbShowForAreaActionPerformed
        txtAreaAliens.setText("");
        
        try {
            String selectedAreaId = cmbShowForArea.getSelectedItem().toString();
            int selectedAreaIdInt = parseInt(selectedAreaId);
            String sqlNameQuery = "select * from Alien where Plats like '" + selectedAreaIdInt + "';";
            ArrayList<HashMap<String, String>> alienList = idb.fetchRows(sqlNameQuery);
            for (HashMap <String, String> aRow : alienList){
                txtAreaAliens.append("Alien-ID: " + aRow.get("Alien_ID"));
                txtAreaAliens.append("     Name: " + aRow.get("Namn") + "\n\n");
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }                
    }//GEN-LAST:event_cmbShowForAreaActionPerformed

    private void cmbShowByRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbShowByRaceActionPerformed
        String selectedShowRace = cmbShowByRace.getSelectedItem().toString();
        txtAreaAliensByRace.setText("");
        try {
            if(selectedShowRace.equals("Boglodite")) {
                String sqlQuery = "select * from Alien where Alien_ID in (select Alien_ID from Boglodite);";
                ArrayList<HashMap<String, String>> AlienList = idb.fetchRows(sqlQuery);
                
                for(HashMap<String, String> aRow : AlienList) {
                    appendToTxtAreaAliensByRace(aRow);
                }
            }
            else if(selectedShowRace.equals("Squid")) {
                String sqlQuery = "select * from Alien where Alien_ID in (select Alien_ID from Squid);";
                ArrayList<HashMap<String, String>> AlienList = idb.fetchRows(sqlQuery);
                    
                for(HashMap<String, String> aRow : AlienList) {
                    appendToTxtAreaAliensByRace(aRow);
                }
            }
            else {
                String sqlQuery = "select * from Alien where Alien_ID in (select Alien_ID from Worm);";
                ArrayList<HashMap<String, String>> AlienList = idb.fetchRows(sqlQuery);
                    
                for(HashMap<String, String> aRow : AlienList) {
                    appendToTxtAreaAliensByRace(aRow);
                }
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
    }//GEN-LAST:event_cmbShowByRaceActionPerformed

    private void appendToTxtAreaAliensByRace(HashMap<String, String> aHashMap) {
        txtAreaAliensByRace.append("Alien-ID: " + aHashMap.get("Alien_ID"));
        txtAreaAliensByRace.append("     Name: " + aHashMap.get("Namn"));
        txtAreaAliensByRace.append("     Registrationdate: " + aHashMap.get("Registreringsdatum") + "\n\n");
    }
    
    private void btnAddedWhenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddedWhenActionPerformed
        AgentMenu.this.dispose();
        new AddedBetweenDatePage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnAddedWhenActionPerformed

    private void btnShowAlienInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAlienInfoActionPerformed
        AgentMenu.this.dispose();
        new ShowAlienInfoPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnShowAlienInfoActionPerformed

    private void btnAddEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEquipmentActionPerformed
        AgentMenu.this.dispose();
        new EquipmentMenu(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnAddEquipmentActionPerformed

    private void cmbCommanderAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCommanderAreaActionPerformed
        selectedAreaIdCommander = cmbCommanderArea.getSelectedItem().toString();
        int selectedAreaIdToInt = parseInt(selectedAreaIdCommander);
        String areaBenamning = getCorrectBenamning();     
        
        try {
            String sqlAgentIdQuery = "select Agent_ID from Omradeschef where Omrade = " + selectedAreaIdToInt;
            String anAgentId = idb.fetchSingle(sqlAgentIdQuery);
            int anAgentIdToInt = parseInt(anAgentId);
            String sqlAgentNameQuery = "select Namn from Agent where Agent_ID = " + anAgentIdToInt;
            String agentName = idb.fetchSingle(sqlAgentNameQuery);
            lblAreaCommander.setText(areaBenamning + "'s commander is Agent-ID: " + anAgentId + " Name: " + agentName);
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
    }//GEN-LAST:event_cmbCommanderAreaActionPerformed

    
    
    private String getCorrectBenamning() {
        String correctBenamning = "";
        int selectedOmradesId = parseInt(selectedAreaIdCommander);
        
        try {
            String sqlQuery = "select Benamning from Omrade where Omrades_ID = " + selectedOmradesId;
            correctBenamning = idb.fetchSingle(sqlQuery);
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!");
        }
        return correctBenamning;
    }
    
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEquipment;
    private javax.swing.JButton btnAddedWhen;
    private javax.swing.JButton btnChangeInfo;
    private javax.swing.JButton btnNewAlien;
    private javax.swing.JButton btnShowAlienInfo;
    private javax.swing.JComboBox<String> cmbCommanderArea;
    private javax.swing.JComboBox<String> cmbShowByRace;
    private javax.swing.JComboBox<String> cmbShowForArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblAgentAdminHeader;
    private javax.swing.JLabel lblAgentId;
    private javax.swing.JLabel lblAlienVal;
    private javax.swing.JLabel lblAliensByRace;
    private javax.swing.JLabel lblAliensInArea;
    private javax.swing.JLabel lblAreaCommander;
    private javax.swing.JLabel lblSearchAreaBoss;
    private javax.swing.JTextArea txtAreaAliens;
    private javax.swing.JTextArea txtAreaAliensByRace;
    // End of variables declaration//GEN-END:variables
}
