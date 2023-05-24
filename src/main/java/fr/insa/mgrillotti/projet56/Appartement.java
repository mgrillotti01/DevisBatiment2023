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
public class Appartement {
    
    /**
     * @return the idAppartement
     */
    public int getIdAppartement() {
        return idAppartement;
    }

    /**
     * @return the niveauAppartement
     */
    public int getNiveauAppartement() {
        return niveauAppartement;
    }

    /**
     * @return the listePieces
     */
    public ArrayList<Piece> getListePieces() {
        return listePieces;
    }
    
    private int idAppartement;
    private int niveauAppartement;
    private ArrayList<Piece> listePieces = new ArrayList<>();
    
    public Appartement(int id, int niveau, ArrayList<Piece> liste){
        
        this.idAppartement = id;
        this.niveauAppartement = niveau;
        this.listePieces = liste;
        
    }
    
    public void addMur(Piece piece){
        this.listePieces.add(piece.getIdPiece(), piece);
    }
}
