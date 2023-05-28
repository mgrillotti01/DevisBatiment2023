/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.mgrillotti.projet56;

import java.awt.Color;

/**
 *
 * @author Amadou Coulibaly
 */
public class Coin {

    // Attributs
    public static double rayon = 5;
    
    private Color couleur;
    private int idCoin;
    private double cx;
    private double cy;
    
    // Constructeur
    Coin(int id, double x, double y)
    {
      this.idCoin=id;
      this.cx=x;
      this.cy=y;
      this.couleur = Color.BLACK;
    }
    
    // test
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coin{");
        sb.append("idCoin=").append(idCoin);
        sb.append(", cx=").append(cx);
        sb.append(", cy=").append(cy);
        sb.append('}');
        return sb.toString();
    }
    
    void afficher()
    {
        System.out.println(" Coin : id ="+this.getIdCoin()+" abscisse = "+this.getX()+ " Ordonnée ="+this.getY());
    }
    
    public static Coin demandePoint() {
        System.out.println("id :");
        int id = Lire.i();
        System.out.println("abscisse : ");
        double cx = Lire.d();
        System.out.println("ordonnée : ");
        double cy = Lire.d();
        return new Coin(id, cx, cy);
    }
    
    /**
     * @return the couleur
     */
    public Color getCouleur() {
        return couleur;
    }
    
    /**
     * @return the idCoin
     */
    int getIdCoin() {
        return this.idCoin;    
    }
    
    /**
     * @return the cx
     */
    double getX() {
        return this.cx;    
    }
    
    /**
     * @return the cy
     */
    double getY() {
        return this.cy;    
    }
    
    
}
