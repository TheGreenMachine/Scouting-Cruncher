/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SettingsGUI.java
 *
 * Created on Nov 3, 2011, 9:13:40 PM
 */

package org.scouting.gui;

import java.io.File;

/*
 * @author aoneill
 * @note Made by the Netbeans built-in GUI creator
 */


public class SettingsGUI extends javax.swing.JFrame
{

    private String defaultTeamFileDir;
    private boolean logSetting;
    private boolean scoutBool = false;


    /** Creates new form SettingsGUI */
    public SettingsGUI()
    {
        initComponents();

        fileExplorer = new javax.swing.JFileChooser();
        fileExplorer.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logCheckBox = new javax.swing.JCheckBox();
        scoutButton = new javax.swing.JButton();
        wDirPanel = new javax.swing.JPanel();
        teamDirLocation = new javax.swing.JTextField();
        chooseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        logCheckBox.setText("Log Session");
        logCheckBox.setFocusable(false);

        scoutButton.setText("Scout!");
        scoutButton.setFocusable(false);
        scoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoutButtonActionPerformed(evt);
            }
        });

        wDirPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Working Directory"));

        teamDirLocation.setColumns(50);
        teamDirLocation.setEditable(false);
        teamDirLocation.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        teamDirLocation.setFocusable(false);

        chooseButton.setText("Choose ...");
        chooseButton.setFocusable(false);
        chooseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout wDirPanelLayout = new org.jdesktop.layout.GroupLayout(wDirPanel);
        wDirPanel.setLayout(wDirPanelLayout);
        wDirPanelLayout.setHorizontalGroup(
            wDirPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(wDirPanelLayout.createSequentialGroup()
                .add(wDirPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(teamDirLocation, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, wDirPanelLayout.createSequentialGroup()
                        .addContainerGap(521, Short.MAX_VALUE)
                        .add(chooseButton)))
                .addContainerGap())
        );
        wDirPanelLayout.setVerticalGroup(
            wDirPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(wDirPanelLayout.createSequentialGroup()
                .add(teamDirLocation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(chooseButton))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(logCheckBox))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                .add(scoutButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(wDirPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(wDirPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(scoutButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(logCheckBox)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoutButtonActionPerformed
        // TODO add your handling code here:
        scoutBool = true;
    }//GEN-LAST:event_scoutButtonActionPerformed

    private void chooseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseButtonActionPerformed
        // TODO add your handling code here:
        fileExplorer.setCurrentDirectory(new File(System.getProperty("user.dir")));
        
        int returnVal = fileExplorer.showOpenDialog(this);
        if(returnVal == javax.swing.JFileChooser.APPROVE_OPTION)
        {
            try
            {
                defaultTeamFileDir = fileExplorer.getSelectedFile().getPath();
                teamDirLocation.setText(defaultTeamFileDir);
            }
            catch(Exception e)
            {
                System.out.println("Could not set teamDirLocation Field!");
            }
        }
    }//GEN-LAST:event_chooseButtonActionPerformed

    public void setTeamDirField(String dirPath)
    {
        defaultTeamFileDir = dirPath;
        teamDirLocation.setText(defaultTeamFileDir);
    }

    public void setLogBox(boolean state)
    {
        logSetting = state;
        logCheckBox.setSelected(logSetting);
    }

    public boolean getLogBox()
    {
        return logCheckBox.isSelected();
    }

    public String getTeamDirPath()
    {
        return defaultTeamFileDir;
    }

    public boolean getScoutStatus() throws InterruptedException
    {
        Thread.currentThread().sleep(10);
        return scoutBool;
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseButton;
    private javax.swing.JCheckBox logCheckBox;
    private javax.swing.JButton scoutButton;
    private javax.swing.JTextField teamDirLocation;
    private javax.swing.JPanel wDirPanel;
    // End of variables declaration//GEN-END:variables

    private javax.swing.JFileChooser fileExplorer;
}
