package sorts;

import joueurs.Personnage;

public class TirAlArc implements AttaqueBasique {
    public void utiliserArmeDeBase(String nom, int dommages, Personnage autreJoueur) {
        System.out.print(nom + " utilise Tir à l'Arc et inflige " + dommages + " dommages");
        autreJoueur.subirAttaque(dommages);
    }
}
