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
class Fenetre extends Ouverture {
    int idFenetre;
    
    public Fenetre(int id) {
        super(1.2, 1.2);   
        this.idFenetre=id;
    }
    
    @Override
    public void afficher() {
        System.out.println("Fenetre #" + idFenetre + ":");
        super.afficher();
    }

}