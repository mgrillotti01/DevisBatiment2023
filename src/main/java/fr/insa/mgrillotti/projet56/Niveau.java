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
public class Niveau {
    
    /**
     * @return the idNiveau
     */
    public int getIdNiveau() {
        return idNiveau;
    }

    /**
     * @return the hauteurSousPlafond
     */
    public double getHauteurSousPlafond() {
        return hauteurSousPlafond;
    }

    /**
     * @param hauteurSousPlafond the hauteurSousPlafond to set
     */
    public void setHauteurSousPlafond(double hauteurSousPlafond) {
        this.hauteurSousPlafond = hauteurSousPlafond;
    }

    /**
     * @return the listeApparts
     */
    public ArrayList<Appartement> getListeApparts() {
        return listeApparts;
    }
    
    private int idNiveau;
    private double hauteurSousPlafond;
    private ArrayList<Appartement> listeApparts = new ArrayList<>();
    
    public Niveau(int id, double hsp){
        
        this.idNiveau = id;
        this.hauteurSousPlafond = hsp;
        this.listeApparts = null;
        
    }
    
    public void addMur(Appartement appart){
        this.listeApparts.add(appart.getIdAppartement(), appart);
    }
}
