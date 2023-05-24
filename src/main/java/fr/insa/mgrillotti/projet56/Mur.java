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
    private int idMur;
    private int nbrePortes;
    private int nbreFenetres;
    private Coin debut;
    private Coin fin;
    private ArrayList<Revetement> listeRevetement = new ArrayList<>();
    
    
    
    Mur(int id, Coin dc, Coin fc)
    {
        this.idMur=id;
        this.debut=dc;
        this.fin=fc;
    }
    
    void afficher()
    {System.out.println("==== Mur =====");
    this.getDebut().afficher();
    this.getFin().afficher();    
    }
    
    double longueur()
    {
        return(Math.sqrt((this.getFin().getCx()-this.getDebut().getCx())*(this.getFin().getCx()-this.getDebut().getCx()) + (this.getFin().getCy()-this.getDebut().getCy())*(this.getFin().getCy()-this.getDebut().getCy())));
    }
    
    double surface()
    {
        System.out.println("\nEntrer la Hauteur du mur (hauteur sous-plafond)");
        double hsp=Lire.d();
        return(this.longueur()*hsp);
    }
    @Override
    public String toString() {
        return "Mur{" + "idMur=" + getIdMur() + ", nbrePortes=" + getNbrePortes() + ", nbreFenetres=" + getNbreFenetres() + ", debut=" + getDebut() + ", fin=" + getFin() + ", listeRevetement=" + getListeRevetement() + '}';
    }
    
    public double maxX(){
        return Math.max(this.debut.getCx(), this.fin.getCx());
    }
    
    public double minX(){
        return Math.min(this.debut.getCx(), this.fin.getCx());
    }
    
    public double maxY(){
        return Math.max(this.debut.getCy(), this.fin.getCy());
    }
    
    public double minY(){
        return Math.min(this.debut.getCy(), this.fin.getCy());
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
     * @return the listeRevetement
     */
    public ArrayList<Revetement> getListeRevetement() {
        return listeRevetement;
    }
    
}
