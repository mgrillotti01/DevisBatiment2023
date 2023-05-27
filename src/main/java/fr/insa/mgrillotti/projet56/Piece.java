/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.mgrillotti.projet56;
import java.util.ArrayList;
/**
 *
 * @author lgoubet01
 */
public class Piece {
           
    //Attributs
    private int idPiece;
    private Sol sol;
    private Plafond plafond;
    private ArrayList<Mur> listeMurs = new ArrayList<>(); //dans l'ordre : murB, murG, murH, murD

    public Piece(
        int idPiece, 
        Coin coinBG,
        double longueurX,
        double longueurY,
        double hauteur,
        ArrayList<Revetement> listeRevetements
    ) {
        this.idPiece = idPiece;
              
        //coinBD : coinBasDroite
        //On crée un coin qu'on utlise pour créer ls 3 autres
        Coin coinBD = new Coin(coinBG.getID()+1, coinBG.getX()+longueurX, coinBG.getY()) ; 
        Coin coinHG = new Coin(coinBG.getID()+2, coinBG.getX(), coinBG.getY()+longueurY) ; 
        Coin coinHD = new Coin(coinBG.getID()+3, coinBG.getX()+longueurX, coinBG.getY()+longueurY) ; 
       
        ArrayList<Coin> listeCoins = new ArrayList<>();
        listeCoins.add(coinBG);
        listeCoins.add(coinHG);
        listeCoins.add(coinHD);
        listeCoins.add(coinBD);
               
        System.out.println(" Identifiant du Mur (un entier)");
        int idMur=Lire.i();
        
        Revetement revMurB = Revetement.choisirRevetement(listeRevetements, false, true, false);
        //murB : murBas
        Mur murB = new Mur (idMur,coinBG,coinBD, hauteur, revMurB);
        listeMurs.add(murB);
        Revetement revMurG = Revetement.choisirRevetement(listeRevetements, false, true, false);
        Mur murG = new Mur (idMur+1,coinBG,coinHG, hauteur, revMurG);
        listeMurs.add(murG);
        Revetement revMurH = Revetement.choisirRevetement(listeRevetements, false, true, false);
        Mur murH = new Mur (idMur+2,coinHG,coinHD, hauteur, revMurH);
        listeMurs.add(murH);
        Revetement revMurD = Revetement.choisirRevetement(listeRevetements, false, true, false);
        Mur murD = new Mur (idMur+3,coinHD,coinBD, hauteur, revMurD);
        listeMurs.add(murD);
        
        System.out.println(" Identifiant du Sol");
        int idSol=Lire.i();
        Revetement revSol = Revetement.choisirRevetement(listeRevetements, false, false, true);
        this.sol = new Sol (idSol, listeCoins, revSol);
        
        System.out.println(" Identifiant du Plafond");
        int idPlafond=Lire.i();
        Revetement revPlafond = Revetement.choisirRevetement(listeRevetements, true, false, false);
        this.plafond = new Plafond (idPlafond, listeCoins, revPlafond);
        
    }
    
    /**
     * @return the idPiece
     */
    public int getIdPiece() {
        return idPiece;
    }

    /**
     * @return the sol
     */
    public Sol getSol() {
        return sol;
    }

    /**
     * @return the plafond
     */
    public Plafond getPlafond() {
        return plafond;
    }
    
    /**
     * @return the listeMurs
     */
    public ArrayList<Mur> getListeMurs() {
        return listeMurs;
    }
    
    void afficher(){
        
    }
    
    double surfaceTotale(double hauteurSousPlafond){
        //somme de la surface du sol, du plafond et des murs
        double surface = this.sol.surface()+this.plafond.surface();
        for (Mur mur: listeMurs){
            surface = surface + mur.surface(hauteurSousPlafond);
        }
        return surface;
    }
    
    double surfaceRevetement(int idRevetement, double hauteurSousPlafond){
    
        //pouur chercher la surface totale occupée par un revêtement dans une pièce
        double surface = 0;
        if(idRevetement == this.sol.getRevetement().idRevetement){
            surface = surface + this.sol.surface();
        }
        if(idRevetement == this.plafond.getRevetement().idRevetement){
            surface = surface + this.plafond.surface();
        }
        for (Mur mur: this.listeMurs){
            if(idRevetement == mur.getRevetement().idRevetement){
                surface = surface + mur.surface(hauteurSousPlafond);
            }
        }
        return surface;
    }
    
    double montantRevetement(){
        return 0.0;//A REMPLIR
    }
    
    @Override
    public String toString(){
        return "à faire";//A REMPLIR
    }
    
    
}


 /*    System.out.println(" Identifiant du Coin");
        int id=Lire.i();
        System.out.println(" Abscisse du Coin");
        double x=Lire.d();
        System.out.println(" Ordonnée du Coin"); 
        double y=Lire.d();*/