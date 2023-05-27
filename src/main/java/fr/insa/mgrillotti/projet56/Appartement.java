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
                
        /*System.out.println(" Identifiant de la Piece");
        int idPiece=Lire.i();
        System.out.println(" Identifiant du Coin (en bas à gauche)");
        int idCoinBG=Lire.i();
        System.out.println(" Abscisse du Coin");
        double x=Lire.d();
        System.out.println(" Ordonnée du Coin"); 
        double y=Lire.d();
        Coin coinBG = new Coin(idCoinBG, x, y);
        System.out.println(" Longueur de la pièce en X");
        double longueurX=Lire.i();
        System.out.println(" Longueur de la pièce en Y");
        double longueurY=Lire.i();
        Piece piece = new Piece (idPiece, coinBG, longueurX, longueurY, hsp);
        this.listePieces.add(piece);*/
        //A FAIRE : BOUCLE POUR RAJOUTER PLUSIEURS PIECES
        
    }
    
    public int getIdAppartement() {
        return idAppartement;
    }
    
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
}