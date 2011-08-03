/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GeometryEditor.java
 *
 * Created on 19-jul-2011, 20:28:06
 */

package com.abajar.crrcsimeditor;

import com.abajar.crrcsimeditor.avl.view.table.AVLGeometryTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableColumnModel;
import com.abajar.crrcsimeditor.avl.AVLGeometry;
import java.util.EnumSet;
import com.abajar.crrcsimeditor.avl.AVL;
import com.abajar.crrcsimeditor.avl.geometry.Body;
import com.abajar.crrcsimeditor.avl.geometry.Control;
import com.abajar.crrcsimeditor.avl.geometry.Section;
import com.abajar.crrcsimeditor.avl.geometry.Surface;
import com.abajar.crrcsimeditor.avl.mass.Mass;
import com.abajar.crrcsimeditor.avl.view.SelectorMutableTreeNode;
import com.abajar.crrcsimeditor.avl.view.SelectorMutableTreeNode.ENABLE_BUTTONS;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;
import javax.swing.tree.DefaultTreeModel;
import static java.util.EnumSet.of;
import javax.swing.tree.MutableTreeNode;

/**
 *
 * @author hfreire
 */
public class GeometryEditor extends javax.swing.JFrame {

    final private CRRCsimEditor controller;
    /** Creates new form GeometryEditor */
    public GeometryEditor(CRRCsimEditor controller ){
        this.controller = controller;
        initComponents();
    }

    private DefaultTreeModel getTreeModel(){
        AVL avl = this.controller.avl;
        
        SelectorMutableTreeNode avlNode = new SelectorMutableTreeNode(avl);
        SelectorMutableTreeNode geometryNode = new SelectorMutableTreeNode(avl.getGeometry(),of(ENABLE_BUTTONS.ADD_SURFACE));
        SelectorMutableTreeNode massNode = new SelectorMutableTreeNode(avl.getMass());

        for(Surface surf : avl.getGeometry().getSurfaces()){
            SelectorMutableTreeNode surfNode = createSurfaceTreeNode(surf);
            geometryNode.add(surfNode);

            for(Section section:surf.getSections()){
                SelectorMutableTreeNode sectionNode = new SelectorMutableTreeNode(section, of(ENABLE_BUTTONS.ADD_CONTROL));
                surfNode.add(sectionNode);

                for(Control control:section.getControls()){
                    SelectorMutableTreeNode controlNode = new SelectorMutableTreeNode(control);
                    sectionNode.add(controlNode);
                }
            }
        }
        
        for(Body body : avl.getGeometry().getBodies()){
            SelectorMutableTreeNode bodyNode = new SelectorMutableTreeNode(body);
            geometryNode.add(bodyNode);
        }
        

//        for(Mass mass:avl.getMass().getMass()){
//            SelectorMutableTreeNode mNode = new SelectorMutableTreeNode(mass);
//            massNode.add(mNode);
//        }
        
        avlNode.add(geometryNode);
//        avlNode.add(massNode);
        return new DefaultTreeModel(avlNode);
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
        avlTree = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        modelPropertiesTable = new javax.swing.JTable();
        addSurfaceButton = new javax.swing.JButton();
        addSectionButton = new javax.swing.JButton();
        addControlButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        avlTree.setModel(this.getTreeModel());
        avlTree.setName("avlTree"); // NOI18N
        avlTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                avlTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(avlTree);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        modelPropertiesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        modelPropertiesTable.setName("modelPropertiesTable"); // NOI18N
        jScrollPane2.setViewportView(modelPropertiesTable);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.abajar.crrcsimeditor.CRRCsimEditor.class).getContext().getResourceMap(GeometryEditor.class);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addSurfaceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addSectionButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addControlButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addSurfaceButton)
                            .addComponent(addSectionButton)
                            .addComponent(addControlButton)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avlTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_avlTreeValueChanged
        SelectorMutableTreeNode treeNode = (SelectorMutableTreeNode)evt.getPath().getLastPathComponent();

        EnumSet<ENABLE_BUTTONS> options = treeNode.getOptions();
        addSurfaceButton.setEnabled(options.contains(ENABLE_BUTTONS.ADD_SURFACE));
        addSectionButton.setEnabled(options.contains(ENABLE_BUTTONS.ADD_SECTION));
        addControlButton.setEnabled(options.contains(ENABLE_BUTTONS.ADD_CONTROL));
        
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addControlButton;
    private javax.swing.JButton addSectionButton;
    private javax.swing.JButton addSurfaceButton;
    private javax.swing.JTree avlTree;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable modelPropertiesTable;
    // End of variables declaration//GEN-END:variables

    private void showModelProperties(Object userObject) {
        if (userObject.getClass().equals(AVLGeometry.class)) showModelPropertiesTyped((AVLGeometry)userObject);
    }

    private void showModelPropertiesTyped(AVLGeometry aVLGeometry) {
       this.modelPropertiesTable.setModel(new AVLGeometryTable(aVLGeometry));
    }

    private void createColumn(DefaultTableColumnModel tableModel, String name){
       TableColumn tc =  new TableColumn();
       tc.setHeaderValue(name);
       tableModel.addColumn(tc);
    }

    private SelectorMutableTreeNode createSectionTreeNode(Section section) {
        return new SelectorMutableTreeNode(section, of(ENABLE_BUTTONS.ADD_CONTROL));
    }

    private SelectorMutableTreeNode createSurfaceTreeNode(Surface surf){
        return new SelectorMutableTreeNode(surf, of(ENABLE_BUTTONS.ADD_SECTION));
    }

    private MutableTreeNode createControlTreeNode(Control control) {
        return new SelectorMutableTreeNode(control, of(ENABLE_BUTTONS.NONE));
    }


}
