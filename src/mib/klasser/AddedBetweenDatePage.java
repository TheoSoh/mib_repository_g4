/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.klasser;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * @author Grupp4
 * Klassens f�lt
 */
public class AddedBetweenDatePage extends javax.swing.JFrame {

    //Variabel deklaration - p�b�rjas h�r
    private InfDB idb;
    private int agentId;
    //Variabel deklaration - avslutas h�r
    
    /**
     * Creates new form AddedBetweenDatePage
     */
    public AddedBetweenDatePage(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        setTitle("Alien information");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFromDate = new javax.swing.JTextField();
        txtToDate = new javax.swing.JTextField();
        lblAddedBetweenHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAlienInfo = new javax.swing.JTextArea();
        lblFromDate = new javax.swing.JLabel();
        lblToDate = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtFromDate.setText("xxxx/xx/xx");

        txtToDate.setText("xxxx/xx/xx");

        lblAddedBetweenHeader.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblAddedBetweenHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddedBetweenHeader.setText("Added Between Dates");

        txtAreaAlienInfo.setColumns(20);
        txtAreaAlienInfo.setRows(5);
        jScrollPane1.setViewportView(txtAreaAlienInfo);

        lblFromDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFromDate.setText("From date:");

        lblToDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblToDate.setText("To date:");

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblErrorMessage.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAddedBetweenHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lblFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblAddedBetweenHeader)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFromDate)
                    .addComponent(lblToDate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnCancel)
                    .addComponent(lblErrorMessage))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Denna metod st�nger ner det nuvarande f�nstret och �terg�r till det f�reg�ende f�nsret.
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
     * Denna metod bekr�ftar ifall de ifyllda v�rderna visar ett resultat, vilket kan vara flera olika individer.
     * @param evt 
     */
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String fromDate = txtFromDate.getText();
        String toDate = txtToDate.getText();
        txtAreaAlienInfo.setText("");
        
        if(Validation.checkTwoEmptyTxtFields(txtFromDate, txtToDate)) {
            lblErrorMessage.setText("Enter a date in each text field!");
        }
        else {
            try {
                String sqlQuery = "select Alien_ID, Namn, Registreringsdatum, Plats from Alien"
                    + " where registreringsdatum > '" + fromDate + "' and Registreringsdatum < '" + toDate + "';";
                ArrayList<HashMap<String, String>> AliensAddedBetweenDates = idb.fetchRows(sqlQuery);
                
                if(AliensAddedBetweenDates.isEmpty()) {
                    lblErrorMessage.setText("There are no aliens registered within the given dates!");
                }
                else {
                    for(HashMap<String, String> aColumn : AliensAddedBetweenDates) {
                        txtAreaAlienInfo.append("Alien-ID: " + aColumn.get("Alien_ID"));
                        txtAreaAlienInfo.append("     Name: " + aColumn.get("Namn"));
                        txtAreaAlienInfo.append("     Registrationdate: " + aColumn.get("Registreringsdatum"));
                        txtAreaAlienInfo.append("     Area: " + aColumn.get("Plats") + "\n\n");
                    }
                    lblErrorMessage.setText("");
                }
            }
            catch(InfException e) {
                lblErrorMessage.setText("Wrong format! Correct format is: xxxx/xx/xx or xxxx-xx-xx");
            }
            catch(Exception e) {
                lblErrorMessage.setText("Unexpected Error!");
                System.out.print(e);
            }
        }
    }//GEN-LAST:event_btnConfirmActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddedBetweenHeader;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JLabel lblFromDate;
    private javax.swing.JLabel lblToDate;
    private javax.swing.JTextArea txtAreaAlienInfo;
    private javax.swing.JTextField txtFromDate;
    private javax.swing.JTextField txtToDate;
    // End of variables declaration//GEN-END:variables
}
