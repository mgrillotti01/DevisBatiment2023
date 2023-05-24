/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.mgrillotti.projet56;
import java.util.ArrayList;
/**
 *
 * @author lgoubet01
 */
public class Piece {
    /**
     * @return the idPiece
     */
    public int getIdPiece() {
        return idPiece;
    }

    /**
     * @return the sol
     */
    public int getSol() {
        return sol;
    }

    /**
     * @return the plafond
     */
    public int getPlafond() {
        return plafond;
    }

    /**
     * @return the listeMurs
     */
    public ArrayList<Mur> getListeMurs() {
        return listeMurs;
    }
    private int idPiece;
    private int sol;
    private int plafond;
    private ArrayList<Mur> listeMurs;

    public Piece(int idPiece, int sol, int plafond, ArrayList<Mur> listeMurs) {
        this.idPiece = idPiece;
        this.sol = sol;
        this.plafond = plafond;
        this.listeMurs = listeMurs;
    }
    
    public void addMur(Mur mur){
        this.listeMurs.add(mur.getIdMur(), mur);
    }
    
    
}
