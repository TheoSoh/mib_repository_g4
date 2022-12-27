/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.klasser;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Grupp4
 */
public class AgentMenu extends javax.swing.JFrame {
    
    private InfDB idb;
    private int agentId;
    
    
    /**
     * Creates new form agentMeny
     */
    public AgentMenu(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        lblAgentId.setText("Your Agent-id: " + agentId);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgentMeny = new javax.swing.JLabel();
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
        btnSearchInfoAlien = new javax.swing.JButton();
        lblSearchAreaBoss = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblAgentId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgentMeny.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblAgentMeny.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgentMeny.setText("MIB - Agent menu");

        btnNewAlien.setText("Add New Alien");
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

        cmbShowForArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbShowForArea.setToolTipText("");
        cmbShowForArea.setName(""); // NOI18N
        cmbShowForArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbShowForAreaActionPerformed(evt);
            }
        });

        lblAliensInArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAliensInArea.setText("Aliens in an Area");

        lblAliensByRace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAliensByRace.setText("All aliens by race");

        cmbShowByRace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        btnSearchInfoAlien.setText("Alien Info");
        btnSearchInfoAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchInfoAlienActionPerformed(evt);
            }
        });

        lblSearchAreaBoss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearchAreaBoss.setText("Who is the Commander (Area)");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lblAgentId.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAliensInArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChangeInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNewAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbShowForArea, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbShowByRace, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddedWhen, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnSearchInfoAlien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAliensByRace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddEquipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSearchAreaBoss, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAlienVal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(208, 208, 208))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(lblAgentMeny, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblAgentMeny)
                .addGap(10, 10, 10)
                .addComponent(lblAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddEquipment)
                .addGap(18, 18, 18)
                .addComponent(lblSearchAreaBoss)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblAlienVal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewAlien)
                    .addComponent(btnAddedWhen))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangeInfo)
                    .addComponent(btnSearchInfoAlien))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAliensByRace)
                    .addComponent(lblAliensInArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbShowByRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbShowForArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAlienActionPerformed
        AgentMenu.this.dispose();
        new NewAlienPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnNewAlienActionPerformed

    private void btnChangeInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangeInfoActionPerformed

    private void cmbShowForAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbShowForAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbShowForAreaActionPerformed

    private void cmbShowByRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbShowByRaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbShowByRaceActionPerformed

    private void btnAddedWhenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddedWhenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddedWhenActionPerformed

    private void btnSearchInfoAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchInfoAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchInfoAlienActionPerformed

    private void btnAddEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEquipmentActionPerformed
        AgentMenu.this.dispose();
        new EquipmentMenu(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnAddEquipmentActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEquipment;
    private javax.swing.JButton btnAddedWhen;
    private javax.swing.JButton btnChangeInfo;
    private javax.swing.JButton btnNewAlien;
    private javax.swing.JButton btnSearchInfoAlien;
    private javax.swing.JComboBox<String> cmbShowByRace;
    private javax.swing.JComboBox<String> cmbShowForArea;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblAgentId;
    private javax.swing.JLabel lblAgentMeny;
    private javax.swing.JLabel lblAlienVal;
    private javax.swing.JLabel lblAliensByRace;
    private javax.swing.JLabel lblAliensInArea;
    private javax.swing.JLabel lblSearchAreaBoss;
    // End of variables declaration//GEN-END:variables
}
