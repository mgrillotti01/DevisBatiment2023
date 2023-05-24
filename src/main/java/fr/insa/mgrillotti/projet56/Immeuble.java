/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.mgrillotti.projet56;

/**
 *
 * @author mgrillotti01
 */
class Immeuble extends Batiment{
    
    public Immeuble(String identifiant){
        
        super(identifiant,null);
        
    }
    @Override
    public void addNiveau(Niveau niv){
        this.listeNiveaux.add(niv);
    }
    public void deleteNiveau(Niveau niv){
        this.listeNiveaux.remove(niv);
    }
}
