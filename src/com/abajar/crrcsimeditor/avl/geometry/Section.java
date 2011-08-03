/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abajar.crrcsimeditor.avl.geometry;

import com.abajar.crrcsimeditor.avl.AVLSerializable;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import static com.abajar.crrcsimeditor.avl.AVLGeometry.fs;

/**
 *
 * @author hfreire
 */
public class Section implements AVLSerializable{

    //TODO: AIRFOIL
    //TODO: AFILE
    //TODO: DESIGN

    //CONTROL
    private final float[] XYZle = new float[3];
    private float Chord;
    private float Ainc;
    private float Nspan;
    private float Sspace;
    private String NACA="";
    private final ArrayList<Control> controls = new ArrayList<Control>();

    //TODO: CLAF
    //TODO: CDCL

    /**
     * @return the XYZle
     */
    public float[] getXYZle() {
        return XYZle;
    }

    /**
     * @return the Chord
     */
    public float getChord() {
        return Chord;
    }

    /**
     * @param Chord the Chord to set
     */
    public void setChord(float Chord) {
        this.Chord = Chord;
    }

    /**
     * @return the Ainc
     */
    public float getAinc() {
        return Ainc;
    }

    /**
     * @param Ainc the Ainc to set
     */
    public void setAinc(float Ainc) {
        this.Ainc = Ainc;
    }

    /**
     * @return the Nspan
     */
    public float getNspan() {
        return Nspan;
    }

    /**
     * @param Nspan the Nspan to set
     */
    public void setNspan(float Nspan) {
        this.Nspan = Nspan;
    }

    /**
     * @return the Sspace
     */
    public float getSspace() {
        return Sspace;
    }

    /**
     * @param Sspace the Sspace to set
     */
    public void setSspace(float Sspace) {
        this.Sspace = Sspace;
    }

    /**
     * @return the NACA
     */
    public String getNACA() {
        return NACA;
    }

    /**
     * @param NACA the NACA to set
     */
    public void setNACA(String NACA) {
        this.NACA = NACA;
    }

    /**
     * @return the controls
     */
    public ArrayList<Control> getControls() {
        return controls;
    }

    @Override
    public void writeAVLData(OutputStream out) {
        PrintStream ps = new PrintStream(out);
        ps.print("SECTION                             |  (keyword)\n");                      //        SECTION                             |  (keyword)
        ps.printf(fs(7) + "| Xle Yle Zle   Chord Ainc   [ Nspan Sspace ]\n", this.getXYZle()[0],
                this.getXYZle()[1], this.getXYZle()[1],
                this.getChord(), this.getAinc(), this.getNspan(), this.getSspace());     //0.0 5.0 0.2   0.50  1.50   5 -2.0   | Xle Yle Zle   Chord Ainc   [ Nspan Sspace ]

        ps.printf("NACA                      |    (keyword)\n");                                         //NACA                      |    (keyword)
        ps.printf("%1$19s | section NACA camberline\n", this.getNACA());            //4300                      | section NACA camberline

        for(Control control : this.getControls()){
            control.writeAVLData(out);
        }
    }

    @Override
    public String toString() {
        return "section";
    }


}
