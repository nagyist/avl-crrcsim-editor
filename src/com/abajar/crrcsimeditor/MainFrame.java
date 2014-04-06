/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on 03-jul-2011, 22:45:18
 */

package com.abajar.crrcsimeditor;

import com.abajar.crrcsimeditor.ui.ChangeSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.abajar.crrcsimeditor.avl.AVL;
import com.abajar.crrcsimeditor.avl.AVLGeometry;
import com.abajar.crrcsimeditor.avl.geometry.Body;
import com.abajar.crrcsimeditor.avl.geometry.Control;
import com.abajar.crrcsimeditor.avl.geometry.Section;
import com.abajar.crrcsimeditor.avl.geometry.Surface;
import com.abajar.crrcsimeditor.avl.mass.Mass;
import com.abajar.crrcsimeditor.avl.mass.MassObject;
import com.abajar.crrcsimeditor.avl.view.SelectorMutableTreeNode;
import com.abajar.crrcsimeditor.avl.view.SelectorMutableTreeNode.ENABLE_BUTTONS;
import com.abajar.crrcsimeditor.avl.view.table.AVLModelTableFactory;
import com.abajar.crrcsimeditor.avl.view.table.CRRCSimTableModel;
import com.abajar.crrcsimeditor.crrcsim.CRRCSim;
import com.abajar.crrcsimeditor.crrcsim.CRRCSim.Change;
import com.abajar.crrcsimeditor.crrcsim.CRRCSim.Changelog;
import java.io.File;
import java.util.EnumSet;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import javax.swing.tree.DefaultTreeModel;
import static java.util.EnumSet.of;
import javax.swing.tree.MutableTreeNode;

/**
 *
 * @author hfreire
 */
public class MainFrame extends javax.swing.JFrame {

    private CRRCsimEditor controller;
        
    /** Creates new form MainFrame */
    public MainFrame(CRRCsimEditor controller) {
        this.controller = controller;

        initComponents();

        this.modelPropertiesTable.addChangeSelectionListener(new ChangeSelectionListener(){

            @Override
            public void notify(int rowIndex, int columnIndex) {
                MainFrame.this.helpTextArea.setText(((CRRCSimTableModel) modelPropertiesTable.getModel()).getColumnsHelp()[columnIndex]);
            }

        });
        
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        view3DIFrame = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        modelPropertiesTable = new com.abajar.crrcsimeditor.ui.TableView();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        addSurfaceButton = new javax.swing.JButton();
        addSectionButton = new javax.swing.JButton();
        addControlButton = new javax.swing.JButton();
        addMassButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addBodyButton = new javax.swing.JButton();
        addChangeButton = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        avlTree = new javax.swing.JTree();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        topViewButton = new javax.swing.JButton();
        frontViewButton = new javax.swing.JButton();
        rightViewButton = new javax.swing.JButton();
        jInternalFrame5 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        helpTextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        fileOpenMenuItem = new javax.swing.JMenuItem();
        fileExportAsAVLMenuItem = new javax.swing.JMenuItem();
        fileExportAsCRRsimMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        editSetAvlExecutableMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        jDesktopPane1.setName("jDesktopPane1"); // NOI18N

        view3DIFrame.setMaximizable(true);
        view3DIFrame.setResizable(true);
        view3DIFrame.setName("view3DIFrame"); // NOI18N
        view3DIFrame.setVisible(true);

        jPanel1.setName("jPanel1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout view3DIFrameLayout = new javax.swing.GroupLayout(view3DIFrame.getContentPane());
        view3DIFrame.getContentPane().setLayout(view3DIFrameLayout);
        view3DIFrameLayout.setHorizontalGroup(
            view3DIFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        view3DIFrameLayout.setVerticalGroup(
            view3DIFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        view3DIFrame.setBounds(330, 160, 470, 360);
        jDesktopPane1.add(view3DIFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame3.setName("jInternalFrame3"); // NOI18N
        jInternalFrame3.setVisible(true);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        modelPropertiesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        modelPropertiesTable.setName("modelPropertiesTable"); // NOI18N
        modelPropertiesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelPropertiesTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(modelPropertiesTable);

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jInternalFrame3.setBounds(0, 0, 800, 80);
        jDesktopPane1.add(jInternalFrame3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame4.setName("jInternalFrame4"); // NOI18N
        jInternalFrame4.setVisible(true);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.abajar.crrcsimeditor.CRRCsimEditor.class).getContext().getResourceMap(MainFrame.class);
        addSurfaceButton.setText(resourceMap.getString("addSurfaceButton.text")); // NOI18N
        addSurfaceButton.setEnabled(false);
        addSurfaceButton.setName("addSurfaceButton"); // NOI18N
        addSurfaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSurfaceButtonActionPerformed(evt);
            }
        });

        addSectionButton.setText(resourceMap.getString("addSectionButton.text")); // NOI18N
        addSectionButton.setEnabled(false);
        addSectionButton.setName("addSectionButton"); // NOI18N
        addSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSectionButtonActionPerformed(evt);
            }
        });

        addControlButton.setText(resourceMap.getString("addControlButton.text")); // NOI18N
        addControlButton.setEnabled(false);
        addControlButton.setName("addControlButton"); // NOI18N
        addControlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addControlButtonActionPerformed(evt);
            }
        });

        addMassButton.setText(resourceMap.getString("addMassButton.text")); // NOI18N
        addMassButton.setEnabled(false);
        addMassButton.setName("addMassButton"); // NOI18N
        addMassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMassButtonActionPerformed(evt);
            }
        });

        deleteButton.setText(resourceMap.getString("deleteButton.text")); // NOI18N
        deleteButton.setEnabled(false);
        deleteButton.setName("deleteButton"); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addBodyButton.setText(resourceMap.getString("addBodyButton.text")); // NOI18N
        addBodyButton.setEnabled(false);
        addBodyButton.setName("addBodyButton"); // NOI18N
        addBodyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBodyButtonActionPerformed(evt);
            }
        });

        addChangeButton.setText(resourceMap.getString("addChangeLogButton.text")); // NOI18N
        addChangeButton.setEnabled(false);
        addChangeButton.setName("addChangeLogButton"); // NOI18N
        addChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChangeLogButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addComponent(addSurfaceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addSectionButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addControlButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addMassButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addBodyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton))
                    .addComponent(addChangeButton))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSurfaceButton)
                    .addComponent(addSectionButton)
                    .addComponent(addControlButton)
                    .addComponent(addMassButton)
                    .addComponent(deleteButton)
                    .addComponent(addBodyButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addChangeButton))
        );

        addSurfaceButton.getAccessibleContext().setAccessibleName(resourceMap.getString("addSurfaceButton.AccessibleContext.accessibleName")); // NOI18N

        jInternalFrame4.setBounds(250, 80, 550, 80);
        jDesktopPane1.add(jInternalFrame4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame2.setName("jInternalFrame2"); // NOI18N
        jInternalFrame2.setVisible(true);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        avlTree.setModel(this.getTreeModel());
        avlTree.setName("avlTree"); // NOI18N
        avlTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                avlTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(avlTree);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );

        jInternalFrame2.setBounds(0, 80, 250, 440);
        jDesktopPane1.add(jInternalFrame2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame1.setName("jInternalFrame1"); // NOI18N
        jInternalFrame1.setVisible(true);

        topViewButton.setText(resourceMap.getString("topViewButton.text")); // NOI18N
        topViewButton.setName("topViewButton"); // NOI18N
        topViewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topViewButtonMouseClicked(evt);
            }
        });

        frontViewButton.setText(resourceMap.getString("frontViewButton.text")); // NOI18N
        frontViewButton.setName("frontViewButton"); // NOI18N
        frontViewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frontViewButtonMouseClicked(evt);
            }
        });

        rightViewButton.setText(resourceMap.getString("rightViewButton.text")); // NOI18N
        rightViewButton.setName("rightViewButton"); // NOI18N
        rightViewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightViewButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(frontViewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topViewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightViewButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(topViewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frontViewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightViewButton)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jInternalFrame1.setBounds(250, 160, 80, 360);
        jDesktopPane1.add(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame5.setName("jInternalFrame5"); // NOI18N
        jInternalFrame5.setVisible(true);

        jPanel2.setName("jPanel2"); // NOI18N

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        helpTextArea.setColumns(20);
        helpTextArea.setLineWrap(true);
        helpTextArea.setRows(5);
        helpTextArea.setText(resourceMap.getString("helpTextArea.text")); // NOI18N
        helpTextArea.setName("helpTextArea"); // NOI18N
        jScrollPane3.setViewportView(helpTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jInternalFrame5Layout = new javax.swing.GroupLayout(jInternalFrame5.getContentPane());
        jInternalFrame5.getContentPane().setLayout(jInternalFrame5Layout);
        jInternalFrame5Layout.setHorizontalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame5Layout.setVerticalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jInternalFrame5.setBounds(800, 0, 400, 520);
        jDesktopPane1.add(jInternalFrame5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu1.setText(resourceMap.getString("jMenu1.text")); // NOI18N
        jMenu1.setName("jMenu1"); // NOI18N
        jMenu1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jMenu1ComponentShown(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText(resourceMap.getString("jMenuItem1.text")); // NOI18N
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        fileOpenMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        fileOpenMenuItem.setText(resourceMap.getString("fileOpenMenuItem.text")); // NOI18N
        fileOpenMenuItem.setName("fileOpenMenuItem"); // NOI18N
        fileOpenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileOpenMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(fileOpenMenuItem);

        fileExportAsAVLMenuItem.setText(resourceMap.getString("fileExportAsAVLMenuItem.text")); // NOI18N
        fileExportAsAVLMenuItem.setName("fileExportAsAVLMenuItem"); // NOI18N
        fileExportAsAVLMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileExportAsAVLMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(fileExportAsAVLMenuItem);

        fileExportAsCRRsimMenuItem.setText(resourceMap.getString("fileExportAsCRRsimMenuItem.text")); // NOI18N
        fileExportAsCRRsimMenuItem.setName("fileExportAsCRRsimMenuItem"); // NOI18N
        fileExportAsCRRsimMenuItem.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                fileExportAsCRRsimMenuItemComponentShown(evt);
            }
        });
        fileExportAsCRRsimMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileExportAsCRRsimMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(fileExportAsCRRsimMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(resourceMap.getString("jMenu2.text")); // NOI18N
        jMenu2.setName("jMenu2"); // NOI18N

        editSetAvlExecutableMenuItem.setText(resourceMap.getString("editSetAvlExecutableMenuItem.text")); // NOI18N
        editSetAvlExecutableMenuItem.setName("editSetAvlExecutableMenuItem"); // NOI18N
        editSetAvlExecutableMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSetAvlExecutableMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(editSetAvlExecutableMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1201, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileExportAsAVLMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileExportAsAVLMenuItemActionPerformed
        controller.exportAsAVL();
    }//GEN-LAST:event_fileExportAsAVLMenuItemActionPerformed

    public File showOpenDialog(String path, String extensionDescription, String...extension){
        JFileChooser fc = new JFileChooser(path);
        
        if (extension.length>0){
            FileNameExtensionFilter filter = new FileNameExtensionFilter(extensionDescription, extension);
            fc.setFileFilter(filter);
        }

        fc.showOpenDialog(this);
        File file = fc.getSelectedFile();
        return file;
    }

    public File showSaveDialog(String path, String extensionDescription, String extension){
        JFileChooser fc = new JFileChooser(path);

        FileNameExtensionFilter filter = new FileNameExtensionFilter(extensionDescription, extension);
        fc.setFileFilter(filter);
        fc.showSaveDialog(this);

        File file = fc.getSelectedFile();
        String filePath = file.getAbsolutePath();
        if (!filePath.contains(".")) {
            filePath += "." + extension;
            file = new File(filePath) ;
        }
        
        return file;
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        controller.saveFile();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void fileOpenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileOpenMenuItemActionPerformed
        controller.openFile();
    }//GEN-LAST:event_fileOpenMenuItemActionPerformed

    private void fileExportAsCRRsimMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileExportAsCRRsimMenuItemActionPerformed
        this.controller.exportAsCRRCsim();
    }//GEN-LAST:event_fileExportAsCRRsimMenuItemActionPerformed

    private void editSetAvlExecutableMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSetAvlExecutableMenuItemActionPerformed
        this.controller.setAvlExecutable();
    }//GEN-LAST:event_editSetAvlExecutableMenuItemActionPerformed

    private void fileExportAsCRRsimMenuItemComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_fileExportAsCRRsimMenuItemComponentShown
    }//GEN-LAST:event_fileExportAsCRRsimMenuItemComponentShown

    private void jMenu1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jMenu1ComponentShown
    }//GEN-LAST:event_jMenu1ComponentShown

    private void rightViewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightViewButtonMouseClicked
        controller.showRightView();
}//GEN-LAST:event_rightViewButtonMouseClicked

    private void frontViewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frontViewButtonMouseClicked
        controller.showFrontView();
}//GEN-LAST:event_frontViewButtonMouseClicked

    private void topViewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topViewButtonMouseClicked
        controller.showTopView();
}//GEN-LAST:event_topViewButtonMouseClicked

    private void avlTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_avlTreeValueChanged
        SelectorMutableTreeNode treeNode = (SelectorMutableTreeNode)evt.getPath().getLastPathComponent();

        EnumSet<ENABLE_BUTTONS> options = treeNode.getOptions();
        addSurfaceButton.setEnabled(options.contains(ENABLE_BUTTONS.ADD_SURFACE));
        addSectionButton.setEnabled(options.contains(ENABLE_BUTTONS.ADD_SECTION));
        addControlButton.setEnabled(options.contains(ENABLE_BUTTONS.ADD_CONTROL));
        addMassButton.setEnabled(options.contains(ENABLE_BUTTONS.ADD_MASS));
        addBodyButton.setEnabled(options.contains(ENABLE_BUTTONS.ADD_BODY));
        deleteButton.setEnabled(options.contains(ENABLE_BUTTONS.DELETE));
        addChangeButton.setEnabled(options.contains(ENABLE_BUTTONS.ADD_CHANGELOG));
        showModelProperties(treeNode.getUserObject());
}//GEN-LAST:event_avlTreeValueChanged

    private void addSurfaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSurfaceButtonActionPerformed
        SelectorMutableTreeNode treeNode = (SelectorMutableTreeNode)this.avlTree.getSelectionPath().getLastPathComponent();
        Surface newSurface = this.controller.createSurfaceFor((AVLGeometry)treeNode.getUserObject()) ;
        ((DefaultTreeModel)this.avlTree.getModel()).insertNodeInto(createSurfaceTreeNode(newSurface), treeNode, treeNode.getChildCount());
}//GEN-LAST:event_addSurfaceButtonActionPerformed

    private void addSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSectionButtonActionPerformed
        SelectorMutableTreeNode treeNode = (SelectorMutableTreeNode)this.avlTree.getSelectionPath().getLastPathComponent();
        Section newSection = this.controller.createSectionFor((Surface)treeNode.getUserObject()) ;
        ((DefaultTreeModel)this.avlTree.getModel()).insertNodeInto(createSectionTreeNode(newSection), treeNode, treeNode.getChildCount());
}//GEN-LAST:event_addSectionButtonActionPerformed

    private void addControlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addControlButtonActionPerformed
        SelectorMutableTreeNode treeNode = (SelectorMutableTreeNode)this.avlTree.getSelectionPath().getLastPathComponent();
        Control newControl = this.controller.createControlFor((Section)treeNode.getUserObject()) ;
        ((DefaultTreeModel)this.avlTree.getModel()).insertNodeInto(createControlTreeNode(newControl), treeNode, treeNode.getChildCount());
}//GEN-LAST:event_addControlButtonActionPerformed

    private void addMassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMassButtonActionPerformed
        SelectorMutableTreeNode treeNode = (SelectorMutableTreeNode)this.avlTree.getSelectionPath().getLastPathComponent();
        Mass newMass = this.controller.createMassFor((MassObject)treeNode.getUserObject()) ;
        ((DefaultTreeModel)this.avlTree.getModel()).insertNodeInto(createMassTreeNode(newMass), treeNode, treeNode.getChildCount());
}//GEN-LAST:event_addMassButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        SelectorMutableTreeNode deleteTreeNode = (SelectorMutableTreeNode) this.avlTree.getSelectionPath().getLastPathComponent();
        SelectorMutableTreeNode parentTreeNode = (SelectorMutableTreeNode) this.avlTree.getSelectionPath().getParentPath().getLastPathComponent();
        deleteTreeNodeAndObject(parentTreeNode, deleteTreeNode);
}//GEN-LAST:event_deleteButtonActionPerformed

    private void modelPropertiesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modelPropertiesTableMouseClicked
        int col = modelPropertiesTable.columnAtPoint(evt.getPoint());
        String[] helpTexts = ((CRRCSimTableModel)modelPropertiesTable.getModel()).getColumnsHelp();
        helpTextArea.setText(helpTexts[col]);
    }//GEN-LAST:event_modelPropertiesTableMouseClicked

    private void addBodyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBodyButtonActionPerformed
        SelectorMutableTreeNode treeNode = (SelectorMutableTreeNode)this.avlTree.getSelectionPath().getLastPathComponent();
        Body newBody = this.controller.createBodyFor((AVLGeometry)treeNode.getUserObject()) ;
        ((DefaultTreeModel)this.avlTree.getModel()).insertNodeInto(createBodyTreeNode(newBody), treeNode, treeNode.getChildCount());
    }//GEN-LAST:event_addBodyButtonActionPerformed

    private void addChangeLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addChangeLogButtonActionPerformed
        SelectorMutableTreeNode treeNode = (SelectorMutableTreeNode)this.avlTree.getSelectionPath().getLastPathComponent();
        Change change = this.controller.createChangeFor((CRRCSim) treeNode.getUserObject());
        ((DefaultTreeModel)this.avlTree.getModel()).insertNodeInto(createChangeNode(change), treeNode, treeNode.getChildCount());
    }//GEN-LAST:event_addChangeLogButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBodyButton;
    private javax.swing.JButton addChangeButton;
    private javax.swing.JButton addControlButton;
    private javax.swing.JButton addMassButton;
    private javax.swing.JButton addSectionButton;
    private javax.swing.JButton addSurfaceButton;
    private javax.swing.JTree avlTree;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenuItem editSetAvlExecutableMenuItem;
    private javax.swing.JMenuItem fileExportAsAVLMenuItem;
    private javax.swing.JMenuItem fileExportAsCRRsimMenuItem;
    private javax.swing.JMenuItem fileOpenMenuItem;
    private javax.swing.JButton frontViewButton;
    private javax.swing.JTextArea helpTextArea;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JInternalFrame jInternalFrame5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.abajar.crrcsimeditor.ui.TableView modelPropertiesTable;
    private javax.swing.JButton rightViewButton;
    private javax.swing.JButton topViewButton;
    private javax.swing.JInternalFrame view3DIFrame;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the fileExportAsCRRsimMenuItem
     */
    public javax.swing.JMenuItem getFileExportAsCRRsimMenuItem() {
        return fileExportAsCRRsimMenuItem;
    }

    /**
     * @return the view3DIFrame
     */
    public javax.swing.JInternalFrame getView3DIFrame() {
        return view3DIFrame;
    }

    private DefaultTreeModel getTreeModel(){
        SelectorMutableTreeNode airplaneNode = new SelectorMutableTreeNode(this.controller.crrcsim, of(ENABLE_BUTTONS.ADD_CHANGELOG));

        AVL avl = this.controller.crrcsim.getAvl();

        SelectorMutableTreeNode avlNode = new SelectorMutableTreeNode(avl);
        airplaneNode.add(avlNode);

        for(Change change : this.controller.crrcsim.getChangelog()){
            airplaneNode.add(new SelectorMutableTreeNode(change));
        }

        SelectorMutableTreeNode geometryNode = createSelectorMutableTreeNode(avl.getGeometry(),of(ENABLE_BUTTONS.ADD_SURFACE, ENABLE_BUTTONS.ADD_MASS, ENABLE_BUTTONS.ADD_BODY));
        avlNode.add(geometryNode);

        for(Surface surf : avl.getGeometry().getSurfaces()){
            SelectorMutableTreeNode surfNode = createSurfaceTreeNode(surf);
            geometryNode.add(surfNode);

            for(Section section:surf.getSections()){
                SelectorMutableTreeNode sectionNode = createSectionTreeNode(section);
                surfNode.add(sectionNode);

                for(Control control:section.getControls()){
                    SelectorMutableTreeNode controlNode = createControlTreeNode(control);
                    sectionNode.add(controlNode);
                }
            }
        }

        for(Body body : avl.getGeometry().getBodies()){
            SelectorMutableTreeNode bodyNode = createBodyTreeNode(body);
            geometryNode.add(bodyNode);
        }


        return new DefaultTreeModel(airplaneNode);
    }

    private SelectorMutableTreeNode createSelectorMutableTreeNode(Object object, EnumSet<ENABLE_BUTTONS> options){
        SelectorMutableTreeNode smTreeNode = new SelectorMutableTreeNode(object, options);
        for(Mass mass : ((MassObject)object).getMasses()){
            smTreeNode.add(createMassTreeNode(mass));
        }
        return smTreeNode;
    }

    public void updateAVLTree(){
        this.avlTree.setModel(this.getTreeModel());
    }

    private void showModelProperties(Object userObject) {
        CRRCSimTableModel tableModel = AVLModelTableFactory.createTableModel(userObject);
        if (tableModel != null) this.modelPropertiesTable.setModel(tableModel);
    }

    private void createColumn(DefaultTableColumnModel tableModel, String name){
       TableColumn tc =  new TableColumn();
       tc.setHeaderValue(name);
       tableModel.addColumn(tc);
    }

    private SelectorMutableTreeNode createSectionTreeNode(Section section) {
        return createSelectorMutableTreeNode(section, of(ENABLE_BUTTONS.ADD_CONTROL, ENABLE_BUTTONS.DELETE));
    }

    private SelectorMutableTreeNode createSurfaceTreeNode(Surface surf){
        return createSelectorMutableTreeNode(surf, of(ENABLE_BUTTONS.ADD_SECTION, ENABLE_BUTTONS.DELETE));
    }


    private SelectorMutableTreeNode createBodyTreeNode(Body newBody) {
        return createSelectorMutableTreeNode(newBody, of(ENABLE_BUTTONS.DELETE));
    }

    private SelectorMutableTreeNode createControlTreeNode(Control control) {
        return createSelectorMutableTreeNode(control, of(ENABLE_BUTTONS.DELETE));
    }

    private SelectorMutableTreeNode createMassTreeNode(Mass mass) {
        return new SelectorMutableTreeNode(mass, of(ENABLE_BUTTONS.DELETE));
    }

    private MutableTreeNode createChangeNode(Change newChange) {
        return new SelectorMutableTreeNode(newChange, of(ENABLE_BUTTONS.DELETE));
    }

    private void deleteTreeNodeAndObject(SelectorMutableTreeNode parentTreeNode, SelectorMutableTreeNode deleteTreeNode){
        ((DefaultTreeModel)this.avlTree.getModel()).removeNodeFromParent(deleteTreeNode);

        if(deleteTreeNode.getUserObject().getClass().equals(Mass.class)){
            ((MassObject)parentTreeNode.getUserObject()).getMasses().remove((Mass)deleteTreeNode.getUserObject());
        }else if(deleteTreeNode.getUserObject().getClass().equals(Surface.class)){
            ((AVLGeometry)parentTreeNode.getUserObject()).getSurfaces().remove((Surface)deleteTreeNode.getUserObject());
        }else if(deleteTreeNode.getUserObject().getClass().equals(Section.class)){
            ((Surface)parentTreeNode.getUserObject()).getSections().remove((Section)deleteTreeNode.getUserObject());
        }else if(deleteTreeNode.getUserObject().getClass().equals(Control.class)){
            ((Section)parentTreeNode.getUserObject()).getControls().remove((Control)deleteTreeNode.getUserObject());
        }else if (deleteTreeNode.getUserObject().getClass().equals(Body.class)){
            ((AVLGeometry)parentTreeNode.getUserObject()).getBodies().remove((Body)deleteTreeNode.getUserObject());
        }else if (deleteTreeNode.getUserObject().getClass().equals(Change.class)){
            ((CRRCSim)parentTreeNode.getUserObject()).getChangelog().remove((Change)deleteTreeNode.getUserObject());
        }else{
            throw new IllegalArgumentException();
        }

    }




}
