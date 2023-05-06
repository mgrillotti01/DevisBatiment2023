/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.mgrillotti.projet56;
import java.util.ArrayList;
/**
 *
 * @author Amadou Coulibaly
 */
public class Mur {
    int idMur, nbrePortes, nbreFenetres;
    Coin debut, fin;
    ArrayList<Revetement> listeRevetement = new ArrayList<>();
    
    
    
    Mur(int id, Coin dc, Coin fc)
    {
        this.idMur=id;
        this.debut=dc;
        this.fin=fc;
    }
    
    void afficher()
    {System.out.println("==== Mur =====");
        this.debut.afficher();
        this.fin.afficher();    
    }
    
    double longueur()
    {
        return(Math.sqrt((this.fin.cx-this.debut.cx)*(this.fin.cx-this.debut.cx) + (this.fin.cy-this.debut.cy)*(this.fin.cy-this.debut.cy)));
    }
    
    double surface()
    {
        System.out.println("\nEntrer la Hauteur du mur (hauteur sous-plafond)");
        double hsp=Lire.d();
        return(this.longueur()*hsp);
    }
    @Override
    public String toString() {
        return "Mur{" + "idMur=" + idMur + ", nbrePortes=" + nbrePortes + ", nbreFenetres=" + nbreFenetres + ", debut=" + debut + ", fin=" + fin + ", listeRevetement=" + listeRevetement + '}';
    }
    
}
