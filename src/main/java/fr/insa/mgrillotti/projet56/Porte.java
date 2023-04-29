/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.mgrillotti.projet56;

/**
 *
 * @author mgrillotti01
 */
class Porte extends Ouverture {
    int idPorte;
    
    public Porte(int id) {
        super(0.9, 2.1);   
        this.idPorte=id;
    }
    
    @Override
    public void afficher() {
        System.out.println("Porte #" + idPorte + ":");
        super.afficher();
    }

}