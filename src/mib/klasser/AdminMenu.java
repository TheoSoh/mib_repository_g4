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
 * @author Grupp4
 * Klassens f�lt
 */
public class AdminMenu extends javax.swing.JFrame {
    
    //Variabel deklaration - p�b�rjas h�r
    private InfDB idb;
    private int agentId;
    private String selectedAreaIdCommander;
    //Variabel deklaration - avslutas h�r
    
    /**
     * Creates new form agentMeny
     */
    public AdminMenu(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        lblAgentId.setText("Your Agent-id: " + agentId);
        setTitle("Admin Menu");
        LoginPage.addAreaIdToCmb(cmbManagerArea);
        LoginPage.addAreaIdToCmb(cmbShowForArea);
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
        cmbManagerArea = new javax.swing.JComboBox<>();
        lblAgentId = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAreaCommander = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAliens = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaAliensByRace = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnDeleteAlien = new javax.swing.JButton();
        btnDeleteEquipment = new javax.swing.JButton();
        btnNewAgent = new javax.swing.JButton();
        btnDeleteAgent = new javax.swing.JButton();
        btnShowAgentInfo = new javax.swing.JButton();
        btnChangeAgentInfo = new javax.swing.JButton();
        btnChangeManagers = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgentAdminHeader.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblAgentAdminHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgentAdminHeader.setText("MIB - Admin menu");

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
        lblSearchAreaBoss.setText("Choose Area-ID below to see who's manager there");

        cmbManagerArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbManagerAreaActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin functions");

        btnDeleteAlien.setText("Delete Alien");
        btnDeleteAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAlienActionPerformed(evt);
            }
        });

        btnDeleteEquipment.setText("Delete Equipment");
        btnDeleteEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEquipmentActionPerformed(evt);
            }
        });

        btnNewAgent.setText("New Agent");
        btnNewAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAgentActionPerformed(evt);
            }
        });

        btnDeleteAgent.setText("Delete Agent");
        btnDeleteAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAgentActionPerformed(evt);
            }
        });

        btnShowAgentInfo.setText("Show Agent Info");
        btnShowAgentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAgentInfoActionPerformed(evt);
            }
        });

        btnChangeAgentInfo.setText("Change Agent Info");
        btnChangeAgentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeAgentInfoActionPerformed(evt);
            }
        });

        btnChangeManagers.setText("Change Managers");
        btnChangeManagers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeManagersActionPerformed(evt);
            }
        });

        btnSignOut.setText("Sign out");
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(lblAgentAdminHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(cmbManagerArea, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 68, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAlienVal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblAliensInArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnChangeInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnNewAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbShowForArea, 0, 165, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbShowByRace, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddedWhen, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnShowAlienInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAliensByRace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48))))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnShowAgentInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btnDeleteAgent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewAgent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDeleteEquipment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnChangeAgentInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnChangeManagers)
                .addGap(233, 233, 233))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblAgentAdminHeader)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSignOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddEquipment)
                .addGap(18, 18, 18)
                .addComponent(lblSearchAreaBoss)
                .addGap(8, 8, 8)
                .addComponent(cmbManagerArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(36, 36, 36)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnChangeManagers)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteEquipment)
                    .addComponent(btnNewAgent))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteAlien)
                    .addComponent(btnDeleteAgent))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowAgentInfo)
                    .addComponent(btnChangeAgentInfo))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Denna metod st�nger ner det nuvarande f�nstret och �ppnar upp ett nytt (NewAlienPage).
     * @param evt 
     */
    private void btnNewAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAlienActionPerformed
        dispose();
        new NewAlienPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnNewAlienActionPerformed

    /**
     * Denna metod st�nger ner det nuvarande f�nstret och �ppnar upp ett nytt (ChangeAlienInfoPage).
     * @param evt 
     */
    private void btnChangeInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeInfoActionPerformed
        dispose();
        new ChangeAlienInfoPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnChangeInfoActionPerformed

    /**
     * Denna metod visar vilka aliens med ett visst Id p� vilken plats dom finns.
     * @param evt 
     */
    private void cmbShowForAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbShowForAreaActionPerformed
       txtAreaAliens.setText("");
        ArrayList< HashMap<String, String>> alienNames;
        
        try {
            String selectedAreaId = cmbShowForArea.getSelectedItem().toString();
            int selectedAreaIdInt = parseInt(selectedAreaId);
            String sqlNameQuery = "select * from Alien where Plats like '" + selectedAreaIdInt + "';";
            alienNames = idb.fetchRows(sqlNameQuery);
            for (HashMap <String, String> aRow : alienNames){
            txtAreaAliens.append(aRow.get("Namn") + "\n");
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Internal database error!"); 
        }
    }//GEN-LAST:event_cmbShowForAreaActionPerformed
    
    /**
     * Denna metod visar information om aliens beroende p� vilken ras alienen �r.
     * @param evt 
     */
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

    /**
     * Denna metod l�gger till text i textarean. 
     * @param aHashMap 
     */
    private void appendToTxtAreaAliensByRace(HashMap<String, String> aHashMap) {
        txtAreaAliensByRace.append("Alien-ID: " + aHashMap.get("Alien_ID"));
        txtAreaAliensByRace.append("     Name: " + aHashMap.get("Namn"));
        txtAreaAliensByRace.append("     Registrationdate: " + aHashMap.get("Registreringsdatum") + "\n\n");
    }
    
    /**
     * Denna metod st�nger ner det nuvarande f�nstret och �ppnar upp ett nytt (AddedBetweenDatePage).
     * @param evt 
     */
    private void btnAddedWhenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddedWhenActionPerformed
        dispose();
        new AddedBetweenDatePage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnAddedWhenActionPerformed

    /**
     * Denna metod st�nger ner det nuvarande f�nstret och �ppnar upp ett nytt (ShowAlienInfoPage).
     * @param evt 
     */
    private void btnShowAlienInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAlienInfoActionPerformed
        dispose();
        new ShowAlienInfoPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnShowAlienInfoActionPerformed

    /**
     * Denna metod st�nger ner det nuvarande f�nstret och �ppnar upp ett nytt (EquipmentMenu).
     * @param evt 
     */
    private void btnAddEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEquipmentActionPerformed
        dispose();
        new EquipmentMenu(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnAddEquipmentActionPerformed

    /**
     * Denna metod visar information om vilken omr�deschef som finns i ett omr�de.
     * @param evt 
     */
    private void cmbManagerAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbManagerAreaActionPerformed
        selectedAreaIdCommander = cmbManagerArea.getSelectedItem().toString();
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
    }//GEN-LAST:event_cmbManagerAreaActionPerformed

    /**
     * Denna metod st�nger ner det nuvarande f�nstret och �ppnar upp ett nytt (NewAgentPage).
     * @param evt 
     */
    private void btnNewAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAgentActionPerformed
        dispose();
        new NewAgentPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnNewAgentActionPerformed

    /**
     * Denna metod st�nger ner det nuvarande f�nstret och �ppnar upp ett nytt (DeleteAgentPage).
     * @param evt 
     */
    private void btnDeleteAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAgentActionPerformed
        dispose();
        new DeleteAgentPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnDeleteAgentActionPerformed

    /**
     * Denna metod st�nger ner det nuvarande f�nstret och �ppnar upp ett nytt (ShowAgentInfoPage).
     * @param evt 
     */
    private void btnShowAgentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAgentInfoActionPerformed
        dispose();
        new ShowAgentInfoPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnShowAgentInfoActionPerformed

    /**
     * Denna metod st�nger ner det nuvarande f�nstret och �ppnar upp ett nytt (DeleteEquipmentPage).
     * @param evt 
     */
    private void btnDeleteEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEquipmentActionPerformed
        dispose();
        new DeleteEquipmentPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnDeleteEquipmentActionPerformed

    /**
     * Denna metod st�nger ner det nuvarande f�nstret och �ppnar upp ett nytt (DeleteAlienPage).
     * @param evt 
     */
    private void btnDeleteAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAlienActionPerformed
        dispose();
        new DeleteAlienPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnDeleteAlienActionPerformed

    /**
     * Denna metod st�nger ner det nuvarande f�nstret och �ppnar upp ett nytt (ChangeAgentInfoPage).
     * @param evt 
     */
    private void btnChangeAgentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeAgentInfoActionPerformed
        dispose();
        new ChangeAgentInfoPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnChangeAgentInfoActionPerformed

    private void btnChangeManagersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeManagersActionPerformed
        dispose();
        new ChangeManagersPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnChangeManagersActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        dispose();
        new LoginPage(idb).setVisible(true);
    }//GEN-LAST:event_btnSignOutActionPerformed
    
    /**
     * Denna metod h�mtar ut ett omr�des ben�mning.
     * @return 
     */
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEquipment;
    private javax.swing.JButton btnAddedWhen;
    private javax.swing.JButton btnChangeAgentInfo;
    private javax.swing.JButton btnChangeInfo;
    private javax.swing.JButton btnChangeManagers;
    private javax.swing.JButton btnDeleteAgent;
    private javax.swing.JButton btnDeleteAlien;
    private javax.swing.JButton btnDeleteEquipment;
    private javax.swing.JButton btnNewAgent;
    private javax.swing.JButton btnNewAlien;
    private javax.swing.JButton btnShowAgentInfo;
    private javax.swing.JButton btnShowAlienInfo;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JComboBox<String> cmbManagerArea;
    private javax.swing.JComboBox<String> cmbShowByRace;
    private javax.swing.JComboBox<String> cmbShowForArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
