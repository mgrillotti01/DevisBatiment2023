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
    private ArrayList<Revetement> listeRevetements = new ArrayList<>();
    
    Plafond(int id, ArrayList<Coin> liste, ArrayList<Revetement> listeRev)
    {
        this.idPlafond=id;
        this.listeCoins.addAll(liste);
        this.listeRevetements.addAll(listeRev);
    }
    
    double longueur(Coin e, Coin c)
    {
        return(Math.sqrt((e.getCx()-c.getCx())*(e.getCx()-c.getCx()) + (e.getCy()-c.getCy())*(e.getCy()-c.getCy())));
    }
    
    double surface()
    {
        return(longueur(this.getListeCoins().get(1),this.getListeCoins().get(3))*longueur(this.getListeCoins().get(2),this.getListeCoins().get(3)));
    }
    
    @Override
    public String toString() {
        return "Sol{" + "idPlafond=" + getIdPlafond() + ", listeCoins=" + getListeCoins() + ", listeRevetements"+ getListeRevetements() + '}';
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
    public ArrayList<Revetement> getListeRevetements() {
        return listeRevetements;
    }
}
