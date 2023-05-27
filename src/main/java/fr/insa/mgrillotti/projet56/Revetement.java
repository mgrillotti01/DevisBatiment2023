/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.mgrillotti.projet56;

import java.util.ArrayList;

/**
 *
 * @author thenry01
 */
public class Revetement {
    // Attributs
    int idRevetement;
    String designation;
    boolean pourMur, pourSol, pourPlafond;
    double prixUnitaire;
    
    Revetement(int id, String designation, boolean pourMur, boolean pourSol, boolean pourPlafond, double p)
    {
        // Constructeurs
        this.idRevetement=id;
        this.designation=designation;
        this.pourMur=pourMur;
        this.pourSol=pourSol;
        this.pourPlafond=pourPlafond;
        this.prixUnitaire=p;
        
    }
    
    boolean pourMur(){
        return this.pourMur;
    }
    
    boolean pourSol(){
        return this.pourSol;
    }
    
    boolean pourPlafond(){
        return this.pourPlafond;
    }
    
    static Revetement choisirRevetement(ArrayList<Revetement> listeRevetements, boolean pourPlafond, boolean pourMur, boolean pourSol){
        //créer une liste des revêtements pour un seul type de surface
        //puis demander à l'utilisateur de choisir un revêtement dans cette liste
        
        return listeRevetements.get(0); //TEMPORAIRE, A REMPLACER
    }
            
    
}
