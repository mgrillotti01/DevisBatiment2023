/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.mgrillotti.projet56;

/**
 *
 * @author thenry01
 */
public class Revetement {
    // Attributs
    int idRevetement;
    String designation;
    boolean pourMur, pourSol, pourPlafond,;
    double prixUnitaire;
    
    Revetement(int id, double p)
    {
        // Constructeurs
        this.idRevetement=id;
        this.prixUnitaire=p;
    }
}
