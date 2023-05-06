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
    //Attributs
    int idPiece, sol, plafond;
    ArrayList<Mur> listeMurs;

    public Piece(int idPiece, int sol, int plafond, ArrayList<Mur> listeMurs) {
        this.idPiece = idPiece;
        this.sol = sol;
        this.plafond = plafond;
        this.listeMurs = listeMurs;
    }
    
    
}
