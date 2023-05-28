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
public class Appartement {
       
    private int idAppartement;
    private ArrayList<Piece> listePieces = new ArrayList<>();
    
    public Appartement (int id, double hsp){
        this.idAppartement = id;  
    }
    
    /**
    * @return the idAppartement
    */
    public int getIdAppartement() {
        return idAppartement;
    }
    
    //C'est déjà fait par la fonction getNiveau de Immeuble
    /*public int getNiveauAppartement() {
        return niveauAppartement;
    }*/
    
    /**
     * @return the listePieces
     */
    public ArrayList<Piece> getListePieces() {
        return listePieces;
    }
    
    public void addPiece(Piece piece){
        this.listePieces.add(piece);
    }
    
    public void deletePiece(Piece piece){
        if (!this.listePieces.isEmpty()){
            this.listePieces.remove(piece);
        }else{
            System.out.println("L'appartements est deja vide");
        }
    }    
    
    void afficher(){
    System.out.println("==== Piece =====");
        
    
        for (Piece piece: listePieces){
            piece.afficher();
        }
    }
    
    double surfaceTotale(double hauteurSousPlafond){
        //somme de la surface des pièces
        double surface = 0.0;
        for (Piece piece: listePieces){
            surface = surface + piece.surfaceTotale(hauteurSousPlafond);
        }
        return surface;
    }
    
    double surfaceRevetement(int idRevetement, double hauteurSousPlafond){
        //somme de la surface des pièces pour un revêtement donné
        double surface = 0.0;
        for (Piece piece: listePieces){
            surface = surface + piece.surfaceRevetement(idRevetement, hauteurSousPlafond);
        }
        return surface;
    }
    
    public void addMur(Piece piece){
        this.listePieces.add(piece.getIdPiece(), piece);
    }
}
