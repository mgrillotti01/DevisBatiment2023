/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fr.insa.mgrillotti.projet56;
//import java.util.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author mgrillotti01
 */
public class Projet56 {

    public static void main(String[] args) {
        
        
        
        /*System.out.println("0 pour créer une maison, 1 pour créer un immeuble");
        int i=Lire.i();
        Batiment batiment;
            
        if (i==0){
            System.out.println(" Identifiant de la Maison");
            int idMaison=Lire.i();
            double hauteur = 3;
            Maison maison = new Maison(idMaison, hauteur);
            Coin coin = new Coin(0, 0.0, 0.0);
            maison.addPiece(new Piece(0, coin, 3.0, 3.0, 3.0, listeRevetements ));
            batiment = maison;

        }else{
            System.out.println(" Identifiant de l'immeuble");
            int idImmeuble=Lire.i();
            Coin coin = new Coin(0, 0.0, 0.0);
            Immeuble immeuble = new Immeuble(idImmeuble);
            immeuble.getNiveau(0).getListeApparts().get(0).addPiece(new Piece(0, coin, 3.0, 3.0, 3.0, listeRevetements ));
            batiment = immeuble;
        }
        
        double surfaceTotale = batiment.surfaceTotale();
        System.out.println("Surface totale :" + surfaceTotale);*/
        Menu();
    }
    
    public static void Menu(){
        //Numeroteur num = new Numeroteur();
        
        //liste de tous les revetements qui existent
        ArrayList<Revetement> listeRevetements = new ArrayList<>();
        listeRevetements.add(new Revetement (1, "peinture", true, true, true, 30));
        
        System.out.println("Souhaitez-vous calculer le devis d'un Immeuble ou d'une Maison ?");
        String bat = Lire.S();
        Batiment batiment;
        if (! bat.equals("Maison") && (! bat.equals("maison"))){
            batiment = new Immeuble(0);
        }else{
            batiment = new Maison(0);
        }
        int selection = 0;
        while (selection != -1){
            System.out.println("Devis du Batiment");
            System.out.println("----------------------------------");
            System.out.println("0) Interface graphique");
            System.out.println("1) Créer un point");
            System.out.println("2) Supprimer un point");
            System.out.println("3) Créer un mur");
            System.out.println("4) Supprimer un mur");
            System.out.println("4) Ajouter un revêtement");
            System.out.println("5) Enlever un revêtement");
            System.out.println("6) Créer un sol");
            System.out.println("7) Supprimer un sol");
            System.out.println("8) Ajouter un revêtement");
            System.out.println("9) Enlever un revêtement");
            System.out.println("10) Créer un sol");
            System.out.println("11) Supprimer un sol");
            System.out.println("12) Ajouter un revêtement");
            System.out.println("13) Enlever un revêtement");
            System.out.println("14) Créer un plafond");
            System.out.println("15) Supprimer un plafond");
            System.out.println("16) Ajouter un revêtement");
            System.out.println("17) Enlever un revêtement");
            System.out.println("18) Créer une pièce");
            System.out.println("19) Supprimer une pièce");
            System.out.println("20) Ajouter un mur à une pièce");
            System.out.println("21) Enlever un mur à une pièce");
            if (! bat.equals("Maison") && (! bat.equals("maison"))){
                System.out.println("22) Créer un appartement");
                System.out.println("23) Supprimer un appartement");
                System.out.println("24) Ajouter une pièce à un appartement");
                System.out.println("25) Enlever une pièce à un appartement");
                System.out.println("26) Créer un niveau");
                System.out.println("27) Supprimer un niveau");
                System.out.println("28) Ajouter un appartement à un niveau");
                System.out.println("29) Enlever un appartement à un niveau");
            }
            System.out.println("30) Calculer la surface totale du batiment");
            System.out.println("31) Calculer le devis du batiment");
            System.out.println("-1) Quitter");
            System.out.println("votre choix : ");
            selection = Lire.i();
            if (selection == 1){
                System.out.println("identifiant du point:");
                int id = Lire.i();
                System.out.println("abscisse");
                double x = Lire.d();
                System.out.println("ordonnée");
                double y = Lire.d();
                Coin c = new Coin(id,x,y);
                //num.getOrAdd(c);
                
            }else if (selection == 18){
                System.out.println(" Identifiant de la Piece");
                int idPiece=Lire.i();
                System.out.println(" Identifiant du Coin (en bas à gauche)");
                int idCoinBG=Lire.i();
                System.out.println(" Abscisse du Coin");
                double x=Lire.d();
                System.out.println(" Ordonnée du Coin"); 
                double y=Lire.d();
                Coin coinBG = new Coin(idCoinBG, x, y);
                System.out.println(" Longueur de la pièce en X");
                double longueurX=Lire.i();
                System.out.println(" Longueur de la pièce en Y");
                double longueurY=Lire.i();
                
                batiment.addPiece(idPiece, coinBG, longueurX, longueurY, listeRevetements);
            
            }else if (selection == 30){
                double surfaceTotale = batiment.surfaceTotale();
                System.out.println("Surface totale :" + surfaceTotale +" m^2");
            }
        }
    }

    
    /*static double calculMontantRevetement(Mur m1, Revetement r)
    {
        return (m1.surface()* r.prixUnitaire);
    }*/
    

    
}
