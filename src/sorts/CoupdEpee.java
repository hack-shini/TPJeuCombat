package sorts;

import joueurs.Personnage;

public class CoupdEpee implements AttaqueBasique {

    public void utiliserArmeDeBase(String nom, int dommages, Personnage autreJoueur) {
        System.out.print(nom + " utilise Coup d'Epée et inflige " + dommages + " dommages");
        autreJoueur.subirAttaque(dommages);
    }
}
