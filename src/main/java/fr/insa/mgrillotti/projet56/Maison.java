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
class Maison extends Batiment{
    private ArrayList<Piece> listePieces = new ArrayList<>();
    private double hauteurSousPlafond;
    private ArrayList<Niveau> listeNiveaux = new ArrayList<>();
    
    public Maison(String identifiant){
        
        super(identifiant);
        this.listeNiveaux.isEmpty();
        
        System.out.println(" Hauteur sous plafond de la maison");
        double hauteurSousPlafond=Lire.d();
        while (hauteurSousPlafond<=2.1){
            //hauteur des portes : 2.1
            System.out.println(" Le plafond doit être à plus de 2.10m de haut");
            hauteurSousPlafond=Lire.d();
        }
        
        this.hauteurSousPlafond = hauteurSousPlafond;
            
    }
    
    void afficher(){
    System.out.println("==== Piece =====");
        
    
        for (Piece piece: listePieces){
            piece.afficher();
        }
    }
    
    @Override
    public void addPiece(
        int idPiece, 
        Coin coinBG,
        double longueurX,
        double longueurY,
        ArrayList<Revetement> listeRevetements
    ){
        Piece piece = new Piece (idPiece, coinBG, longueurX, longueurY, this.getHauteurSousPlafond(), listeRevetements);
        this.listePieces.add(piece);
    }
    
    public void deletePiece(Piece piece){
        if (!this.listePieces.isEmpty()){
            this.listePieces.remove(piece);
        }else{
            System.out.println("La maison est deja vide");
        }
    }    
    
    @Override
    public double surfaceTotale(){
        double surface = 0.0;
        for (Piece piece: listePieces){
            surface = surface + piece.surfaceTotale(this.hauteurSousPlafond);
        }
        return surface;
    }
    
    /**
     * @return the hauteurSousPlafond
     */
    public double getHauteurSousPlafond() {
        return hauteurSousPlafond;
    }
       
}
