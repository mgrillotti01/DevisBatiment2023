/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.mgrillotti.projet56;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author thenry01
 */
public class Revetement {
    // Attributs
    int idRevetement;
    String designation;
    boolean pourMur, pourSol, pourPlafond;
    double prixUnitaire;
    
    Revetement(String designation){
    try
    {
    String[] t;
    BufferedReader revetements = new BufferedReader(new FileReader("CatalogueRevetements.txt"));
    String lignelue;// Ligne lue depuis le fichier
       while((lignelue=revetements.readLine())!=null)
       {
           t = lignelue.split(";");
           if (t[1].equals(designation)) 
           {
               this.idRevetement = Integer.parseInt(t[0]);
               this.designation = designation;
               this.pourMur = Boolean.parseBoolean(t[2]);
               this.pourSol = Boolean.parseBoolean(t[3]);
               this.pourPlafond = Boolean.parseBoolean(t[4]);
               this.prixUnitaire = Double.parseDouble(t[5]);
           }
       }
    revetements.close();
    }
    catch(FileNotFoundException err){
    System.out.println( "Erreur :le fichier n’existe pas!\n "+err);}
    catch (IOException err){
    System.out.println(" Erreur :\n "+err);}
    }
    
    Revetement(int id){
    try
    {
    String[] t;
    BufferedReader revetements = new BufferedReader(new FileReader("CatalogueRevetements.txt"));
    String lignelue;// Ligne lue depuis le fichier
       while((lignelue=revetements.readLine())!=null)
       {
           t = lignelue.split(";");
           if (t[0].equals(id)) 
           {
               this.idRevetement = id;
               this.designation = t[1];
               this.pourMur = Boolean.parseBoolean(t[2]);
               this.pourSol = Boolean.parseBoolean(t[3]);
               this.pourPlafond = Boolean.parseBoolean(t[4]);
               this.prixUnitaire = Double.parseDouble(t[5]);
           }
       }
    revetements.close();
    }
    catch(FileNotFoundException err){
    System.out.println( "Erreur :le fichier n’existe pas!\n "+err);}
    catch (IOException err){
    System.out.println(" Erreur :\n "+err);}
    }
}
