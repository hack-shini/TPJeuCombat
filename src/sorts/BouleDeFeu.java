package sorts;

import joueurs.Personnage;

public class BouleDeFeu implements AttaqueBasique {

    public void utiliserArmeDeBase(String nom, int dommages, Personnage autreJoueur) {
        System.out.println(nom + " utilise Boule de feu et inflige " + dommages + " dommages");
        autreJoueur.perdVitalite(dommages);
    }
}
