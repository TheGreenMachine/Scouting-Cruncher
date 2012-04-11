/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AllDataGUI.java
 *
 * Created on Dec 17, 2011, 10:47:18 PM
 */

package com.edinarobotics.gui;

import com.edinarobotics.gui.utilities.Sorter;
import com.edinarobotics.scout.Global;
import javax.swing.table.DefaultTableModel;

/*
 * @author aoneill
 * @note Made by the Netbeans built-in GUI creator
 */
public class AllDataGUI extends javax.swing.JFrame
{
    private static String tableHeader[] = new String[] {"Team Name", "Auto Score", "Main Score", "End Score", "Overall Score", "Penalty Number"};
    private String[][] allData = Global.allData;

    private static final int DATA_POINTS = 7;
    private static final String TITLE_BASE = "All Scores - ";

    /** Creates new form AllDataGUI */
    public AllDataGUI()
    {
        initComponents();
        init();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scoresLabel = new javax.swing.JLabel();
        modeComboBox = new javax.swing.JComboBox();
        dataScrollPane = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        resultsLabel = new javax.swing.JLabel();
        sortDirComboBox = new javax.swing.JComboBox();

        setTitle("All Scores");

        scoresLabel.setText("All Average Scores By");

        modeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Team Number", "Overall Score", "Autonomous", "Main Game", "End Game" }));
        modeComboBox.setFocusable(false);
        modeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeComboBoxActionPerformed(evt);
            }
        });

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dataTable.setMinimumSize(new java.awt.Dimension(64, 64));
        dataScrollPane.setViewportView(dataTable);

        resultsLabel.setText("with results");

        sortDirComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Low to High", "High to Low" }));
        sortDirComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortDirComboBoxActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(dataScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(200, 200, 200)
                        .add(scoresLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(modeComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(resultsLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(sortDirComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(scoresLabel)
                    .add(modeComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(resultsLabel)
                    .add(sortDirComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dataScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 346, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void init()
    {
        initTable();
        updateTitle("Team Number");
        setVisible(true);
    }
    
    private void modeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeComboBoxActionPerformed
        // TODO add your handling code here:
        Sorter sort = new Sorter(DATA_POINTS);

        int mode = sortDirComboBox.getSelectedItem().toString().equals("Low to High") ?
            Sorter.LOW_TO_HIGH : Sorter.HIGH_TO_LOW;

        String optionChosen = modeComboBox.getSelectedItem().toString();
        String data[][] = {};

        if(optionChosen.equals("Team Number"))
        {
            //data = sortBest(allData, 0);
            data = sort.sortBest(allData, 0, mode);
        }
        else if(optionChosen.equals("Autonomous"))
        {
            //data = sortBest(allData, 0);
            data = sort.sortBest(allData, 1, mode);
        }
        else if(optionChosen.equals("Main Game"))
        {
            //data = sortBest(allData, 0);
            data = sort.sortBest(allData, 2, mode);
        }
        else if(optionChosen.equals("End Game"))
        {
            //data = sortBest(allData, 0);
            data = sort.sortBest(allData, 3, mode);
        }
        else if(optionChosen.equals("Overall Score"))
        {
            //data = sortBest(allData, 0);
            data = sort.sortBest(allData, 4, mode);
        }
        else
        {
            System.err.println("OH GOD! THE BLOOD!! ITS EVERYWHERE");
            System.exit(1);
        }

        updateTitle(optionChosen);
        writeToTable(data);
    }//GEN-LAST:event_modeComboBoxActionPerformed

    private void sortDirComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortDirComboBoxActionPerformed
        // TODO add your handling code here:
        modeComboBoxActionPerformed(evt);
    }//GEN-LAST:event_sortDirComboBoxActionPerformed

    private void initTable()
    {
        Sorter sort = new Sorter(DATA_POINTS);
        String data[][] = sort.sortBest(allData, 0, Sorter.LOW_TO_HIGH);
        writeToTable(data);
    }

    private void writeToTable(String data[][])
    {
        dataTable.setModel(new DefaultTableModel(data, tableHeader));
    }

    private void updateTitle(String suffix)
    {
        setTitle(TITLE_BASE + suffix);
    }
    
    /**
    * @param args the command line arguments
    */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllDataGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane dataScrollPane;
    private javax.swing.JTable dataTable;
    private javax.swing.JComboBox modeComboBox;
    private javax.swing.JLabel resultsLabel;
    private javax.swing.JLabel scoresLabel;
    private javax.swing.JComboBox sortDirComboBox;
    // End of variables declaration//GEN-END:variables


}
