package sorts;

import joueurs.Personnage;

public class BouleDeFeu implements AttaqueBasique {

    public void utiliserArmeDeBase(String nom, int dommages, Personnage autreJoueur) {
        System.out.print(nom + " utilise Boule de feu et inflige " + dommages + " dommages");
        autreJoueur.subirAttaque(dommages);
    }
}
