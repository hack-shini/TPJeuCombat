package sorts;

import joueurs.Personnage;

public class AucuneAttaqueBasique implements AttaqueBasique {

    public void utiliserArmeDeBase(String nom, int dommages, Personnage joueur) {
        System.out.print("n'utilise aucune arme ");
    }
}
