/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fr.insa.mgrillotti.projet56;
//import java.util.ArrayList;
/**
 *
 * @author mgrillotti01
 */
public class Projet56 {

    public static void main(String[] args) {
        Coin c1;
        System.out.println(" Identifiant du Coin");
        int id=Lire.i();
        System.out.println(" Abscisse du Coin");
        double x=Lire.d();
        System.out.println(" Ordonnée du Coin");
        double y=Lire.d();
        c1=new Coin(id,x,y);
        //Collection <Coin> listeCoins = new ArrayList<>();
        //Numeroteur numeroteur = new Numeroteur(listeCoins);
        //Piece p;
        //ArrayList<Mur> listeMurs = new ArrayList<Mur>();
        //p = new Piece(1,2,4,listeMurs);
        
        // Pour afficher textuellement le coin c1
        c1.afficher();
                
         Coin c2;
         System.out.println(" Identifiant du Coin");
         id=Lire.i();
         System.out.println(" Abscisse du Coin");
         x=Lire.d();
         System.out.println(" Ordonnée du Coin");
         y=Lire.d();
         c2=new Coin(id,x,y);
         
         Mur m1;
         System.out.println(" Identifiant du Mur");
         id=Lire.i();
         m1=new Mur(id,c1,c2);
         m1.afficher();
//         System.out.println(c2.toString());
//         System.out.println(m1.toString());
         System.out.println("Longueur du mur ="+m1.longueur());
         
         //Formattage de l'affichage
         System.out.format("\nLongueur du mur =%.2f",m1.longueur());
//         System.out.printf("\nLongueur du mur =%.3f\n",m1.longueur());
 /*         
// Exemple         
         double dval=7.1475;
         System.out.format("\nLongueur du mur =%.2f",dval);
         System.out.format("\nLongueur du mur =%.3f",dval);
         */
 
         // Calcul et affichage de la surface d'un mur
         //double surface=m1.surface();
         //System.out.println(m1.toString()+"\nSurface :"+m1.surface());
         System.out.format(m1.toString()+"\nSurface :%.2f",m1.surface());
         
         // Calcul du coût du revêtement d'un mur
         System.out.println("Entrer Revêtement");
         Revetement r;
         System.out.println("Entrer l'id du revêtement");
         id=Lire.i();
         
         System.out.println("Prix unitaire du revêtement");
         double prix=Lire.d();
         r=new Revetement(id,prix);
         double montantRevetement=calculMontantRevetement(m1,r);
         System.out.format("\nSurface :%.2f",montantRevetement);
    } // Fin de la méthode main
    
    
         static double calculMontantRevetement(Mur m1, Revetement r)
         {
             return (m1.surface()* r.prixUnitaire);
         }
    }
