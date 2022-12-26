/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.klasser;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author theosohlman
 */
public class ChangeAlienInfoPage extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form ChangeAlienInfoPage
     */
    public ChangeAlienInfoPage(InfDB idb) {
        initComponents();
        this.idb = idb;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblChangeInfoHeader.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblChangeInfoHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChangeInfoHeader.setText("Change alien's information");

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

        btnCancel.setText("Cancel");

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
                            .addComponent(lblSetNewRace, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbNewRace, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbRaceAlienId, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addComponent(btnSetNewRace, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblNewValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblChangeThis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValueAlienId, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbValueAlienId, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cmbInfoToChange, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnChangeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
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
                    .addComponent(lblValueAlienId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbInfoToChange, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChangeThis)
                    .addComponent(btnChangeInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNewValue)
                    .addComponent(txtNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRaceAlienId)
                            .addComponent(cmbRaceAlienId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbNewRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSetNewRace)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnSetNewRace)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetNewRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetNewRaceActionPerformed
        
    }//GEN-LAST:event_btnSetNewRaceActionPerformed

    private void btnChangeInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeInfoActionPerformed
        
    }//GEN-LAST:event_btnChangeInfoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChangeInfo;
    private javax.swing.JButton btnSetNewRace;
    private javax.swing.JComboBox<String> cmbInfoToChange;
    private javax.swing.JComboBox<String> cmbNewRace;
    private javax.swing.JComboBox<String> cmbRaceAlienId;
    private javax.swing.JComboBox<String> cmbValueAlienId;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblChangeInfoHeader;
    private javax.swing.JLabel lblChangeThis;
    private javax.swing.JLabel lblNewValue;
    private javax.swing.JLabel lblRaceAlienId;
    private javax.swing.JLabel lblSetNewRace;
    private javax.swing.JLabel lblValueAlienId;
    private javax.swing.JSeparator separator;
    private javax.swing.JTextField txtNewValue;
    // End of variables declaration//GEN-END:variables
}
