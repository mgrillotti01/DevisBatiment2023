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
public class Sol {
    
    int idSol;
    ArrayList<Coin> listeCoins = new ArrayList<>();
    ArrayList<Revetement> listeRevetements = new ArrayList<>();
    
    Sol(int id, ArrayList<Coin> list){
        this.idSol=id;
        this.listeCoins.addAll(list);
        //this.listeRevetements.addAll(listRev);
    }
    
    void afficher()
    {System.out.println("==== Sol =====");
    int i;
        for (i=0;i<4;i++)  {
            this.listeCoins.get(i).afficher();
        }
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
        return "Sol{" + "idSol=" + idSol + ", listeCoins=" + listeCoins + ", listeRevetements"+ listeRevetements + '}';
    }
}
