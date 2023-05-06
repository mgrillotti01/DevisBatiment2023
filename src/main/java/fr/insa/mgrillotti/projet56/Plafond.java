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
public class Plafond {
    
    int idPlafond;
    ArrayList<Coin> listeCoins = new ArrayList<>();
    ArrayList<Revetement> listeRevetements = new ArrayList<>();
    
    Plafond(int id, ArrayList<Coin> liste, ArrayList<Revetement> listeRev)
    {
        this.idPlafond=id;
        this.listeCoins.addAll(liste);
        this.listeRevetements.addAll(listeRev);
    }
    
    double longueur(Coin e, Coin c)
    {
        return(Math.sqrt((e.cx-c.cx)*(e.cx-c.cx) + (e.cy-c.cy)*(e.cy-c.cy)));
    }
    
    double surface()
    {
        return(longueur(this.listeCoins.get(1),this.listeCoins.get(2))*longueur(this.listeCoins.get(2),this.listeCoins.get(3)));
    }
    
    @Override
    public String toString() {
        return "Sol{" + "idPlafond=" + idPlafond + ", listeCoins=" + listeCoins + ", listeRevetements"+ listeRevetements + '}';
    }
}
