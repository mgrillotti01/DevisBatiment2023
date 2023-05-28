/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.mgrillotti.projet56;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author mgrillotti01
 */
public class Plafond {
    
    private Color couleur = Color.BLACK;
    private int idPlafond;
    private ArrayList<Coin> listeCoins = new ArrayList<>();
    private Revetement revetement;
    
    Plafond(int id, ArrayList<Coin> listeCoins, Revetement revetement)
    {
        this.idPlafond=id;
        this.listeCoins.addAll(listeCoins);
        this.revetement=revetement;
    }
    
    double longueur(Coin e, Coin c)
    {
        return(Math.sqrt((e.getX()-c.getX())*(e.getX()-c.getX()) + (e.getY()-c.getY())*(e.getY()-c.getY())));
    }
    
    double surface()
    {
        return(longueur(this.getListeCoins().get(1),this.getListeCoins().get(2))*longueur(this.getListeCoins().get(2),this.getListeCoins().get(3)));
    }
    
    @Override
    public String toString() {
        return "Sol{" + "idPlafond=" + getIdPlafond() + ", listeCoins=" + getListeCoins() + ", Revetement="+ getRevetement() + '}';
    }
    
    /**
     * @return the couleur
     */
    public Color getCouleur() {
        return couleur;
    }

    /**
     * @return the idPlafond
     */
    public int getIdPlafond() {
        return idPlafond;
    }

    /**
     * @return the listeCoins
     */
    public ArrayList<Coin> getListeCoins() {
        return listeCoins;
    }

    /**
     * @return the listeRevetements
     */
    /*public ArrayList<Revetement> getListeRevetements() {
        return listeRevetements;
    }*/
    
    public Revetement getRevetement(){
        return this.revetement;
    }
}
