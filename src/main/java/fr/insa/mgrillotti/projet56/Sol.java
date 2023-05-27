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
    
    private Color couleur = Color.BLACK;
    private int idSol;
    private Revetement revetement;
    private ArrayList<Coin> listeCoins = new ArrayList<>();
    private ArrayList<Ouverture> listeOuvertures = new ArrayList<>();
    
    Sol(int id, ArrayList<Coin> list, Revetement revetement){
        this.idSol=id;
        this.listeCoins.addAll(list);
        this.revetement=revetement;
        
        System.out.println(" Identifiant de la Tremie");
        int idTremie=Lire.i();
        Tremie tremie = new Tremie (idTremie);
        listeOuvertures.add(tremie);
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
        return(Math.sqrt((e.getX()-c.getX())*(e.getX()-c.getX()) + (e.getY()-c.getY())*(e.getY()-c.getY())));
    }
    
    double surface()
        {
        double surfaceSol = (longueur(this.listeCoins.get(1),this.listeCoins.get(2))*longueur(this.listeCoins.get(2),this.listeCoins.get(3)));
        for (Ouverture ouverture: listeOuvertures){
            surfaceSol = surfaceSol - ouverture.surface();
        }
        return surfaceSol;
    }
    @Override
    public String toString() {
        return "Sol{" + "idSol=" + idSol + ", listeCoins=" + listeCoins + ", Revetement="+ revetement + '}';
    }
    
    public double maxX(){
        //fonctionne parce que la liste est ordonnée; (coinBG, coinHG, coinHD, coinBD)
        return this.listeCoins.get(2).getX();
    }
    
    public double minX(){
        //fonctionne parce que la liste est ordonnée; (coinBG, coinHG, coinHD, coinBD)
        return this.listeCoins.get(0).getX();
    }
    
    public double maxY(){
        //fonctionne parce que la liste est ordonnée; (coinBG, coinHG, coinHD, coinBD)
        return this.listeCoins.get(2).getY();
    }
    
    public double minY(){
        //fonctionne parce que la liste est ordonnée; (coinBG, coinHG, coinHD, coinBD)
        return this.listeCoins.get(0).getY();
    }
    
    public Revetement getRevetement(){
        return this.revetement;
    }
}
//
test
