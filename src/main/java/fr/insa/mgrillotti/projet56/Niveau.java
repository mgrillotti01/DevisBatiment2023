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
    
    private int idNiveau;
    private double hauteurSousPlafond;
    private ArrayList<Appartement> listeApparts = new ArrayList<>();
       
    Niveau(int id){
        this.idNiveau=id;
                
        System.out.println(" Hauteur sous plafond de l'appartements");
        hauteurSousPlafond=Lire.d();
        while (hauteurSousPlafond<=2.1){
            //hauteur des portes : 2.1
            System.out.println(" Le plafond doit être à plus de 2.10m de haut");
            hauteurSousPlafond=Lire.d();
        }
        
        int idAppartement = idNiveau;
        Appartement appartement = new Appartement(idAppartement, hauteurSousPlafond);
        this.addAppartement(appartement);
        
    }
    
    public void addAppartement(Appartement appartement){
        this.listeApparts.add(appartement);
    }
    
    public void deleteAppartement(Appartement appartement){
        if (!this.listeApparts.isEmpty()){
            this.listeApparts.remove(appartement);
        }else{
            System.out.println("Le niveau est deja vide");
        }
    }
    
    
    
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
    
    //??
    public void addMur(Appartement appart){
        this.listeApparts.add(appart.getIdAppartement(), appart);
    }
    
    public double surfaceTotale(){
        double surface = 0.0;
        for (Appartement appartement: listeApparts){
            surface = surface + appartement.surfaceTotale(this.hauteurSousPlafond);
        }
        return surface;
    }
    
    public Appartement demanderAppartement(){
        int nbrAppartements = this.listeApparts.size();
        System.out.println("Choisissez un appartement entre 0 et " +(nbrAppartements -1));
        int nbrAppartChoisi=Lire.i();
        while ((nbrAppartChoisi <0) || (nbrAppartChoisi > (nbrAppartements -1))){
            System.out.println("L'appartement doit être entre 0 et " +(nbrAppartements -1));
            nbrAppartChoisi=Lire.i();
        }
        return this.listeApparts.get(nbrAppartChoisi);
    }
            
}
