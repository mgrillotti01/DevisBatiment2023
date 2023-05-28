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
public abstract class Batiment {
    
    String idBatiment;
    
    Batiment(String identifiant){
        this.idBatiment = identifiant;
   
    }
    
    public abstract double surfaceTotale();   
    
    //A FAIRE
    public double surfaceRevetement(){
        return 0.0;
    }
    
    public abstract void addPiece(
        int idPiece, 
        Coin coinBG,
        double longueurX,
        double longueurY,
        ArrayList<Revetement> listeRevetements
    );
  
}
