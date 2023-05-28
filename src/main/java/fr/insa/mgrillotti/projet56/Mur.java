/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.mgrillotti.projet56;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author Amadou Coulibaly
 */
public class Mur {
    private Color couleur = Color.BLACK;
    private int idMur, nbrePortes, nbreFenetres;
    private Coin debut, fin;
    private double hsp;
    private Revetement revetement;
    private ArrayList<Ouverture> listeOuvertures = new ArrayList<>();
    
    
    
    Mur(int id, Coin dc, Coin fc, double hsp, Revetement revetement ){
        this.idMur=id;
        this.debut=dc;
        this.fin=fc;
        this.hsp=hsp;
        this.revetement=revetement;
        
        System.out.println(" Identifiant de la Porte");
        int idPorte=Lire.i();
        Porte porte = new Porte(idPorte);
        listeOuvertures.add(porte);
        
        System.out.println(" Identifiant de la Fenetre");
        int idFenetre=Lire.i();
        Fenetre fenetre = new Fenetre(idFenetre);
        listeOuvertures.add(fenetre);
    }
    
    void afficher(){
    System.out.println("==== Mur =====");
        this.debut.afficher();
        this.fin.afficher();
        
        for (Ouverture ouverture: listeOuvertures){
            ouverture.afficher();
        }
    }
    
    double longueur()
    {
        return(Math.sqrt((this.getFin().getX()-this.getDebut().getX())*(this.getFin().getX()-this.getDebut().getX()) + (this.getFin().getY()-this.getDebut().getY())*(this.getFin().getY()-this.getDebut().getY())));
    }
    
    double surface(double hauteurSousPlafond){
        double surfaceMur=(this.longueur()*hsp);
        for (Ouverture ouverture: listeOuvertures){
            surfaceMur = surfaceMur - ouverture.surface();
        }
        return surfaceMur;
    }
    @Override
    public String toString() {
        return "Mur{" + "idMur=" + idMur + ", nbrePortes=" + nbrePortes + ", nbreFenetres=" + nbreFenetres + ", debut=" + debut + ", fin=" + fin + ", Revetement=" + revetement + '}';
    }
    
    public double maxX(){
        return Math.max(this.getDebut().getX(), this.getFin().getX());
    }
    
    public double minX(){
        return Math.min(this.getDebut().getX(), this.getFin().getX());
    }
    
    public double maxY(){
        return Math.max(this.getDebut().getY(), this.getFin().getY());
    }
    
    public double minY(){
        return Math.min(this.getDebut().getY(), this.getFin().getY());
    }

    /**
     * @return the couleur
     */
    public Color getCouleur() {
        return couleur;
    }

    /**
     * @return the idMur
     */
    public int getIdMur() {
        return idMur;
    }

    /**
     * @return the nbrePortes
     */
    public int getNbrePortes() {
        return nbrePortes;
    }

    /**
     * @return the nbreFenetres
     */
    public int getNbreFenetres() {
        return nbreFenetres;
    }

    /**
     * @return the debut
     */
    public Coin getDebut() {
        return debut;
    }

    /**
     * @return the fin
     */
    public Coin getFin() {
        return fin;
    }

    /**
     * @return the revetement
     */
    public Revetement getRevetement(){
        return this.revetement;
    }
    
    /**
     * @return the listeRevetement
     */
    /*public ArrayList<Revetement> getListeRevetement() {
        return listeRevetement;
    }*/
    
}
   
