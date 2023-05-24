/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.mgrillotti.projet56;
import java.util.ArrayList;

/**
 *
 * @author mgrillotti01
 */


        
public abstract class Ouverture {
    double dimX;
    double dimY;

    public Ouverture(double dimX, double dimY) {
        this.dimX = dimX;
        this.dimY = dimY;
        
    }

    public double surface() {
        return this.dimX*this.dimY;
    }

    public void afficher() {
        System.out.println("\tDimensions : " + dimX + "m x " + dimY + "m");
        System.out.println("\tSurface : " + surface() + "m²");
    }

    
    
}