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
class Immeuble extends Batiment{
    
    private ArrayList<Niveau> listeNiveaux = new ArrayList<>();
        
    public Immeuble(String identifiant){
        
        super(identifiant);
        
        System.out.println(" Identifiant du Niveau (de 0 à 4 inclus)");
        int idNiveau=Lire.i();
        if ((idNiveau >4) || (idNiveau <0)){
            System.out.println("Le niveau doit être 0, 1, 2, 3 ou 4");
        }else{
            Niveau niveau = new Niveau(idNiveau);
            this.addNiveau(niveau);
        
        }
    }
    
    public void addNiveau(Niveau niv){
        if (this.listeNiveaux.size()<5){
            this.listeNiveaux.add(niv);
        }else{
            System.out.println("Enlever un niveau");
        }
    }
    public void deleteNiveau(Niveau niv){
        if (!this.listeNiveaux.isEmpty()){
            this.listeNiveaux.remove(niv);
        }else{
            System.out.println("Le batiment est deja vide");
        }
    }
    
    public Niveau getNiveau(int idNiveau){
        return this.listeNiveaux.get(idNiveau);
    }
    
    @Override
    public double surfaceTotale(){
        double surface = 0.0;
        for (Niveau niveau: listeNiveaux){
            surface = surface + niveau.surfaceTotale();
        }
        return surface;
    }
    
    @Override
    public void addPiece(
        int idPiece, 
        Coin coinBG,
        double longueurX,
        double longueurY,
        ArrayList<Revetement> listeRevetements
    ){
        if (listeNiveaux.isEmpty()){
            System.out.println("Il n'y a pas de niveaux dans l'immeuble, il faut d'abord en créer un");
            return;
        }
        Niveau niveauChoisi = demanderNiveau();
        if (niveauChoisi.getListeApparts().isEmpty()){
            System.out.println("Il n'y a pas d'appartement dans ce niveau, il faut d'abord en créer un");
            return;
        }
        Appartement appartementChoisi = niveauChoisi.demanderAppartement();
        Piece piece = new Piece (idPiece, coinBG, longueurX, longueurY, niveauChoisi.getHauteurSousPlafond(), listeRevetements);
        appartementChoisi.addPiece(piece);
    }
    
    public Niveau demanderNiveau(){
        int nbrNiveaux = this.listeNiveaux.size();
        System.out.println("Choisissez un niveau entre 0 et " +(nbrNiveaux -1));
        int nbrNiveauChoisi=Lire.i();
        while ((nbrNiveauChoisi <0) || (nbrNiveauChoisi > (nbrNiveaux -1))){
            System.out.println("Le niveau doit être entre 0 et " +(nbrNiveaux -1));
            nbrNiveauChoisi=Lire.i();
        }
        return this.listeNiveaux.get(nbrNiveauChoisi);
    }
        
}

