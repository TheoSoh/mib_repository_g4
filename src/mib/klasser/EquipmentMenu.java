/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.klasser;

import javax.swing.JFrame;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupp4
 */
public class EquipmentMenu extends javax.swing.JFrame {
    
    //H�r p�b�rjas deklaration av f�lt.
    private static InfDB idb;
    private int agentId;
    //H�r slutar deklarationen av f�lt.
    
    /**
     * Creates new form EquipmentMenu
     * @param idb
     * @param agentId 
     */
    public EquipmentMenu(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        setTitle("Equipment Menu");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEquipmentMenu = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnTeknik = new javax.swing.JButton();
        btnVapen = new javax.swing.JButton();
        btnKommunikation = new javax.swing.JButton();
        btnAddEquipmentToAgent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEquipmentMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEquipmentMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEquipmentMenu.setText("New Equipment");
        lblEquipmentMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnTeknik.setText("Technology");
        btnTeknik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeknikActionPerformed(evt);
            }
        });

        btnVapen.setText("Weapon");
        btnVapen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVapenActionPerformed(evt);
            }
        });

        btnKommunikation.setText("Communication");
        btnKommunikation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKommunikationActionPerformed(evt);
            }
        });

        btnAddEquipmentToAgent.setText("Assign Equipment");
        btnAddEquipmentToAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEquipmentToAgentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblEquipmentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVapen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTeknik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKommunikation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddEquipmentToAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEquipmentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnTeknik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVapen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKommunikation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddEquipmentToAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Metoden kallas när användaren klickar på cancel knappen i rutan.
     * Stänger ner EquipmentMenu samtidigt öppnas AdminMenu eller AgentMenu,
     * beroende på vilken meny man kom ifrån. Detta kontrolleras m.h.a. 
     * checkAdminStatus() metoden.
     * @param evt 
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        EquipmentMenu.this.dispose();
        if(LoginPage.checkAdminStatus(agentId)) {
            new AdminMenu(idb, agentId).setVisible(true);
        }
        else {
            new AgentMenu(idb, agentId).setVisible(true);
        }
    }//GEN-LAST:event_btnCancelActionPerformed
    
    /**
     * 
     * @param evt 
     */
    private void btnTeknikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeknikActionPerformed
        EquipmentMenu.this.dispose();
        new NewTechnologyPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnTeknikActionPerformed
    
    /**
     * 
     * @param evt 
     */
    private void btnVapenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVapenActionPerformed
        EquipmentMenu.this.dispose();
        new NewWeaponPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnVapenActionPerformed
    
    /**
     * 
     * @param evt 
     */
    private void btnKommunikationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKommunikationActionPerformed
        EquipmentMenu.this.dispose();
        new NewCommunicationPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnKommunikationActionPerformed
    
    /**
     * 
     * @param evt 
     */
    private void btnAddEquipmentToAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEquipmentToAgentActionPerformed
        EquipmentMenu.this.dispose();
        new AddEquipmentToAgentPage(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnAddEquipmentToAgentActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEquipmentToAgent;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnKommunikation;
    private javax.swing.JButton btnTeknik;
    private javax.swing.JButton btnVapen;
    private javax.swing.JLabel lblEquipmentMenu;
    // End of variables declaration//GEN-END:variables
}
