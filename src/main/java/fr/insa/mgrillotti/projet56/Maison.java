/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.mgrillotti.projet56;

/**
 *
 * @author mgrillotti01
 */
class Maison extends Batiment{
    
    public Maison(String identifiant){
        
        super(identifiant,null);
        
    }
    
    @Override
    public void addNiveau(Niveau niv){
        if (this.listeNiveaux.isEmpty()){
            this.listeNiveaux.add(niv);
        }else{
            System.out.println("Enlever un niveau");
        }
    }
    public void deleteNiveau(Niveau niv){
        if (this.listeNiveaux.size() == 1){
            this.listeNiveaux.remove(niv);
        }else{
            System.out.println("La maison est deja vide");
        }
    }
}
