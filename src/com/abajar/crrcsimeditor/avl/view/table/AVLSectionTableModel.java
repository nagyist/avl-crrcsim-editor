/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abajar.crrcsimeditor.avl.view.table;

import com.abajar.crrcsimeditor.avl.geometry.Section;
import javax.swing.table.TableModel;

/**
 *
 * @author hfreire
 */
class AVLSectionTableModel extends AVLTableModel{

    final Section section;

    protected AVLSectionTableModel(Section section) {
        this.section = section;
    }

    @Override
    protected void updateAVL(TableModel tableModel) {
        this.section.getXYZle()[0]=(Float)tableModel.getValueAt(0,0);
        this.section.getXYZle()[1]=(Float)tableModel.getValueAt(0,1);
        this.section.getXYZle()[2]=(Float)tableModel.getValueAt(0,2);
        this.section.setChord((Float)tableModel.getValueAt(0,3));
        this.section.setAinc((Float)tableModel.getValueAt(0,4));
        this.section.setNspan((Float)tableModel.getValueAt(0,5));
        this.section.setSspace((Float)tableModel.getValueAt(0,6));
        this.section.setNACA((String)tableModel.getValueAt(0,7));
    }

    @Override
    protected Object[][] getData() {
        return new Object[][]{{
          this.section.getXYZle()[0],
          this.section.getXYZle()[1],
          this.section.getXYZle()[2],
          this.section.getChord(),
          this.section.getAinc(),
          this.section.getNspan(),
          this.section.getSspace(),
          this.section.getNACA()
        }};
    }

    @Override
    protected Object[] getColumns() {
        return new Object[]{"Xle","Yle","Zle","Chord","Ainc","Nspan","Sspace","NACA"};
    }

    @Override
    public Class<?> getColumnClass(int i) {
        Class result = Float.class;
        if (i == 7) result = String.class;
        return result;
    }

}
