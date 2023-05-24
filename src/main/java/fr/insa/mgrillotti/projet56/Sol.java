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
public class Sol {
    
    Color couleur = Color.BLACK;
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
        return(Math.sqrt((e.getCx()-c.getCx())*(e.getCx()-c.getCx()) + (e.getCy()-c.getCy())*(e.getCy()-c.getCy())));
    }
    
    double surface()
    {
        return(longueur(this.listeCoins.get(1),this.listeCoins.get(3))*longueur(this.listeCoins.get(2),this.listeCoins.get(3)));
    }
    
    @Override
    public String toString() {
        return "Sol{" + "idSol=" + idSol + ", listeCoins=" + listeCoins + ", listeRevetements"+ listeRevetements + '}';
    }
    
    public double maxX(){
        double max = this.listeCoins.get(0).getCx();
        for (Coin c : this.listeCoins){
            if (c.getCx() > max){
                max = c.getCx();
            }
        }
        return max;
    }
    
    public double minX(){
        double min = this.listeCoins.get(0).getCx();
        for (Coin c : this.listeCoins){
            if (c.getCx() < min){
                min = c.getCx();
            }
        }
        return min;
    }
    
    public double maxY(){
        double max = this.listeCoins.get(0).getCy();
        for (Coin c : this.listeCoins){
            if (c.getCy() > max){
                max = c.getCy();
            }
        }
        return max;
    }
    
    public double minY(){
        double min = this.listeCoins.get(0).getCy();
        for (Coin c : this.listeCoins){
            if (c.getCy() > min){
                min = c.getCy();
            }
        }
        return min;
    }
}
