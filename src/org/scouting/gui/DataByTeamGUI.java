/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DataByTeamGUI.java
 *
 * Created on Feb 21, 2012, 11:46:13 AM
 */

package org.scouting.gui;

import org.scouting.filer.Extracter;
import org.scouting.filer.FileScanner;
import org.scouting.scout.Main;

/*
 * @author aoneill
 * @note Made by the Netbeans built-in GUI creator
 */
public class DataByTeamGUI extends javax.swing.JFrame
{
    String VERSION = "";

    /** Creates new form DataByTeamGUI */
    public DataByTeamGUI(String teamList[])
    {
        initComponents();
    }

    public DataByTeamGUI(String teamList[], String version)
    {
        VERSION = version;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        teamTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        sortLabel = new javax.swing.JLabel();
        sortComboBox = new javax.swing.JComboBox();
        resultLabel = new javax.swing.JLabel();
        resultComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        teamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Team Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(teamTable);

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Match", "Autonomous", "Main Game", "End Game", "Penalty Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(dataTable);

        sortLabel.setText("Sort By");

        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Match", "Autonomous", "Main Game", "End Game", "Penalty Number" }));

        resultLabel.setText("with results");

        resultComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Low to High", "High to Low" }));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 640, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(137, 137, 137)
                        .add(sortLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(sortComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 187, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(resultLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(resultComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 187, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(sortLabel)
                            .add(sortComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(resultLabel)
                            .add(resultComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 241, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 275, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showData()
    {
        int teamNumber = getTeamNumber();
        String data[][] = getContent(teamNumber);
    }

    public String[][] getContent(int teamNumber)
    {
        FileScanner teamFileScanner = new FileScanner();
        Extracter extract = new Extracter();

        String currentDir = Main.currentDir;
        String workspaceFolderName = Main.workspaceFolderName;
        String teamFolderName = Main.teamFolderName;

        System.out.println();
        System.out.println("Team " + String.valueOf(teamNumber) + ":");
        teamFileScanner.openFile(currentDir + "/" + workspaceFolderName + "/" + teamFolderName, String.valueOf(teamNumber) + ".txt");

        String nextLine = teamFileScanner.getNextLine();
        while(nextLine.startsWith("#"))
        {
            nextLine = teamFileScanner.getNextLine();
        }

        int lineCount = 1;
        while(teamFileScanner.hasNextEntry())
        {
            teamFileScanner.getNextLine();
            lineCount++;
        }

        System.out.println("Found Line numbers (" + lineCount + ") in " + String.valueOf(teamNumber) + ".txt");

        String content[] = new String[lineCount];
        teamFileScanner.openFile(currentDir + "/" + workspaceFolderName + "/" + teamFolderName, String.valueOf(teamNumber) + ".txt");

        nextLine = teamFileScanner.getNextLine();
        System.out.println("::: " + nextLine);
        while(nextLine.startsWith("#"))
        {
            nextLine = teamFileScanner.getNextLine();
            System.out.println("::: " + nextLine);
        }

        content[0] = nextLine;
        System.out.println("     content[0] = " + nextLine);
        for(int j = 1; j < lineCount; j++)
        //while(teamFileScanner.hasNextEntry())
        {
            content[j] = teamFileScanner.getNextLine();
            System.out.println("    content[" + j + "] = " + content[j]);
        }


        String extractedData[][] = new String[5][lineCount];
        for(int j = 0; j < lineCount; j++)
        {
            // Ignoring Round Number
            // <roundNum>:<autoPoints>:<mainPoints>:<endPoints>:<penalties>
            extractedData[0][j] = extract.extractEntry(content[j], 1);
            extractedData[1][j] = extract.extractEntry(content[j], 2);
            extractedData[2][j] = extract.extractEntry(content[j], 3);
            extractedData[3][j] = extract.extractEntry(content[j], 4);
            extractedData[4][j] = extract.extractEntry(content[j], 5);
        }

        return extractedData;
    }


    public int getTeamNumber()
    {
        return Integer.parseInt(teamTable.getValueAt(teamTable.getSelectedRow(), teamTable.getSelectedColumn()).toString());
    }


    /**
    * @param args the command line arguments
    */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataByTeamGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox resultComboBox;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JComboBox sortComboBox;
    private javax.swing.JLabel sortLabel;
    private javax.swing.JTable teamTable;
    // End of variables declaration//GEN-END:variables

}
