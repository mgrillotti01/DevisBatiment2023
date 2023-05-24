/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.mgrillotti.projet56;

/**
 *
 * @author mgrillotti01
 */
class Tremie extends Ouverture{
    int idTremie;
    
    public Tremie(int id) {
        super(1, 3);   
        this.idTremie=id;
    }
    
    @Override
    public void afficher() {
        System.out.println("Tremie #" + idTremie + ":");
        super.afficher();
    }

}
